import java.util.LinkedList;
import java.util.ListIterator;

public class Fila {
	LinkedList<Pessoa> fila = new LinkedList<Pessoa>();
	
	public void insere(Pessoa elemento) {
		if(fila.size()==0) {
			fila.add(elemento);
		}else {
			int i = 0;				
			ListIterator<Pessoa> list = fila.listIterator(0);			
			while(list.hasNext() && elemento.prioridade<=list.next().prioridade) {
				i = list.nextIndex();
			}
			fila.add(i, elemento);		
		}
	}
	
	public void remove() {		
		fila.removeFirst();
	}
	
	public void mostrarFila() {
		ListIterator<Pessoa> list = fila.listIterator(0);
		int i = 0;
		while(list.hasNext()) {
			System.out.println(i+": "+list.next());
			i++;
		}
	}
	
	public static void main(String[] args) {
		
		Fila fila = new Fila();
		
		
		fila.insere(new Pessoa(3,"Marlene","Idoso"));
		fila.insere(new Pessoa(3,"lene","Idoso2"));
		fila.insere(new Pessoa(3,"Marlene","Idoso3"));
		
		
		fila.insere(new Pessoa(1,"Irene","Gestante"));
		fila.insere(new Pessoa(3,"lene","Idoso4"));
		fila.insere(new Pessoa(1,"Irene","Gestante2"));		
		fila.insere(new Pessoa(1,"Irene","Gestante3"));
		fila.insere(new Pessoa(2,"Mar","CrionçaNoColo"));
		fila.insere(new Pessoa(2,"Mar","CrionçaNoColo2"));
		
		fila.mostrarFila();
		
		
		fila.insere(new Pessoa(3,"lene","Idoso5"));
		fila.insere(new Pessoa(1,"lene","Gestante4"));
		fila.insere(new Pessoa(3,"lene","Idoso6"));
		
		fila.insere(new Pessoa(3,"lene","Idoso7"));
		fila.insere(new Pessoa(1,"lene","Gestante5"));
		fila.insere(new Pessoa(3,"lene","Idoso8"));
		
		System.out.println("\n");
		fila.mostrarFila();
		
		fila.remove();
		fila.remove();
		fila.remove();
		fila.remove();
		fila.remove();
		fila.remove();
		fila.remove();
		fila.remove();
		fila.remove();
		fila.remove();
		
		System.out.println("\n");
		fila.mostrarFila();
		
		fila.insere(new Pessoa(1,"Irene","Gestante6"));
		fila.insere(new Pessoa(1,"lene","Gestante7"));
		fila.insere(new Pessoa(3,"Marlene","Idoso9"));
		fila.insere(new Pessoa(3,"lene","Idoso10"));
		fila.insere(new Pessoa(2,"Mar","CrionçaNoColo3"));

		System.out.println("\n");
		fila.mostrarFila();
		
	}
}