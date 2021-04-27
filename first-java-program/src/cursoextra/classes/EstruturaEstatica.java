package cursoextra.classes;

public class EstruturaEstatica<T> {
	
	private T[] elementos;
	private int tamanho;
	
	public EstruturaEstatica (int capacidade) {
		this.elementos = (T[]) new Object[capacidade];
		this.tamanho = 0;
	}
	
	public EstruturaEstatica() {
		this(10);
	}

	public EstruturaEstatica(T[] elementos, int tamanho) {
		super();
		this.elementos = elementos;
		this.tamanho = tamanho;
	}
	
	

}