class Node{
    int data;
    Node left,right;
    Node(int x){
        data=x;
    }
}

public class Search_in_BST{
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

        Node res = searchIter(p, 15);
        if(res!=null){System.out.println(res.data);}
        else{System.out.println("Element not found!!");}
        
    }

    static Node searchRecur(Node p, int key){
        if(p==null){return null;}
        if(p.data==key){return p;}
        else if(p.data>key){return searchRecur(p.left, key);}
        else{return searchRecur(p.right, key);}
    }

    static Node searchIter(Node p, int key){
        while(p!=null){
            if(p.data==key){return p;}
            else if(p.data>key){p=p.left;}
            else{p=p.right;}
        }
        return null;

    }
}