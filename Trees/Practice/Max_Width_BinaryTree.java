import java.util.LinkedList;
import java.util.Queue;

class Node{
    int data;
    Node left,right;
    Node(int x){
        data=x;
    }
}

public class Max_Width_BinaryTree {
    public static void main(String[] args) {
        Node p = new Node(10);
        Node p1 = new Node(20);
        Node p2 = new Node(30);
        Node p3 = new Node(40);
        Node p4 = new Node(50);
        Node p5 = new Node(60);
        Node p6 = new Node(70);
        p.left=p1;
        p.right=p2;
        p1.left=p3;
        p1.right=p4;
        p2.right=p5;
        p2.left=p6;

        System.out.println(maxWidth(p));
    }

    static int maxWidth(Node p){
        if(p==null)return 1;
        Queue<Node> q= new LinkedList<Node>();
        q.add(p);
        int max=q.size();
        while(q.isEmpty()==false){
            int count=q.size();
            for(int i=0;i<count;i++){
                Node curr = q.poll();
                if(curr.left!=null){q.add(curr.left);}
                if(curr.right!=null){q.add(curr.right);}
            }
            if(count>max){max=count;}
        }
        return max;

    }
}
