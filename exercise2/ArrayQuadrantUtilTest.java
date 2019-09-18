package com.ge.exercise2;

import org.junit.Assume;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ArrayQuadrantUtilTest {

	@SuppressWarnings("static-access")
	@Test
	public void getQuadrantValuesTest() {
		char[][] data = { { 'a', 'b', 'c', 'd' }, { 'e', 'f', 'g', 'h' }, { 'i', 'j', 'k', 'l' },
				{ 'm', 'n', 'o', 'p' } };

		ArrayQuadrantUtil util = new ArrayQuadrantUtil(data);
		Assume.assumeNotNull(util.printQuadrant(data, 2, 2));
		Assume.assumeNotNull(util.printColumn(data, 4));
		Assume.assumeNotNull(util.printRow(data, 4));

		char[] expectedResult = { 'a', 'b', 'e', 'f' };
		assertArrayEquals(expectedResult, util.printQuadrant(data, 2, 2));

		char[] expectedResult1 = { 'a', 'e', 'i', 'm' };
		assertArrayEquals(expectedResult1, util.printRow(data, 4));

		char[] expectedResult2 = { 'a', 'b', 'c', 'd' };
		assertArrayEquals(expectedResult2, util.printRow(data, 4));

	}

	private void assertArrayEquals(char[] expectedResult, Object[] printQuadrant) {
		// TODO Auto-generated method stub

	}
}