//Two ways to use thread in Java
// a) Extending Thread Class , b) Implementing Runnable Interface
public class ThreadDemo extends Thread {

    public void run(){
        System.out.println("Inside run method");
    }
    public static void main(String[] args){
        System.out.println("Inside Main class");
        ThreadDemo td=new ThreadDemo();
        System.out.println("Starting thread....");
        td.start();
        System.out.println("After start of thread");
    }
}
