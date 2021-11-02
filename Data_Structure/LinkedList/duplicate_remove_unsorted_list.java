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
public class duplicate_remove_unsorted_list {
    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(1);
        Node node3 = new Node(4);
        Node node4 = new Node(4);
        Node node5 = new Node(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        duplicate_remove(node1);
        // removeLoop(node1);

    }
    public static void duplicate_remove(Node head){
        // 1 1 1 1
        // 1 2 1 2
        Node prev = head;
        Node temp = head;
        HashSet <Integer> set = new HashSet <Integer>();
        while(temp!=null){
          if(set.contains(temp.data))
           prev.next = temp.next;
          else{
              set.add(temp.data);
              prev = temp;
          }
          temp = temp.next;
        }
        while(head!=null){
            System.out.println(head.data+ " ");
            head = head.next;
        }
    }

}
