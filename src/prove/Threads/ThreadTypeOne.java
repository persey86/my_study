package proove;


/**
 * Created by Anastasia on 19.11.2016.
 */

class FirstTypeOfThread{
        public static void main(String[] args)
        {
            Thread myThready = new Thread(new Runnable()
            {
                public void run(){
                    System.out.println("Hi!");
                }
            });
            myThready.start();
            System.out.println("Главный поток завершен...");
        }
    }
