import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 1, 2, 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3, 2, 1 }, input1);
	}

  @Test
	public void testReverseInPlace2() {
    int[] input1 = { 1, 2, 3, 4, 5, 6 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 6, 5, 4, 3, 2, 1 }, input1);
	}

  @Test
  public void testReversed() {
    int[] input1 = { 4, 5, 6 };
    assertArrayEquals(new int[]{ 6, 5, 4 }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversed2() {
    int[] input1 = { 4, 5, 6, 7, 8, 9 };
    assertArrayEquals(new int[]{ 9, 8, 7, 6, 5, 4 }, ArrayExamples.reversed(input1));
  }
}
