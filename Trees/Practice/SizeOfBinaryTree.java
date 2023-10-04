class Node{
    int data;
    Node left,right;
    Node(int x){
        data=x;
    }
}

public class SizeOfBinaryTree {
    public static void main(String[] args) {
        Node p = new Node(4);
        Node p1 = new Node(1);
        Node p2 = new Node(6);
        Node p3 = new Node(5);
        Node p4 = new Node(2);
        Node p5 = new Node(9);
        p.left=p1;
        p.right=p2;
        p1.left=p3;
        p1.right=p4;
        p2.right=p5;

        System.out.println(size(p));
    }


    static int size(Node p){
        if(p==null)return 0;
        else{
            return 1+size(p.left)+size(p.right);
        }
    }
}
