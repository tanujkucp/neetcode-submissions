class LinkedList {

    Node head, tail;
    int size;

    class Node {
        int val;
        Node next;
        Node (int val) {
            this.val = val;
        }
    }

    public LinkedList() {

    }

    public int get(int index) {
        if(index >= size){
            return -1;
        }

        int i=0;
        Node curr = head;
        while (i++ < index){
            curr = curr.next;
        }
        return curr.val;
    }

    public void insertHead(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (size == 0){
            tail = head;
        }
        size++;
    }

    public void insertTail(int val) {
        Node node = new Node(val);
        if (tail != null){
            tail.next = node;
        }
       
        tail = node;
        if(head == null) { 
            head = tail;
        }
        size++;
    }

    public boolean remove(int index) {
        if (index >= size){
            return false;
        }

        if (size==1){
            head = null;
            tail = null;
            size--;
            return true;
        }

        int i=0;
        Node curr = head, prev=head;
        while(i++ < index){
            prev = curr;
            curr = curr.next;
        }

        prev.next = curr.next;
        
        if (curr == tail) {
            tail = prev;
        }
        if(curr == head) {
            head = curr.next;
        }
        size--;
        return true;
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> arr = new ArrayList<>();
        int i=0;
        Node curr = head;
        while(i++ < size){
            arr.add(curr.val);
            curr = curr.next;
        }
        return arr;
    }
}
