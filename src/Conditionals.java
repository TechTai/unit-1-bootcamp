/**
 * Created by alexandraqin on 4/14/15.
 */
public class Conditionals {

  public static void main (String args[]) {

  }
  //Takes in an int n. Returns a true if n is odd, and false otherwise.
  public static boolean isOdd(int n){
    //originally had only 1 line of code - return (n%2 != 0) but thought question asked specifically for if/else
    if(n%2 != 0) return true;
    return false;
  }
  //Takes in an int n. Returns true if n is a multiple of three, and false otherwise.
  public static boolean isMultipleOfThree(int n){
    return (n%3 == 0);
  }
  //Takes in an int n. Returns true if n is both odd and a multiple of three, and false otherwise.
  public static boolean isOddAndIsMultipleOfThree(int n){
    return ((n%2 != 0) && (n%3 == 0));
  }
  //Write this method building on recent methods
  public static boolean isOddAndIsMultipleOfThree2(int n){
    return (isOdd(n) && isMultipleOfThree(n));
  }
  //Takes in an int n and prints "Fizz" if n is a multiple of three, and print n otherwise.
  public static void fizzMultipleOfThree(int n){
    if(isMultipleOfThree(n)){
      System.out.println("Fizz");
    } else{
      System.out.println(n);
    }
  }
  //Takes in a Person and returns true if the person is from London, and false otherwise.

}
