package rifttech.behavioral.mediator.impl.colleagues;

import rifttech.behavioral.mediator.Colleague;
import rifttech.behavioral.mediator.Kingdoms;
import rifttech.behavioral.mediator.Mediator;

/**
 * Created by Arthur Abramov on 30.11.2016.
 */
public class Mercia extends Colleague {

    public Mercia(Mediator mediator, Kingdoms kingdom) {
        super(mediator, kingdom);
    }

    public void notify(String message) {
        System.out.println(message);
    }
}
