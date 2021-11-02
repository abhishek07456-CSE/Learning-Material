package Data_Structure.LinkedList;

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
public class duplicate_remove_sorted_list {
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
        Node prev = null;
        Node temp = head;
        while(temp!=null){
          prev = temp;
          temp = temp.next;
          while(temp!=null && temp.data==prev.data){
              temp = temp.next;
          }
          prev.next = temp;
        }
        while(head!=null){
            System.out.println(head.data+ " ");
            head = head.next;
        }
    }

}
