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
    }
}
