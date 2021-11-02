package JAVA.JAVA8;

import java.util.Arrays;

public class reduceStream {
    public static void main(String[] args) {
        int sum1 = Arrays.asList(1,2,3,4,5).stream().reduce(0, (e1 , e2) -> e1+e2);
        System.out.println("sum with stream " + sum1);

        int sum2 = Arrays.asList(1,2,3,4,5).parallelStream().reduce(1, (e1 , e2) -> e1*e2);
        System.out.println("sum with parallel stream " + sum2);

        int max_value = Arrays.asList(-1,-2,-3,6 ,-4,-5).parallelStream().reduce(Integer.MIN_VALUE, (e1 , e2) -> e1 > e2 ? e1 : e2);
        System.out.println("max value with parallel stream " + max_value);
    }
}
