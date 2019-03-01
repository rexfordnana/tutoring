/*
 * Class: CMSC201 
 * Instructor:
 * Description: (Give a brief description for each Program)
 * Due: 2/24/2019
 * I pledge that I have completed the programming assignment
independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your name here: Nadia Ndumu
*/


import java.util.Arrays;
import java.util.Scanner;

public class Statistics {

    private static int MAX_NUMBERS = 10;
    private static double mean;
    private static double standardDeviation;
    private static double size, sum = 0;
    private static double[] x = new double[MAX_NUMBERS];

    private static void computeMean(){
        size = x.length;
       //compute the sum
        for (double num:x)
            sum+=num;

        //compute the mean
        mean  = sum/size;
        System.out.println("The mean is: " + mean);
    }

    private static void computeStandardDeviation(){
       //compute the top part (numerator) for SD
        for (double num: x) {
            standardDeviation += Math.pow(num - mean,2);
        }
        standardDeviation = Math.sqrt(standardDeviation/size);
        System.out.println("The Standard Deviation is: " +standardDeviation);
    }

    private static void menu(){
        System.out.println("Enter numbers: ");
        Scanner scanner = new Scanner(System.in);
        for (int i =0 ; i<MAX_NUMBERS; i++){
            x[i] = scanner.nextDouble();
        }
        System.out.println(Arrays.toString(x));
    }

    public static void main(String[] args) {
        menu();
        computeMean();
        computeStandardDeviation();
    }

}
