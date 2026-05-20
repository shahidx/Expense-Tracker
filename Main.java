import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ExpenseTracker tracker = new ExpenseTracker();
        while (true){
            System.out.println("\n===== Expense Tracker =====");
            System.out.println("1. Add Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. Total Spending");
            System.out.println("4. Exit");
            System.out.print("Enter Your Choice: ");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter Category: ");
                    String category = sc.next();
                    System.out.print("Enter Amount: ");
                    double amount = sc.nextDouble();
                    tracker.addExpense(category, amount);
                    break;
                case 2:
                    tracker.viewExpenses();
                    break;
                case 3:
                    tracker.totalSpending();
                    break;
                case 4:
                    System.out.println("Exiting Program...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}