import java.util.LinkedList;
import java.util.Queue;

class Node{
    int data;
    Node left,right;
    Node(int x){
        data=x;
    }
}

public class revision {
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
        System.out.print("PreOrder Traversal -> ");
        preOrder(p);
        System.out.println();
        System.out.print("InOrder Traversal -> ");
        inOrder(p);
        System.out.println();
        System.out.print("PostOrder Traversal -> ");
        postOrder(p);
        System.out.println();
        System.out.print("Height of the tree -> "+height(p));
        System.out.println();
        System.out.print("Nodes at distance 2 -> ");
        printNode(p,2);
        System.out.println();
        System.out.print("LevelOrder Traversal -> ");
        levelOrder(p);
        System.out.println();
        System.out.println("LevelOrder Line By Line Traversal -> ");
        levelLineByLine2(p);
        System.out.println();
        

    }

    static void preOrder(Node p){
        if(p==null){
            return;
        }
        System.out.print(p.data+" ");
        preOrder(p.left);
        preOrder(p.right);
    }

    static void inOrder(Node p){
        if(p==null)return;
        inOrder(p.left);
        System.out.print(p.data+" ");
        inOrder(p.right);
    }

    static void postOrder(Node p){
        if(p==null)return;
        postOrder(p.left);
        postOrder(p.right);
        System.out.print(p.data+" ");
    }

    static int height(Node p){
        if(p==null)return 0;
        else return (Math.max(height(p.left), height(p.right)))+1;
    }

    static void printNode(Node p, int k){
        if(p==null)return;
        if(k==0){System.out.print(p.data+" ");}
        else{
            printNode(p.left, k-1);
            printNode(p.right, k-1);
        }
    }

    static void levelOrder(Node p){
        if(p==null)return;
        Queue<Node> q = new LinkedList<Node>();
        q.add(p);
        while(q.isEmpty()==false){
            Node curr = q.poll();
            System.out.print(curr.data+" ");
            if(curr.left!=null){q.add(curr.left);}
            if(curr.right!=null){q.add(curr.right);}
        }
    }

    static void levelLineByLine(Node p){
        if(p==null)return;
        Queue<Node> q = new LinkedList<Node>();
        q.add(p);
        q.add(null);
        while(q.size()>1){
            Node curr=q.poll();
            if(curr==null){
                System.out.println();
                q.add(null);
                continue;
            }
            System.out.print(curr.data+" ");
            if(curr.left!=null){q.add(curr.left);}
            if(curr.right!=null){q.add(curr.right);}
        }
    }

    static void levelLineByLine2(Node p){
        if(p==null)return;
        Queue<Node> q = new LinkedList<Node>();
        q.add(p);
        while(q.isEmpty()==false){
            int count=q.size();
            for(int i=0;i<count;i++){
                Node curr = q.poll();
                System.out.print(curr.data+" ");
                if(curr.left!=null){q.add(curr.left);}
                if(curr.right!=null){q.add(curr.right);}
            }
            System.out.println();
        }
    }
}
