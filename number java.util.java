 import java.util.Scanner;
public class randomNumber {
 public static void guessing()
 {
  Scanner scanObj = new Scanner(System.in);
  int num = 1 + (int)(100 * Math.random());
  int Z = 5;
  int x, pick;

  System.out.println( "A number to be found is chosen between 1 to 100. You got 5 picks only!");

  for (x = 0; x < Z; x++) {
  System.out.println("pick the number:");
  pick =  scanObj.nextInt();
  if (num == pick) {
   System.out.println( "Congrats! You picked the correct number.");
   break;
  }

   else if (num > pick && x != Z - 1) {
        System.out.println("The num is greater than " + pick);
    }
    else if (num < pick
            && x != Z - 1) {
        System.out.println("The num is less than " + pick);
    }
 }
 if (x == Z) {
  System.out.println("You have exhausted Z trials.");
  System.out.println("The num was " + num);
 }
}
 public static void main(String arg[])
 {
  guessing();
 }
}