package rifttech.behavioral.mediator.impl;

import rifttech.behavioral.mediator.Colleague;
import rifttech.behavioral.mediator.Diplomacy;
import rifttech.behavioral.mediator.Kingdoms;
import rifttech.behavioral.mediator.Mediator;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by Arthur Abramov on 30.11.2016.
 */
public class Messenger extends Mediator {
    private List<Colleague> colleagues;

    public Messenger(){
        this.colleagues = new ArrayList<>();
    }

    public List<Colleague> getColleagues(){
        return colleagues;
    }

    public void send(Diplomacy diplomacy, Kingdoms from, Kingdoms to) {
        getColleagues().stream().filter(colleague -> colleague.getKingdom().equals(to)).forEach(colleague -> {
            String message = String.format(

                    "[Message Received from %s to %s]: %s"
                    ,from.name()
                    ,to.name()
                    ,diplomacy.getAction()

            );
            colleague.notify(message);
        });
    }
}
