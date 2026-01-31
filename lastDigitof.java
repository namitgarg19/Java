import java.io.*;
import java.util.*;

class UserMainCode
{
    public int lastDigitof(int input1){
        return input1 % 10;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        UserMainCode obj = new UserMainCode();
        System.out.println(obj.lastDigitof(n));
    }
}
