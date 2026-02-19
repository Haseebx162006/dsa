public class Linkdlist {
    // Creating the head of the list

    Node head;

    public void insert(int data){
        Node newnode= new Node(data);

        // Case 1 if the list is empty
        if(head==null){
            head= newnode;
            return;
        }

        // Case 2 if the list is not empty

        Node temp = head;
        while (temp.next!=null){
            temp=temp.next;
        }

        temp.next=newnode;
    }


    public void print(){
        // creating a refernce node to get to the last node

        Node temp = head; // pointing towards Head (First node)

        while (temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("NULL");
    }

    public void deleteFromEnd(){
        if (head== null) {
            System.out.println("List is empty");
            return;
        }

        Node temp= head;
        while (temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }
}
