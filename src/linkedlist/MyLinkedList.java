package linkedlist;

public class MyLinkedList {
    //  List<String> list = new LinkedList<String>();

    Node first;
    Node last;
    int size;
    class Node{
        int element;
        Node previous;
        Node next;
        public Node(int element){
            this.element=element;
        }
        public int getElement(){
            return element;
        }
        public Node getNext(){
            return next;
        }
    }
    private int indexOf(Node link){
        if(link==null){
            return -1;
        }
        return 1+ indexOf(link.next);
    }
    public int get(int i){
        int q=indexOf(first);
        Node current = first;
        current=current.next;
        System.out.println(current.element);
        return current.element;
    }
    private boolean elementIndex(int index){
        return index>=0 && index<size;
    }
    private void checkElementIndex(int index){
        if(!elementIndex(index)){
            throw new IndexOutOfBoundsException();
        }
    }

    public void add(int element){
        Node nnode = new Node(element);
        if (first==null){
            nnode.next=null;
            nnode.previous=null;
            first=nnode;
            last=nnode;
        }else{
            last.next=nnode;
            nnode.previous=last;
            last = nnode;
        }
        size++;
    }

    Node node(int index) {


        if (index < (size >> 1)) {
            Node x = first;
            for (int i = 0; i < index; i++)
                x = x.next;
            return x;
        } else {
            Node x = last;
            for (int i = size - 1; i > index; i--)
                x = x.previous;
            return x;
        }
    }
    public void add(int index, int element) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node newNode = new Node(element);
        if (index == 0) {
            add(element);
        }
        if (index == size) {
            last.next = newNode;
            last = newNode;
        }
        Node oldNode = first;
        for (int i = 0; i < index; i++) {
            oldNode = oldNode.next;
        }
        Node oldPrevious = oldNode.previous;
        oldPrevious.next = newNode;
        oldNode.previous = newNode;

        newNode.previous = oldPrevious;
        newNode.next = oldNode;
        size++;
    }
    public Integer set(int index, int element) {
        checkElementIndex(index);
        Node x = node(index);
        Integer oldVal = x.element;
        x.element = element;
        return oldVal;
    }
    public void remove(int index) {
        if (index == 0) {

            first = first.next;
        } else {

            Node current = first;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }

            current.next = current.next.next;
        }
    }


    public String toString() {
        System.out.println("Size : " + size);
        String string = "Contents:\n";


        Node current = first;
        while (current != null) {
            string += current.getElement() + "\n";
            current = current.getNext();

        }
        return string;
    }

}


