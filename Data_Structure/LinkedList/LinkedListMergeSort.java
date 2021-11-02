class Node {
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
 }
public class LinkedListMergeSort {
    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(3);
        Node node3 = new Node(4);
        Node node4 = new Node(2);
        Node node5 = new Node(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        Node head = mergeSort(node1);
         while(head!=null){
             System.out.println(head.data);
             head= head.next;
         }
        // removeLoop(node1);

    }
    public static Node getMiddle(Node head){
        if(head == null) return null;
        Node fast = head;
        Node slow = head;
        while(fast.next!=null && fast.next.next!=null){
             fast = fast.next.next;
             slow = slow.next;
        }
        return slow;
    }

    public static Node mergeList(Node left , Node right){
        // 1 2 3 4
        // 1 1 2
        Node result = null;
        if(left == null) return right;
        if(right == null) return left;
        if(left.data <= right.data){
            result = left;
            result.next = mergeList(left.next , right);
        } else {
            result = right;
            result.next = mergeList(left,right.next);

        }
        return result;
    }
    public static Node mergeSort(Node head){
        if(head == null || head.next == null) return head;
        Node middle = getMiddle(head);
        Node nextNode = middle.next;
        middle.next = null;
        Node leftList = mergeSort(head);
        Node rightList = mergeSort(nextNode);
        Node finalList = mergeList(leftList,rightList);
        return finalList;
    }
}
