package mystringarraylist;

import java.util.Arrays;

public class MyStringArrayList{

    private Object[] array ;
    private int numberOfElements =0;
    private int index;

   ///c ArrayList /// cmd+нажать на метод для просмотра исходного кода
    public MyStringArrayList(){
        array = new Object[10];
    }
    private void grow() {
        String[] newArray = new String[array.length * 2];
        System.arraycopy(array, 0, newArray, 0, index - 1);
        array = newArray;
    }
    public void add(String item){
        if( array.length - numberOfElements == 1){
            array = Arrays.copyOf(array, array.length * 2);
        }
        array[numberOfElements++] = item;
    }
    public void add(int index, String item) {
        final int s;
        String[] elementData;
        if ((s = numberOfElements) == (elementData = (String[]) this.array).length)
            grow();
        System.arraycopy(elementData, index,
                elementData, index + 1,
                s - index);
        elementData[index] = item;
        numberOfElements++;
    }
    public String get(int index){
        return (String) array[index];
    }
    public void set(int index,String item){
        array[index]=item;
    }
    public String remove(int index){
        if(index<numberOfElements){
            String item = (String) array[index];
            array[index]=null;
            numberOfElements--;

            return item;

        }
        else{
            throw new ArrayIndexOutOfBoundsException();
        }
    }
    public int size(){
        return numberOfElements;
    }

    private void resize(int newLength){
        Object[] newArray = new Object[newLength];
        System.arraycopy(array, 0 ,newArray,0,numberOfElements);
        array=newArray;
    }
    public String toString(){
        String result = "содержание: ";
        for(int i=0; i<size();i++){
                result += " "+get(i)+ ';';
        }
        return result;
    }
}
