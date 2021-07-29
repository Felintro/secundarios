package cinema.ingresso;

public class Normal extends Ingresso {
	
	@Override
	public double getValor() {
		return valor;
	}
	
	@Override
	public String getTipo() {
		return "Ingresso Normal";
	}
	
	public Normal() {
		
	}

}
