package JAVA.DesignPattern;

class SingletonPattern implements Cloneable {
   //for overcome from serlisation and clonable
   protected Object clone() throws CloneNotSupportedException{
       return super.clone();
   }

}
class SingletonEager extends SingletonPattern{
    //it intilied without get instance method as instance of SingletonEager is created
    static private SingletonEager instance = new SingletonEager();
    private SingletonEager(){

    }
    static public SingletonEager getInstance(){
        return instance;
    }
    protected Object clone() throws CloneNotSupportedException{
        return instance;
    }
}
class SingletonLazy{
    //only when get instance method called then initialized
    static private SingletonLazy instance = null;
    private SingletonLazy(){

    }
    static public SingletonLazy getInstance(){
        if(instance == null) instance = new SingletonLazy();
        return instance;
    }
}

class SingletonSynchronized{
    static private SingletonSynchronized instance = null;
    private SingletonSynchronized(){

    }
    // //here one thread can read and only one write , but we can allow multiple thread for read , for writing allow only one
    // static public synchronized SingletonSynchronized getInstance(){
    //     if(instance == null) instance = new SingletonSynchronized();
    //     return instance;
    // }

     static public synchronized SingletonSynchronized getInstance(){
         //thread 1 in critical section , thread 2 waiting for trun
         // other thread can read value
        if(instance == null) {
            //only one thread enter for writing (if two user try to get instance at same time then one thread wait)
            //thread 2 wait
            synchronized(SingletonSynchronized.class){
                //thread 1 in critical section
                //when thread 2 come in critical section after thread 1 , it already intialized so that's why condition again check
                if(instance == null){//when second thread enter and previous thread already initialized the instance , then it prevent from initialization again
                   instance = new SingletonSynchronized();
                }
            }
        }
        return instance;
    }


}
public class Singleton {
    public static void main(String[] args) throws CloneNotSupportedException {

        // eager Method
        // SingletonEager i1 = SingletonEager.getInstance();
        // SingletonEager i2 = SingletonEager.getInstance();
        // if(i1.equals(i2)){
        //     System.out.println(i1.hashCode());
        //     System.out.println(i2.hashCode());

        // }

        //lazy instillation
        // SingletonLazy i1 = SingletonLazy.getInstance();
        // SingletonLazy i2 = SingletonLazy.getInstance();
        // if(i1.equals(i2)){
        //     System.out.println(i1.hashCode());
        //     System.out.println(i2.hashCode());

        // }

        //thread safe
        // SingletonSynchronized i1 = SingletonSynchronized.getInstance();
        // SingletonSynchronized i2 = SingletonSynchronized.getInstance();
        // if(i1.equals(i2)){
        //     System.out.println(i1.hashCode());
        //     System.out.println(i2.hashCode());

        // }


        //cloneable

        SingletonEager i1 = SingletonEager.getInstance();
        SingletonEager i2 = (SingletonEager)i1.clone();//prevent clone from new instance
        if(i1.equals(i2)){
                    System.out.println(i1.hashCode());
                    System.out.println(i2.hashCode());

         }else{
            System.out.println("Not equals");
         }




    }
}
