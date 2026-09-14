package Chapter1;


/**
 * Write a description of class One here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class One
{
    //instance variables
    int x;
    int y;
    public static void main(String[] args){
        
    }
    /**
     * Input integer value in a
     * Input integer value in b
     * This method will initialize the value of 
     * instance variable x and y 
     */
    
    public void input(int a, int b){
        x = a; 
        y = b;    
    }
    
    public void printValues(){
        System.out.print("\nx = " + x);
        System.out.print("\ny = " + y);
    }
}