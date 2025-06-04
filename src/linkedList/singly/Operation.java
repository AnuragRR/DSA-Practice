package linkedList.singly;

public class Operation {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.insertAtBeginning(2);
        linkedList.insertAtBeginning(3);
        linkedList.insertAtLast(5);
        linkedList.insertAtBeginning(8);
//        linkedList.deleteFromFirst();
        linkedList.deleteFromLast();
        linkedList.printData();
        linkedList.deleteFromLast();
        linkedList.printData();
        linkedList.deleteFromLast();
        linkedList.printData();
        linkedList.deleteFromLast();
        linkedList.printData();
    }
}
