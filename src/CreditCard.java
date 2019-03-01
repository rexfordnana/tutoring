import java.util.Scanner;

public class CreditCard {
    /** Return true if the card number is valid */
    public static boolean isValid(long number){
        int sum = sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);
        return sum%10==0;
    }
    /** Get the result from Step 2 */
    public static int sumOfDoubleEvenPlace(long number){
        int sum = 0;
        long second;
        number = number/10;
        int size = getSize(number);
        for (int i = size; i>0; i=i-2){
            second = getPrefix(number,i)%10;
            second = getDigit((int) (second * 2));
            sum+=second;
        }
        return sum;
    }

    /** Return this number if it is a single digit, otherwise,
     * return the sum of the two digits */
    public static int getDigit(int number){
        if (number < 10)
            return number;
        else
            return number/10+number%10;
    }

    /** Return sum of odd-place digits in number */
    public static int sumOfOddPlace(long number){
        int sum = 0;
        int size = getSize(number);
        for (int i = size; i>0; i=i-2){
            sum += getPrefix(number,i) % 10;
        }
        return sum;
    }

    /** Return true if the digit d is a prefix for number */
    public static boolean prefixMatched(long number, int d){
        return getPrefix(number, getSize(d)) == d;
    }


    /** Return the number of digits in d */
    public static int getSize(long d){
        int count = 0;
        while (d > 0){
            d = d / 10;
            count ++;
        }
        return count;
    }

    /** Return the first k number of digits from number. If the
     * number of digits in number is less than k, return number. */
    public static long getPrefix(long number, int k){
        k = getSize(number) - k;

        if (k < 0)
            return number;

        for (int i=0; i<k; i++){
            number = number/10;
        }
        return number;
    }

    /** input credit card’s number from keyboard
     Return this credit Card’s number
     */
    public static long inputData(){
        System.out.println("Enter a credit card number as a long: ");
        Scanner scanner = new Scanner(System.in);
        long cardNo = scanner.nextLong();
        return cardNo;
    }


    /**Display result using a method println()*/
    public static void displayResult(long number){
        if (isValid(number))
            System.out.println(number + " is valid!");
        else
            System.out.println(number + " is invalid");
    }

    public static void main(String[] args) {
        displayResult(inputData());
    }


}
