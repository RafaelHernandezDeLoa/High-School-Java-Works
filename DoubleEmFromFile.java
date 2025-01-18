/** Rafael Hernandez 12/14/19 per#5
 * 
 */

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class DoubleEmFromFile
{
    public static void main (String[] args) throws IOException
    {
        File myfile = new File("C:\\Users\\Alexis\\Document.TXT");
        Scanner filereader = new Scanner(myfile);;
        String line = "";

        while (filereader.hasNext())
        {
            line = filereader.nextLine();
            System.out.println(line);
            System.out.println();
        } 
        filereader.close();

        int anInt = 0;
        int numCount = 0;
        int wordCount = 0;
        String sp = "";

        String[] sentences = line.split("[.]");
        int sentenceCount = sentences.length;

        for (int k = 0; k < sentenceCount; k++)
        {
            String[] words = sentences[k].split("\\d+");
            wordCount = words.length - 1;
            String[] nums = sentences[k].split("\\D+");
            numCount = nums.length - 1;

            if (sentences[k].equals(words[0]))
            {
                System.out.println(">" + sentences[k] + ".");
                System.out.println();
                continue;
            }
            
            if (nums[0].equals(""))
            {
                for (int i = 0; i<numCount; i++)
                {
                    anInt = Integer.parseInt(nums[i + 1]);
                    sp = sp + words[i] + (2 * anInt);
                }

                if (numCount == wordCount)
                {
                    sp = sp + words[wordCount];
                }
            }
            else
            {
                for (int j = 0; j<wordCount; j++)
                {
                    anInt = Integer.parseInt(nums[j]);
                    sp = sp + (2 * anInt) + words[j + 1];
                }

                if (numCount == wordCount)
                {
                    anInt = Integer.parseInt(nums[numCount]);
                    sp = sp + (2 * anInt);
                }
            }

            System.out.println(">" + sp + ".");
            sp = "";
            System.out.println();
        }
    }
}
