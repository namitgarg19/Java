import java.io.*;
import java.util.*;

// Read only region start
class UserMainCode
{

    public int addLastDigits (int input1, int input2){
        // Read only region end
        return Math.abs(input1 % 10 + input2 % 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        
        UserMainCode obj = new UserMainCode();
        System.out.println(obj.addLastDigits(n1, n2));
    }
}
