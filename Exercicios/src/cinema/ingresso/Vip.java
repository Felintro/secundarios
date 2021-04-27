package cinema.ingresso;

public class Vip extends Ingresso {
	
	public Vip() {
		
	}
	
	protected double valorAdicional = 30;
	
	@Override
	public double getValor() {
		return valor+valorAdicional;
	}
	
	@Override
	public String getTipo() {
		return "Ingresso VIP";
	}

}