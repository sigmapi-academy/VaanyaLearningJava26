package Looping;
import java.util.*;

/**
 * Write a description of class SumOfDigits here.
 * Program asking for a number which should be greater than 0,
 * the program will find sum of its digits.
 * @author (your name)
 * @version (a version number or a date)
 */
public class SumOfDigits
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("\f");
        int d, t, num, sumOfDigits = 0;
        do{
            System.out.print("Enter any integer greater than 0: ");
            num = sc.nextInt();
            if(num <= 0){
                System.out.print("\nFollow the input instruction.\n");
            }
        }while(num <= 0);
        
        t = num;
        while(t > 0){
            d = t % 10;
            sumOfDigits += d;
            t /= 10; //remove the last digit
        }

        System.out.print("\n sum of digits in " + num +" : " + sumOfDigits);
    }
}