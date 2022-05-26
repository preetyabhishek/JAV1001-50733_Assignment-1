// Name:- Shivam Sharma
// Student Id:- A00253431

package com.example.myconversionlab;
import java.util.Scanner;

public class MyConversionLab
{
    public static void main(String[] args)
    {
    	double valueToConvert;
        String unitOfMeasure;

        // Getting user input using Scanner class
        System.out.print("Enter the value to convert : ");
        Scanner i = new Scanner(System.in);
        String initVal = i.next();
        valueToConvert = Double.parseDouble(initVal);
        System.out.print("Enter the current unit of measure : ");
        unitOfMeasure = i.next();
        i.close();
        
        //Switch Cases for different measure types
        double convertedVal;
        switch(unitOfMeasure)
        {
            case "km":
                // To convert unit into mi
            	convertedVal = valueToConvert * 0.62;
                System.out.printf("%.2f km is equals to : %.2f mi",valueToConvert, convertedVal);
                break;
            case "mi":
                // To convert unit into km
            	convertedVal = valueToConvert * 1.61;
                System.out.printf("%.2f mi is equals to : %.2f km",valueToConvert, convertedVal);
                break;
            case "cm":
                // To convert unit into in
            	convertedVal = valueToConvert * 0.39;
                System.out.printf("%.2f cm is equals to : %.2f in",valueToConvert, convertedVal);
                break;
            case "in":
                // To convert unit into cm
            	convertedVal = valueToConvert * 2.54;
                System.out.printf("%.2f in is equals to : %.2f cm",valueToConvert, convertedVal);
                break;
            case "kg":
                // To convert unit into lb
            	convertedVal = valueToConvert * 2.21;
                System.out.printf("%.2f kg is equals to : %.2f lb",valueToConvert, convertedVal);
                break;
            case "lb":
                // To convert unit into kg
            	convertedVal = valueToConvert * 0.45;
                System.out.printf("%.2f lb is equals to : %.2f kg",valueToConvert, convertedVal);
                break;
            case "g":
                // To convert unit into oz
            	convertedVal = valueToConvert * 0.04;
                System.out.printf("%.2f g is equals to : %.2f oz",valueToConvert, convertedVal);
                break;
            case "oz":
                // To convert unit into g
            	convertedVal = valueToConvert * 28.35;
                System.out.printf("%.2f oz is equals to : %.2f g",valueToConvert, convertedVal);
                break;
            case "L":
                // To convert unit into cups
            	convertedVal = valueToConvert * 4.17;
                System.out.printf("%.2f L is equals to : %.2f cups",valueToConvert, convertedVal);
                break;
            case "cups":
                // To convert unit into L
            	convertedVal = valueToConvert * 0.24;
                System.out.printf("%.2f cups is equals to : %.2f L",valueToConvert, convertedVal);
                break;
            case "C":
                // To convert unit into F
            	convertedVal = (valueToConvert * 9/5) + 32;
                System.out.printf("%.2fC (Celsius) is equals to : %.2fF (Fahrenheit)",valueToConvert, convertedVal);
                break;
            case "F":
                // To convert unit into C
            	convertedVal = (valueToConvert - 32) * 5/9;
                System.out.printf("%.2fF (Fahrenheit) is equals to : %.2fC (Celsius)",valueToConvert, convertedVal);
                break;
            default:
                // default block
                System.out.print("Please enter unit of measure from the following list only : \n km \n mi \n cm \n in \n kg \n lb \n g \n oz \n L \n cups \n C \n F ");
        }
    }
}