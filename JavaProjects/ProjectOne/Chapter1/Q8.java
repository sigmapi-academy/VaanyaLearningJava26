package Chapter1;

/**
 * Write a description of class Q8 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q8
{
    void calculate()
    {
        System.out.print("\fPattern1: \n");
        int i, j;
        for(i=1; i<=4; i++)
        {
            for(j=1; j<=4; j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    void calculate(int num)
    {
        int i, f=1;
        for(i=1; i<=num; i++)
        {
            f*=i;
        }
        System.out.print("Factorial: "+f);
    }

    boolean calculate(int num, int digit)
    {
        int i, d, flag=0;
        for(i=num; i>0; i/=10)
        {
            d=i%10;
            if(d==digit)
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}