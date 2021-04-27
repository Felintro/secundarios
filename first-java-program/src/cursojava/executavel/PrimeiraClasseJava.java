package cursojava.executavel;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Secretario;
import conexaobd.SingleConnection;
import cursojava.classesauxiliares.FuncaoAutenticacao;
import cursojava.classes.Disciplina;

public class PrimeiraClasseJava {

	public static void main(String[] args) {		/* Início: Método Main */
		
		try {
			
			SingleConnection.getConnection();
		
			String login = JOptionPane.showInputDialog("Insira seu login:");
			String senha = JOptionPane.showInputDialog("Insira sua senha:");
	
			if(new FuncaoAutenticacao(new Secretario(login, senha)).autenticar() || new FuncaoAutenticacao(new Diretor(login, senha)).autenticar()) {
			
				ArrayList<Aluno> alunos = new ArrayList<Aluno>();				/* Instanciação da lista de objetos alunos, tipo Aluno */
				
				int escolhaAdcAluno = JOptionPane.showConfirmDialog(null, "Deseja inserir um aluno ?");

				while(escolhaAdcAluno == 0) {
				
					Aluno aluno = Aluno.createAluno();
					
					aluno.setDisciplinas(Disciplina.createDisciplinas());
					
					int escolhaRemoverDisciplina = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina ?");
					
					aluno.setDisciplinas(Disciplina.removeDisciplina(aluno.getDisciplinas(), escolhaRemoverDisciplina));
					
					alunos.add(aluno);	/* Inserindo o aluno recebido dentro da lista de alunos */
					
					int escolhaRemoverAluno = JOptionPane.showConfirmDialog(null, "Deseja remover algum aluno ?");
					
					Aluno.removerAluno(alunos, escolhaRemoverAluno);
					
					escolhaAdcAluno = JOptionPane.showConfirmDialog(null, "Deseja inserir outro aluno ?");
		
				}
				
			}
				
		
 		else JOptionPane.showMessageDialog(null, "Senha Inválida!");
			
		}
		
		/* Início: Captura de exceções */
		
		catch (Exception e) {				/* Exceção genérica, usada para capturar exceções que não prevemos*/
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Erro inesperado: " + e.getClass().getName());
			
		}
		
		
		
		finally {							/* Sempre é executado, ocorrendo erros ou não! */
											/* Finally é usado quando precisamos executar um processo (método), tendo erro ou não! */
											/* Exemplo: Fechar uma transação do banco de dados */
			
			// JOptionPane.showMessageDialog(null, "Testando o bloco finally\nTeste OK!");
			
		}			/* Fim: Captura de Exceções */
		
	}				/* Fim: Método main */
}

/* =============== Fim da classe =============== */