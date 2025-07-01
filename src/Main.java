import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in  = new Scanner(System.in);
        double numberOfGallons = 0.0;
        double fuelEfficiency = 0.0;
        double fuelPrice = 0.0;
        double costPer100 = 0.0;
        double fullTankDistance= 0.0;


        boolean done = false;
        do
        {
            System.out.println("Please enter the number of gallons in the tank:  ");
            if(in.hasNextDouble())
            {
                numberOfGallons = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else
            {
                String trash = in.next();
                System.out.println("You said your number of gallons was " + trash);
                System.out.println("You have to enter a valid amount!");
            }
        }while(!done);
        done = false;

        do
        {
            System.out.println("Please enter the vehicles fuel efficiency in mpg: ");
            if(in.hasNextDouble())
            {
                fuelEfficiency = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else
            {
                String trash = in.next();
                System.out.println("You said your fuel efficiency was: " + trash);
                System.out.println("You have to enter a valid amount!");
            }
        }while(!done);
        done = false;

        do
        {
            System.out.println("Please enter fuel price in dollars per gallon: ");
            if(in.hasNextDouble())
            {
                fuelPrice = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else
            {
                String trash = in.next();
                System.out.println("You said your temp was: " + trash);
                System.out.println("You have to enter a valid amount!");
            }
        }while(!done);

        costPer100 = (100 / fuelEfficiency) * fuelPrice;
        fullTankDistance = fuelEfficiency * numberOfGallons;
        System.out.println("It would cost you $" + costPer100 + " to go 100 miles");
        System.out.println(" The car can " + fullTankDistance + " on a full tank of gas");



    }
}