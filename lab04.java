package cse220Lab1;
import java.util.Scanner;
public class lab04 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int a[] = new int[5];
        int i;
        for(i=0;i<a.length;i++){
            a[i] = keyboard.nextInt();
        }
        for(i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]!=a[j]){
                    System.out.println("Number you enter is : "+a[j]);
                }
            }
        }
        for(i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    System.out.println("Number already used");
                }
            }
        }
        System.out.println(a[i]);
    }
}
