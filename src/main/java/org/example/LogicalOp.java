package org.example;

import java.util.Scanner;

public class LogicalOp {
    public void counterPlus(int a) {
        System.out.println("Counting to 100");
        if (a < 100)
            for (//a=a+1; pentru afisarea de la urmatorul numarul de la cel dat de utilizator
                 ;a<= 100; a++)
                System.out.println(a);
        else
            System.out.println("Numarul e prea mare");
    }
    public int givennumber() {
        System.out.println("Please enter number : ");
        Scanner scanner = new Scanner(System.in);

        return scanner.nextInt();
    }
    public void counterMinus(int a) {
        System.out.println("Counting to -100");
        if (a > -100)
            for (//a=a+1; pentru afisarea de la urmatorul numarul de la cel dat de utilizator
                    ; a >= -100; a--)
                System.out.println(a);
        else
            System.out.println("Numarul e prea mic");
    }
    public void counterAtoB1(int a,int b) {
        System.out.println("Counting from "+a+" to "+b);
        if (a < b)
            for (//a=a+1; pentru afisarea de la urmatorul numarul de la cel dat de utilizator
                    ; a <= b; a++)
                System.out.println(a);
        if(b<a)
            for (//a=a-1; pentru afisarea de la urmatorul numarul de la cel dat de utilizator
                    ;a>=b; a--)
                System.out.println(a);
    }
    public void counterAtoB2(int a,int b) {

        if (a < b) {
            System.out.println("Counting from " + a + " to " + b);
            for (//a=a+1; pentru afisarea de la urmatorul numarul de la cel dat de utilizator
                    ; a <= b; a++)
                System.out.println(a);
        }
        if(b<a) {
            System.out.println("Counting from " + b + " to " + a);
            for (//a=a-1; pentru afisarea de la urmatorul numarul de la cel dat de utilizator
                    ; b <= a; b++)
                System.out.println(b);
        }
    }
    public void par()
    {
        System.out.println("Numerele pare de la 0 la 100");
        for(int i=1;i<=100;i++)
        {
            if(i%2==0)
                System.out.println(i);
        }
    }
    public void impar()
    {
        System.out.println("Numerele impare de la 0 la 100");
        for(int i=1;i<=100;i++)
        {
            if(i%2!=0)
                System.out.println(i);
        }
    }
    public void sum(int a)
    {
        int s=0;
        int i=a;
        for(;i<=100;i++)
            s=s+i;
        System.out.println("Suma numerelor este de la "+a+" pana la 100 este: "+s);
    }
    public void medie(int a)
    {
        int s=0;
        int i=a;
        int c=0;
        for(;i<=100;i++) {
            s = s + i;
            c++;
        }
        System.out.println("Media numerelor este de la "+a+" pana la 100 este: "+(double)(s/c));
    }
    public void star()
    {
        int i,j;
        for(i=7;i>0;i--) {
            for (j = 0; j < i; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}

