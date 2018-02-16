import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Principal2 {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       
       System.out.println("Introdueix dni: ");
       String dni_entra = entrada.nextLine();
  
        try {
            System.out.println(error(dni_entra));
        } catch (DniError ex) {
            Logger.getLogger(Principal2.class.getName()).log(Level.SEVERE, null, ex);
        }
      
       
    }
    
      private static String error(String dni) throws DniError{
        
        if(dni.charAt(0)== '0') throw new DniError("No pot ser 0 la primera lletra");
        
       if(dni.length() > 9) throw new DniError("No pot ser major de 8 caracteres"); 
       
       
       return "Correcte";
}
      
}