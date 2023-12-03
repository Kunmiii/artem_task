package artem_task;

public class ArrayList<T> implements StringList {
    private final int initial_size = 10;
    private T[] items;
    private int cur_loc;

    public ArrayList(){
        this.items = (T[]) new Object[initial_size];
        this.cur_loc = 0;
    }
    @Override
    public void add(String element) {
        this.items[cur_loc++] = (T) element;
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
}
