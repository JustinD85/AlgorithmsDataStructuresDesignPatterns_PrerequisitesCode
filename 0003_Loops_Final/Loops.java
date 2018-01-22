import java.util.*;
public class Loops
{
    public static void main(String[] args)
    {
        //Loops are sections of code that are repeated a certain number of times
        //every loop has the same things:
        //1) A start condition
        //2) Code to execute
        //3) A condition to check for continuation/termination
        //4) An exit condition
        
        //Start condition is the state of variables/objects before the loop begins
        //for example:
        int x = 0;
        
        //code to execute is something to repeat "While" the loop check condition exists
        while (x < 10) //a while loop checks the condition and runs 'while' the condition is true
        {
            //repeated code here:
            x++;
            PrintMessage1("is the current value of x.", x);
            //once x reaches 10, the loop will exit
        }
        //after the loop is executed, the new value of x is 10.  
        
        //while loops can also be executed on a boolean, 
        //since ultimately the check condition has to evaluate to a boolean
        
        boolean continueLoop = true;
        Scanner input = new Scanner(System.in);
        
        x = 0;
        
        while (continueLoop)
        {
            System.out.println("Should we continue?");
            String inline = input.nextLine();
            x++;
            PrintMessage2(String.format("Loop Iteration Number %d", x));
            if (inline.equalsIgnoreCase("NO"))
            {
                continueLoop = false;
            }
        }
        
        //while may never execute
        while (continueLoop)
        {
            PrintMessage2("This will never print unless code is changed!");
        }
        
        x = 0;
        
        //do..while
        //executes a minimum of one time no matter what
        do
        {
            x++;
            PrintMessage2(String.format("Loop Iteration Number %d", x));
            
            System.out.println("Should we continue?");
            String inline = input.nextLine();
            if (inline.equalsIgnoreCase("NO"))
            {
                continueLoop = false;
            }
            else
            {
                continueLoop = true;
            }
        } while (continueLoop);
        
        //for loops:
        //start, check, and ending conditions are all in the top line
        //code in {}'s is the repeated code:
        for (int i = 0; i < 5; i++)
        {
            PrintMessage1("is the current line!", i);
        }
        
        //enhanced for loop (using an array here, we'll cover arrays next time!)
        String[] lines = new String[6];
        lines[0] = "This is line 0";
        lines[1] = "This is line 1";
        lines[2] = "This is line 2";
        lines[3] = "This is line 3";
        lines[4] = "This is line 4";
        lines[5] = "This is line 5";
        
        for (String s : lines)
        {
            PrintMessage2(s);
        }
         
    }
    
    public static void PrintMessage1(String message, int lineNum)
    {
        System.out.println(String.format("%d %s", lineNum, message));
    }
    
    public static void PrintMessage2(String message)
    {
        System.out.println(message);
    }
}
