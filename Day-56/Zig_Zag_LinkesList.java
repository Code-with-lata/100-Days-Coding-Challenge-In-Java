public class Zig_Zag_LinkesList {
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

    public void zigZag(){
        // find mid
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        // reverse 2nd half
        Node curr = mid.next;
        Node prev = null;
        mid.next =null;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node left = head;
        Node right = prev;
        Node nextL, nextR;

        // zig-zag merge
        while(left != null && right != null){
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right =nextR;
        }
    }
    public static void main(String[] args) {
        Zig_Zag_LinkesList ll = new Zig_Zag_LinkesList(); 
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        
        ll.print();
        ll.zigZag();

        ll.print();
        
    }
}
