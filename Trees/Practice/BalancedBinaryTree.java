class Node{
    int data;
    Node left,right;
    Node(int x){
        data=x;
    }
}

public class BalancedBinaryTree {
    public static void main(String[] args) {
        Node p = new Node(4);
        Node p1 = new Node(1);
        Node p2 = new Node(6);
        Node p3 = new Node(5);
        Node p4 = new Node(2);
        Node p5 = new Node(9);
        Node p6 = new Node(11);

        p.left=p1;
        p.right=p2;
        p1.left=p3;
        p1.right=p4;
        p2.right=p5;
        p5.right=p6;

        System.out.println(isBalanced(p));
    }

    static int isBalanced(Node p){
        if(p==null) return 0;
        int lh=isBalanced(p.left);
        if(lh==-1)return -1;
        int rh=isBalanced(p.right);
        if(rh==-1)return -1;
        if(Math.abs(lh-rh)>1){return -1;}
        else return Math.max(lh,rh)+1;

    }
}
