package com.ramnar.behaviour.mediator;

/**
 * Hello world!
 *
 */
public class Client 
{
    public static void main( String[] args )
    {
        User ram = new User("ram");
        User rahul = new User("rahul");
        ram.sendMessage("Hi rahul");
        rahul.sendMessage("Hi rahul");
    }
}
