import java.awt.event.*;
import java.util.*;

import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 * Classe que utilitza classes internes (i concreta per a realitzar un
 * callback). Presenta la hora en un quadre de di�leg
 * 
 * @author sergi grau
 * @version 1.0, 18.01.2010
 * 
 */
public class ClasseInternaLocal {
	public static void main(String[] agrs) {
		RellotgeInternaLocal rellotge = new RellotgeInternaLocal(1000);
		rellotge.inici();		
	}
}

/**
 * Classe Rellotge. La classe interna es crea local a un m�tode i per tant una �nica vegada
 * 
 * @author sergi grau
 * @version 1.0, 18.01.2010
 * 
 */
class RellotgeInternaLocal {
	private int interval;
	private Date data; //accessible des de la classe interna
	public RellotgeInternaLocal(int interval) {
		this.interval = interval;

	}

	public void inici() {
		/**
		 * Classe Interna Local (callback) 	que implementa ActionListener
		 * 
		 * @author sergi grau
		 * @version 1.0, 18.01.2010
		 * 
		 */
		 class Esdeveniment implements ActionListener {
			public void actionPerformed(ActionEvent event) {	
				data = new Date(); //atribut de la classe externa
				System.out.println(data);
			}
		}
		
		ActionListener esdeveniment = new Esdeveniment();
		Timer t = new Timer(interval, esdeveniment);
		t.start();
		JOptionPane.showMessageDialog(null, "Voleu acabar el rellotge?");
		System.exit(0);
	}

	
}
