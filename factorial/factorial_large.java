//For number greater that 21 where it ends up in displaying overloading...this factorial uses BigInteger class in java
import java.math.*;
import java.util.*;

public class Fact {

   public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.println("Enter a number: ");
       int n = in.nextInt();
       String f = factorial(n);
       System.out.println("Factorial is " + f);
   }

   public static String factorial(int n) {
       BigInteger fact = new BigInteger("1");
       for (int i = 1; i <= n; i++) {
           fact = fact.multiply(new BigInteger(i + ""));
       }
       return fact.toString();
   }
}
