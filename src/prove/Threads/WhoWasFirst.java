package proove;

/**
 * Created by Anastasia on 20.11.2016.
 */
class Egg extends Thread
{
@Override
    public void run(){
    for (int i =0;i<5;i++){
        try{
            sleep(1000);
        }catch (InterruptedException e){}
        System.out.println("Яйцо!");
    }
}
}
class Chicken{
    static Egg mAnotherOpinion; //побочный эффект

    public static void main(String[] args)
    {
        mAnotherOpinion = new Egg();  // Создание потока
        System.out.println("Спор начат...");
        mAnotherOpinion.start();
        for (int i=0;i<5;i++){
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){}
            System.out.println("Курица!");
        }
        if (mAnotherOpinion.isAlive()) {  // Если оппонент не сказал последнее слово
        try
        {
            mAnotherOpinion.join();   // Подождать пока оппонент выскажется
        }catch (InterruptedException e){}
            System.out.println("Первым появилось яйцо");
        }
        else{
            System.out.println("Первой появилась курица");
        }
        System.out.println("Спор закончен");
        }
    }
