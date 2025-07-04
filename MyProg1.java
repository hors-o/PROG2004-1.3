import java.util.Scanner;

public class MyProg1 {
    public static void main(String[] args) {
       
        //Initialize the array with a size of 10

        double[] housePrices = new double[10];
    
        //Set up loop to take input from the user

        for (int i = 0; i < 10; i++) {
            Scanner userInput = new Scanner(System.in);
            System.out.println("Enter the price of the house:");
            housePrices[i] = userInput.nextInt();  
        }

        //Print the array of house prices that are greater than $500,000   
        
        System.out.println("House prices greater than $500,000:");

        //Loop through the array and print prices greater than $500,000
        for (int i = 0; i < 10; i++) {
            if (housePrices[i] > 500000) {
                System.out.println("House prices are: $" + housePrices[i]);
            }   
        }

        //Calculate the total price of the houses
        double totalPrice = 0;
        for (int i = 0; i < 10; i++) {
            totalPrice += housePrices[i];
        }

        //Calculate the average price of the houses
        double averagePrice = totalPrice / 10;
        System.out.println("Average price of the houses is: $" + averagePrice);


        //Calculate cheapest and most expensive house prices
        //Initialize variables for cheapest and most expensive prices

        double cheapestPrice = housePrices[0];
        double mostExpensivePrice = housePrices[0];

        //Loop through the array to find the cheapest and most expensive prices, 
        //comparing each price to the first element

        for (int i = 1; i < 10; i++) {
            if (housePrices[i] < cheapestPrice) {
                cheapestPrice = housePrices[i];
            }
            if (housePrices[i] > mostExpensivePrice) {
                mostExpensivePrice = housePrices[i];
            }
        }

        //Print the cheapest and most expensive house prices
        System.out.println("Cheapest house price is: $" + cheapestPrice);
        System.out.println("Most expensive house price is: $" + mostExpensivePrice);
    }
        
}
