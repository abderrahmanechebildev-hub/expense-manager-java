package expensemanager;
import java.util.* ; 


public class ExpensesManager {
    private List <Expense> expenseslist = new ArrayList<Expense>();
    public void addExpense(Expense e){
        expenseslist.add(e);
    }
    public void listAllTheExpenses()
    {
        System.out.println("here are all the expenses ");
        for(Expense e : expenseslist)
        {
            System.out.println(e);
        }
    }
    public double expensesTotal()
    {
        double total = 0 ; 
        for(Expense e : expenseslist)
        {
            total = total + e.getAmount() ; 
        }
        return total ;
    }
    public void  searchByKeyWord(String keyword){
        boolean find = false ;
        System.out.println("the result");
        for(Expense exp : expenseslist)
        { 
            if(exp.getDescription().equals(keyword) || exp.getDate().equals(keyword) || exp.getCategory().equals(keyword) )
            {
                 System.out.println(exp) ; 
                 find = true ;
            }   
            
        }
        if(!find)
        System.out.println("there is no expense with this search keyword") ;
    }
    public void deleteExpense(String Desc)
    {
        int index = 0 ; 
        for(Expense exp : expenseslist )
        { 
            if(exp.getDescription().equals(Desc) ){
                expenseslist.remove(index);
                break ;
            }
            index++ ;
        }
    }
}
