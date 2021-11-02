package JAVA.Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.*;

public class Executor {
    public static void main(String[] args) {

        Callable<Integer> c = () -> {
            try {
                return sum(1, 2);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return 0;
        };

        ExecutorService er = Executors.newFixedThreadPool(2);
        Future<Integer> f = er.submit(c);
        Future<Integer> f1 = er.submit(c);

        try {
            System.out.print(f.get());
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        er.shutdown();

    }

    private static Integer sum(int i, int j) {
         while(true){
             System.out.println(Thread.currentThread().getName());
         }
    }

}
