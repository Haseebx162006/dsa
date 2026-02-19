public class circularQueue {
    private int[] arr;
    private int size;
    private int front;
    private int rear;

    // now creating the constructor

    public circularQueue(int size){
        this.size=size;
        arr= new int[size];
        front=-1;
        rear=-1;
    }

    public boolean isEmpty(){
        return (front==-1);
    }
    public void enquee(int element){
        if ((rear +1)% size == front){
            System.out.println("Queue is full");
            return;
        }
        if(front==-1){
            front=0;
        }
        rear= (rear+1)%size;
        arr[rear]=element;
    }
    // now creating a function to remove the element from the queue

    public int dequeue(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }
        int value= arr[front];
        if(front==rear){
            front=-1;
            rear=-1;
        }else{
            front= (front+1)%size;
        }

        return  value;
    }
    public void print(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return;
        }
        int i = front;
        while (true){
            System.out.println(arr[i]);
            if (i==rear){
                break;
            }
            i= (i+1)%size;
        }
    }
}
