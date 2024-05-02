package QUEUE;

class ArrayImpletation{

    int capacity;

    int[] arr;

    int rear ;

    int front;

    int size;

    public ArrayImpletation(int capacity){
        this.capacity = capacity;
        arr = new int[capacity];
        rear=0;
        front=0;
        size=0;
    }

    public boolean isEmpty(){
        if(size == 0){
            return true;
        }
        return false;
    }

    public void enqueue(int a){
        if(capacity==size){
            throw new RuntimeException("overflow");
        }
        int rear=getRear();
        rear = (rear+1)%capacity;
        arr[rear]=a;
        size++;
    }

    public void dequeue(){
        if(front==-1){
            throw new RuntimeException("underflow");
        }
       front=(front+1)%capacity;
       size--;
    }

    int getRear(){
        if(isEmpty()){
            return -1;
        }
        return (front+size-1)%capacity;
    }

    int getFront(){
        if(isEmpty()){
            return -1;
        }
        return front;
    }

    public static void main(String[] args){
        ArrayImpletation arrayImpletation = new ArrayImpletation(3);
        arrayImpletation.enqueue(10);
        arrayImpletation.enqueue(20);
        System.out.println(arrayImpletation.getRear());
        System.out.println(arrayImpletation.getFront());
        arrayImpletation.dequeue();
        System.out.println(arrayImpletation.getRear());
        System.out.println(arrayImpletation.getFront());
        arrayImpletation.enqueue(30);
        System.out.println(arrayImpletation.getRear());
        System.out.println(arrayImpletation.getFront());
        arrayImpletation.enqueue(30);
        System.out.println(arrayImpletation.getRear());
        System.out.println(arrayImpletation.getFront());
    }
}