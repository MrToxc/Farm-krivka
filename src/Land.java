import java.util.ArrayList;
import java.util.List;

public class Land {

    private String name;
    private int size;
    List<Flower> arr = new ArrayList<>();

    public Land(String name, int size, List<Flower> arr) {
        this.name = name;
        this.size = size;
        this.arr = arr;
    }
}
