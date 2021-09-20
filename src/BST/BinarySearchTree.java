package BST;

public class BinarySearchTree {

    public static int minElement(Node root){
        Node current=root;
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

    public static void main(String[] args) {
        BST a = new BST();
        Node root = null;
        int[] array={ 7,4,12,3,6,8,-1,5,10};
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
        leafNode(root);
        System.out.println();
        int output1=minElement(root);
        System.out.println("Min Element is "+output1);

    }
    static  void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data+" ");
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

}

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