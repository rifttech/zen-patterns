package rifttech.behavioral.observer;

import org.junit.Test;
import rifttech.behavioral.observer.impl.EasternGate;
import rifttech.behavioral.observer.impl.NorthernGate;
import rifttech.behavioral.observer.impl.SouthernGate;
import rifttech.behavioral.observer.impl.WesternGate;

/**
 * Created by Arthur Abramov on 02.12.2016.
 */
public class ObserverTest {
    @Test
    public void runObserver() throws Exception {
        Watchtower tower = new Watchtower();
        tower.attachGate(new NorthernGate());
        tower.attachGate(new SouthernGate());
        tower.attachGate(new WesternGate());
        tower.attachGate(new EasternGate());

        tower.alarm();

    }
}
