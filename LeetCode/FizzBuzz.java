import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SweetJava {
       public static void main(String[] args){
           System.out.print("Please inset a number: ");
           Scanner scanner = new Scanner(System.in);
           int n = Integer.parseInt(scanner.nextLine());
           System.out.println(fizzBuzz(n));
        }

    private static List<String> fizzBuzz (int n) {
        List<String> ans = new ArrayList<String>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                ans.add("FizzBuzz");
            } else if (i % 3 == 0) {
                ans.add("Fizz");
            } else if (i % 5 == 0) {
                ans.add("Buzz");
            } else
                ans.add(Integer.toString(i));
        }
        return ans;
    }
}