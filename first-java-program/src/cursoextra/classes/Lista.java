package cursoextra.classes;

public class Lista<T> {
	
	private T[] elementos;
	private int tamanho;
	
	public Lista (int capacidade) {
		this.elementos = (T[]) new Object[capacidade];
		this.tamanho = 0;
	}

	public boolean adiciona (T elemento) {
		
		this.aumentaCapacidade();
		
		if(this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}
		
		return false;
		
	}
	
	private void aumentaCapacidade() {
		
		if(this.tamanho == this.elementos.length) {
			
			T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
			
			for(int i=0; i<this.elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];
			}
			
			this.elementos = elementosNovos;
			
		}
	}
	
}