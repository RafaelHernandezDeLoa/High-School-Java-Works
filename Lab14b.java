/**
 * 
 */
public class Lab14b
{
    public static void main(String[] args)
    {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String question = "is going Up ?  ";
        int l = 9;
        for (int k = 1; k <= 4; k++)
        {
            System.out.print("[");
            for (int i = 0; i < l + 1; i++)
            {
                if (i == l)
                {
                    System.out.print(nums[i]);
                    continue;
                }
                System.out.print(nums[i] + ", ");
            }
            System.out.println("]");
            System.out.print(question);
            for (int i = 0; i < l; i++)
            {
                int j = i + 1;
                if (nums[i] < nums[j])
                {
                    if (i == l - 1)
                    {
                        System.out.println("true");
                    }
                    continue;
                }
                System.out.println("false");
                break;
            }

            if (nums[3] == 4)
            {
                nums = new int[] {1, 2, 3, 9, 11, 20, 30};
                l = 6;
                continue;
            }

            if (nums[3] == 9)
            {
                nums = new int[] {9, 8, 7, 6, 5, 4, 3, 2, 0, -2};
                l = 9;
                continue;
            }

            if (nums[3] == 6)
            {
                nums = new int[] {3, 6, 9, 12, 9, 6, 3};
                l = 6;
                continue;
            }
        }
        System.out.println();

        nums = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        question = "is going Down ?  ";
        l = 9;
        for (int k = 1; k <= 4; k++)
        {
            System.out.print("[");
            for (int i = 0; i < l + 1; i++)
            {
                if (i == l)
                {
                    System.out.print(nums[i]);
                    continue;
                }
                System.out.print(nums[i] + ", ");
            }
            System.out.println("]");
            System.out.print(question);
            for (int i = 0; i < l; i++)
            {
                int j = i + 1;
                if (nums[i] > nums[j])
                {
                    if (i == l - 1)
                    {
                        System.out.println("true");
                    }
                    continue;
                }
                System.out.println("false");
                break;
            }

            if (nums[3] == 4)
            {
                nums = new int[] {1, 2, 3, 9, 11, 20, 30};
                l = 6;
                continue;
            }

            if (nums[3] == 9)
            {
                nums = new int[] {9, 8, 7, 6, 5, 4, 3, 2, 0, -2};
                l = 9;
                continue;
            }

            if (nums[3] == 6)
            {
                nums = new int[] {3, 6, 9, 12, 9, 6, 3};
                l = 6;
                continue;
            }
        }
    }
}