
public class driver
{
    public static void main(String[] args)
    {
        System.out.println("Starting...");
        
        int i = 32;
        double x = 2.50;
        String y = "My first program";
        char ch = 'y';
        boolean isActive = true;
        
        System.out.println("My age is " + i);
        System.out.printf("My age is %d\n", i);
        
        System.out.printf("My age is %d\tI paid $%.2f for a "
                            + "coffee today.\n%s\nDo I like to program? "
                            + "%s\nThis course is active: %b\n"
                            , i
                            , x
                            , y
                            , ch
                            , isActive);
        
    }
}
