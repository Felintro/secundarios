package conexaobd;

import java.sql.Connection;
import java.sql.DriverManager;

public class SingleConnection {
	
	/* Esta classe utiliza m√©todos e atributos est√°ticos, pois a conex√£o com o banco √© feita uma √∫nica vez */
	
	private static String url = "jdbc:postgresql://localhost:5432/cadastro";	// URL do BD, esse √© o url padr√£o do PostgreSQL com JDBC
	private static String password = "admin";									// Senha do BD
	private static String user = "postgres";									// Usu√°rio do BD
	private static Connection connection = null;								// Objeto/Interface de conex√£o com o BD
	
	static {			/* Essa palavra Chave, for√ßa a aplica√ß√£o a rodar o que est√° dentro das chaves antes de tudo  */
		conectar();		/* Ou seja, em toda inst√¢ncia da classe SingleConnection, esse m√©todo √© acionado primeiro */
	}
	
	public SingleConnection() {		/* Construtor */
		conectar();
	}
	
	private static void conectar() {
		
		try {
			
			if(connection == null) {
				Class.forName("org.postgresql.Driver");							// Carregamento do Driver do BD
				connection = DriverManager.getConnection(url, user, password);	// AtribuiÁ„o do objeto de conex„o com o BD usando os atributos est·ticos descritos na classe
				connection.setAutoCommit(false);								// MÈtodo usado para impedir o autosave nas operaÁıes CRUD do BD
				System.out.println("Conex„o efetuada com sucesso!");
			}
			
		} catch (Exception e) {
			System.out.println("Erro na conex„o com o banco de dados!");
			e.printStackTrace();
		}
		
	}
	
	public static Connection getConnection() {
		return connection;
	}
	
}