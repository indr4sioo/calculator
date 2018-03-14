
package kalkulator;

import java.util.Scanner;

public class kalkulator {
 

 
    private static Scanner wej;

	public static void main(String[] args) 
    { while (true){ int pierwsza;  
    int druga;
    char znak;      
    wej = new Scanner(System.in);
    System.out.println("Podaj pierwsz¹ liczbê:"); 
    pierwsza = wej.nextInt();
    System.out.println("Podaj drug¹ liczbê:");
    druga = wej.nextInt();

    System.out.println("Dodawanie dwóch liczb - wciœnij +");
    System.out.println("Odejmowanie dwóch liczb - wciœnij -");
    System.out.println("Mno¿enie dwóch liczb - wciœnij *");
    System.out.println("Dzielenie dwóch liczb - wciœnij /");
    System.out.println("Operacaja modulo - wciœnij %");

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