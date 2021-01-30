public class Main extends User {
    public static void main(String[] args) {

        User me = new User("Tom", "tom@gmail.com", 1234);
        me.deposit(2000);
        // me.withdraw(500);
        System.out.println(me.moneyInBank);
    }

}