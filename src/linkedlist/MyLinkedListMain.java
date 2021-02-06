package linkedlist;

public class MyLinkedListMain {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.add(9);
        list.add(1);
        list.add(5);
        list.add(2);
        list.add(9);
        list.add(2);
        list.add(4);
        list.add(2,10);
        System.out.println(list);
        list.set(2,10);
        list.remove(3);
        list.get(7);
    }
}
