public class Farmer {
    private String name;
    private Farm farm;
    private Land land;

    public Farmer(String name, Farm farm, Land land) {
        this.name = name;
        this.farm = farm;
        this.land = land;
    }

    @Override
    public String toString() {
        return "Farmer{" +
                "name='" + name + '\'' +
                ", farm=" + farm +
                ", land=" + land +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Farm getFarm() {
        return farm;
    }

    public void setFarm(Farm farm) {
        this.farm = farm;
    }

    public Land getLand() {
        return land;
    }

    public void setLand(Land land) {
        this.land = land;
    }

    public void addAnimal(Animal animal) {
        if(farm.getFreeSpace() < animal.getSize()) {
            System.out.println("Not enough space");
            return;
        }
        farm.getArrAnimal()
    }


}
