package com.ramnar.behaviour.memento;

/**
 * Hello world!
 *
 */
public class Client 
{
    public static void main( String[] args )
    {
        Originator origin = new Originator();
        CareTaker careTaker = new CareTaker();
        
        origin.setState("#state1");
        origin.setState("#state2");
        careTaker.saveState(origin.saveStateToMemento());
        origin.setState("#state3");
        origin.setState("#state4");
        careTaker.saveState(origin.saveStateToMemento());
        
        System.out.println(origin.restoreFromMemento(careTaker.getState(0)));
    }
}
