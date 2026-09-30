package Chapter1;
import java.util.*;


/**
 * Write a description of class TernaryOperatorDemo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TernaryOperatorDemo
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("\fEnter the value of x= ");
        int x = sc.nextInt();
        System.out.print("Enter the value of y= ");
        int y = sc.nextInt();
        System.out.print("Enter the value of z= ");
        int z = sc.nextInt();
        
        int whoIsMax = (x > y && x > z) ? x : (y > z)? y : z;
        
        System.out.print("\nMax = " + whoIsMax);
    }
}