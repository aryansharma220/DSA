import java.util.LinkedList;
import java.util.Queue;

class Node{
    int data;
    Node left,right;
    Node(int x){
        data=x;
    }
}

public class LevelOrderTraversal {
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

        printLevelOrderLineByLine2(p);
    }

    static void printLevelOrder(Node p){
        if(p==null)return;
        Queue<Node> q = new LinkedList<Node>();
        q.add(p);
        while(q.isEmpty()==false){
            Node curr = q.poll();
            System.out.println(curr.data+" ");
            if(curr.left!= null){q.add(curr.left);}
            if(curr.right!= null){q.add(curr.right);}
            // System.out.println();
        }
    }

    static void printLevelOrderLineByLine1(Node p){
        if(p==null)return;
        Queue<Node> q1= new LinkedList<Node>();
        q1.add(p);
        q1.add(null);
        while(q1.size()>1){
            Node curr = q1.poll();
            if(curr==null){
                System.out.println();
                q1.add(null);
                continue;
            }
            System.out.print(curr.data+" ");
            if(curr.left!=null){q1.add(curr.left);}
            if(curr.right!=null){q1.add(curr.right);}
        }
    }

    static void printLevelOrderLineByLine2(Node p){
        if(p==null)return;
        Queue<Node> q= new LinkedList<Node>();
        q.add(p);
        while(q.isEmpty()==false){
            int count=q.size();
            for(int i=0;i<count;i++){
                Node curr=q.poll();
                System.out.print(curr.data+" ");
                if(curr.left!=null){q.add(curr.left);}
                if(curr.right!=null){q.add(curr.right);}
            }
            System.out.println();
        }
    }
}
