import java.util.Scanner;

class EmployeeEncap {
    private int account_balance;
    private int upi_pin = 998899;

    // Setter for balance with validation
    public void setBalance(int balance) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter UPI Pin: ");
        int pin = sc.nextInt();

        if (pin == upi_pin) {
            account_balance = balance;
            System.out.println("Congratulations! Salary is credited!");
        } else {
            System.out.println("Salary not credited! Wrong Pin.");
        }
    }

    // Getter for balance with validation
    public int getBalance() {
        Scanner sc = new Scanner(System.in);
        System.out.println("To know the balance, please enter UPI Pin: ");
        int pin = sc.nextInt();

        if (pin == upi_pin) {
            System.out.println("Available balance is: " + account_balance);
            return account_balance;
        } else {
            System.out.println("!!Wrong Pin!! Unable to fetch balance.");
        }
        return -1;
    }
}

public class Encapsulation{
    public static void main(String[] args) {
        EmployeeEncap emp = new EmployeeEncap();

        emp.setBalance(50000);  // try to set salary
        emp.getBalance();       // try to fetch balance
    }
}
