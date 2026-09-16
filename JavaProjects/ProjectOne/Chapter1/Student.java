package Chapter1;


/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    int rollNum;
    String name;
    
    static String school = "Perarson Middle School";
    
    Student(int rn, String nm){
        this.rollNum = rn;
        this.name = nm;
    }
    
    void display(){
        System.out.print("\nRoll number: " + rollNum);
        System.out.print("\nName: " + name);
        System.out.print("\nSchool: " + school);
    }
}