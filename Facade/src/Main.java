public class Main {


        public static void main(String[] args) {

            PaymentFacade paymentFacade = new PaymentFacade();


            String cardNumber = "1234-5678-9012-3456";
            String pin = "1234";
            double amount = 25.99;
            String operationType = "PizzaOrder";

            boolean success = paymentFacade.makePayment(cardNumber, pin, amount, operationType);

            if (success) {
                System.out.println("Order placed successfully!");
            } else {
                System.out.println("Failed to place order.");
            }
        }

}