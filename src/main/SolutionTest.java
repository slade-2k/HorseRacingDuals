package main;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void WhenInputIsSortedIntegerTestArrayThenOutputShouldReturn1() {
		ArrayList<Integer> input = new ArrayList<Integer>();
		input.add(5);
		input.add(8);
		input.add(9);
		
		int lowest = (new Solution()).getClosestStrengths(input);
		assertEquals(1, lowest);
	}
	
	@Test
	public void WhenInputIsUnsortedIntegerTestArrayThenOutputShouldReturn1() {
		ArrayList<Integer> input = new ArrayList<Integer>();
		input.add(5);
		input.add(15);
		input.add(17);
		input.add(3);
		input.add(8);
		input.add(11);
		input.add(28);
		input.add(6);
		input.add(55);
		input.add(7);
		
		int lowest = (new Solution()).getClosestStrengths(input);
		assertEquals(1, lowest);
	}
}
//	@Test
//	public void WhenInputIsUnsortedHugeIntegerTestArrayThenOutputShouldReturn47{
//
//	}
