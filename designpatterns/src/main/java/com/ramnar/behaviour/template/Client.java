package com.ramnar.behaviour.template;

/**
 * Hello world!
 *
 */
public class Client 
{
    public static void main( String[] args )
    {
        OrderTemplate order = new EOrder();
        order.order(true);
    }
}
