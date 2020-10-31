package com.example;

public class Triangle {

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
     *
     * @return True if triangle is valid. False otherwise
     */
    public boolean isValid() {
        return areAllTheSidesPositives() && doTheSidesSatisfyTheTriangleInequality();
    }

    private boolean areAllTheSidesPositives() {
        return ShapeUtils.areAllSidesPositives(sideA, sideB, sideC);
    }

    private boolean doTheSidesSatisfyTheTriangleInequality() {
        return ((Math.abs(sideB - sideC) < sideA) && (sideA < (sideB + sideC))) &&
                ((Math.abs(sideA - sideC) < sideB) && (sideB < (sideA + sideC))) &&
                ((Math.abs(sideA - sideB) < sideC) && (sideC < (sideA + sideB)));
    }

    /**
     * Returns the Triangle type using its sides measures
     *
     * @return Returns the Triangle type (ISOSCELES, EQUILATERAL or SCALENE). If triangle isn't valid, returns null;
     */
    public TriangleType getTriangleType() {
        if (isValid()) {
            if (isEquilateral())
                return TriangleType.EQUILATERAL;
            else if (isIsosceles())
                return TriangleType.ISOSCELES;
            else if (isScalene())
                return TriangleType.SCALENE;
        }
        return null;
    }

    private boolean isEquilateral() {
        return ShapeUtils.areAllSidesEquals(sideA, sideB, sideC);
    }

    private boolean isIsosceles() {
        return ShapeUtils.howManyEqualsSideItHas(sideA, sideB, sideC) == 2;
    }

    private boolean isScalene() {
        return ShapeUtils.areAllSidesDifferent(sideA, sideB, sideC);
    }


    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public void setSideC(int sideC) {
        this.sideC = sideC;
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
