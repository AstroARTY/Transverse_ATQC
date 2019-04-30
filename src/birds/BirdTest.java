package birds;

import org.testng.annotations.Test;

import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class BirdTest {
  private static final String TO_STRING_INCORRECT = "toString() method is incorrect";

  @Test()
  public void testBird() {
    assertTrue(Modifier.isAbstract(Bird.class.getModifiers()), "Bird class is not abstract");
  }

  @Test()
  public void testFlyingBird() {
    assertTrue(Modifier.isAbstract(FlyingBird.class.getModifiers()),
        "Bird class is not abstract");

    assertTrue(Bird.class.isAssignableFrom(FlyingBird.class),
        "FlyingBird class does not extend Bird class");
  }

  @Test()
  public void testNonFlyingBird() {
    assertTrue(Modifier.isAbstract(NonFlyingBird.class.getModifiers()),
        "Bird class is not abstract");

    assertTrue(Bird.class.isAssignableFrom(NonFlyingBird.class),
        "NonFlyingBird class does not extend Bird class");
  }

  @Test
  public void testFeed() {
    List<Eagle> eagles = new ArrayList<>();
    eagles.add(new Eagle());
    Zoo.feed(eagles);

    assertEquals(eagles.get(0).toString(), "Eagle", TO_STRING_INCORRECT);

    List<Swallow> swallows = new ArrayList<>();
    swallows.add(new Swallow());
    Zoo.feed(swallows);

    assertEquals(swallows.get(0).toString(), "Swallow", TO_STRING_INCORRECT);

    List<Penguin> penguins = new ArrayList<>();
    penguins.add(new Penguin());
    Zoo.feed(penguins);

    assertEquals(penguins.get(0).toString(), "Penguin", TO_STRING_INCORRECT);

    List<Kiwi> kiwis = new ArrayList<>();
    kiwis.add(new Kiwi());
    Zoo.feed(kiwis);

    assertEquals(kiwis.get(0).toString(), "Kiwi", TO_STRING_INCORRECT);
  }

  @Test
  public void testAccept() {
    List<FlyingBird> birds = new ArrayList<>();
    Zoo.acceptBird(birds, new Eagle());
    Zoo.acceptBird(birds, new Swallow());

    assertEquals(birds.get(0).toString(), "Eagle", TO_STRING_INCORRECT);

    assertEquals(birds.get(1).toString(), "Swallow", TO_STRING_INCORRECT);
  }

  @Test
  public void testRegister() {
    List<Bird> birds = new ArrayList<>();
    Zoo.registerBird(birds, new Eagle());
    Zoo.registerBird(birds, new Swallow());
    Zoo.registerBird(birds, new Penguin());
    Zoo.registerBird(birds, new Kiwi());

    assertEquals(birds.get(0).toString(), "Eagle", TO_STRING_INCORRECT);

    assertEquals(birds.get(1).toString(), "Swallow", TO_STRING_INCORRECT);

    assertEquals(birds.get(2).toString(), "Penguin", TO_STRING_INCORRECT);

    assertEquals(birds.get(3).toString(), "Kiwi", TO_STRING_INCORRECT);
  }
}
