package dsa;

class Node{
    int data;
    Node next;

    Node(int val){
        data = val;
        next = null;
    }
}

class LinkedList{ 
    Node head;
    Node tail;

    LinkedList(){
        head = null;
        tail = null;
    }

    void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    void print(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    void InsertBegin(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    int size(){
        int i = 0;
        Node temp = head;
        while(temp != null){
            i++;
            temp = temp.next;
        }
        return i;
    }

    void InsertPosition(int pos, int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        if(pos > size() - 1){
            tail.next = newNode;
            tail = newNode;
            return;
        }

        int i = 0;
        if(pos == 0){
            newNode.next = head;
            head = newNode;
        }
        else if(pos == size() - 1){
            tail.next = newNode;
            tail = newNode;
        }else{
            Node temp = head;
            Node prev = null;
            while(temp.next != null){
                if(i + 1 == pos){
                    prev = temp;
                    temp = temp.next;
                    prev.next = newNode;
                    newNode.next = temp;
                    return;
                }
                temp = temp.next;
                i++;
            }
        }
    }
}

public class LinkedListImp {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.InsertBegin(100);
        list.print();
        list.InsertPosition(2, 54);
        list.print();
    }
}
