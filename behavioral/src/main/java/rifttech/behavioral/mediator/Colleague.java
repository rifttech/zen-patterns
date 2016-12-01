package rifttech.behavioral.mediator;

/**
 * Created by Arthur Abramov on 30.11.2016.
 */
public abstract class Colleague {
    protected Mediator mediator;
    protected Kingdoms kingdom;

    public Kingdoms getKingdom() {
        return kingdom;
    }

    public Colleague(Mediator mediator, Kingdoms kingdom){
        this.mediator = mediator;
        this.kingdom = kingdom;

    }

    public void send(Diplomacy diplomacy, Kingdoms to){
        this.mediator.send(diplomacy, kingdom, to);
    }

    public abstract void notify(String message);

}
