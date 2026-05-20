import java.util.ArrayList;

class ExpenseTracker {
    ArrayList<Expense> expenses = new ArrayList<>();
    void addExpense(String category, double amount){
        Expense expense = new Expense(category, amount);
        expenses.add(expense);
        System.out.println("Expense Added Successfully");
    }

    void viewExpenses(){

        if(expenses.isEmpty()){
            System.out.println("No Expenses Found");
            return;
        }
        System.out.println("\n----- Expenses -----");
        for (Expense expense : expenses){
            System.out.println(expense.category + " : Rs. " + expense.amount);
        }
    }

    void totalSpending(){
        double total = 0;
        for (Expense expense : expenses) {
            total = total + expense.amount;
        }
        System.out.println("\nTotal Spending: Rs. " + total);
    }
}