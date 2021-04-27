package conexaobd;

import java.sql.Connection;
import java.sql.DriverManager;

public class SingleConnection {
	
	/* Esta classe utiliza métodos e atributos estáticos, pois a conexão com o banco é feita uma única vez */
	
	private static String url = "jdbc:postgresql://localhost:5432/cadastro";	// URL do BD, esse é o url padrão do PostgreSQL com JDBC
	private static String password = "admin";									// Senha do BD
	private static String user = "postgres";									// Usuário do BD
	private static Connection connection = null;								// Objeto/Interface de conexão com o BD
	
	static {			/* Essa palavra Chave, força a aplicação a rodar o que está dentro das chaves antes de tudo  */
		conectar();		/* Ou seja, em toda instância da classe SingleConnection, esse método é acionado primeiro */
	}
	
	public SingleConnection() {		/* Construtor */
		conectar();
	}
	
	private static void conectar() {
		
		try {
			
			if(connection == null) {
				Class.forName("org.postgresql.Driver");							// Carregamento do Driver do BD
				connection = DriverManager.getConnection(url, user, password);	// Atribui��o do objeto de conex�o com o BD usando os atributos est�ticos descritos na classe
				connection.setAutoCommit(false);								// M�todo usado para impedir o autosave nas opera��es CRUD do BD
				System.out.println("Conex�o efetuada com sucesso!");
			}
			
		} catch (Exception e) {
			System.out.println("Erro na conex�o com o banco de dados!");
			e.printStackTrace();
		}
		
	}
	
	public static Connection getConnection() {
		return connection;
	}
	
}