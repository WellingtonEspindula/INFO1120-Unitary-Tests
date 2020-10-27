package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );

        Triangle mTriangle = new Triangle(3,4,5);
        System.out.println("Is my triangle valid? "+mTriangle.isValid());

        mTriangle = new Triangle(-3,4,5);
        System.out.println("Is my triangle valid? "+mTriangle.isValid());

        mTriangle = new Triangle(3,0,5);
        System.out.println("Is my triangle valid? "+mTriangle.isValid());

        mTriangle = new Triangle(0, 0,0);
        System.out.println("Is my triangle valid? "+mTriangle.isValid());

        mTriangle = new Triangle(3, 3,3);
        System.out.println("Is my triangle valid? "+mTriangle.isValid());


//        mTriangle = new Triangle(new int[]{3,3,3,3});
//        System.out.println("Is my triangle valid? "+mTriangle.isValid());
    }
}
