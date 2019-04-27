package problem1;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.*;

public class KataTest {

	@Test
	public void basicTest() {

		int[] input = new int[] { -1, -2, -3, -4, -5 };
		int[] expected = new int[] { 1, 2, 3, 4, 5 };
		assertEquals(Arrays.toString(expected),
				Arrays.toString(Kata.invert(input)));

		input = new int[] { -1, 2, -3, 4, -5 };
		expected = new int[] { 1, -2, 3, -4, 5 };
		assertEquals(Arrays.toString(expected),
				Arrays.toString(Kata.invert(input)));

		input = new int[] {};
		expected = new int[] {};
		assertEquals(Arrays.toString(expected),
				Arrays.toString(Kata.invert(input)));

		input = new int[] { 0 };
		expected = new int[] { 0 };
		assertEquals(Arrays.toString(expected),
				Arrays.toString(Kata.invert(input)));
	}

	@Test
	public void randomTest1() { getRandomArray();	}
  
  @Test
	public void randomTest2() { getRandomArray(); }

  @Test
	public void randomTest3() { getRandomArray(); }

	public static boolean getRandomBoolean() {
		return Math.random() < 0.5;
	}
  
  public static int getRandomInt() {
    int ranNum = (int) Math.random() * 100;
    return getRandomBoolean() ? ranNum : ranNum * -1; }
  
  public static int[] getRandomArray() {
		int[] ranArray = new int[ getRandomInt()];
		for (int x = 0; x < ranArray.length; x++) {
      ranArray[x] = getRandomInt();
    }
    return ranArray;
  }
}