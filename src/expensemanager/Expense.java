package expensemanager;
import java.util.* ;
public class Expense {
    private String description ; 
    private double amount; 
    private String date ; 
    private  String category ;
    public Expense(String description  , String date  , String category ,double d )
    { 
        this.description = description ; 
        this.date = date ;
        this.category = category ; 
        this.amount = d ;
    } 

    public String toString()
    {
        return "the description is: " + description + " and the amount is : "+ amount + " and the date is : "+ date + " and the category is : "+ category  ;
    }
    public double getAmount(){
        return amount ;
    }
    public String getDate(){
        return date ;
    }
    public String getDescription(){
        return description ;
    }
    public String getCategory(){
        return category ;
    }
    



}
