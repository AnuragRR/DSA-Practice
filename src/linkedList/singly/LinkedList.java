package linkedList.singly;

public class LinkedList {
    Node head=null;

    public void insertAtBeginning(int item){
        Node newNode = new Node(item);
        if (head == null){
            head = newNode;
            return;
        }
        newNode.next= head;
        head=newNode;

    }

    public void insertAtLast(int item){
        Node newNode = new Node(item);
        if (head == null){
            head = newNode;
            return;
        }
        Node temp = head;

        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void insertAtPosition(int item, int position){
        Node newNode = new Node(item);
    }

    public void printData(){
        if (head == null){
            System.out.println("Linked list is empty");
            return;
        }
        Node temp = head;
        while (temp != null){
            if (temp.next == null){
                System.out.print(temp.data);
            }
            else {
                System.out.print(temp.data+" ==> ");
            }
            temp = temp.next;
        }
        System.out.println();
    }

    public void deleteFromFirst(){
        if (head == null){
            System.out.println("Nothing to delete");
        }
        head = head.next;
    }

    public void deleteFromLast(){
        Node temp = head;
        Node previous = null;
        if (head == null){
            System.out.println("Nothing to delete");
            return;
        }
        if (temp.next == null){
            head = null;
            return;
        }
        while (temp.next!=null){
            previous = temp;
            temp=temp.next;
        }
        previous.next = null;
//        System.out.println();
    }

//    public ListNode middleNode(ListNode head) {
//
//        int cnt = 0;
//        ListNode temp = head;
//        while (temp!=null){
//            temp=temp.next;
//            cnt++;
//        }
//        int mid = (int) Math.ceil(cnt+1/2);
//        for (int i=0 ;i<=mid; i++){
//            temp = head;
//            temp = temp.next;
//        }
//        return temp;
//    }
public Node addOne() {
    reverse();
    Node temp = head;
    while (temp.next!= null){
        if (temp.data == 9){
            temp.data = 0;
        }
        else {
            temp.data  = temp.data+1;
            break;
        }
        temp = temp.next;
    }
    if (temp.next == null){
        if (temp.data<9){
            temp.data++;
        }
        else {
            temp.data = 0;
            Node newNode = new Node(1);
            temp.next = newNode;
        }
    }
    return reverse();
}
public Node reverse(){
        Node temp = head;
        Node current = temp;
        Node prev = null;
        while (current != null){
            Node after =  current.next;
            current.next = prev;
            prev = current;
            current = after;

        }
        head = prev;
        return head;

}
}
