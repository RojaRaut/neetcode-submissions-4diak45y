class LinkedList {
    Node head;

    class Node {
        int val;
        Node next;

        Node(int val) {
            this(val, null);
        }

        Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    public LinkedList() {
        head = null;
    }

    public int get(int index) {
        int size = 0;
        if(head != null) {
            Node curr = head;
            while(curr != null) {
                if(index == size) {
                    return curr.val;
                }
                size++;
                curr = curr.next;
            }
        }
        return -1; 
    }

    public void insertHead(int val) {
        Node newNode = new Node(val);
        if(head != null) {
            newNode.next = head;
            head = newNode;
        }else {
            head = newNode;
        }
    }

    public void insertTail(int val) {
        Node newNode = new Node(val);
        if(head != null) {
            Node curr = head;
            while(curr.next != null) {
                curr = curr.next;
            }curr.next = newNode;
        }else {
            head = newNode;
        }
    }

    public boolean remove(int index) {
        Node prev = null;
        Node curr = null;
        int size = 0;
        
        if(head != null) {
            if(index == 0) {
            head = head.next;
            return true;
           }
           curr = head;
            while(curr != null) {
                if(index == size) {
                    prev.next = curr.next;
                    return true;
                }
                prev = curr;
                curr = curr.next;
                size++;
            }
        }return false;
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> listValues = new ArrayList<Integer>();
        if(head != null) {
            Node curr = head;
            while(curr != null) {
                listValues.add(curr.val);
                curr = curr.next;
            }return listValues;
        }return new ArrayList();
    }
}
