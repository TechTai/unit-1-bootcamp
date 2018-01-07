/**
 * Created by alexandraqin on 4/14/15.
 */
public class ClassesAndObjects {

  public static void main (String args[]) {
    /* Create 3 cats named Garfield, Pink Panther, and Catwoman.
       Assign each of them a favorite food (Garfield's favorite food should be Lasagna).
       Assign each of them an age. */

    Cat c1 = new Cat;
    c1.setName("Garfield");
    c1.setFavoriteFood("Lasagna");
    c1.setAge(12);

    Cat c2 = new Cat;
    c2.setName("Pink Panther");
    c2.setFavoriteFood("Clues");
    c2.setAge(20);

    Cat c3 = new Cat;
    c3.setName("Catwoman");
    c3.setFavoriteFood("Jewelry");
    c3.setAge(30);

    Person p = new Person;
    p.setOwner("Jon");
  }
  //Write a method called isOlder that takes 2 Cats as parameters and returns whether or not the first Cat is older than the second.
  public static boolean isOlder(c1,c3){
    return (age(c1) < age(c3));
  }
  //Write a method called makeBestFriends that takes 2 Cats as parameters and sets both of their favorite foods to the same thing.
  public static void makeBestFriends(c2,c3){
    return (favoriteFood(c2).equals(favoriteFood(c3)));
  }
  //Write a method called makeKitten that takes 2 Cats as parameters and returns a new Cat with a name that is the combination of the 2 parent Cats' names. The age of the new Cat should be 0.
  public static String makeKitten(c2, c1){

  }
  //Write a method called adoption that takes 1 Cat and 1 Person as a paramater and sets the Cat's owner to be the Person.
  public static void adoption(c1,p){
    return (c.setOwner("Jon"));
  }


}
