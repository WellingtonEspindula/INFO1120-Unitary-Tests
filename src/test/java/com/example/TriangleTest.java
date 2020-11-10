package com.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    private static Triangle mTriangle;

    @Test
    public void testForValidTriangle() {
        mTriangle = new Triangle(3, 4, 5);
        assertTrue(mTriangle.isValid());

        mTriangle = new Triangle(3, 3, 3);
        assertTrue(mTriangle.isValid());
    }

    @Test
    public void testForZeroSidedTriangle() {
        mTriangle = new Triangle(3, 0, 5);
        assertFalse(mTriangle.isValid());

        mTriangle = new Triangle(0, 3, 5);
        assertFalse(mTriangle.isValid());

        mTriangle = new Triangle(0, 0, 5);
        assertFalse(mTriangle.isValid());

        mTriangle = new Triangle(3, 0, 5);
        assertFalse(mTriangle.isValid());

        mTriangle = new Triangle(3, 0, 0);
        assertFalse(mTriangle.isValid());
    }

    @Test
    public void testForAllZeroSidedTriangle() {
        mTriangle = new Triangle(0, 0, 0);
        assertFalse(mTriangle.isValid());
    }

    @Test
    public void testForNegativeSidedTriangle() {
        mTriangle = new Triangle(-3, 4, 5);
        assertFalse(mTriangle.isValid());

        mTriangle = new Triangle(-3, -4, 5);
        assertFalse(mTriangle.isValid());

        mTriangle = new Triangle(-3, 4, -5);
        assertFalse(mTriangle.isValid());

        mTriangle = new Triangle(-3, -4, -5);
        assertFalse(mTriangle.isValid());

        mTriangle = new Triangle(3,-4,5);
        assertFalse(mTriangle.isValid());

        mTriangle = new Triangle(3, -4, -5);
        assertFalse(mTriangle.isValid());

        mTriangle = new Triangle(3, 4, -5);
        assertFalse(mTriangle.isValid());
    }

    @Test
    public void testForSumOfTwoSidesEqualsToThirdSide() {
        mTriangle = new Triangle(12, 10, 2);
        assertFalse(mTriangle.isValid());

        mTriangle = new Triangle(12, 10, 2);
        assertFalse(mTriangle.isValid());

        mTriangle = new Triangle(12, 2, 10);
        assertFalse(mTriangle.isValid());

        mTriangle = new Triangle(10, 12, 2);
        assertFalse(mTriangle.isValid());

        mTriangle = new Triangle(10, 2, 12);
        assertFalse(mTriangle.isValid());

        mTriangle = new Triangle(2, 10, 2);
        assertFalse(mTriangle.isValid());

        mTriangle = new Triangle(2, 12, 10);
        assertFalse(mTriangle.isValid());
    }

    @Test
    public void testForUnsatisfiedTriangleInequality() {
        mTriangle = new Triangle(5, 15, 3);
        assertFalse(mTriangle.isValid());

        mTriangle = new Triangle(5, 3, 15);
        assertFalse(mTriangle.isValid());

        mTriangle = new Triangle(15, 5, 3);
        assertFalse(mTriangle.isValid());

        mTriangle = new Triangle(15, 3, 5);
        assertFalse(mTriangle.isValid());

        mTriangle = new Triangle(3, 5, 15);
        assertFalse(mTriangle.isValid());

        mTriangle = new Triangle(3, 15, 5);
        assertFalse(mTriangle.isValid());
    }

    @Test
    public void testForEquilateralTriangle() {
        mTriangle = new Triangle(3, 3, 3);
        assertEquals(TriangleType.EQUILATERAL, mTriangle.getTriangleType());
    }

    @Test
    public void testForInvalidEquilateralTriangle() {
        mTriangle = new Triangle(0, 0, 0);
        assertNotEquals(TriangleType.EQUILATERAL, mTriangle.getTriangleType());
        assertNull(mTriangle.getTriangleType());

        mTriangle = new Triangle(-1, -1, -1);
        assertNotEquals(TriangleType.EQUILATERAL, mTriangle.getTriangleType());
        assertNull(mTriangle.getTriangleType());
    }

    @Test
    public void testForScaleneTriangle() {
        mTriangle = new Triangle(3, 4, 5);
        assertEquals(TriangleType.SCALENE, mTriangle.getTriangleType());

        mTriangle = new Triangle(5, 4, 3);
        assertEquals(TriangleType.SCALENE, mTriangle.getTriangleType());

        mTriangle = new Triangle(5, 3, 4);
        assertEquals(TriangleType.SCALENE, mTriangle.getTriangleType());

        mTriangle = new Triangle(4, 3, 5);
        assertEquals(TriangleType.SCALENE, mTriangle.getTriangleType());

        mTriangle = new Triangle(4, 5, 3);
        assertEquals(TriangleType.SCALENE, mTriangle.getTriangleType());
    }

    @Test
    public void testForInvalidScaleneTriangle() {
        mTriangle = new Triangle(-3, -4, -5);
        assertNotEquals(TriangleType.SCALENE, mTriangle.getTriangleType());
        assertNull(mTriangle.getTriangleType());

        mTriangle = new Triangle(3, -4, -5);
        assertNotEquals(TriangleType.SCALENE, mTriangle.getTriangleType());
        assertNull(mTriangle.getTriangleType());

        mTriangle = new Triangle(-3, 4, -5);
        assertNotEquals(TriangleType.SCALENE, mTriangle.getTriangleType());
        assertNull(mTriangle.getTriangleType());

        mTriangle = new Triangle(3, 4, -5);
        assertNotEquals(TriangleType.SCALENE, mTriangle.getTriangleType());
        assertNull(mTriangle.getTriangleType());

        mTriangle = new Triangle(-3, 4, 5);
        assertNotEquals(TriangleType.SCALENE, mTriangle.getTriangleType());
        assertNull(mTriangle.getTriangleType());

        mTriangle = new Triangle(3, -4, 5);
        assertNotEquals(TriangleType.SCALENE, mTriangle.getTriangleType());
        assertNull(mTriangle.getTriangleType());
    }

    @Test
    public void testForIsoscelesTriangle() {
        mTriangle = new Triangle(10, 10, 12);
        assertEquals(TriangleType.ISOSCELES, mTriangle.getTriangleType());

        mTriangle = new Triangle(10, 12, 10);
        assertEquals(TriangleType.ISOSCELES, mTriangle.getTriangleType());

        mTriangle = new Triangle(12, 10, 10);
        assertEquals(TriangleType.ISOSCELES, mTriangle.getTriangleType());
    }

    @Test
    public void testForInvalidIsoscelesTriangle() {
        mTriangle = new Triangle(-3, -4, -5);
        assertNull(mTriangle.getTriangleType());
        assertNotEquals(TriangleType.SCALENE, mTriangle.getTriangleType());

        mTriangle = new Triangle(3, -4, -5);
        assertNull(mTriangle.getTriangleType());
        assertNotEquals(TriangleType.SCALENE, mTriangle.getTriangleType());

        mTriangle = new Triangle(-3, 4, -5);
        assertNull(mTriangle.getTriangleType());
        assertNotEquals(TriangleType.SCALENE, mTriangle.getTriangleType());

        mTriangle = new Triangle(3, 4, -5);
        assertNull(mTriangle.getTriangleType());
        assertNotEquals(TriangleType.SCALENE, mTriangle.getTriangleType());

        mTriangle = new Triangle(-3, 4, 5);
        assertNull(mTriangle.getTriangleType());
        assertNotEquals(TriangleType.SCALENE, mTriangle.getTriangleType());

        mTriangle = new Triangle(3, -4, 5);
        assertNull(mTriangle.getTriangleType());
        assertNotEquals(TriangleType.SCALENE, mTriangle.getTriangleType());
    }
}
