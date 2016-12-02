package rifttech.behavioral.observer.impl;

import rifttech.behavioral.observer.Gate;

/**
 * Created by Arthur Abramov on 02.12.2016.
 */
public class EasternGate implements Gate {
    @Override
    public void close() {
        System.out.println("Eastern gate has closed");
    }
}
