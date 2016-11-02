package prove;

/**
 * Created by Anastasia on 12.08.2016.
 */
public class UseMainException
{
    public static void main(String[] args)
    {
        int a=4;
        try
        {
            System.out.println(a/0);
        }catch (ArithmeticException e){
            System.out.println("Произошла недопустимая ошибка - деление на ноль!");
        }
    }
}

