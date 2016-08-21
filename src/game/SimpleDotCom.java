package game;

/**
 * Created by Kostya on 21.08.2016.
 */
class SeaBattle
{
    public static void main(String[] args)
    {
        int numOfGuess = 0;
        GameHelper helper = new GameHelper();
        SimpleDotCom theDotCom = new SimpleDotCom();
        int randomNum = (int) (Math.random() * 5);                 // generate number for 1st stack

        int[] locations = {randomNum, randomNum + 1, randomNum + 2};
        theDotCom.setLocationCells(locations);          // place of site
        boolean isAlive = true;                           // inspect: has finished game or no
        while (isAlive == true)
        {
            String guess = helper.getUserInput("Введите число");
            String result = theDotCom.checkYourself(guess); //trying input values and saving result in String
            numOfGuess++;
            if (result.equals("Потопил"))
            {
                isAlive = false;
                /**
                 * if "site" has broken than we are assigning value "false" (end of cycle) and printing result
                 */
                System.out.println("Вам потребовалось" +" "+ numOfGuess +" "+ "попыток");
            }
        }
    }
}

public class SimpleDotCom{
int [] locationCells;
    int numOfHits=0;

    public void setLocationCells(int [] locs){
        locationCells = locs;
    }
    public String checkYourself(String stringGuess){
        int guess=Integer.parseInt(stringGuess);
        String result="Мимо";
        for (int cell: locationCells){
            if (guess == cell){
                result = "Попал";
                numOfHits++;
                break;
            }
        }
        if (numOfHits==locationCells.length){
            result="Потопил";
        }
        System.out.println(result);
        return result;
    }
}

