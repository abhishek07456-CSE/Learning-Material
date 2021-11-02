package JAVA.JAVA8;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class predicate {
    public static void main(String[] args) {
        List <Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println("All Numbers ");
        eval(list , n->true);

        System.out.println("Even Numbers");
        eval(list , n->(n&1)==0);

        System.out.println("Odd Numbers");
        eval(list , n->(n&1)==1);
    }

    private static void eval(List<Integer> list,Predicate <Integer> predicate) {
        list.forEach(value->{
            if(predicate.test(value)){
                System.out.print(value+" ");
            }
        });
        System.out.println();
    }
}

// let arr = [1,2,3];
// arr.map(val => 2*val);
// console.log(arr);
