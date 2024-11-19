public class PaymentFacade {

    private AccountChecker accountChecker;
    private SecurityChecker securityChecker;
    private BalanceChecker balanceChecker;
    private Ledger ledger;
    private NotificationService notificationService;

    public PaymentFacade() {
        // Initialize subsystem instances
        accountChecker = new AccountChecker();
        securityChecker = new SecurityChecker();
        balanceChecker = new BalanceChecker();
        ledger = new Ledger();
        notificationService = new NotificationService();
    }

    public boolean makePayment(String cardNumber, String pin, double amount, String operationType) {
        // Check account
        if (!accountChecker.checkAccount(cardNumber)) {
            System.out.println("Invalid account.");
            return false;
        }

        // Verify PIN
        if (!securityChecker.verifyPin(cardNumber, pin)) {
            System.out.println("Invalid PIN.");
            return false;
        }

        // Check balance
        if (!balanceChecker.checkSufficientBalance(cardNumber, amount)) {
            System.out.println("Insufficient balance.");
            return false;
        }

        // Make ledger entry
        ledger.makeEntry(cardNumber, amount, operationType);

        // Send notification
        notificationService.sendNotification(cardNumber, amount, operationType);

        System.out.println("Payment successful!");
        return true;
    }
}
