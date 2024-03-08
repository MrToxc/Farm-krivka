import java.util.ArrayList;
import java.util.List;

public class Land {

    private String name;
    private int size;
    private int freeSpace;
    List<Flower> arrFlower = new ArrayList<>();

    public Land(String name, int size) {
        this.name = name;
        this.size = size;
    }
}
