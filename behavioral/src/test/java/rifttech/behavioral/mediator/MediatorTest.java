package rifttech.behavioral.mediator;

import org.junit.Test;
import rifttech.behavioral.mediator.impl.colleagues.*;
import rifttech.behavioral.mediator.impl.Messenger;


import java.util.Arrays;
import java.util.Dictionary;

/**
 * Created by Arthur Abramov on 30.11.2016.
 */
public class MediatorTest {
    @Test
    public void testMediator(){
        Messenger messenger = new Messenger();
        EastAnglia eastAnglia = new EastAnglia(messenger, Kingdoms.EastAnglia);
        Essex essex = new Essex(messenger, Kingdoms.Essex);
        Kent kent = new Kent(messenger, Kingdoms.Kent);
        Mercia mercia = new Mercia(messenger, Kingdoms.Mercia);
        Northumbria northumbria = new Northumbria(messenger, Kingdoms.Northumbria);
        Sussex sussex = new Sussex(messenger, Kingdoms.Sussex);
        Wessex wessex = new Wessex(messenger, Kingdoms.Wessex);

        messenger.getColleagues()
            .addAll(
                Arrays.asList(
                 eastAnglia
                ,essex
                ,kent
                ,mercia
                ,northumbria
                ,sussex
                ,wessex
        ));


        messenger.send(Diplomacy.Envoy, Kingdoms.Northumbria ,Kingdoms.Kent);
        messenger.send(Diplomacy.Trade, Kingdoms.EastAnglia, Kingdoms.Essex);
        messenger.send(Diplomacy.War, Kingdoms.Essex, Kingdoms.Mercia);
        messenger.send(Diplomacy.Peace,Kingdoms.EastAnglia, Kingdoms.Sussex);

    }
}
