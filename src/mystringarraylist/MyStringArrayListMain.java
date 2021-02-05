package mystringarraylist;

public class MyStringArrayListMain {
    public static void main(String[] args) {
        MyStringArrayList arrayList =new MyStringArrayList();
        arrayList.add("df");
        arrayList.add("v,sz ");
        arrayList.add("z,c");
        arrayList.add("4");
        arrayList.add("ss");
        System.out.println(arrayList.toString());
        System.out.println("//////////////////////");
        arrayList.set(2,"sl");
        System.out.println(arrayList.toString());
        System.out.println("//////////////////////");
        System.out.println("array list size: "+arrayList.size());
        arrayList.remove(2);
        System.out.println("array list size after removing: "+arrayList.size());
        System.out.println("//////////////////////");
        System.out.println(arrayList.get(3));
        System.out.println("//////////////////////");

    }
}
