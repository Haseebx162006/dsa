public class Queue {
    private int[] arr;
    private int size;
    private int front;
    private int rear;

    // now creating the constructor

    public Queue(int size){
        this.size=size;
        arr = new int[size];
        front=-1;
        rear=-1;
    }

    public void enqueu(int elemnt){
        if (rear==size-1){
            System.out.println("Queue is full");
            return;
        }
        if (front==-1){
            front=0;
        }
        arr[++rear]=elemnt;
    }
    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        if(front>rear){
            front=-1;
            rear=-1;
        }
        return arr[front++];
    }

    public boolean isEmpty(){
        return  rear==-1 || front>rear;
    }
    public  void print(){
        for (int i = front; i <=rear; i++) {
            System.out.println(arr[i]);
        }
    }
    public int peek(){
        if (isEmpty()){
            System.out.println("Bhai queue is empty");
            return -1;
        }
        return  arr[front];
    }
}
