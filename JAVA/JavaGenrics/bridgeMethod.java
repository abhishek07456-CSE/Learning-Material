package JAVA.JavaGenrics;

class Node<T> {

    public T data;

    public Node(T data) { this.data = data; }
    public void setData(Object obj){
        this.data = (T) obj;
        System.out.println(obj);
    }
}

class MyNode extends Node<Integer> {
    public MyNode(Integer data) { super(data); }

    public void setData(Integer data) {
        System.out.println("MyNode.setData");
        super.setData(data);
    }
}
public class bridgeMethod {
     static{
         System.out.println("x");
     }
    // public static void main(String[] args) {
    //     Node <Integer> node = new Node(2);
    //     node.setData(67.99);
    // }
}
