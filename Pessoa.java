public class Pessoa {
	int prioridade;
	String nome;
	String tipo;
	
	public Pessoa(int pri,String nome, String tipo) {
		prioridade = pri;
		this.nome = nome;
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "[" + tipo+": "+nome+"]";
	}
	
	
}