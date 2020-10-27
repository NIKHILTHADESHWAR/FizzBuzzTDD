import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Scanner;

import org.junit.Test;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int num = in.nextInt();

        for(int i=1; i<=num; i++)
            System.out.println(generateFizzBuzz(i));
    }

    public static String generateFizzBuzz(int num) {
        String result;
        if(multipleOf3(num) && multipleOf5(num))
            result = "FizzBuzz";
        else if(multipleOf3(num))
            result = "Fizz";
        else if(multipleOf5(num))
            result = "Buzz";
        else
            result = Integer.toString(num);
        return result;
    }

    @Test
    public void testFizzBuzz() {
        assertEquals("FizzBuzz",generateFizzBuzz(15));
    }

    private static boolean multipleOf3(int n) {
        if(n%3 == 0)
            return true;
        return false;
    }

    private static boolean multipleOf5(int n) {
        if(n%5 == 0)
            return true;
        return false;
    }
}