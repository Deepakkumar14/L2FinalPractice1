package BST;

import java.util.ArrayList;

class Node {
    Node left;
    Node right;
    int data;

}
class BST {

    public Node insert(Node node, int val) {
        if(node == null) {
            return createNewNode(val);
        }

        if(val < node.data) {
            node.left = insert(node.left, val);
        } else if((val > node.data)) {
            node.right = insert(node.right, val);
        }

        return node;
    }

    public Node createNewNode(int val) {
        Node a = new Node();
        a.data = val;
        a.left = null;
        a.right = null;
        return a;
    }
}

public class BinarySearchTree {

    static  ArrayList list1=new ArrayList<>();
    public static ArrayList searchElement(Node node,int data) {
        if (node==null)
            list1.add(null);
        else if (node.data > data) {
            searchElement(node.left, data);
        }
       else if (node.data < data) {
            searchElement(node.right, data);
        } else if(node.data==data){
            list1.add(node.data);
            list1.add(node.left.data);
            list1.add(node.right.data);
        }
        return list1;
    }


    public static int minElement(Node root){
        Node current;
        if (root.left==null)
            return root.data;

            current=root.left;
            int min=current.data;
            while(current.left!=null){
                if(current.left.data<min){
                    min=current.left.data;
                    current=current.left;
                }
            }
        return min;
    }

   static ArrayList<Integer> list=new ArrayList<>();
    public static int sumKElement(int k){
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=list.get(i);
        }
        return sum;
    }

    public static int minDistance(){
        int min=list.get(1)-list.get(0);
        for(int i=1;i<list.size()-1;i++){
            if(list.get(i+1)-list.get(i)<min){
                min=list.get(i+1)-list.get(i);
            }
        }
        return min;
    }


    static  void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data+" ");
            list.add(root.data);
            inorderRec(root.right);
        }

    }

   static void preorderRec(Node root) {
        if (root != null) {
            System.out.print(root.data+" ");
            preorderRec(root.left);
            preorderRec(root.right);
        }

    }

   static  void postorderRec(Node root) {
        if (root != null) {
            postorderRec(root.left);
            postorderRec(root.right);
            System.out.print(root.data+" ");
        }
    }

    static  void leafNode(Node root) {
        if (root.left==null && root.right==null) {
            System.out.print(root.data+" ");
        }
        else {
            if (root.left != null) {
                leafNode(root.left);
            }
            if (root.right != null) {
                leafNode(root.right);
            }
        }
    }

    public static void main(String[] args) {
        BST a = new BST();
        Node root = null;
        int[] array={4,2,7,1,3};
        int k=3;
        int search=2;
        int[] output=new int[array.length];
        root=a.insert(root,array[0]);
        for (int i=0;i< array.length;i++){
            output[i]=a.insert(root,array[i]).data;
        }
        System.out.println("Inorder");
        inorderRec(root);
        System.out.println();
        System.out.println("postorder");
        postorderRec(root);
        System.out.println();
        System.out.println("preorder");
        preorderRec(root);
        System.out.println();
        System.out.println("Leaf Nodes");
        leafNode(root);
        System.out.println();
        int output1=minElement(root);
        System.out.println("Min Element is "+output1);
        int output2=sumKElement(k);
        System.out.println("sum of k small Element is "+output2);
        System.out.println("Level Order");
        preorderRec(root);
        System.out.println();
        int output3=minDistance();
        System.out.println("Min distance is "+output3);
        ArrayList output4=searchElement(root,search);
        if(output4==null)
        System.out.println("Search element"+null);
        else
            System.out.println("Search element"+output4);
    }

}

