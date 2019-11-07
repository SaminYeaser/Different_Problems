public class Circulareven {
    public static void main(String[] args) {
        int a[]={35,36,0,0,0,29,30,31,32,33,34};
        int size=8, start=5,k=start;
        int b[]= new int[size];
        for (int i=0;k<a.length && i<size;i++) {
                b[i] = a[k];
            k=(k+1)%a.length;

        }
        for (int i=0;i<b.length;i++){
            if(b[i]%2==0)
            System.out.println(b[i]);
        }
    }
}
