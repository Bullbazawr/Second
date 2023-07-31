package SEMINAR2;

public class MyLinkedLIst {
    private Node head;
    private Node tail;
    
    public MyLinkedLIst(){
        head = null;
        tail = null;
    }

    private boolean isEmpty() {
        return head == null;
    }

    public void PrintMy() {
        Node temp = head;
        while (temp != null) {
            System.out.printf("%s ", temp.data);
            temp = temp.next;
        }
        System.out.println();
    }

    public void addFirst(Object data) {
        Node temp = new Node(data);
        if (isEmpty())
            tail = temp;
        else
            head.prev = temp;
        temp.next = head;
        head = temp;
    }

    public void addLast(Object data) {
        Node temp = new Node(data);
        if (isEmpty())
            head = temp;
        else
            tail.next = temp;
        temp.prev = tail;
        tail = temp;
    }

    public void addByIndex(Object data, int index) {
        Node current = head;
        int count = 0;
        Node temp = new Node(data);
        while (current != null && count < index) {
            current = current.next;
            count++;
        }
        current.prev.next = temp;
        temp.prev = current.prev;
        current.prev = temp;
        temp.next = current;
    }

    public void RemoveFirst() {
        if (head.next == null)
            tail.next = null;
        else
            head.next.prev = null;
        head = head.next;
    }

    public void RemoveLast() {
        if (head.next == null)
            head = null;
        else
            tail.prev.next = null;
        tail = tail.prev;
    }

    public void RemoveByIndex(int index) {
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        if (current == head)
            RemoveFirst();
        else if (current == tail)
            RemoveLast();
        else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }

    }

    public void Reverse(){
        Node current = head;
        Node temp;
        while(current != null){
            temp = current.next;
            current.next = current.prev;
            if(temp != null){
                current.prev = temp;
                current = temp;
            }
            else{
                current.prev = null;
                current = null;
            }
        }
        temp = head;
        head = tail;
        tail = temp;
    }
}
