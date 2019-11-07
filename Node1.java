
public class Node1{
    int x;
    Node prev;
    Node next;
    public Node1 (int i, Node p, Node n){
        x = i;
        prev = p;
        next = n;
    }
}
public class Tester{
    public static void main(String[]args){
        int a [] = {X+1,X+2,X+3,X+4};
        int b [] = {X+5,X+6,X+7,X+8};
        MyList m = new MyList();
        m.myMethod(a,b);
    }
}
public class MyList{
    public Node head;
    public void myMethod(int [] a, int [] b){
        head = new Node(a[0]* b[0],null,null);
        Node h = head;
        Node p;
        for(int i = 0;i<a.length;i++){
            p = new Node(a[i],null,null);
            h.next = p; h = h.next;
        }
        h.next = head;
        h=head;
        for(int i = 0;i<b.length;i++){
            p = new Node(b[i]-a[i],null,null);
            h.prev = p;
            h =h.prev;
        }
    }
}