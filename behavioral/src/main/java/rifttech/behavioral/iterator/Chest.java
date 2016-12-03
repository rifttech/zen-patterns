package rifttech.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Arthur Abramov on 03.12.2016.
 */
public class Chest {
    private List<Item> items;
    public Chest(){
        this.items = new ArrayList<>();
    }

    public Chest(List<Item> items){
        this.items = items;
    }

    public Iterator<Item> getIterator(){
        return new Iterator<Item>() {
            private int count = 0;
            @Override
            public Item next() {
                return items.get(count++);
            }

            @Override
            public boolean hasNext() {
                return items.size() >= count + 1;
            }
        };
    }



}
