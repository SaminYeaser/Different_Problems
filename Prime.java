import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a value");
        int a = keyboard.nextInt();
        int flag=0;
        if(a==2){
            System.out.println("Prime");
        }
        else if(a==0||a==1){
            System.out.println("Not Prime");
        }
        for (int i=2;i<a;i++) {
            if (a % i == 0) {
                System.out.println("Not Prime");
                flag=1;
                break;
            }
        }
            if(flag==0){
                System.out.println("Prime");
            }
        }

    }

