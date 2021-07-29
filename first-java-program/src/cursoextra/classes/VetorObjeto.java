package cursoextra.classes;

public class VetorObjeto {
	
	private Object[] elementos;
	private int tamanho;
	
	public VetorObjeto(int capacidade) {
		this.elementos = new Object[capacidade];
		this.tamanho = 0;
	}

	public Object[] getElementos() {
		return elementos;
	}

	public void setElementos(Object[] elementos) {
		this.elementos = elementos;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	

}
