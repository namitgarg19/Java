import java.util.Scanner;
public class InsurancePremiumCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String B = sc.nextLine();
        double A = sc.nextDouble();
        int C = sc.nextInt();

        double charges=0;
        double noclaimbonus =0;
        double processingcharge =0;
        if(B.equalsIgnoreCase("Domestic")){
            if(A<100000){
                charges=0.3;
            }else{
                charges=0.25;
            }
            if(C==0){
                noclaimbonus=10;
            }
            processingcharge=50;
        }
        if(B.equalsIgnoreCase("Commercial")){
            if(A<250000){
                charges=0.5;
            }else{
                charges=0.75;
            }
            if(C==0){
                noclaimbonus=15;
            }
            processingcharge=80;
        }
        double x = charges*A/100 + processingcharge;
        double finalpremium = x - noclaimbonus*x/100;
        System.out.printf("%.2f", finalpremium);
    }
}