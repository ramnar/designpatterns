package com.ramnar.behaviour.strategy;

import java.math.BigDecimal;

/**
 * Hello world!
 *
 */
public class Client 
{
    public static void main( String[] args )
    {
       Bill bill = new Bill();
       bill.addItem(new LineofItem("mobile", new BigDecimal(200000)));
       bill.addItem(new LineofItem("screenprotector", new BigDecimal(200)));
       
       bill.payBill(new CashPayment());
    }
}
