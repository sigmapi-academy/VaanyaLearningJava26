package Chapter2;
import java.util.*;


/**
 * Write a description of class Q4 here.
 * A shopkeeper offers 80% discount on purchasing articles whereas
 * the other shopkeeper offers two successive discount 60% and 25%
 * for purchasing the same articles.
 * Write a program in Java to compute and display which is better
 * offer for a customer. Take the price of an article as an input. 

 * @author (your name)
 * @version (a version number or a date)
 */
public class Q4
{
    public static void main(String args[]){
        System.out.print("\f"); //clears terminal window
        Scanner sc = new Scanner(System.in);
        float price, dis1, dis2, dis3;
        System.out.print("Enter price of the article: ");
        price = sc.nextFloat();
        dis1 = price*0.8f;
        dis2 = price*0.5f;
        dis3 = (price-dis2)*0.35f;
        System.out.print("\nDiscount 1: " + dis1);
        System.out.print("\nSuccessive discount: ");
        System.out.print("\n\tDiscount 1: " + dis2);
        System.out.print("\n\tDiscount 2: " + dis3);
        if(dis1 > (dis2+dis3)){
            System.out.print("\nOffer-1 is better");
        }
        else{
            System.out.print("\nOffer-2 is better");
        }
    }
}