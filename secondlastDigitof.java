import java.io.*;
import java.util.*;

// Read only region start
class UserMainCode
{

    public int secondlastDigitof(int input1){
        // Read only region end
        
        input1 = Math.abs(input1); // handle negative numbers
        
        if (input1 >= 0 && input1 <= 9) { 
            return -1; // single digit case
        }
        else {
            int a = input1 / 10; // remove last digit
            int result = a % 10; // get second last digit
            return result;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        UserMainCode obj = new UserMainCode();
        System.out.println(obj.secondlastDigitof(n));
    }
}
