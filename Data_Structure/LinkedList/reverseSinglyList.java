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
public class reverseSinglyList {
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
        reverse(node1);
        // removeLoop(node1);

    }
    public static void reverse(Node head){
        Node current = head;
        Node next = null;
        Node prev = null;
        while(current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;

        }
        head = prev;
        while(head!=null){
            System.out.println(head.data+ " ");
            head = head.next;
        }
    }
    }
}
