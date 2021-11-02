class Node {
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
 }
 public class floyd_detection_cycle {
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
         node5.next = node3;
         detectCyclicSlowFastPointer(node1);
         // removeLoop(node1);

     }
     public static void detectCyclicSlowFastPointer(Node head){
         Node fast = head;
         Node slow = head;
         Node prev = null;
         while(fast!=null){
            System.out.println(slow.data + " " +fast.data);

            fast = fast.next;
            prev = slow;
            if(fast!=null){
                slow = slow.next;
                fast = fast.next;
            }
            if(slow==head){ // if head is meeting point
                prev.next = null;
                break;
            }
            if(slow == fast){
                System.out.println("meeting point is " + slow.data);
                slow = head;
                // move one by one slow and fast if thy meet i.e starting point of loop so we need to set prev node of fast to null
                /*
                     2->3->4->5
                           |  |
                           7<-6
                    slow    fast
                    2         2
                    3         4
                    4         6
                    5         4
                    6         6

                so meeting point is 6 (distance to 4 i.e starting point is 1 node)
                from head to starting point of loop is 1 distance.
                move slow and fast one by one
                */
                while(slow.next != fast.next){
                    slow = slow.next;
                    fast = fast.next;
                }
                fast.next = null;
                break;
            }
         }

         while(head!=null){
            System.out.println(head.data);
             head = head.next;
        }
     }
 }
