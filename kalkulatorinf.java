
package kalkulator;

import java.util.Scanner;

public class kalkulator {
 

 
    private static Scanner wej;

	public static void main(String[] args) 
    { while (true){ int pierwsza;  
    int druga;
    char znak;      
    wej = new Scanner(System.in);
    System.out.println("Podaj pierwsz� liczb�:"); 
    pierwsza = wej.nextInt();
    System.out.println("Podaj drug� liczb�:");
    druga = wej.nextInt();

    System.out.println("Dodawanie dw�ch liczb - wci�nij +");
    System.out.println("Odejmowanie dw�ch liczb - wci�nij -");
    System.out.println("Mno�enie dw�ch liczb - wci�nij *");
    System.out.println("Dzielenie dw�ch liczb - wci�nij /");
    System.out.println("Operacaja modulo - wci�nij %");

    znak = wej.next().charAt(0);  
    switch(znak)    
    {
        case '+':    
        {
            System.out.println(pierwsza + druga);
            break;
        }
        case '-':  
        {
            System.out.println(pierwsza - druga);
            break;
        }
        case '*':  
        {
            System.out.println(pierwsza * druga);
            break;
        }
        case '/':   
        {           
            if(druga !=0)
            {
              System.out.println(pierwsza / druga + " reszty: " +
                      pierwsza % druga);
            }
            else
            {
                System.out.println("Nie dzielimy przez zero!!!");
            }
            break;
        }
        case '%':   
        {
            if(druga !=0)  
            {
                System.out.println("Wynik: "+pierwsza % druga);
            }
            else
            {
                System.out.println("Nie dzielimy przez zero!!");
            }
        }}
    }      
 
       
 
    }
}