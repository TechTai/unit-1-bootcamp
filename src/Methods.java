/**
 * Created by alexandraqin on 4/14/15.
 */
public class Methods {

  public static void main (String args[]) {

  }
  //Takes an int as a parameter and returns the square of that integer.
  public static int calculateSquare(int n){
    return Math.pow(n,2);
  }
  //Takes an int as a paramenter and returns the square root of that integer.
  public static int calulcateSquareRoot(int n){
    return Math.sqrt(n);
  }
  //Takes a String as a parameter and returns the String in lowercase.
  public static String toLowerCase(String s){
    return s.toLowerCase();
  }
  //Takes 2 int parameteres and determines if the second is a multiple of the first.
  public static boolean isMultiple(int a, int b){
    return (b % a == 0);
  }
  //Takes an int as a parameter and prints the integer surrounded bu astericsks with the length of each side equal to the given integer
  public static void prettyInteger(int p){
    int front = p(*);
    int back = p(*)
    System.out.println(front + p + back);
  }
  //Takes 2 ints as parameters and returns a random int within that range
  public static int random(int min, int max){
    return (rand.nextInt((max-min) + 1) + min);
  }
}

