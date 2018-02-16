/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rbeka_000
 */
public class SumaException extends Exception{

    public SumaException(String missatge) {
        super(missatge);
    }

    @Override
    public String getMessage() {
        return "s'ha produit un error:"+super.getMessage(); //recupera el mensaje
    }
     
}
