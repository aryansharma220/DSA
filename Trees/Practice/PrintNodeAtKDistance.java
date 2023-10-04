class Node{
    int data;
    Node left,right;
    Node(int x){
        data=x;
    }
}

public class PrintNodeAtKDistance {
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

        printNode(p, 1);
    }

    static void printNode(Node p, int k){
        if(p==null)return;
        if(k==0){System.out.println(p.data);}
        else{
            printNode(p.left, k-1);
            printNode(p.right, k-1);
        }
    }
}
