package com.ramnar.dp.bhvr.state;

/**
 * Hello world!
 *
 */
public class Client 
{
    public static void main( String[] args )
    {
        MobileContext context = new MobileContext();
        context.displayStatus();
        
        context.setState(new VibrationMode());
        context.displayStatus();
    }
}
