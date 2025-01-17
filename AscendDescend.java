/**
 * 
 */
import java.util.Arrays;

public class AscendDescend
{
    public static void main (String[] args)
    {
        System.out.println("Ascend   Descend");
        System.out.println();
        String[] ss = {"Bill", "Mary", "Lee", "Agnes", "Alfred", "Thomas", "Alvin", "Bernard", "Ezra", "Herman"};
        Arrays.sort(ss);
        
        for (int i = 0; i < 10; i++)
        {
            System.out.println(ss[i] + "   " + ss[ss.length - 1 - i]);
        }
    }
}