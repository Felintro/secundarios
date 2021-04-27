package programa;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

import Classes.Usuario;

public class Banco {

	public static void main(String[] args) {
		
		boolean login = false;
		
		int iniciarCadastro = JOptionPane.showConfirmDialog(null, "Deseja se cadastrar ?");
		
		Usuario usuarioLogin = new Usuario();
		
		List<Usuario> usuarios = new ArrayList<Usuario>();	/* Instancia��o da lista de usu�rios */
		
		while (iniciarCadastro == 0) {
			
			String nome = JOptionPane.showInputDialog("Insira seu nome:");
			String senha = JOptionPane.showInputDialog("Insira sua senha:");
			String email = JOptionPane.showInputDialog("Insira seu e-mail:");
			double saldo = Double.parseDouble(JOptionPane.showInputDialog("Fa�a seu dep�sito:"));
			
			Usuario novoUsuario = new Usuario();				/* Instancia��o do objeto novoUsuario do tipo Usuario */
			
			/* Setando os atributos do objeto novoUsuario com as vari�veis recebidas anteriormente */
			
			novoUsuario.setNome(nome);
			novoUsuario.setSenha(senha);
			novoUsuario.setEmail(email);
			novoUsuario.setSaldo(saldo);
			
			/* Fim SETTER */
			
			usuarios.add(novoUsuario);							/* Objeto novoUsuario � adicionado a lista de usu�rios */
			
			iniciarCadastro = JOptionPane.showConfirmDialog(null, "Deseja cadastrar outro usu�rio ?");
			
		}
		
		int iniciarLogin = JOptionPane.showConfirmDialog(null, "Deseja logar ?");
		
		while (iniciarLogin == 0) {
			
			String emailLogin = JOptionPane.showInputDialog("Insira seu email:");
			String senhaLogin = JOptionPane.showInputDialog("Insira sua senha:");
			
			for (Usuario usuarioVar : usuarios) {
				
				if(usuarioVar.getEmail().equals(emailLogin) && usuarioVar.getSenha().equals(senhaLogin)) {
					
					login = true;
					usuarioLogin = usuarioVar;
					break;
					
				}	else JOptionPane.showMessageDialog(null, "E-mail e/ou senha incorreto(s)!\nTente novamente!");
				
			}
			
			if(login == true) {
				
				int iniciarDeposito = JOptionPane.showConfirmDialog(null, "Bem-vindo sr(a) " + usuarioLogin.getNome() + "\nSeu Saldo: " + usuarioLogin.getSaldo() + "\nDeseja depositar ?");
				
				while(iniciarDeposito == 0) {
					double novoSaldo = usuarioLogin.getSaldo() + Double.parseDouble(JOptionPane.showInputDialog("Sr(a) " + usuarioLogin.getNome() + ",\nSeu novo saldo � de R$: " + usuarioLogin.getSaldo() + "\nInsira o valor do dep�sito:"));
					usuarioLogin.setSaldo(novoSaldo);
					
					iniciarDeposito = JOptionPane.showConfirmDialog(null, "Sr(a) " + usuarioLogin.getNome() + ",\nSeu novo saldo � de R$" + usuarioLogin.getSaldo() + "\nDeseja fazer um novo dep�sito?");
				}
				
				int iniciarSaque = JOptionPane.showConfirmDialog(null, "Sr(a) " + usuarioLogin.getNome() + ",\nSeu Saldo � de: R$" + usuarioLogin.getSaldo() + "\nDeseja sacar?");
				
				while(iniciarSaque == 0) {
					double novoSaldo = usuarioLogin.getSaldo() - Double.parseDouble(JOptionPane.showInputDialog("Sr(a) " + usuarioLogin.getNome() + "\nSeu saldo �: " + usuarioLogin.getSaldo() + "\nInsira o valor do saque:"));
					usuarioLogin.setSaldo(novoSaldo);
					iniciarSaque = JOptionPane.showConfirmDialog(null, "Sr(a) " + usuarioLogin.getNome() + "\nSeu novo saldo �: " + usuarioLogin.getSaldo() + "\nDeseja fazer um novo saque?");
				}
				
				JOptionPane.showMessageDialog(null, "Fazendo logoff...");
				login = false;
				
			}
			
			iniciarLogin = JOptionPane.showConfirmDialog(null, "Deseja fazer novo login?");
				
			}
			

			
	}
		
}