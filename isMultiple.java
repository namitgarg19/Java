import java.io.*;
import java.util.*;

// Read only region start
class UserMainCode
{

    public int isMultiple(int input1, int input2){
        // Read only region end
        
        if (input1 == 0 || input2 == 0) 
            return 3; // zero case
        
        else if (input1 % input2 == 0) 
            return 2; // multiple
        
        else 
            return 1; // not a multiple
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        
        UserMainCode obj = new UserMainCode();
        System.out.println(obj.isMultiple(n1, n2));
    }
}
