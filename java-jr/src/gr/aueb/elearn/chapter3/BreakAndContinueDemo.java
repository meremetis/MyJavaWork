package gr.aueb.elearn.chapter3;

/**
 * break and contininue demo
 */
public class BreakAndContinueDemo
{
    public static void main(String[] args)
    {
        int i = 0;
        int j = 0;
        int result = 0;

        while(true)
        {
            if (i == 10) break;
            i++;
        }

        while(j <= 10)
        {
            j++;
            if (i == 5) continue;
            result += j;
        }
    }
}
