public class ArrayAdding {
    public static void main(String[] args) {
        int a1[]={23,33,77,43};
        int a2[]={43,53,83,63};
        int a3[]= new int[a1.length+a2.length];
        for(int i=0,count=0;i<a3.length;i++){
            if(i<a1.length) {
                a3[i] = a1[i];
            }
            else{
                a3[i] = a2[count];
                count++;
            }
        }
        for (int j=0;j<a3.length;j++){
            System.out.println(a3[j]);
        }
    }
}
