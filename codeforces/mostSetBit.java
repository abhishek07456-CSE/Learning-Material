public class mostSetBit {
     public static void main(String[] args) {

        /*
             2^n = input
             eg 8 => 2^n =8 => (nlog2 = log 8 )=>(n = log8/log2);
        */
         int k  =(int) (Math.log(20) / Math.log(2));
         System.out.println((int)Math.pow(2,k));

     }
}
