package com.example;

public class Triangle {
    public enum TriangleType {
        ISOSCELES,
        EQUILATERAL,
        SCALENE
    };

    private int sideA;
    private int sideB;
    private int sideC;

    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }


    /**
     * Checks if the Triangle is valid
     * @return True if triangle is valid. False otherwise
     */
    public boolean isValid() {
        return areAllTheSidesPositives() && doTheSidesSatisfyTheTriangleInequality();
    }

    private boolean doTheSidesSatisfyTheTriangleInequality() {
        return TriangleUtils.doTheSidesSatisfyTheTriangleInequality(getSideA(), getSideB(), getSideC());
    }

    private boolean areAllTheSidesPositives() {
        return TriangleUtils.areAllTheSidesPositives(getSideA(), getSideB(), getSideC());
    }

    /**
     * Returns the Triangle type using its sides measures
     * @return Returns the Triangle type. If triangle isn't valid, returns null;
     */
    public TriangleType getTriangleType() {
        if (isValid()){
            if (isEquilateral())
                return TriangleType.EQUILATERAL;
            else if (isIsosceles())
                return TriangleType.ISOSCELES;
            else if (isScalene())
                return TriangleType.SCALENE;
        }
        return null;
    }

    private boolean isIsosceles() {
        return TriangleUtils.isIsosceles(getSideA(), getSideB(), getSideC());
    }

    private boolean isScalene() {
        return TriangleUtils.isScalene(getSideA(), getSideB(), getSideC());
    }

    private boolean isEquilateral() {
        return TriangleUtils.isEquilateral(getSideA(), getSideB(), getSideC());
    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public int getSideC() {
        return sideC;
    }

}
