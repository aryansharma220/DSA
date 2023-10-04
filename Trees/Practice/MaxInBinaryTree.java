import java.util.LinkedList;
import java.util.Queue;


class Node{
    int data;
    Node left,right;
    Node(int x){
        data=x;
    }
}

public class MaxInBinaryTree {
    public static void main(String[] args) {
        Node p = new Node(4);
        Node p1 = new Node(10);
        Node p2 = new Node(6);
        Node p3 = new Node(500);
        Node p4 = new Node(2);
        Node p5 = new Node(9);
        p.left=p1;
        p.right=p2;
        p1.left=p3;
        p1.right=p4;
        p2.right=p5;

        System.out.println(findMaxrecur(p));
    }

    //Iterative function 
    static int findMax(Node p){
        if(p==null) return Integer.MIN_VALUE;
        Queue<Node> q= new LinkedList<Node>();
        q.add(p);
        int Max=Integer.MIN_VALUE;
        while(q.isEmpty()==false){
            Node curr=q.poll();
            if(curr.data>Max){Max=curr.data;}
            if(curr.left!=null){q.add(curr.left);}
            if(curr.right!=null){q.add(curr.right);}
        }
        return Max;
    }

    // Recursive function
    static int findMaxrecur(Node p){
        if(p==null) return Integer.MIN_VALUE;
        return Math.max(p.data, Math.max(findMaxrecur(p.left),findMaxrecur(p.right)));
    }
}
