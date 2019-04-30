package birds;

import java.util.List;

public class Zoo {

  /**
   * Feeds different bird sections of the zoo.
   *
   * @param fedBirds list of birds of particular type
   */
  public static void feed(List<? extends Bird> fedBirds) {
    System.out.println("Feeding birds");
    for (Bird bird : fedBirds) {
      bird.toString();
    }
  }

  /**
   * Adds birds to a flying section of the zoo.
   *
   * @param list list of birds of particular type
   * @param bird new bird
   */
  public static void acceptBird(List<? super FlyingBird> list, FlyingBird bird) {
    System.out.println("Accepting bird to a section");
    bird.checkWings();
    list.add(bird);
    list.toString();
  }

  /**
   * Adds bird to the general list.
   *
   * @param birds   list of birds
   * @param newBird bird to add
   */
  public static void registerBird(List<? super Bird> birds, Bird newBird) {
    System.out.println("Adding bird to the birds list");
    birds.add(newBird);
    birds.toString();
  }
}