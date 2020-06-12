public class RunnableDemo{ //implements Runnable {

//    public void run(){
//        System.out.println("Inside run method");
//    }
    public static  void main(String[] args){

        System.out.println("Creating Runnable...");
        RunnableDemo runnable=new RunnableDemo();

//        Runnable runnable1=new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Inside run method");
//            }
//        };
         //Java 8 , lambda expression
         Runnable runnable1=()->{
             System.out.println("Inside runnable interface");
         };

         Thread th=new Thread(runnable1);
        System.out.println("Starting thread");
        th.start();

        System.out.println("Hiiiiiiiiiiiiiiiiii");

    }
}
