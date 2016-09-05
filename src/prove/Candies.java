package prove;

//package prove;
//
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//
///**
// * Candy weighs X grams, tangerine - Y grams and apple - Z grams.
// Need to write a program that will determine how many different versions of gifts weighing exactly W grams can make Santa Claus.
// Input data
// Function should receive four integers X, Y, Z and W.
// Output data
// Function should return a single integer - the number of gift options.
// Example:
//
// X = 10
// Y = 25
// Z = 15
// W = 40
// Result: 3
// */
public class Candies{
    public static void main(String[] args)
    {
        exerciseFirst(10, 25, 15, 40);
    }
    // ex 1
    public static void exerciseFirst(int x, int y, int z, int w)
    {
        int result = 0;

        // we are going to solve equation:  a*x + b*y + c*z = w

        if (x != 0 && y != 0 && z != 0)
        {

            // if a = 0, b=0 then c = w/z ...

            int maxC = Math.round(w / z);

            // the same but a=0 c=0
            int maxB = Math.round(w / y);

            // the same but b=0 c=0
            int maxA = Math.round(w / x);

            for (int a = 0; a <= maxA; a++)
            {
                for (int b = 0; b <= maxB; b++)
                {
                    for (int c = 0; c <= maxC; c++)
                    {
                        int sum = a * x + b * y + c * z;
                        if (sum == w)
                        {
                            result++;
                        }
                    }
                }
            }
        }
        System.out.println("result: " + result);
    }
}



