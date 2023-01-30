import java.util.Arrays;

public class MyArrayList<E> {
    private int size = 0;
    private static int DEFAULT_CAPACITY = 10;
    private Object elements[];
    public MyArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }
    public MyArrayList(int capacity) {
        elements = new Object[capacity];
    }
    public void add(int index, E element) {
        if(size == elements.length) {
            int newSize = elements.length * 2;
            elements = Arrays.copyOf(elements, newSize);
        }
        for(int i = size + 1; i > index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = element;
    }
    public E remove(int index) {
        for(int i = index; i < size; i++) {
            elements[i] = elements[i + 1];
        }
        return (E) elements[index];
    }
    public int size() {
        return size;
    }
    public E clone() throws CloneNotSupportedException{
        return (E) super.clone();
    }
    public boolean contains(E o) {
        boolean result = false;
        for(int i = 0; i < size; i++) {
            if(o == elements[i]) result = true;
        }
        return result;
    }
    public int indexOf(E o) {
        int result = - 1;
        for (int i = 0; i < size; i++) {
            if (o == elements[i]) result = i;
        }
        return result;
    }
    public boolean add(E e) {
        if(size == elements.length) {
            int newSize = elements.length * 2;
            elements = Arrays.copyOf(elements, newSize);
        }
        elements[size++] = e;
        return true;
    }
    public void ensureCapacity(int minCapacity) {
        elements = Arrays.copyOf(elements, minCapacity);
    }
    public E get(int i) {
        return (E) elements[i];
    }
    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
    }


}