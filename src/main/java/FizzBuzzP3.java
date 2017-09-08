/**
 * Created by jwest1 on 9/1/2017.
 */
import java.lang.reflect.Array;
import java.util.Objects;
import java.util.Scanner;

public class FizzBuzzP3 {

    public static Object[] FizzBuzz(int n)
    {
        //Because I wanted to have a array to keep track of both ints and Strings, the object array seemed to be the
        //best option


        if(n<1)
        {
            Object blank[] = {"Invalid number"};
            return blank;
        }

        Object fizzBuzz[] = new Object[n];

        for (int i = 1; i <= fizzBuzz.length; i++)
        {
            int index = i;
            if(index >= 1 && index%3==0 && index%5 != 0)
            {
                fizzBuzz[i-1] = "Fizz";
                //The continues are used as a way to be sure that once a number was found to be fizz or buzz or both
                //That it wouldnt have to go through the rest of the loop
                continue;
            }
            else if(index >= 1 && index%3!=0 && index%5 == 0)
            {
                fizzBuzz[i-1] = "Buzz";
                continue;
            }
            else if(index >= 1 && index%3==0 && index%5 == 0)
            {
                fizzBuzz[i-1] = "Fizz-Buzz";
                continue;
            }
            else
            {
                fizzBuzz[i-1] = i;
            }
        }
        return fizzBuzz;

    }

    public static void main(String args[])
    {
        boolean TF = true;
        int n;
        int temp;
        while (TF)
        {
            Scanner scan = new Scanner(System.in);

            System.out.println("Enter the maximum number for FizzBuzz or 'stop' to end program.");
            String str = scan.nextLine();
            if(Objects.equals(str, "stop") || )
            {
                TF = false;
                break;
            }else
                n= Integer.parseInt(str);
            Object tempArray[] = FizzBuzzP3.FizzBuzz(n);
            for(int i = 0; i < tempArray.length; i++)
            {
                System.out.println(tempArray[i]);
            }

        }
    }

}
