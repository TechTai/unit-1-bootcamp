/**
 * Created by alexandraqin on 4/14/15.
 */
public class Loops {

  public static void main (String args[]) {

  }
  //Write a method that prints the numbers 1 through 10 using a loop.
  public static void printRange(int i){
    for(int i=1; i<=10; i++){
      System.out.println(i);
    }
  }
  //Write a method that prints the numbers 1 through 10 using a different kind of loop.
  public static void printRange2(int i){
    int i = 1;
    while(i <= 10){
      System.out.println(i);
      i++;
    }
  }
  //Write a method that takes in an int n and prints the numbers 1 through n.
  public static void printNumbers(int n){
    for(int i = 1; i <= n; i++ ){
      System.out.println(i);
    }
  }
  //Write a method that takes in an int n and prints the even numbers 2 through n.
  public static void printEven(int n){
    for (int i = 2; i <= n; i++){
      if (i%2 == 0) {
        System.out.println(i);
        i++;
      }
    }
  }
  //Write a method that prints the sum of 1 through 10 using a loop.
  public static void printSum(){
    int sum = 0;
    for(int i = 1; i <= 10; i++){
        sum = sum + i;
    }
    System.out.println(sum);
  }
  //Write a method that takes in an int n and prints the sum of the numbers 1 through n using a loop.
  public static void printNSum(int n){
    int sum = 0;
    for(int i = 1; i <= n; i++){
        sum = sum + i;
    }
    System.out.println(sum);
  }
  //Use the method you wrote in part 6 to print the sum of the numbers from 1 through 10000.
  public static void printMoreSum(){
    int sum = 0;
    for(int i = 1; i <= 10000; i++){
      sum = sum + i;
    }
    System.out.println(sum);
  }
  //Write a method that takes in an int n and a String s and prints out s on its own line, n times. If n is negative, print "".
  public static void printString(int n, String s){
    if(n > 0){
      System.out.println(StringUtils.repeat(s,n));
    } else {
      System.out.print("");
    }
  }
  //Modify the method to print out the string concatenated with itself n times.
  public static void printString(int n, String s){
    if(n > 0){
      System.out.print(StringUtils.repeat(s,n));
    } else {
      System.out.print("");
    }
  }
  //Write a method that prints the first ten Fibonnaci numbers.
  public static void fib(10){
    System.out.print("0 1");

    int a = 0;
    int b = 1;

    for(int i = 0; i < 10; i++){
      int next = a + b;
      a = b;
      b = next;
      System.out.println(next + " ");
    }
  }
  //Modify the method to sum the first ten Fibonnaci numbers.
  public static void fibSum(10){
    int a = 0;
    int b = 1;

    for(int i = 0; i < 10; i++){
      int next = a + b;
      a = b;
      b = next;
      int sum = 0;
      sum = sum + next;
      System.out.println(sum);
    }
  }
  //Modify the method to take in an int n and sum the first n Fibonnaci numbers.
  public static void fibSum(int n){ // int n = 10
    int a = 0;
    int b = 1;

    for(int i = 0; i < n; i++){
      int next = a + b;
      a = b;
      b = next;
      int sum = 0;
      sum = sum + next;
      System.out.println(sum);
    }
  }

}
