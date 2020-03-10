//Armando Galan-Cedeño  Assignment4A
//CS121 Spring 2020
//March 3, 2020
//Purpose: Create a payroll calculator program using a "do..while" loop. 

package assignment4a;
import java.util.Scanner;
                                                           
public class Assignment4A 
{                        
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        double ANN_BONUS = .05;
        double YR_SALARY = 50000;
        double HR_RATE = 20;
        double BASE_PAY = 200;
        double COMMISSION = .10;
        double wPaycheck, otPay, regularPay, totalPay, totalAmount, comm, priceItem;
        int answer, hrs, otHours, soldItems;
        String fName, lName;
             
        do 
        {
            System.out.println("Welcome to the HR payroll program.");
            System.out.println("Enter a 1 if the employee is salary, "
                    + "enter a 2 if the employee is hourly, enter a 3 if the "
                    + "employee is commission, or enter a 4 to exit the program.");
            answer = input.nextInt();
            
            while (answer < 1 || answer > 4)
            {
                System.out.println("Invalid input. Please provide a number between "
                        + "1 and 4.");            
                answer = input.nextInt();
            }
            
            while (answer == 1)
            {
                System.out.print("Please enter the employee's first name: ");
                fName = input.next(); 
                System.out.print("Please enter the employee's last name: ");
                lName = input.next();
                System.out.println("Please provide the employee's yearly salary: $" 
                        + YR_SALARY); 
                System.out.println("Please provide the annual profit bonus "
                        + "percent: %" + ANN_BONUS);

                wPaycheck = (YR_SALARY * (1 + ANN_BONUS)) / 52;

                System.out.printf("%s%s%s%s%s%.2f%n%n", "The employee's name is ", 
                        fName, " ", lName, " and its weekly paycheck amount is $", 
                        wPaycheck);
                break;
            }
                
            while (answer == 2)
            {
                System.out.print("Please enter the employee's first name: ");
                fName = input.next(); 
                System.out.print("Please enter the employee's last name: ");
                lName = input.next();
                System.out.println("Please provide the employee's hourly pay "
                        + "rate: $" + HR_RATE); 
                System.out.print("Please provide the total number of hours "
                        + "worked: ");
                hrs = input.nextInt();
                    
                    if (hrs > 40)
                    {
                        System.out.print("Please provide the number of overtime "
                                + "hours worked: ");
                        otHours = input.nextInt();
                        
                        otPay = ((HR_RATE * 1.5) * otHours);
                        
                    }
                    else
                    {
                        otPay = 0;
                    }
                    
                regularPay = HR_RATE * 40;
                totalPay = regularPay + otPay; 
                
                System.out.printf("%s%s%s%s%.2f%s%.2f%s%.2f%n%n", fName, " ", 
                        lName, "'s regular pay is $", regularPay, " and its "
                        + "overtime pay amount is $", otPay, ". The "
                        + "employee's total paycheck amount is $", 
                        totalPay);
                break;
            }
            
            while (answer == 3)
            {
                System.out.print("Please enter the employee's first name: ");
                fName = input.next(); 
                System.out.print("Please enter the employee's last name: ");
                lName = input.next();
                System.out.print("Please enter the number of items sold: ");
                soldItems = input.nextInt();
                System.out.print("Please enter the price of the item(s): $");
                priceItem = input.nextDouble();
                
                totalAmount = (double)soldItems * priceItem;
                comm = totalAmount * COMMISSION;
                wPaycheck = comm + BASE_PAY;
                
                System.out.printf("%s%s%s%s%s%.2f%s%.2f%s%.2f%n%n", "The total "
                        + "amount for items sold by ", fName, " ", lName, " is "
                        + "$", totalAmount, ". The employee's commission "
                        + "amount is $", comm, " and its total "
                        + "paycheck amount is $", wPaycheck);
                break;
            }
        } while (answer != 4);
    }
}