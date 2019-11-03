package Assginment1;

public class ReversingArray extends main {
    public void method4(int[] b) {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
       int c = a.length-1;
       for(int i=0;i<a.length;i++){
           b[i] = a[c];
           c--;
       }
        for (int i=0;i<a.length;i++)
            System.out.println(b[i]);
    }
}
