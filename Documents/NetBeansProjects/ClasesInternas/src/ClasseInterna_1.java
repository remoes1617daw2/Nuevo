package Exercici2;

public class ClasseInterna_1 {
	public static void main(String[] args) {
		String[] a = {"Despertador", "iPod", "Bàscula", "Guitarra"};
		IteradorInterna it = new IteradorInterna(a);
		while (it.hasNext())
			System.out.println(it.getNext());
	}
}

class IteradorInterna {
	private int idx;
	private String[] array;
		
	public IteradorInterna(String[] array) {
		this.idx = -1;
		this.array = array;
	}
	
	public boolean hasNext() {
		return (idx <array.length-1);
	}
		
	public String getNext() {
		idx++;
		return (array[idx]);
	}
}
