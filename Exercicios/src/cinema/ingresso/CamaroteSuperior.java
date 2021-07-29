package cinema.ingresso;

public class CamaroteSuperior extends Vip {
	
	
	private double taxa = 80;
	private String local = "Camarote Superior";
	private String tipo = super.getTipo() + " (Camarote Superior)";
	
	@Override
	public double getValor() {
		return valor+valorAdicional+taxa;
	}
	
	public String getLocal() {
		return local;
	}
	
	@Override
	public String getTipo() {
		return tipo;
	}

	public CamaroteSuperior() {
		
	}
	
}
