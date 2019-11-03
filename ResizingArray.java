package Assginment1;

public class ResizingArray{
   public void method3(){
       int a[]={1,2,3,4,5,6,7,8,9};
       int[] b = new int[a.length*2];
       for(int i=0;i<a.length;i++){
           b[i]=a[i];
       }
       for (int i=0;i<b.length;i++)
           System.out.println(b[i]);
   }
}
