package Serialization;

/**
 * Created on 08.12.2016.
 */
public class GameSaverTest
{
    public static void main(String[] args)
    {
        //There is a few "hero"
        GameCharacter one = new GameCharacter(50, "Эльф", new String[] {"лук", "меч", "кастет"});
        GameCharacter two = new GameCharacter(200, "Тролль", new String[] {"голые руки", "большой топор"});
        GameCharacter three = new GameCharacter(120, "Маг", new String[] {"заклинания", "невидимость"});

        try{
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("Game.ser"));
            os.writeObject(one);
            os.writeObject(two);
            os.writeObject(three);
            os.close();
        }catch (IOException ex){
            ex.printStackTrace();
        }
        one = null;
        two = null;
        three = null;

        try{
            ObjectInputStream is = new ObjectInputStream(new FileInputStream("Game.ser"));  // Here we've read from file
            GameCharacter oneRestore = (GameCharacter) is.readObject();
            GameCharacter twoRestore = (GameCharacter) is.readObject();
            GameCharacter threeRestore = (GameCharacter) is.readObject();

            System.out.println("Тип первого:" + oneRestore.getType());
            System.out.println("Тип второго:" + twoRestore.getType());
            System.out.println("Тип третьего:" + threeRestore.getType());
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
