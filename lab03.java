package cse220Lab1;
import java.util.Scanner;
public class lab03 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int[] a = new int[5];
        int i;


        for (i = 0; i < a.length; i++) {
            a[i] = keyboard.nextInt();
        }
        int max = a[0];
        int indexMax = 0;
        for (i = 0; i < a.length; i++) {
            for (int j =i+1 ; j < a.length; j++) {

                if (a[i] > a[j]) {
                    max = a[i];
                    a[i]=a[j];
                    a[j]= max;
                }
            }
            System.out.println(a[i]);
        }
        for(int z=0;z<a.length;z++){
            if(a[z]%2==0){
                System.out.println("The even numbers are: ");
                for(z=0;z<a.length-1;z++) {
                    System.out.print(a[z] + ",");
                }
            }
        }
    }
}