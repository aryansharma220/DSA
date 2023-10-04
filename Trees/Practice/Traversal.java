class Node{
    int data;
    Node left,right;
    Node(int x){
        data=x;
    }
}

public class Traversal {
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

        System.out.print("Preorder Traversal -> ");
        preOrder(p);
        System.out.println();
        System.out.print("Postorder Traversal -> ");
        postOrder(p);
        System.out.println();
        System.out.print("Inorder Traversal -> ");
        inOrder(p);

    }

    static void preOrder(Node p){
        if(p!=null){
            System.out.print(p.data+" ");
            preOrder(p.left);
            preOrder(p.right);
        }
    }

    static void postOrder(Node p){
        if(p!=null){
            postOrder(p.left);
            postOrder(p.right);
            System.out.print(p.data+" ");
        }
    }

    static void inOrder(Node p){
        if(p!=null){
            inOrder(p.left);
            System.out.print(p.data+" ");
            inOrder(p.right);
        }
    }
}
