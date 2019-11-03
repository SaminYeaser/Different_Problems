package cse220Lab1;
import java.util.Scanner;
public class lab02 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
     int [] a = new int[5];
     int i;


     for(i=0;i<a.length;i++){
         a[i]= keyboard.nextInt();
     }
        int max = a[0];
        int indexMax=0;
     for(i=0;i<a.length;i++){

         if(a[i]>max) {
             max = a[i];
             indexMax = i;
         }
         }

        int indexMin=0;
        int min = a[0];
        for(i=0;i<a.length;i++){
                if(a[i]<min) {
                    min = a[i];
                    indexMin = i;
                }
            }
        int temp = a[indexMin];
        a[indexMin] = a[indexMax];
        a[indexMax] = temp;
            for(i=0;i<a.length;i++){
                System.out.println(a[i]);
            }
    }
    }
