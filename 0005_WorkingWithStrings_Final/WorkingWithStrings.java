import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;
import java.util.StringTokenizer;

public class WorkingWithStrings
{
    private static final int STAR_COUNT = 80;
    
    public static void main(String[] args) 
    {
        //java.lang.String
        String quote = "We've done the impossible, and that makes us mighty!";
        String quotePart = "impoSSible";
        
        System.out.println(quote);
        System.out.println(quote.length());
        System.out.println(PrintStars(STAR_COUNT));
        
        //contains
        System.out.println("Quote contains 'impoSSible': " + quote.contains(quotePart));
        System.out.println("Quote contains 'IMPOSSIBLE': " + quote.contains(quotePart.toUpperCase()));
        System.out.println("Quote contains 'impossible': " + quote.contains(quotePart.toLowerCase()));
        System.out.println(PrintStars(STAR_COUNT));
        
        //charAt
        System.out.println("The 1st character in quote is: " + quote.charAt(0));
        System.out.println("The 18th character in quote is: " + quote.charAt(17));
        System.out.println("The last character in quote is: " + quote.charAt(quote.length() - 1));
        System.out.println(PrintStars(STAR_COUNT));
        
        //indexOf & lastIndexOf
        int firstM = quote.indexOf('m');
        int lastT = quote.lastIndexOf('t');
        int offSet = quote.indexOf(quotePart.toLowerCase());
        System.out.println("The first index of m in quote is at position: " + firstM);
        System.out.println("The last index of t in quote is at position: " + lastT);
        System.out.println("Impossible starts at: " + offSet);
        System.out.println(PrintStars(STAR_COUNT));
        
        //substring
        String firstCharToChar18 = quote.substring(0, 18);
        String char19ToEnd = quote.substring(18);
        String firstMtoLastT = quote.substring(firstM, lastT - firstM);
        System.out.println("The substring from first char to char 18 in quote is: " + firstCharToChar18);
        System.out.println("The substring from char 19 to the end in quote is: " + char19ToEnd);
        System.out.println("The substring from first M to lastT in quote is: " + firstMtoLastT);
        
        System.out.println("Working with strings is not " 
                            + quote.substring(offSet, offSet + quotePart.length())
                            + "!");
        System.out.printf("Working with strings is not %s!\n"
                            , quote.substring(offSet, offSet + quotePart.length()));
        System.out.println(PrintStars(STAR_COUNT));
        
        
        String name = "Fred Flintstone";
        String name2 = "fred flintstone";
        
        System.out.println("Name = Name2 [case-sensitive]: " + name.equals(name2));
        System.out.println("Name = Name2 [ignore case]: " + name.equalsIgnoreCase(name2));
        System.out.println(PrintStars(STAR_COUNT));
        System.out.println(PrintStars(STAR_COUNT));
        
        //String Builder:
        StringBuilder sb = new StringBuilder("");
        sb.append("This ");
        sb.append("is ");
        sb.append("my ");
        sb.append("program ");
        System.out.println(sb.toString());
        System.out.println(sb);
        System.out.println(PrintStars(STAR_COUNT));
        
        //String Buffer:
        StringBuffer sb2 = new StringBuffer("");
        sb2.append("This ");
        sb2.append("is ");
        sb2.append("my ");
        sb2.append("program ");
        System.out.println(sb2.toString());
        System.out.println(sb2);
        System.out.println(PrintStars(STAR_COUNT));
        
        System.out.println(PrintStars(STAR_COUNT));
        //split:
        String testString = "This is my program";
        String[] myStrings = testString.split(" ");
        for (String s : myStrings)
        {
            System.out.println(s);
        }
        System.out.println(PrintStars(STAR_COUNT));
        //tokenizer:
        StringTokenizer st = new StringTokenizer(testString, " ");
        while (st.hasMoreElements())
        {
            System.out.println(st.nextElement());
        }
        System.out.println(PrintStars(STAR_COUNT));
        System.out.println(PrintStars(STAR_COUNT));
    }
    
    public static String PrintStars(int num)
    {
        String repeated = Stream.generate(() -> "*").limit(num).collect(joining());
        return repeated;
    }
}
