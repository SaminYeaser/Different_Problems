package Assginment1;

public class ShiftArrayLeft {
    public void method5(int[] b) {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int temp = 0;
        for (int i = 1; i < a.length - 1; i++) {
            a[i - 1] = b[i];
        }
        for (int i = 0; i < a.length-2; i++) {
            System.out.println(a[i]);
        }

        System.out.println(temp);
    }
}