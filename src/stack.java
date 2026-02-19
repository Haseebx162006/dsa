public class stack {

    private int[] arr;
    private int size;
    private int top;

    public stack(int size) {
       this.size=size;
       arr= new int[size];
       top=-1;
    }

    public void push(int element) {
        if (top == size - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = element;
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--];
    }

    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void print() {
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
