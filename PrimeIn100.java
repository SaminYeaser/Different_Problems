import java.util.Scanner;
public class PrimeIn100 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int sum=0;
        System.out.println("Enter the numbers");
        int n=keyboard.nextInt();
        for(int i=1;i<=n;i=i+2){
            if(i%11!=0){
                sum=sum+i;
            }
        }
        System.out.println(sum);
    }
}
