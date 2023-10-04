import java.util.LinkedList;
import java.util.Queue;

class Node{
    int data;
    Node left,right;
    Node(int x){
        data=x;
    }
}

public class LeftViewOfBinaryTree{
    public static void main(String[] args) {
        Node p = new Node(10);
        Node p1 = new Node(20);
        Node p2 = new Node(30);
        Node p3 = new Node(40);
        Node p4 = new Node(50);
        // Node p5 = new Node(60);
        p.left=p1;
        p.right=p2;
        p2.left=p3;
        p2.right=p4;
        // p3.right=p5;

        leftViewIte(p);
    }

    // Iterative Function
    static void leftViewIte(Node p){
        if(p==null)return;
        Queue<Node> q = new LinkedList<Node>();
        q.add(p);
        while(q.isEmpty()==false){
            int count=q.size();
            for(int i=0;i<count;i++){
                Node curr=q.poll();
                if(i==0){System.out.print(curr.data+" ");}
                if(curr.left!=null){q.add(curr.left);}
                if(curr.right!=null){q.add(curr.right);}
            }
        }
    }

    // Recursive Function
    static int maxlevel=0;
    static void leftViewRecur(Node p,int level){
        if(p==null)return;
        if(maxlevel<level){
            System.out.print(p.data+" ");
            maxlevel=level;
        }
        leftViewRecur(p.left, level+1);
        leftViewRecur(p.right, level+1);
    }
}