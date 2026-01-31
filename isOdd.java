import java.io.*;
import java.util.*;
class UserMainCode{
public int isOdd(int input1){
if(input1 %2 !=0) return 2;
else return 1;
}

public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    UserMainCode obj = new UserMainCode();
    System.out.println(obj.isOdd(n));
}
}