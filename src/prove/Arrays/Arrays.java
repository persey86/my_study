package prove;

/**
 * Created on 03.09.2016.
 */
public class Arrays
{
    public static void main(String[] args)
    {
        int[] arr = {4, -54, 0, 6, -987, 432};
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] >= 0)
            {
                int a = arr[i];
                System.out.print(a+" ");
            } else continue;
        }
    }
}
