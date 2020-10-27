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
        if(num%3 == 0 && num%5 == 0)
            return "FizzBuzz";
        else if(num%3 == 0)
            return "Fizz";
        else if(num%5 == 0)
            return "Buzz";
        else
            return Integer.toString(num);
    }

    @Test
    public void testFizzBuzz() {
        assertEquals("FizzBuzz",generateFizzBuzz(15));
    }
}