import java.util.*;
class SinglyListOperation{
       static Node head;
       static class Node{
         int data;
         Node next;
         public Node(int d){
             this.data = d;
             this.next = null;
         }
     }
  public static void getChoices(){
    System.out.println("-----------------------------");

      System.out.println("1. Insert At Front.");
      System.out.println("2. Insert At End.");
      System.out.println("3. Insert At Position.");
      System.out.println("4. Print List.");

    System.out.println("-----------------------------");

  }
  public static void insertAtFront(int e){
    //   Node tempHead = this.head;
       Node frontNode =  new Node(e);
       frontNode.next = head;
       head = frontNode;
  }

  public static void insertAtEnd(int e){
       Node tempHead = head;
       Node frontNode =  new Node(e);
       if(tempHead!=null){
            while(tempHead.next!=null){
                    tempHead = tempHead.next;
            }
            tempHead.next = frontNode;
       }else{
            head = frontNode;
       }

  }

  public static void printList(){
    Node tempHead = head;
    while(tempHead!=null){
        System.out.print(tempHead.data+"->");
        tempHead = tempHead.next;
    }
    System.out.print("null\n");
  }
  public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      while(true){
          System.out.println("Enter Choices");
          getChoices();
          int choice = s.nextInt();
          switch (choice){
              case 1:
                System.out.println("Enter Element.");
                int ef = s.nextInt();
                insertAtFront(ef);
                  break;
              case 2:
                  System.out.println("Enter Element.");
                  int eb = s.nextInt();
                  insertAtEnd(eb);
                  break;
              case 4:
                printList();
              default:
                  return;
          }
      }
  }
}