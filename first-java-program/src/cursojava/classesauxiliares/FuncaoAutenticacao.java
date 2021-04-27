package cursojava.classesauxiliares;

import cursojava.interfaces.PermitirAcesso;

public class FuncaoAutenticacao {
	
	private PermitirAcesso acessoGeral;
	
	public boolean autenticar() {
		
		return acessoGeral.autenticar(); 
	
	}
	
	public FuncaoAutenticacao(PermitirAcesso acesso) {
		this.acessoGeral = acesso;
	}

}