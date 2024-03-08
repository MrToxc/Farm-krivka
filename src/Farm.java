import java.util.ArrayList;
import java.util.List;

public class Farm {
    private String name;
    private int size;
    private int freeSpace = size;
    List<Animal> arrAnimal = new ArrayList<>();

    public Farm(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getFreeSpace() {
        return freeSpace;
    }

    public void setFreeSpace(int freeSpace) {
        this.freeSpace = freeSpace;
    }

    public static List<Animal> getArrAnimal() {
        return arrAnimal;
    }

    public void setArrAnimal(List<Animal> arrAnimal) {
        this.arrAnimal = arrAnimal;
    }
}
