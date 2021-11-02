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
public class cyclic_remove_list {
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
        node5.next = node2;
        detectWithFlagAndRemove(node1);
        // removeLoop(node1);

    }
    public static void detectWithFlagAndRemove(Node head){
        Node temp = head;
        Node prev = null;
        while(temp!=null){
            if(temp.flag == 1){// if we find first flag =1 i.e starting point of list
                System.out.println("prev node "+prev.data + " this node " + temp.data);
                prev.next = null;
                break;
            }
            prev = temp;
            temp.flag = 1;
            temp = temp.next;
        }
        while(head!=null){
            System.out.println(head.data);
            head = head.next;
        }

    }
    public static void detectCyclicFast(Node head){
        Node fast = head;
        Node slow = head;
        while(fast!=null & fast.next!=null){
            System.out.println(slow.data + " " + fast.data);
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
             System.out.println("loop find at "+ slow.data);
             break;
            }
        }
    }
}
