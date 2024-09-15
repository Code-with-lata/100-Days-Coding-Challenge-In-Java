public class Search_Through_Recursion {
    public static class Node {
        int data;
        Node next;
    
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    public static Node head;
    public static Node tail;
    public static int size;
    
    // Add Method
    public void addFirst(int data){
        //step1 = creat new node
        Node newNode = new Node(data);
        size++;
    
        if(head == null){
            head = tail = newNode;
            return;
        }
        //step2 = newNode next = head
        newNode.next = head;
        //step3 = head = newNode
        head = newNode;
    
    }
    public void addLast(int data){
        Node newNode =new Node(data);
        size++;
    
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
    
        tail = newNode;
    }
    
    // Print Method
    public void print() {
        if(head == null){
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->" );
            temp = temp.next;
        }
        System.out.println("null");
    }
    
    // Search thugh recursion
    public int helper(Node head, int key){
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;
        }
        return idx+1;
    }

    public int recSearch(int key){
        return helper(head, key);
    }
    
    
    
    
    public static void main(String args[]){
        Search_Through_Recursion ll = new Search_Through_Recursion();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
    
        ll.print();
    
        System.out.println(ll.recSearch(3));
        System.out.println(ll.recSearch(10));
    }
}    
    
    
