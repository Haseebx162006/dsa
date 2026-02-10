package LabQuestion;

 abstract class Animal {
    public void eat(){
        System.out.println("He is eating");
    }
}
public class cow extends Animal{
    public void run(){
        System.out.println("He is running");
    }
}
class Main{
    public static void main(String[] args) {
        cow c= new cow();
        c.run();
    }
}
