package QUEUE;
import linkedList.Node;

class LinkedListImplementation{

    Node front;

    Node rear;

    int size;

    LinkedListImplementation(){
        size =0;
        front=null;
        rear=null;
    }

    public boolean isEmpty(){
        if(front==null){
            return true;
        }
        return false;
    }

    public void enqueue(int a){
        Node node = new Node(a);
        if(front==null){
            front=node;
            rear=node;
            size++;
        }
        else{
            rear.next=node;
            rear=node;
            size++;
        }
    }

    public void dequeue(){
        if(front==null){
            throw new RuntimeException("");
        }
        else{
            front=front.next;
            size--;
        }
    }

    public int getSize(){
        return size;
    }

    public int getfront(){
        return front.data;
    }

    public int getReaer(){
        return rear.data;
    }

public static void main(String[] args) {
    LinkedListImplementation ll=new LinkedListImplementation();
    ll.enqueue(10);
    ll.enqueue(20);
    ll.enqueue(30);

    System.out.println(ll.getfront());
    System.out.println(ll.getReaer());
    System.out.println(ll.getSize());

    ll.dequeue();
    System.out.println(ll.getfront());
    System.out.println(ll.getReaer());
    System.out.println(ll.getSize());

}

}