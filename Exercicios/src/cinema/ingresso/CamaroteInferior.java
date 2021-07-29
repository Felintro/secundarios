package cinema.ingresso;

public class CamaroteInferior extends Vip {
	
	private double taxa = 20;
	private String local = "Camarote Inferior";
	private String tipo = super.getTipo() + " (Camarote Inferior)";
	
	
	public String getLocal() {
		return local;
	}
	
	@Override
	public double getValor() {
		return valor+valorAdicional+taxa;
	}
	
	@Override
	public String getTipo() {
		return tipo;
	}
	
	public CamaroteInferior() {
		
	}
	
}