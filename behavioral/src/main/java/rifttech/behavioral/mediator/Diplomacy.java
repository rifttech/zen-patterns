package rifttech.behavioral.mediator;

/**
 * Created by Arthur Abramov on 01.12.2016.
 */
public enum Diplomacy {


      Trade("Let's trade")
    , Peace("We want to make  proposal to you about peace treaty")
    , War("We'll conquer these lands")
    , Envoy("Accept our envoy");
    private String action = "";
    public String getAction(){
        return action;
    }
    Diplomacy(String action){
         this.action = action;
    }
}
