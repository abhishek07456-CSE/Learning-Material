package Data_Structure.Stack;

import java.util.Stack;

class Node {
    Node left;
    Node right;
    int data;

    Node(int d) {
        this.data = d;
        this.left = this.right = null;
    }
}

class BstPreToPost {
    private static int index = 0;
    public static Node constructTree(int pre[] , int min , int max ){
        if(index >= pre.length) return null;
        if(pre[index]<min || pre[index] > max) return null;
            Node node = new Node(pre[index++]);
            node.left = constructTree(pre,min, node.data);
            node.right= constructTree(pre, node.data , max);
            return node;
    }
    public static Node recursivePreToPost(int pre[]){
        return constructTree(pre, Integer.MIN_VALUE , Integer.MAX_VALUE);
    }
    public static Node preToPostBST(int pre[]) {
        int size = pre.length;
        Stack<Node> stack = new Stack<Node>();
        Node node = new Node(pre[0]);
        stack.push(node);
        int i = 1;
        Node root = node;
        Node peek = null;
        Node last = null; // check last right
        while (i < size) {
            if (stack.empty() || ((peek = stack.peek()) != null && peek.data >= pre[i])) {
                node = new Node(pre[i]);
                stack.push(node);
                peek = stack.peek();
                if (last != null) {
                    if (last.right == null) { // no need to if last right already set
                        last.right = peek; // last element so here 7 right added is 8
                    }
                    last = null;
                }
                i++;
            } else {
                // maintain stack.top always greater
                Node pop = stack.pop();
                /*
                 * 9 7 6 8
                 */
                if (!stack.empty()) {
                    peek = stack.peek();
                    if (peek.left == null) {
                        peek.left = pop; // last pop is left element in peek 7->6 then 9->7 now 9|8 in stack and last is
                                         // 7 when right come so 7 right addded when next element added
                    }
                }
                last = pop;
            }

        }
        while (!stack.empty()) {
            peek = stack.pop();
            if (peek.left == null)
                peek.left = last;
            last = peek;
        }
        return root;
    }

    public static void PostOrderTraversal(Node root) {
        if (root == null)
            return;
        PostOrderTraversal(root.left);
        PostOrderTraversal(root.right);
        System.out.print(root.data + " ");

    }

    public static void main(String[] args) {
        // int arr[] = { 9, 3, 2, 6, 5, 8, 10 };
        int arr[] = {2,1,3};
        // Node root = preToPostBST(arr);
        Node root = recursivePreToPost(arr);
        PostOrderTraversal(root);
    }
}