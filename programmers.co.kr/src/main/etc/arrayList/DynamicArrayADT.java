package etc;

public interface ZingoArrayList<E> {
    int size();
    void set(int index, E value);
    E get(int index);
    E remove(int index);
}
