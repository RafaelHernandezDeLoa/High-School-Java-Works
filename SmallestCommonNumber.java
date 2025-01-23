/** Rafael Hernandez 10/21/19 per#5
 * 
 */

public class SmallestCommonNumber
{
    public static void main(String[] args)
    {
        int[] nums1 = { 1, 2, 4, 6, 7, 9, 13, 14, 17 };
        int[] nums2 = { 0, 3, 5, 8, 9, 11, 12, 14, 17, 18, 20 };

        int SmallestComNum = lowestCommon1(nums1, nums2);
        int SmallestComNum2 = lowestCommon2(nums1, nums2);
        System.out.println(SmallestComNum + " from long way.");
        System.out.println(SmallestComNum2 + " from short way.");
    }

    public static int lowestCommon1(int[] a, int[] b)
    {
        int[] arrayOfNums1 = a;
        int[] arrayOfNums2 = b;
        int i;
        int j;
        int arrayOfNums1Common = 1;
        int arrayOfNums2Common = 0;
        int smallestNum = 21;
        for (i = 0; i < arrayOfNums1.length; i++)
        {
            for (j = 0; j < arrayOfNums2.length; j++)
            {
                if (arrayOfNums1[i] == arrayOfNums2[j])
                {
                    smallestNum = arrayOfNums1[i];
                    arrayOfNums1Common = arrayOfNums1[i];
                    arrayOfNums2Common = arrayOfNums2[j];
                    break;
                }
            }
            if (arrayOfNums1Common == arrayOfNums2Common)
            {
                break;
            }
            j = 0;
        }
        return smallestNum;
    }

    public static int lowestCommon2(int[] c, int[] d)
    {
        int[] array1 = c;
        int[] array2 = d;
        int f = 0;
        int g = 0;
        int smallestComm;
        while (f < array1.length && g < array2.length )
        {
            if (array1[f] < array2[g])
            {
                f++;
            }
            else if (array1[f] > array2[g])
            {
                g++;
            }
            else if (array1[f] == array2[g])
            {
                break;
            }
        }
        smallestComm = array1[f];
        return smallestComm;
    }
} 