public class Searct_Through_Iteration {
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




    public int itrSearch(int key){
        Node temp = head;
        int i = 0;

        while(temp != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        // When key not found
        return -1;
    }
    public static void main(String args[]){
        Searct_Through_Iteration ll = new Searct_Through_Iteration();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);

        ll.print();

        System.out.println(ll.itrSearch(3));
        System.out.println(ll.itrSearch(10));
    }
}
