import java.lang.Math;
public class WorkingWithMath
{
    public static void main(String[] args)
    {
        int x = 4;
        double y = 25.0;
        double z = 4.2734893;
        
        System.out.println("Square root of x: " + Math.sqrt(x));
        System.out.println("y/z: " + y/z);
        System.out.println("Ceiling of y/z: " + Math.ceil(y/z));
        System.out.println("Floor of y/z: " + Math.floor(y/z));
        System.out.println("Rounded y/z: " + Math.round(y/z));
        System.out.println("Hypotenuse: " + Math.hypot(y, z));
    }
}
