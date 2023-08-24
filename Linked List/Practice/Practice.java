class NodeS {
    int data;
    NodeS next;

    NodeS(int x) {
        data = x;
    }
}

class NodeC {
    int data;
    NodeC next;

    NodeC(int x) {
        data = x;
    }
}

class NodeL {
    int data;
    NodeL next, prev;

    NodeL(int x) {
        data = x;
    }
}

public class Practice {
    public static void main(String[] args) {
        NodeL head = new NodeL(10);
        NodeL temp1 = new NodeL(20);
        NodeL temp2 = new NodeL(30);
        NodeL temp3 = new NodeL(40);
        head.next=temp1;
        head.prev=temp3;
        temp1.next=temp2;
        temp1.prev=head;
        temp2.next=temp3;
        temp2.prev=temp1;
        temp3.next=head;
        temp3.prev=temp2;
        printList1(head);
        System.out.println();
        head=insertAtBeginCL(head, 100);
        printList1(head);
        System.out.println();
        head=insertAtEndCL(head, 400);
        printList1(head);

        // NodeC head = new NodeC(10);
        // NodeC temp1= new NodeC(20);
        // NodeC temp2= new NodeC(30);
        // NodeC temp3= new NodeC(40);
        // head.next=temp1;
        // temp1.next=temp2;
        // temp2.next=temp3;
        // temp3.next=head;
        // printList(head);
        // System.out.println();
        // head=insertAtBegin(head, 100);
        // printList(head);
        // System.out.println();
        // head=insertAtEnd(head, 400);
        // printList(head);
        // System.out.println();
        // head=deleteHead(head);
        // printList(head);
        // System.out.println();
        // head=deleteKthNode(head, 3);
        // printList(head);

        // head=insertAtBegin(head, 30);
        // head=insertAtBegin(head, 20);
        // head=insertAtBegin(head, 10);
        // head=insertAtEnd(head, 40);
        // head=insertAtEnd(head, 50);
        // printList(head);
        // System.out.println();
        // head=reverse(head);
        // printList(head);

        // head = insertAtBegin(head, 30);
        // head = insertAtBegin(head, 20);
        // head = insertAtBegin(head, 10);
        // head = insertAtEnd(head, 40);
        // head = insertAtEnd(head, 50);
        // printList(head);
        // System.out.println();
        // head = insertAtPos(head, 25, 3);
        // printList(head);
        // System.out.println();
        // head = deleteFirst(head);
        // printList(head);
        // System.out.println();
        // head = deleteLast(head);
        // printList(head);
        // System.out.println();
        // int result=search(head, 30);
        // System.out.println(result);
    }

    static NodeL insertAtBeginCL(NodeL head, int x){
        NodeL temp=new NodeL(x);
        temp.prev=head.prev;
        temp.next=head;
        head.prev.next=temp;
        head.prev=temp;
        // int data=temp.data;
        // temp.data=head.data;
        // head.data=data;
        return temp;
    }

    static NodeL insertAtEndCL(NodeL head, int x){
        NodeL temp=new NodeL(x);
        temp.prev=head.prev;
        temp.next=head;
        head.prev.next=temp;
        head.prev=temp;
        return head;
    }



    static void printList1(NodeL head){
        NodeL curr=head;
        do{
            System.out.print(curr.data+" ");
            curr=curr.next;
        }while(curr!=head);
    }

    static NodeC deleteKthNode(NodeC head, int pos) {
        NodeC curr = head;
        for (int i = 1; i < pos - 1; i++) {
            curr = curr.next;
        }
        curr.next = curr.next.next;
        return head;
    }

    static NodeC deleteHead(NodeC head) {
        // NodeC temp=head;
        int decap = head.data;
        head.data = head.next.data;
        head.next.data = decap;
        head.next = head.next.next;
        return head;
    }

    static NodeC insertAtBegin(NodeC head, int x) {
        NodeC temp = new NodeC(x);
        temp.next = head.next;
        head.next = temp;
        int data = temp.data;
        temp.data = head.data;
        head.data = data;
        return head;
    }

    static NodeC insertAtEnd(NodeC head, int x) {
        NodeC temp = new NodeC(x);
        temp.next = head.next;
        head.next = temp;
        int data = temp.data;
        temp.data = head.data;
        head.data = data;
        return temp;
    }

    static void printList(NodeC head) {
        NodeC curr = head;
        do {
            System.out.print(curr.data + " ");
            curr = curr.next;
        } while (curr != head);
    }

    static NodeL reverse(NodeL head) {
        if (head == null || head.next == null)
            return head;
        NodeL curr = head, temp = null;
        while (curr.next != null) {
            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;
            curr = curr.prev;
        }
        return temp.prev;
    }

    static NodeL insertAtBegin(NodeL head, int x) {
        NodeL temp = new NodeL(x);
        temp.next = head;
        if (head != null)
            head.prev = temp;
        return temp;
    }

    static NodeL insertAtEnd(NodeL head, int x) {
        NodeL temp = new NodeL(x);
        if (head == null)
            return temp;
        NodeL curr = head;
        while (curr.next != null)
            curr = curr.next;
        curr.next = temp;
        temp.prev = curr;
        return head;
    }

    static void printList(NodeL head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    static int search(NodeS head, int x) {
        NodeS curr = head;
        for (int i = 1; curr.next != null; i++) {
            if (curr.data == x)
                return i;
            curr = curr.next;
        }
        return -1;
    }

    static NodeS insertAtBegin(NodeS head, int x) {
        NodeS temp = new NodeS(x);
        temp.next = head;
        return temp;
    }

    static NodeS insertAtEnd(NodeS head, int x) {
        NodeS temp = new NodeS(x);
        NodeS curr = head;
        while (curr.next != null)
            curr = curr.next;
        curr.next = temp;
        temp.next = null;
        return head;
    }

    static NodeS insertAtPos(NodeS head, int x, int pos) {
        NodeS temp = new NodeS(x);
        NodeS curr = head;
        for (int i = 1; i < pos - 1; i++)
            curr = curr.next;
        temp.next = curr.next;
        curr.next = temp;
        return head;
    }

    static NodeS deleteFirst(NodeS head) {
        head = head.next;
        return head;
    }

    static NodeS deleteLast(NodeS head) {
        NodeS curr = head;
        while (curr.next.next != null)
            curr = curr.next;
        curr.next = null;
        return head;
    }

    static void printList(NodeS head) {
        NodeS curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
}
