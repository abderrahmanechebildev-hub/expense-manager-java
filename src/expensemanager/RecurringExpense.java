package expensemanager;


public class RecurringExpense  extends Expense{
  
    public RecurringExpense(String description  , String date  , String category, double d)
    { 
        super(description, date, category, d) ;
        
    } 
   @Override
    public String toString() {
        return super.toString() + " [recurring 🔁 yearly: " + yearlyCost() + "]";
    }
        

    public double yearlyCost()
    {
        return this.getAmount() * 12 ;
    }

}
