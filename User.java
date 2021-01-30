public class User {

    String userName;
    String userEmail;
    int userPin;
    double moneyInBank;

    public User() {
    };

    public User(String name, String email, int pin) {
        this.userName = name;
        this.userEmail = email;
        this.userPin = pin;

    }

    public void withdraw(double amount) {
        moneyInBank -= amount;

    }

    public void deposit(double amount){
        moneyInBank += amount;
    }

}