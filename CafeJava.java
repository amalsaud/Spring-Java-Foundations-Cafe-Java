public class CafeJava {
    public static void main(String[] args) {

        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = ", Your total is $";

        double mochaPrice = 3.5;
        double dripCoffeePrice = 2.2;
        double lattePrice = 4.3;
        double cappuccinoPrice = 3.3;

        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";

        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;

        // Cindhuri ordered a coffee. Print to the console the correct status message,
        // based on her order status.
        System.out.println(generalGreeting + customer1 + pendingMessage);

        // Sam just ordered 2 lattes, print the message to display their total.
        // Next, use an if statement to print the appropriate order status message.
        // Change the isReady flag value from true to false or vice versa in order to
        // test your control logic
        System.out.println(generalGreeting + customer2 + displayTotalMessage + lattePrice * 2);
        if (isReadyOrder2) {
            System.out.println(customer2 + readyMessage);
        } else {
            System.out.println(customer2 + pendingMessage);
        }

        // Jimmy just realized he was charged for a coffee but had ordered a latte.
        // Print the total message with the new calculated total (what he owes)
        System.out.println( generalGreeting + customer3 + displayTotalMessage + (lattePrice - dripCoffeePrice));

        // Noah ordered a cappuccino. Use an if statement to check the status of his
        // order and print the correct status message.
        // If it is ready, also print the message to display the total.
        if (isReadyOrder4) {
            System.out.println(generalGreeting + customer4 + readyMessage + displayTotalMessage + cappuccinoPrice);
        } else {
            System.out.println(customer4 + pendingMessage);
        }
    }
}
