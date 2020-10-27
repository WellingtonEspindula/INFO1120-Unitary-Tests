package com.example;

public class TriangleUtils {

    public static boolean areAllTheSidesPositives(int sideA, int sideB, int sideC) {
        return isPositive(sideA) && isPositive(sideB) && isPositive(sideC);
    }

    private static boolean isPositive(int side) {
        return side > 0;
    }


    public static boolean doTheSidesSatisfyTheTriangleInequality(int a, int b, int c) {
        return ( (Math.abs(b-c) < a) && (a < (b+c)) ) &&
                ( (Math.abs(a-c) < b) && (b < (a+c)) ) &&
                ( (Math.abs(a-b) < c) && (c < (a+b)) );
    }

    public static boolean isScalene(int a, int b, int c) {
        return (a!=b) && (a!=c);
    }

    public static boolean isIsosceles(int a, int b, int c) {
        return ((a==b) && (b!=c)) ||
                ((b==c) && (a!=c)) ||
                ((a==c) && (b!=c));
    }

    public static boolean isEquilateral(int a, int b, int c) {
        return (a==b) && (b==c);
    }

}
