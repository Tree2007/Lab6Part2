import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //variables
        Scanner scan = new Scanner(System.in);
        double gas = 0;
        double mpg = 0;
        double price = 0;
        double pricePer100;
        double distance;
        boolean gasValid = false;
        boolean mpgValid = false;
        boolean priceValid = false;

        //data collection
        do{
            System.out.println("Enter the amount of gas in your vehicle in gallons");
            if (scan.hasNextDouble()) {
                gas = scan.nextDouble();
                if (gas >= 0) {
                    gasValid = true;
                }
            } else {
                System.out.println("You have entered and invalid value. Please try again");
                scan.nextLine();
            }
        } while (!gasValid);
        do{
            System.out.println("Enter fuel efficiency in MPG");
            if (scan.hasNextDouble()) {
                mpg = scan.nextDouble();
                if (mpg > 0) {
                    mpgValid = true;
                }
            } else {
                System.out.println("You have entered and invalid value. Please try again");
                scan.nextLine();
                scan.nextLine();
            }
        } while (!mpgValid);
        do{
            System.out.println("Enter the current price of gas by gallon");
            if (scan.hasNextDouble()) {
                price = scan.nextDouble();
                if (price > 0) {
                    priceValid = true;
                }
            } else {
                System.out.println("You have entered and invalid value. Please try again");
                scan.nextLine();
                scan.nextLine();
            }
        } while (!priceValid);

        //math
        distance = gas * mpg;
        pricePer100 = ((double)100 / mpg) * price;

        //output
        System.out.printf("%5s %10.2f %5s %10.2f", "Cost per 100 miles in $:", pricePer100, "\nDistance left in miles:", distance);
    }
}