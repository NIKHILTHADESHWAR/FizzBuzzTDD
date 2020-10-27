import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int num = in.nextInt();

        for(int i=1; i<=num; i++)
            System.out.println(generateFizzBuzz(i));
    }

    public static String generateFizzBuzz(int num) {
        return "Testing...";
    }
}