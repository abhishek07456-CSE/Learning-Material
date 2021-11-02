package Data_Structure.LinkedList;

import java.util.HashSet;

class Node {
   int data;
   int flag = 1;
   Node next;
   public Node(int data){
       this.data = data;
       this.next = null;
       this.flag = 0;
   }
}
public class  _PAIR_WISE_SWAP{
    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        SWAP(node1);
        // removeLoop(node1);

    }
    public static void SWAP(Node head){
        // 1 1 1 1
        // 1 2 1 2
        Node current = head;
        Node prev = null;
        Node last= null;
        while(current!=null){
            prev = current;
            current = current.next;
            if(current!=null){
               prev.next = current.next; // 1 2 3 4  => 1 3 4
               current.next = prev; // 2 1 3 4
               if(last==null){
                   head = current; //SET HEAD TO SECOND ELEMENT I.E 2
               }else{
                   last.next = current; // 2 1 3 4 EG. LAST 1 SO link it to next i.e  4 so 2 1 4 3 maintain
               }
               last = prev; // store 2 element so that linked to 4 so list maintained    2 1 3 4   =>  2 1 4 3
               current = prev.next;
            }
        }
        while(head!=null){
            System.out.println(head.data+ " ");
            head = head.next;
        }
    }

}
