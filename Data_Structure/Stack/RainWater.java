package Data_Structure.Stack;

import java.util.Stack;

public class RainWater {
    public static int twoArray(int height[]) {
        int l = height.length;
        int left[] = new int[l];
        int right[] = new int[l];
        left[0] = height[0];
        // store min
        for (int i = 1; i < l; i++) {
            left[i] = Math.max(height[i], left[i - 1]);
        }
        right[l - 1] = height[l - 1];
        for (int i = l - 2; i >= 0; i--) {
            right[i] = Math.max(height[i], right[i + 1]);
        }
        /*
         * height = 2 1 2 0 0 2 left = 2 2 2 2 2 2 right = 2 2 2 2 2 2 water =
         * Math.min(left[i], right[i]) - height[i]; = 0 1 0 2 2 0 = 5 unit water stored
         */
        int result = 0;
        for (int i = 0; i < l; i++) {
            result += Math.min(left[i], right[i]) - height[i];
        }
        return result;

    }

    public static int usingStack(int height[]) {
        int result = 0;
        Stack<Integer> stack = new Stack<Integer>();
        int l = height.length;
        for (int i = 0; i < l; i++) {
            while (!stack.empty() && height[stack.peek()] < height[i]) {
                int pop = stack.pop();
                if (stack.empty())
                    break; // no left boundary found
                int length = i - stack.peek() - 1;
                /*
                 * 2 1 3(at i) pop element is 1 that in between left and right i.e 2 and 3 pop 1
                 * now peek at 0 index gap = i - peek - 1 = 2 - 0 - 1 = 1 min height = min(2,3)
                 * - 1 (popped element) = 2 -1 so 1 unit store between 2 1 3
                 */
                result = result + length * (Math.min(height[stack.peek()], height[i]) - height[pop]);
            }
            stack.push(i);
        }
        return result;
    }

    public static int twoPointer(int height[]) {
        int r = height.length - 1;
        int l = 0;
        int lm = 0;
        int rm = 0;
        int result = 0;
        while (l < r) {
            if (height[l] > height[r]) {
                // move right to till left
                /*
                 * 7 1 2 5
                 *
                 */
                if (height[r] > rm) {
                    rm = height[r]; // update rm ie. 5
                } else {
                    result += rm - height[r];
                    /*
                     * 5(right max) - 2 5(right max ) - 1
                     *
                     */
                }
                r = r - 1;// move back till right max until left max found
            } else {
                /*
                 *
                 * 5 1 2 7
                 */
                if (height[l] > lm) {
                    lm = height[l];
                } else {
                    result += lm - height[l];
                    /*
                     * 5(left max) - 2 5(left max ) - 1
                     *
                     */
                }
                l = l + 1; // move till until max found then right
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 1, 2, 0, 0, 2 };
        long start = System.nanoTime();
        System.out.println("result using two array " + twoArray(arr));
        long end = System.nanoTime();
        System.out.println("Time Taken " + (end - start));

        start = System.nanoTime();
        System.out.println("\nresult using two stack " + usingStack(arr));
        end = System.nanoTime();
        System.out.println("Time Taken " + (end - start));

        start = System.nanoTime();
        System.out.println("\nresult using two pointer " + twoPointer(arr));
        end = System.nanoTime();
        System.out.println("Time Taken " + (end - start));

    }
}
