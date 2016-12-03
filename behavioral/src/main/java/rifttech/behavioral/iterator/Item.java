package rifttech.behavioral.iterator;

/**
 * Created by Arthur Abramov on 03.12.2016.
 */
public class Item {
    private final int id;
    private final String name;
    public Item(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
