public class Remove_Nth_Node_from_End {
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
     
    // Delete Nth from the End
    public void deleteNthfromEnd(int n){
        // calculate size
        int size =0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            size++;
        }

        if(n == size){
            head = head.next; // remove first
            return;
        }

        //size-n
        int i = 1;
        int iToFind = size-n;
        Node prev = head;
        while(i < iToFind){
            prev =prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return;

    }
     
    

    
    
    public static void main(String args[]){
        Remove_Nth_Node_from_End ll = new Remove_Nth_Node_from_End();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
    
        ll.print();
        
        ll.deleteNthfromEnd(3);
        ll.print();
    }
}
