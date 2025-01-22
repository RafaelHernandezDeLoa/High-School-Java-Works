/**
 * 
 */
import java.util.ArrayList;

public class ArrayListGlitch
{
    public static void main (String[] args)
    {
        ArrayList<Integer> arylst = new ArrayList<Integer> ();
        ArrayList<Integer> numoptions = new ArrayList<Integer> ();
        numoptions.add(1);
        numoptions.add(2);
        numoptions.add(3);
        numoptions.add(4);
        numoptions.add(5);
        numoptions.add(6);
        numoptions.add(7);
        numoptions.add(8);
        numoptions.add(9);

        System.out.print("Original list: ");

        int count = 9;
        while (count > 0)
        {
            int numbers = (int) (Math.random() * 10);

            while (numbers == 0)
            {
                numbers = (int) (Math.random() * 10);
            }

            Integer number = 0;

            if (numbers == (numoptions.get(0)).intValue())
            {
                number = 1;
                numoptions.remove(0);
                numoptions.add(0,0);
            }
            else if (numbers == (numoptions.get(1)).intValue())
            {
                number = 2;
                numoptions.remove(1);
                numoptions.add(1,0);
            }
            else if (numbers == (numoptions.get(2)).intValue())
            {
                number = 3;
                numoptions.remove(2);
                numoptions.add(2,0);
            }
            else if (numbers == (numoptions.get(3)).intValue())
            {
                number = 4;
                numoptions.remove(3);
                numoptions.add(3,0);
            }
            else if (numbers == (numoptions.get(4)).intValue())
            {
                number = 5;
                numoptions.remove(4);
                numoptions.add(4,0);
            }
            else if (numbers == (numoptions.get(5)).intValue())
            {
                number = 6;
                numoptions.remove(5);
                numoptions.add(5,0);
            }
            else if (numbers == (numoptions.get(6)).intValue())
            {
                number = 7;
                numoptions.remove(6);
                numoptions.add(6,0);
            }
            else if (numbers == (numoptions.get(7)).intValue())
            {
                number = 8;
                numoptions.remove(7);
                numoptions.add(7,0);
            }
            else if (numbers == (numoptions.get(8)).intValue())
            {
                number = 9;
                numoptions.remove(8);
                numoptions.add(8,0);
            }
            arylst.add(number);

            if (number == 0)
            {
                arylst.remove(arylst.size()-1);
                continue;
            }

            count--;
        }

        while (count < arylst.size())
        {
            System.out.print((arylst.get(count)).intValue() + " ");
            count++;
        }

        System.out.println();
        System.out.print("The new array: ");

        count = arylst.size();

        while (count > 0)
        {
            if (!((arylst.get(count - 1)).intValue() % 2 == 0))
            {
                arylst.remove(count - 1);
            }
            count--;
        }

        count = 0;

        while (count < arylst.size())
        {
            System.out.print((arylst.get(count)).intValue() + " ");
            count++;
        }
    }
}