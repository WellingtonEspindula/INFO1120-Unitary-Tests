package com.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    private static Triangle mTriangle;

    @Test
    public void isValid_DefaultValues_ReturnTrue() {
        mTriangle = new Triangle(3,4,5);
        assertTrue(mTriangle.isValid());

        mTriangle = new Triangle(3, 3,3);
        assertTrue(mTriangle.isValid());

    }

    @Test
    public void isValid_ZeroValues_ReturnFalse() {
        mTriangle = new Triangle(3,0,5);
        assertFalse(mTriangle.isValid());

        mTriangle = new Triangle(0,3,5);
        assertFalse(mTriangle.isValid());

        mTriangle = new Triangle(0,0,5);
        assertFalse(mTriangle.isValid());

        mTriangle = new Triangle(3,0,5);
        assertFalse(mTriangle.isValid());

        mTriangle = new Triangle(3,0,0);
        assertFalse(mTriangle.isValid());

        mTriangle = new Triangle(0, 0,0);
        assertFalse(mTriangle.isValid());

    }

    @Test
    public void isValid_NegativeValues_ReturnFalse() {
        mTriangle = new Triangle(-3,4,5);
        assertFalse(mTriangle.isValid());

        mTriangle = new Triangle(-3,-4,5);
        assertFalse(mTriangle.isValid());

        mTriangle = new Triangle(-3,4,-5);
        assertFalse(mTriangle.isValid());

        mTriangle = new Triangle(-3,-4,-5);
        assertFalse(mTriangle.isValid());

        mTriangle = new Triangle(3,-4,5);
        assertFalse(mTriangle.isValid());

        mTriangle = new Triangle(3,-4,-5);
        assertFalse(mTriangle.isValid());

        mTriangle = new Triangle(3,4,-5);
        assertFalse(mTriangle.isValid());
    }

    @Test
    public void getTriangleType() {
        // Equilateral cases
        // Default condition
        mTriangle = new Triangle(3, 3, 3);
        assertEquals(TriangleType.EQUILATERAL, mTriangle.getTriangleType());

//        mTriangle = new Triangle((Integer.MAX_VALUE/2)-2, (Integer.MAX_VALUE/2)-2, (Integer.MAX_VALUE/2)-2);
//        assertEquals(Triangle.TriangleType.EQUILATERAL, mTriangle.getTriangleType());

        // Exception cases: Zero sided Triangle and Negative sided Triangle
        mTriangle = new Triangle(0, 0, 0);
        assertNotEquals(TriangleType.EQUILATERAL, mTriangle.getTriangleType());
        assertNull(mTriangle.getTriangleType());

        mTriangle = new Triangle(-1, -1, -1);
        assertNotEquals(TriangleType.EQUILATERAL, mTriangle.getTriangleType());


        // Scalene cases
        // Default condition
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


        mTriangle = new Triangle(-3, -4, -5);
        assertNull(mTriangle.getTriangleType());
        assertNotEquals(TriangleType.SCALENE, mTriangle.getTriangleType());

        mTriangle = new Triangle(3, -4, -5);
        assertNull(mTriangle.getTriangleType());
        assertNotEquals(TriangleType.SCALENE, mTriangle.getTriangleType());

        mTriangle = new Triangle(-3,4,-5);
        assertNull(mTriangle.getTriangleType());
        assertNotEquals(TriangleType.SCALENE, mTriangle.getTriangleType());

        mTriangle = new Triangle(3,4,-5);
        assertNull(mTriangle.getTriangleType());
        assertNotEquals(TriangleType.SCALENE, mTriangle.getTriangleType());

        mTriangle = new Triangle(-3,4,5);
        assertNull(mTriangle.getTriangleType());
        assertNotEquals(TriangleType.SCALENE, mTriangle.getTriangleType());

        mTriangle = new Triangle(3,-4,5);
        assertNull(mTriangle.getTriangleType());
        assertNotEquals(TriangleType.SCALENE, mTriangle.getTriangleType());


        mTriangle = new Triangle(3,0,5);
        assertFalse(mTriangle.isValid());




    }
}
