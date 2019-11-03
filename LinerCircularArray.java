package Assginment1;

public class LinerCircularArray {
    public void mathod2() {
        int a[] = {15, -4, 17, 0, 0, 5, 6, 9};
        int b[] = new int[a.length];
        int size = 6;
        int capacity = 8;
        int nap = 3;
        int lastIndex = 2;
        int start = 5;
        int i;
        for (i = 0; i < capacity; i++) {
            b[i] = a[start];
            start = (start + 1) % capacity;
        }
        for (i = 0; i < a.length; i++)
            System.out.println(b[i]);
    }
}
