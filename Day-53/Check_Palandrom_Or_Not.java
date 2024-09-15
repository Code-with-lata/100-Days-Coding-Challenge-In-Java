public class Check_Palandrom_Or_Not {
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
     
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean checkPalindrome(){
        if(head == null || head.next != null){
            return true;
        }

        // step1 = find mid
        Node midNode = findMid(head);

        // step2 = reverse 2nd half
        Node prev = null;
        Node curr = head;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev; //right half head
        Node left = head;  //left half head

        //step3 = check left half & right half

        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    

    
    
    public static void main(String args[]){
        Check_Palandrom_Or_Not ll = new Check_Palandrom_Or_Not();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(1);
        
        
        ll.print(); //1->2->2->1
        
        System.out.println(ll.checkPalindrome());
    }
}
