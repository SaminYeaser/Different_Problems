class Node {
    int num;
    Node next;
    public Node(int n, Node x){
        num =n;
        next =x;
    }
}

class LinkedList {
    Node head;
    public LinkedList(){
        head = null;
    }
    void insert(int val){
        Node node = new
                Node(val,null);
        node.next = head;
        head = node;
    }
    int remove() {
        int val = 0;
        if(head != null) {
            Node prev = null;
            Node cur = head;
            while(cur.next!=null){
                prev = cur;
                cur = cur.next;
            }
            val = cur.num;
            if(cur == head)
                head = null;
            else
                prev.next = null;
        }
        return val;
    }
}
