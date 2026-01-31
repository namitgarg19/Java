import java.io.*;
import java.util.*;

// Read only region start
class UserMainCode
{
    public int countEvens (int input1, int input2, int input3, int input4, int input5)
    {
        // Read only region end
        
        int count = 0;

        if (input1 % 2 == 0) count++;
        if (input2 % 2 == 0) count++;
        if (input3 % 2 == 0) count++;
        if (input4 % 2 == 0) count++;
        if (input5 % 2 == 0) count++;

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();

        UserMainCode obj = new UserMainCode();
        System.out.println(obj.countEvens(a, b, c, d, e));
    }
}
