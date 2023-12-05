package artem_task;

import java.util.Arrays;

public class ArrayList implements StringList {
    private Object[] items;
    private int cur_loc;

    public ArrayList(){
        int initialSize = 10;
        this.items = new Object[initialSize];
        this.cur_loc = 0;
    }
    @Override
    public void add(String element) {
        checkCapacity();
        items[cur_loc++] = element;
    }

    public String toString(){
        String modString = "[ ";
        for (int i = 0; i < cur_loc; i++) {
            modString += items[i];
            if (i < cur_loc - 1){
                modString += ", ";
            }
        }
            modString += " ]";
            return modString;
    }
    @Override
    public int indexOf(String element) {
        for (int i = 0; i < cur_loc; i++) {
            if (element == items[i]){
                return i;
            }
        }
        return -1;
    }

    @Override
    public int size() {
        return cur_loc;
    }

    @Override
    public String get(int index) {
        if (index < 0 || index >= cur_loc){
            throw new IndexOutOfBoundsException();
        }
        return (String) items[index];
    }

    private void checkCapacity(){
        if (cur_loc == items.length){
            int newSize = items.length * 2;
            items = Arrays.copyOf(items, newSize);
        }
    }
}
