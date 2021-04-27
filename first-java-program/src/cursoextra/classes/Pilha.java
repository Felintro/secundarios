package cursoextra.classes;

import java.util.Arrays;

public class Pilha<T> {
	
	private T[] elementos;
	private int tamanho;
	
	public Pilha (int capacidade) {
		this.elementos = (T[]) new Object[capacidade];
		this.tamanho = 0;
	}
	
	public int getTamanho() {
		return this.tamanho;
	}

	
	
	
	
	
	
	/* Método toString */
	
	@Override
	public String toString() {
		return "Pilha [elementos=" + Arrays.toString(elementos) + ", tamanho=" + tamanho + "]";
	}
	
	/* Métodos equals e hashCode */

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.deepHashCode(elementos);
		result = prime * result + tamanho;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pilha other = (Pilha) obj;
		if (!Arrays.deepEquals(elementos, other.elementos))
			return false;
		if (tamanho != other.tamanho)
			return false;
		return true;
	}
	
}