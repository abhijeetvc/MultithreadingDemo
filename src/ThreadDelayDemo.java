public class ThreadDelayDemo {

    public static void main(String[] args){
        String[] countries={"India","USA","Singapore","France","Australia"};

        Runnable runnable=()->{
            System.out.println("Reading country names");
            for (String country:countries) {
                System.out.println("Country Name: "+country);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread th=new Thread(runnable);
        System.out.println("Starting thread");
        th.start();
    }
}
