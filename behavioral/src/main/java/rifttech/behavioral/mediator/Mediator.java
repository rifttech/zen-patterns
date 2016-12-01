package rifttech.behavioral.mediator;

/**
 * Created by Arthur Abramov on 30.11.2016.
 */
public abstract class Mediator {
    public abstract void send(Diplomacy diplomacy, Kingdoms from, Kingdoms to);
}
