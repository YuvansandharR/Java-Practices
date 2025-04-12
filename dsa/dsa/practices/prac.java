package dsa.practices;

class Node{
    int data;
    Node next;

  Node(int data){
    this.data = data;

  }
}
class LinkedList{
    Node head;
    LinkedList(){
        head = null;
    }
    void add(int data){
        Node newnode = new Node(data);
        if(head==null){
            head = newnode;
            return;
        }
        else{
            Node temp = head;
            while(temp.next!=null){
            temp = temp.next;
            }
            temp.next=newnode;
        }
    }
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data );
            current = current.next;
        }
        
    }
}

public class prac {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(4);
        list.add(24);
        list.display();
    }
    
}
