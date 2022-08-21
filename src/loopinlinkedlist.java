public class loopinlinkedlist {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=next;
        }
    }
    public boolean hascycle(Node head){
        if(head == null){
            return false;
        }
        Node hare=head;
        Node turtle=head;
        while(hare != null || hare.next != null){
            hare = hare.next.next;
            turtle=turtle.next;
            if(hare==turtle){

                return true;
            }

        }
        return false;
    }
