import java.io.*;
import java.util.*;

// Read only region start
class UserMainCode
{

    public int countEvensOdds(int input1, int input2, int input3, int input4, int input5, String input6)
    // Read only region end
    {
        int even_count = 0, odd_count = 0;

        if (input1 % 2 != 0) odd_count++; else even_count++;
        if (input2 % 2 != 0) odd_count++; else even_count++;
        if (input3 % 2 != 0) odd_count++; else even_count++;
        if (input4 % 2 != 0) odd_count++; else even_count++;
        if (input5 % 2 != 0) odd_count++; else even_count++;

        if (input6.equals("even")) 
            return even_count;
        else 
            return odd_count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        String type = sc.next();

        UserMainCode obj = new UserMainCode();
        System.out.println(obj.countEvensOdds(a, b, c, d, e, type));
    }
}
