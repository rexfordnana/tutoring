package main;

import java.util.Scanner;

public class ZellersCongruence {

    private static int h,y,q,m,k,j;

    private static int computeDayOfWeek(){
        h = q + 26*(m+1)/10 + k + k/4 + j/4 + 5*j;
        h = h % 7;
        return h;
    }

    private static void computeYearOfCentury(){
        k = y % 100;
    }

    private static void computeCentury(){
        j = y/100;
    }

    private static void menu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("**************Zeller's Congruence****************");
        System.out.print("Enter Year: eg 2012: ");
        y = scanner.nextInt();
        System.out.print("Enter month: 1 - 12: ");
        q = scanner.nextInt();
        if (q == 1) q = 13;
        if (q == 2) q = 14;
        System.out.print("Enter day of the month: 1 - 31: ");
        m = scanner.nextInt();

    }

    public static void main(String[] args) {
        menu();
        computeYearOfCentury();
        computeCentury();
        int dayOfWeek = computeDayOfWeek();
        System.out.print("Day of the week is ");
        switch (dayOfWeek){
            case 0: System.out.println("Saturday"); break;
            case 1:System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break ;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            case 6: System.out.println("Sunday"); break;
            default: System.out.println("try again");
        }

        System.out.println("**************By Nadia Ndumu****************");
    }


}
