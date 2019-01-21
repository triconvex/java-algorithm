package etc.arrayList;

public class ZingoArrayList<Integer> implements DynamicArrayADT {
    private int size;

    ZingoArrayList() {
    }

    ZingoArrayList(int size) {
        this.size = size;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public void set(int index, Object value) {

    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public Object remove(int index) {
        return null;
    }
}
