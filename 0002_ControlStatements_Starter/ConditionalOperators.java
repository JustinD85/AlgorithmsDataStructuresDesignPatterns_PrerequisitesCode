public class ConditionalOperators
{
    public static void main(String[] args)
    {
        int x = 10;
        boolean isTrue;
        int tracker = 0;
        
        //use the if condition with parentheses to check condition
        //operators:
        //== [equal]
        //&& [and]
        //|| [or]
        //<  [less than]
        //>  [greater than]
        //>= [greater than or equal to]
        //<= [less than or equal to]
        //! [not]
        //!= [not equal]
        
        //integer conditional checks
        if (x == 10)
        {
            //x = 10 so this will run
            PrintMessage("X is equal to 10", tracker);
        }
        else
        {
            //x = 10 so this will not run since the first case did already.
            PrintMessage("X is not equal to 10", tracker);
        }
        tracker++;
        
        
        if (x != 20)
        {
            //x is not equal to 20 (x = 10) so this will run
            PrintMessage("X is not equal to 20", tracker);
        }
        tracker++;
        
        if (x > 5)
        {
            //x is greater than five so this will run (x = 10)
            PrintMessage("X is greater than 5", tracker);
        }
        tracker++;
        
        if (x < 20)
        {
            //x is less than 20 (x = 10) so this will run
            PrintMessage("X is less than 20", tracker);
        }
        tracker++;
        
        if (x < 5)
        {
            //this will not execute ( x is greater than 5 (x=10))
            PrintMessage("X is less than five", tracker);
        }
        else
        {
            PrintMessage("X is not less than five", tracker);
        } 
        tracker++;   
        
        if (x <= 10)
        {
            //x is less than or equal to 10 since x = 10
            PrintMessage("X is less than or equal to 10", tracker);
        }
        tracker++;
        
        if (x >= 10)
        {
            //x is greater than or equal to 10 since x = 10
            PrintMessage("X is greater than or equal to 10", tracker);
        }
        tracker++;
        
        //set isTrue to true
        isTrue = true;
        
        //boolean checks:
        if (isTrue)
        {
            PrintMessage("Boolean isTrue is True!", tracker);
        }
        tracker++;
        
        //you can do this but it's redundant:
        if (isTrue == true)
        {
            PrintMessage("Boolean isTrue is true!", tracker);
        }
        tracker++;
        
        isTrue = false;
        //negative boolean (like saying 'if NOT condition')
        if (!isTrue)
        {
            //like saying if isTrue == false
            PrintMessage("Boolean isTrue is False!", tracker);
        }
        tracker++;
        //same as:
        if (isTrue == false)
        {
            //like saying if isTrue == false
            PrintMessage("Boolean isTrue is False!", tracker);
        }
        tracker++;
        
        //bad programming
        //if (isTrue)
        //{
        //    return true;
        //}
        //else
        //{
        //      return false;
        //}
        //return isTrue;
        
        //and
        x = 20;
        isTrue = true;
        if (x == 20 && isTrue)
        {
            PrintMessage("X equals 20 AND isTrue is True!", tracker);
        }
        tracker++;
       
        if (x!=10 && !isTrue)
        {
            PrintMessage("X is not equal to 10 AND isTrue is False!", tracker);
        }
        else
        {
            if (x == 10)
            {
                PrintMessage("X is equal to 10!", tracker);
            }
            else
            {
                PrintMessage("Boolean isTrue is True!", tracker);
            }
        } 
        tracker++;   
        
        //or
        if (x == 100 || isTrue)
        {
            if (x == 100)
            {
                PrintMessage("X is equal to 100", tracker);
            }
            else
            {
                PrintMessage("isTrue is true", tracker);
            }
        }
        tracker++;
        
        if (x == 1000 || !isTrue)
        {
            if (x == 1000)
            {
                PrintMessage("X is equal to 1000", tracker);
            }
            else
            {
                PrintMessage("isTrue is false!", tracker);
            }
        }
        else
        {
            PrintMessage("X is not 1000 AND IsTrue is True!", tracker);
        }
        tracker++;
        
        //combination
        //use parentheses to check clauses
        x = 40;
        isTrue = false;
        if ((x >= 20 && isTrue) || x > 35)
        {
            if (x > 35)
            {
                PrintMessage("X is greater than 35!", tracker);
            }
            else if (isTrue)
            {
                if (x >= 20)
                {
                    PrintMessage("X is greater than or equal to 20 and isTrue is true!", tracker);
                }
                else
                {
                    PrintMessage("X is < 20 and isTrue is true", tracker);
                }
            }
        }
        
        //String equality:
        //to check string equality, use the equals method:
        String testString = "anyString";
        
        //won't work because of the nature of strings:
        //if (testString == "anyString")...
        //instead, use:
        if (testString.equals("anyString"))
        {
            PrintMessage("The test string is 'anyString'", tracker);
        }
        tracker++;
        
        if (testString.equals("aNySTRinG"))
        {
            //case sensitive...
            PrintMessage("The test string is 'anyString'", tracker);
        }
        else
        {
            PrintMessage("The test string is NOT 'aNySTRinG'", tracker);
        } 
        tracker++;
        
        //can ignore case
        if (testString.equalsIgnoreCase("aNySTRinG"))
        {
            PrintMessage("The test string is the same as 'aNySTRinG' when case is ignored"
                            , tracker);
        }
        tracker++;
    }
    
    //Print a message with the line number for easy display:
    public static void PrintMessage(String msg, int lineNum)
    {
        System.out.println(String.format("%d)\t%s"
                                    , lineNum, msg));
    }
}
