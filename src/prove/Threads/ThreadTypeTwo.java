package proove;

/**
 * Created by Anastasia on 20.11.2016.
 */
class Solution extends Thread
{
    @Override
    public void run()
    {
        System.out.println("Побочный поток стартовал..." + getId());
    }
}
      class Program{
        static Solution mySecondThread;
        static Solution myThirdThread;
        public static void main(String[] args) {
            mySecondThread = new Solution();
            myThirdThread = new Solution();
            mySecondThread.start();
            System.out.println("стартовал." + mySecondThread.getId());

            myThirdThread.start();
            System.out.println("Еще один"+ myThirdThread.getId());
        }
    }
