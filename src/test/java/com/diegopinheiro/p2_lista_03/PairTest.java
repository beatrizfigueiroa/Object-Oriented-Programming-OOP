/**
 * @author Diego Pinheiro <diegompin@gmail.com>
 */
package com.diegopinheiro.p2_lista_03;

import org.junit.Test;
import org.junit.Assert;

public class PairTest {

	@Test
	public void test01NullStrings() {
		String left = null;
		String right = null;
		try {
			new Pair(left, right);
			Assert.fail();
		} catch (Exception e) {

		}
	}

	@Test
	public void test02EmptyStrings() {
		String left = "";
		String right = "";
		try {
			new Pair(left, right);
			Assert.fail();
		} catch (Exception e) {

		}
	}

	@Test
	public void test03LeftStringEmpty() {
		String left = "";
		String right = "Not empty";
		try {
			new Pair(left, right);
			Assert.fail();
		} catch (Exception e) {

		}
	}

	@Test
	public void test04RightStringEmpty() {
		String left = "Not empty";
		String right = "";
		try {
			new Pair(left, right);
			Assert.fail();
		} catch (Exception e) {

		}
	}

	@Test
	public void test05TwoPairsWithIdenticalStringsAreEqual() {
		String left = "left";
		String right = "right";
		try {
			Pair pair1 = new Pair(left, right);
			Pair pair2 = new Pair(left, right);
			Assert.assertTrue(pair1.equals(pair2));
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}

	@Test
	public void test06TwoPairsWithNonIdenticalStringsAreNotEqual() {
		String left = "left";
		String right = "right";
		try {
			Pair pair = new Pair(left, right);
			String actual = pair.toString();
			String expected = "(left, right)";
			Assert.assertEquals(expected, actual);
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}

	@Test
	public void test07PairToString() {
		String left1 = "left1";
		String right1 = "right1";
		String left2 = "left2";
		String right2 = "right2";
		try {
			Pair pair1 = new Pair(left1, right1);
			Pair pair2 = new Pair(left2, right2);
			Assert.assertFalse(pair1.equals(pair2));
		} catch (Exception e) {

		}
	}
}
