package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        LogicalOp a=new LogicalOp();
        int x=a.givennumber();
        int y=a.givennumber();
        a.counterPlus(x);
        System.out.println();
        a.counterMinus(x);
        System.out.println();
        a.counterAtoB1(x,y);
        System.out.println();
        a.counterAtoB2(x,y);
        System.out.println();
        a.par();
        System.out.println();
        a.impar();
        System.out.println();
        a.sum(x);
        a.medie(x);
        a.star();

    }
}
