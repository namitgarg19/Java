import java.io.*;
import java.util.*;

// Read only region start
class UserMainCode
{

    public int isPrime(int input1) {
        // Read only region end
        
        int count = 0;

        for(int i = 2; i < input1; i++){
            count++;
        }

        int prime = 0;

        for(int i = 2; i < input1; i++){
            if(input1 % i != 0) {
                prime++;
            }
        }

        if(prime == count) return 2;
        else return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        UserMainCode obj = new UserMainCode();
        System.out.println(obj.isPrime(n));
    }
}
