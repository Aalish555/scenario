import java.util.Scanner;

public class scenario
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Rikshaw Fare Calculation: ");
        System.out.println("Enter distance in kilometers: ");
        double distance=input.nextDouble();
        System.out.println("Enter time in minutes: ");
        double minutes=input.nextDouble();
        System.out.println("Is the customer local?(yes/no): ");
        String local=input.next();
        System.out.println("Is the travel during night?(yes/no)");
        String night=input.next();
        
        int normal_fare=5;
        int night_fare=7;
        int fare_per_minute=2;
        double discount=0.1;
        
        double total=0;
        if (night=="yes")
        {
            total=(night_fare * distance)+(minutes*fare_per_minute);
        }
        else 
        {
            total=(normal_fare * distance)+(minutes*fare_per_minute);
        }
        
        if (local=="yes")
        {
            total=total-(discount*total);
        }
        System.out.println("The final fare is Rs."+total);
    }
}