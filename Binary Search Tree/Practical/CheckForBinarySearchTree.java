class Node{
    int data;
    Node left,right;
    Node(int x){
        data=x;
    }
}

public class CheckForBinarySearchTree{
    public static void main(String[] args){
        Node p = new Node(10);
        Node p1 = new Node(5);
        Node p2 = new Node(15);
        Node p3 = new Node(2);
        Node p4 = new Node(7);
        Node p5 = new Node(12);
        Node p6 = new Node(17);
        p.left=p1;
        p.right=p2;
        p1.left=p3;
        p1.right=p4;
        p2.right=p6;
        p2.left=p5;

        System.out.println(isBST(p));
    }

    static Node prev = null;
    static int isBST(Node p){
        if(p!=null){
            if(isBST(p.left)!=1){return 0;}
            if(prev!=null && p.data<=prev.data){return 0;}
            prev=p;
            return isBST(p.right);
        }
        else{
            return 1;
        }
    }
}