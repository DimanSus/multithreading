import java.util.concurrent.Semaphore;

public class MyThread extends Thread{
    String name;
    int size;
    Semaphore semaphore;

    public MyThread(String name, int size, Semaphore semaphore) {
        this.name = name;
        this.size = size;
        this.semaphore = semaphore;
        new Thread(this).start();
    }

    @Override
    public void run() {
       // System.out.println("Корабль " + name + " "+ size+ " ");
        if (name.equals("Bread")){
                try{
                    System.out.println("Корабль "+ name + " "+ size+ " ожидает разрешение для входа в туннель");
                    semaphore.acquire();
                    System.out.println("Корабль "+ name + " "+ size+ " получил разрешение и идет на причал 'Хлеб'      +");
                    Thread.sleep(size*100);
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println("Корабль "+ name + " "+ size+ " разгрузился и освобождает вход в туннель       -");
                semaphore.release();
            }
        else if (name.equals("Banana")){
            try{
                System.out.println("Корабль "+ name + " "+ size+ " ожидает разрешение для входа в туннель");
                semaphore.acquire();
                System.out.println("Корабль "+ name + " "+ size+ " получил разрешение и идет на причал 'Бананы'       +");
                Thread.sleep(size*100);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("Корабль "+ name + " "+ size+ " разгрузился и освобождает вход в туннель        -");
            semaphore.release();
        }
        else if (name.equals("Clothes")){
            try{
                System.out.println("Корабль "+ name + " "+ size+ " ожидает разрешение для входа в туннель");
                semaphore.acquire();
                System.out.println("Корабль "+ name + " "+ size+ " получил разрешение и идет на причал 'Одежда'    +");
                Thread.sleep(size*100);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("Корабль "+ name + " "+ size+ " разгрузился и освобождает вход в туннель       -");
            semaphore.release();
        }
        }
    }

