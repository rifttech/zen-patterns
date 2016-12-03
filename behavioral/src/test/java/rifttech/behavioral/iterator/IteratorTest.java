package rifttech.behavioral.iterator;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Arthur Abramov on 03.12.2016.
 */
public class IteratorTest {
    @Test
    public void tryIterator(){
        List<Item> items = Arrays.asList(
                  new Item(0, "Health Potion")
                , new Item(1, "Barbarian Axe")
                , new Item(2, "Paladin Pants")
                , new Item(3, "Skeleton Key")
        );
        Chest chest = new Chest(items);

        Iterator<Item> iterator = chest.getIterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
    }

    @Test
    public void tryIteratorOverEmptyCollection(){
        Chest chest = new Chest();

        Iterator<Item> iterator = chest.getIterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }

    }
}
