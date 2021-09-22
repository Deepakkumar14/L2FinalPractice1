package BST.Delete;

public class Delete {
    class Node {
        int data;
        Node right;
        Node left;
    }
    
    class BST{
        public Node createNode(int data){
            Node a=new Node();
            a.data=data;
            a.right=null;
            a.left=null;
            return a;
        }

        public Node insert(Node root,int data){
                if(root==null){
                   return createNode(data);
                }
                else if(root.data>data){
                    root.left=insert(root.left,data);
                }
                else if(root.data<data){
                    root.right=insert(root.right,data);
                }
            return root;
        }
    }

    public void Inorder(Node root){
        if(root!=null){
            Inorder(root.left);
            System.out.print(root.data+" ");
            Inorder(root.right);
        }
    }
    public Node Delete(Node root,int key){
        if(root==null) {
            return root;
        }

        if(root.data<key){
            root.right=Delete(root.right,key);
        }
        else if(root.data>key){
            root.left=Delete(root.left,key);
        }else{
           if(root.left==null){
               return root.right;
           }
           else if(root.right==null){
                return root.left;
            }
           else{
               root.data=successor(root.right).data;
               root.right=Delete(root.right,root.data);
           }
        }
        return  root;
    }

    public static Node successor(Node curr) {
        Node val = curr;
        while (curr.left != null) {
            val = curr.left;
            curr = curr.left;
        }
        return val;
    }

    public Node trim(Node root,int min,int max){
        if(root == null)
        {
            return null;
        }

        if(root.data < min)
        {
            Node child = root.right;
            return child;
        }

        if(root.data > max)
        {
            Node child = root.left;
           // root = null;
            return child;
        }

        return root;
    }

    public static void main(String[] args) {
        Delete a=new Delete();
        Node root = null;
        int[] array={1,2,3,4,5,6,7,8,0};
        int min=3;
        int max=6;
        int[] output=new int[array.length];
        root=a.new BST().insert(root,array[0]);
        for (int i=0;i< array.length;i++){
            output[i]=a.new BST().insert(root,array[i]).data;
        }
        a.Inorder(root);
        a.trim(root,min,max);
        System.out.println();
        a.Inorder(root);
    }
}
