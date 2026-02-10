public class Main{
    public static void main(String[] args) {
        System.out.println("Hello how are you");
        stack s1 = new stack(5);
        s1.push(5);
        s1.push(2);
        System.out.println(s1.peek());
        s1.print();

        question1 q= new question1();
        String s2= q.reverse("haseeb");
        System.out.println(s2);
    }
}