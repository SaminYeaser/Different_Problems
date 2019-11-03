public class PrimeBetween100 {
    public static void main(String[] args) {
        int i, j;
        //String primenumbers="";
        for (i = 1; i <= 100; i++) {
            int flag=0;
            for (j = i; j>=1; j--) {
                if (i % j == 0) {
                    flag = flag + 1;
                }
            }
                if(flag==2) {
                    System.out.println(i);
                }
            }

    }
}
