import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortable<E extends Comparable<E>> {
    private List<E> list = new ArrayList<>();

    public void add(E item) {
        list.add(item);
    }

    public void sort() {
        Collections.sort(list);
    }

    public void print() {
        for (E item : list) {
            System.out.println(item);
        }
    }
}
