package etc.arrayList;

import org.junit.Test;

import static org.junit.Assert.*;

public class ZingoArrayListTest {
    @Test
    public void init() {
        ZingoArrayList<Integer> dynamicArray = new ZingoArrayList<>();
        assertEquals(0, dynamicArray.size());

        int size = 15;
        ZingoArrayList<Integer> dynamicArray2 = new ZingoArrayList<>(size);
        assertEquals(size, dynamicArray2.size());

        size = 5;
        ZingoArrayList<Integer> dynamicArray3 = new ZingoArrayList<>(size);
        assertEquals(size, dynamicArray3.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void getWithException() {
        ZingoArrayList<Integer> dynamicArray = new ZingoArrayList<>();
        dynamicArray.get(11);
    }

    @Test
    public void get() {
        ZingoArrayList<Integer> dynamicArray = new ZingoArrayList<>();
        dynamicArray.set(0, 1);
        assertEquals((Integer)1, dynamicArray.get(0));
    }

    @Test
    public void set() {
        ZingoArrayList<Integer> dynamicArray = new ZingoArrayList<>();
        dynamicArray.set(0, 1);
        assertEquals((Integer)1, dynamicArray.get(0));

        dynamicArray.set(1, 1);
        assertEquals((Integer)1, dynamicArray.get(1));

        dynamicArray.set(10, 5);
        assertEquals((Integer)5, dynamicArray.get(10));
        assertEquals(11, dynamicArray.size());

        ZingoArrayList<String> dynamicArray2 = new ZingoArrayList<>();
        dynamicArray2.set(0, "Hello");
        assertEquals("Hello", dynamicArray2.get(0));
    }

    @Test
    public void remove() {
        ZingoArrayList<Integer> dynamicArray = new ZingoArrayList<>();
        dynamicArray.set(0, 0);
        dynamicArray.set(1, 1);
        dynamicArray.set(2, 2);
        dynamicArray.set(3, 3);
        dynamicArray.set(4, 4);
        dynamicArray.set(5, 5);
        assertEquals(6, dynamicArray.size());
        assertEquals("[0, 1, 2, 3, 4, 5]", dynamicArray.toString());
        System.out.println(dynamicArray);

        assertEquals((Integer)3, dynamicArray.remove(3));
        System.out.println(dynamicArray);
        assertEquals(5, dynamicArray.size());
        assertEquals("[0, 1, 2, 4, 5]", dynamicArray.toString());
    }
}