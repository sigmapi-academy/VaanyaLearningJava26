package Looping;
import java.util.*;


/**
 * Write a description of class WhileDemo here.
 * Program to print multiplication table of a number from 1 to N
 * @author (your name)
 * @version (a version number or a date)
 */
public class WhileDemo
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num, N;
        System.out.print("\fEnter number for which multiplication table you want: ");
        num = sc.nextInt();
        System.out.print("How many times? \n");
        N = sc.nextInt();
        
        int prod, start = 1;
        while(start <= N){
            prod = start * num;
            System.out.print("\n"+ start + " * " + num + " = " + prod);
            start++;
        }
    }
}