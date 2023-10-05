class Node{
    int data;
    Node left,right;
    Node(int x){
        data=x;
    }
}

public class Children_Sum_property {
    public static void main(String[] args) {
        Node p = new Node(16);
        Node p1 = new Node(7);
        Node p2 = new Node(9);
        Node p3 = new Node(5);
        Node p4 = new Node(2);
        Node p5 = new Node(9);
        p.left=p1;
        p.right=p2;
        p1.left=p3;
        p1.right=p4;
        p2.right=p5;

        System.out.println(followProperty(p));
    }

    static boolean followProperty(Node p){
        if(p==null)return true;
        if(p.left==null && p.right==null) return true;
        int sum=0;
        if(p.left!=null){sum+=p.left.data;}
        if(p.right!=null){sum+=p.right.data;}
        return (p.data==sum && followProperty(p.left) && followProperty(p.right));
    }
}
