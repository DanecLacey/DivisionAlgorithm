import static java.lang.System.*;
import java.util.Scanner;
/* It follows from the Division Algorithm that for every positive integers a and b
there exists unique integers q and r such that b=aq+r where 0≤r<a*/
public class IllDivAlg {
  public static void main( String[] args ) {
    Scanner kb = new Scanner(System.in);
    int a=0, b, q, r;
    String prompt = "> ";

    out.println("\nPlease enter a Natural Number to illustrate the Division Algorithm: ");
    out.print(prompt);
    b = kb.nextInt();
    while (b<1) {
      out.println("Please enter a Natural Number (n>1): ");
      b = kb.nextInt();
    }
    out.println("\n\tb = a * q + r\n\t.\n\t.\n\t.");
    do { //what happens to remainder?
      a++;
      q = b/a;
      r = b%a;
      out.println(b + " = " + a + " * " + q + " + " + r);
    } while ( a != (b+2));
    out.println("\t.\n\t.\n\t.");
  }
}
