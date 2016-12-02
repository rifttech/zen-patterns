package rifttech.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Arthur Abramov on 02.12.2016.
 */
public class Watchtower {
    private List<Gate> gates;
    public Watchtower(){
        gates = new ArrayList<>();
    }
    public void attachGate(Gate gate){
        gates.add(gate);
    }

    public void alarm(){
        System.out.println("Enemies nearby! Close Gates!");
        this.gates.forEach(Gate::close);
    }

}
