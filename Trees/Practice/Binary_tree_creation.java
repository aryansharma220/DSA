class Node{
    int data;
    Node left;
    Node right;
    Node(int x){
        data=x;
    }
}

public class Binary_tree_creation {
    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.left.left=new Node(40);
    }
}
