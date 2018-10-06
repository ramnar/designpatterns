package com.ramnar.behaviour.observer;

/**
 * Hello world!
 *
 */
public class Client 
{
    public static void main( String[] args )
    {
        Blog blog = new Blog();
        blog.addObserver(new Subscriber1());
        blog.addObserver(new Subscriber2());
        blog.updateNews("India won the world cup");
    }
}
