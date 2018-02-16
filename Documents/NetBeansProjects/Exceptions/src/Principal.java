
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rbeka_000
 */
public class Principal {
    public static void main(String[] args){
        int n1=4;
        int n2=2;
        Principal p = new Principal();
        try {
            System.out.println(p.sumar(n1,n2));
        } catch (SumaException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
    //en vez de hacer un objeto para que funcione la funcion, tambien se puede hacer
    //private static int
    private int sumar(int n1, int n2) throws SumaException{
        
        if(n1 >10 || n2 >10) throw new SumaException("no pots superar el valor de 10");
        return n1+n2;
    }
 }

