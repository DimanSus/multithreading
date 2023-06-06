import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(5, true);
        int k =(int)(Math.random()*1000)+50;
        System.out.println(k);

        for (int i = 0; i < k; i++) {
            switch (i%10){
                case (1): new MyThread("Bread", 10, semaphore);
                    break;
                case(2): new MyThread( "Bread", 50, semaphore);
                    break;
                case(3): new MyThread( "Bread", 100, semaphore);
                    break;
                case(4): new MyThread( "Banana", 10, semaphore);
                    break;
                case(5): new MyThread( "Banana", 50, semaphore);
                    break;
                case(6): new MyThread( "Banana", 100, semaphore);
                    break;
                case(7): new MyThread( "Clothes", 10, semaphore);
                    break;
                case(8): new MyThread( "Clothes", 50, semaphore);
                    break;
                case(9): new MyThread( "Clothes", 100, semaphore);
                    break;
                default:
                    break;
            }
        }
    }
}
