import java.io.*;
import java.util.*;

// Read only region start
class UserMainCode
{
    public int nFactorial(int input1){
        // Read only region end
        
        int n = 1;
        for(int i = 1; i <= input1; i++){
            n = n * i;
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        UserMainCode obj = new UserMainCode();
        System.out.println(obj.nFactorial(num));
    }
}
