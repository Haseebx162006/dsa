public class Main{
    public static void main(String[] args) {
//        System.out.println("Hello how are you");
//        stack s1 = new stack(5);
//        s1.push(5);
//        s1.push(2);
//        System.out.println(s1.peek());
//        s1.print();
//
//        question1 q= new question1();
//        String s2= q.reverse("haseeb");
//        System.out.println(s2);

//        Linkdlist l1 = new Linkdlist();
//        l1.insert(5);
//        l1.insert(6);
//        l1.print();
//        l1.deleteFromEnd();
//        l1.print();

        Queue q1 = new Queue(5);
        q1.enqueu(5);
        q1.enqueu(6);
        q1.enqueu(7);
        q1.dequeue();
        q1.print();

        System.out.println("Front is:"+q1.peek());
    }
}