import static org.junit.Assert.*;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlaceEmpty() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  @Test
  public void testReversedInPlaceTwo() {
    int[] input3 = {1, 2};
    ArrayExamples.reverseInPlace(input3);
    assertArrayEquals(new int[]{ 2, 1 }, input3);
  }

  @Test
  public void testReversedInPlaceThree() {
    int[] input2 = {1, 2, 3};
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{ 3, 2, 1 }, input2);
  }


  @Test
  public void testReversedEmpty() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversedTwo() {
    int[] input3 = {1, 2};
    assertArrayEquals(new int[]{ 2, 1 }, ArrayExamples.reversed(input3));
  }

  @Test
  public void testReservedThree() {
    int[] input2 = {1, 2, 3};
    assertArrayEquals(new int[]{ 3, 2, 1 }, ArrayExamples.reversed(input2));
  }

  @Test
  public void testAverageWoutLowest() {
    double [] input2 = {1,1,2,3,4};
    assertEquals(2.5,ArrayExamples.averageWithoutLowest(input2),0);
    
    double [] input = {1,2,3,4};
    assertEquals(3.0, ArrayExamples.averageWithoutLowest(input),0);

  }

}
