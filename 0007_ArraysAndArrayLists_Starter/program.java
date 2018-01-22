import java.util.ArrayList;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class program
{
    public static void main(String[] args)
    {
        int[] myIntArray1 = new int[10];
        myIntArray1[0] = 1;
        myIntArray1[1] = 2;
        myIntArray1[2] = 3;
        myIntArray1[3] = 4;
        myIntArray1[4] = 5;
        myIntArray1[5] = 6;
        myIntArray1[6] = 7;
        myIntArray1[7] = 8;
        myIntArray1[8] = 9;
        myIntArray1[9] = 10;
        
        int[] myIntArray2 = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        ArrayList<Integer> myIntList1 = new ArrayList<Integer>();
        myIntList1.add(10);
        myIntList1.add(20);
        myIntList1.add(30);
        myIntList1.add(40);
        myIntList1.add(50);
        myIntList1.add(60);
        myIntList1.add(70);
        myIntList1.add(80);
        myIntList1.add(90);
        myIntList1.add(100);
        myIntList1.add(110);
        myIntList1.add(120);
        
        ArrayList<Integer> myIntList2 = new ArrayList<Integer>() {
            {add(100);
             add(200);
             add(300);
             add(400);
             add(500);
             add(600);
             add(700);
             add(800);
             add(900);
             add(1000);
             add(5000);
             add(10000);
            }
        };
        
        for (int i = 0; i < myIntArray1.length; i++)
        {
            System.out.println("Ints 1[" + i + "]:" + myIntArray1[i]);
        }
        System.out.println(PrintStars(80));
        
        for (int i : myIntArray2)
        {
            System.out.println("Ints 2[" + (i - 1) + "]:" + i);
        }
        System.out.println(PrintStars(80));
        
        for (int i : myIntList1)
        {
            System.out.println("Next MyIntList1: " + i);
        }
        System.out.println(PrintStars(80));
        
        for (int i = 0; i < myIntArray1.length; i++)
        {
            System.out.println("myIntList2.get("+ i +"): " + myIntList2.get(i));
        }
        System.out.println(PrintStars(80));
        
    }
    
    public static String PrintStars(int num)
    {
        String repeated = Stream.generate(() -> "*").limit(num).collect(joining());
        return repeated;
    }
}
