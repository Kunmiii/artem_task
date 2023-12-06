package artem_task;

import java.util.Arrays;

public class ArrayList implements StringList {
    private Object[] items;
    // int initialSize = 10;
    private int currentIndex;

    public ArrayList(){
        int initialSize = 10;
        this.items = new Object[initialSize];
        this.currentIndex = 0;
    }
    @Override
    public void add(String element) {
        if (isIncreaseNeeded()){
            increaseCapacity();
        }
        items[currentIndex++] = element;
    }

    public String toString(){
        String modString = "[ ";
        for (int i = 0; i < currentIndex; i++) {
            modString += items[i];
            if (i < currentIndex - 1){
                modString += ", ";
            }
        }
            modString += " ]";
            return modString;
    }
    @Override
    public int indexOf(String element) {
        for (int i = 0; i < currentIndex; i++) {
            if (element == items[i]){
                return i;
            }
        }
        return -1;
    }

    @Override
    public int size() {
        return currentIndex;
    }

    @Override
    public String get(int index) {
        if (index < 0 || index >= currentIndex){
            throw new IndexOutOfBoundsException();
        }
        return (String) items[index];
    }

    /*private void checkCapacity(){
        if (currentIndex == items.length){
            int newSize = items.length * 2;
            items = Arrays.copyOf(items, newSize);
        }
    }*/

    private boolean isIncreaseNeeded(){
        return currentIndex == items.length;
    }

    private void increaseCapacity(){
            int newSize = items.length * 2;
            items = Arrays.copyOf(items, newSize);
    }
}
