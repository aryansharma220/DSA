class Node{
    int data;
    Node left,right;
    Node(int x){
        data=x;
    }
}

public class heightOfBinaryTree {
    public static void main(String[] args) {
        Node p = new Node(4);
        Node p1 = new Node(1);
        Node p2 = new Node(6);
        Node p3 = new Node(5);
        Node p4 = new Node(2);
        p.left=p1;
        p.right=p2;
        p1.left=p3;
        p1.right=p4;
        
        System.out.println(height(p));
    }

    static int height(Node p){
        if(p==null)return 0;
        else return Math.max(height(p.left),height(p.right))+1;
    }
}
