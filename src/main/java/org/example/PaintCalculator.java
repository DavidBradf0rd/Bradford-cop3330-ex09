package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 David Bradford
 */

import java.util.Scanner;

public class PaintCalculator
{
    public static void main( String[] args )
    {
        double length, width, total;
        int gallon;
        double galcov = 350;
        Scanner input = new Scanner(System.in);

        System.out.print( "Enter length of room: " );
        length = input.nextDouble();

        System.out.print( "Enter width of room: " );
        width = input.nextDouble();

        total = length*width;
        gallon = (int)Math.ceil(total/galcov);
        int total1 = (int)total;

        System.out.println("You will need to purchase "+gallon+" gallons of paint to cover "+total1+" square feet.");






    }
}
