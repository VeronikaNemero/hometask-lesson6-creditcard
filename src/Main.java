public class Main {
    public static void main(String[] args) {

        CreditCard user1 = new CreditCard("15245888", 100.0);
        user1.replenishment();

        CreditCard user2 = new CreditCard("545876", 0);
        user2.replenishment();

        CreditCard user3 = new CreditCard("5773346", 1000);
        user3.withdrawal();

        user1.viewInfo();
        user2.viewInfo();
        user3.viewInfo();
    }
}