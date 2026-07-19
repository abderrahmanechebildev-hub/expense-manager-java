package expensemanager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ExpensesManager expManager = new ExpensesManager();
        Scanner scn = new Scanner(System.in);
            int choice ;
            double amount ;
            String description ; 
            String date ; 
            String category ; 
            boolean repeat = true ; 
            String answer ; 
            do{
                System.out.println("Choose one of the options in the menu");
            System.out.println("=== Expense Manager ===\n" + 
                                "");
            System.out.println( "1. Add expense\n" + 
                                "2. List all expenses\n" + 
                                "3. Show total\n" +
                                "4. Search by keyword\n" + 
                                "5. Delete by description\n" + 
                                "0. Quit");
            
            
            choice = scn.nextInt();
            if(choice == 1)
            {   
                System.out.println("enter the amount");
                amount = scn.nextDouble();
                while(amount<=0)
                {
                    System.out.println("enter positive amount");
                    amount = scn.nextDouble();
                }
                System.out.println("enter the description");
                scn.nextLine(); 
                description = scn.nextLine();
                System.out.println("enter the category");
                category = scn.nextLine();
                System.out.println("enter the date");
                date = scn.nextLine(); 
                System.out.println("recurring? (y/n)");
                answer  = scn.nextLine();
                Expense exp ; 
                if(answer.equals("y"))
                {
                     exp = new RecurringExpense(description, date, category, amount);
                }
                else 
                     exp = new Expense(description, date, category, amount);
                expManager.addExpense(exp);
                
            }
            else if(choice == 2)
            {
                expManager.listAllTheExpenses();
            }
            else if(choice == 3 )
            {
                System.out.println("the total of expenses is " + expManager.expensesTotal());

            }
            else if(choice == 4 )
            {   scn.nextLine();
                System.out.println("enter the keyword search please");
                expManager.searchByKeyWord(scn.nextLine());
            }
            else if(choice == 5)
            {   scn.nextLine();
                System.out.println("enter the description please");
                expManager.deleteExpense(scn.nextLine());
            }
            else if(choice == 0)
            {
                System.out.println("goodbye");
                repeat = false ;
            }
                
                
            else 
            {
                System.out.println("invalid command repeat please");
            }

            }while(repeat);
            



    }

}