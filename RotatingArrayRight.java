package Assginment1;

public class RotatingArrayRight {
        public void method7(int[] b) {
            int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
            int temp = a[a.length-1];
            for (int i = a.length-1; i > 0; i--) {
                a[i] = a[i-1];
            }
            System.out.println(temp);
            for (int i = 1; i < a.length; i++) {
                System.out.println(a[i]);
            }

        }
    }

