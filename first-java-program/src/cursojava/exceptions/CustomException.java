package cursojava.exceptions;

public class CustomException extends Exception {

	public CustomException(String erro) {
		super("Erro no processamento do arquivo!" + erro);
	}
	
	
	
}
