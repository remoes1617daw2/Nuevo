import java.awt.event.*;
import java.util.*;

import javax.swing.JOptionPane;
import javax.swing.Timer;


public class ClasseInternaAnonima {
	public static void main(String[] agrs) {
		RellotgeInternaAnonima rellotge = new RellotgeInternaAnonima(1000);
		rellotge.inici();		
	}
} 

class RellotgeInternaAnonima {
	private int interval;
	private Date data; //accessible des de la classe interna
	public RellotgeInternaAnonima(int interval) {
		this.interval = interval;

	}

	public void inici() {

		Timer t = new Timer(interval, new ActionListener(){
			public void actionPerformed(ActionEvent event) {
				data = new Date(); //atribut de la classe externa
				System.out.println(data);
			}
		});
		t.start();
		JOptionPane.showMessageDialog(null, "Voleu acabar el rellotge?");
		System.exit(0);
	}	
}
