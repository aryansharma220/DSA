class Node{
    int data;
    Node left,right;
    Node(int x){
        data=x;
    }
}

public class Insertion_in_BST {
    public static void main(String[] args) {
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

        insert(p, 13);
        System.out.println(p5.right.data);
    }

    static void insert(Node p,int key){
        Node prev = null;
        while(p!=null){
            prev=p;
            if(p.data==key){
                System.out.println("Duplicate value can't be added");
                return;
            }
            else if(key<p.data){p=p.left;}
            else{p=p.right;}
        }
        Node n = new Node(key);
        if(key<prev.data){prev.left=n;}
        else{prev.right=n;}
    }
}
