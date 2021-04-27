package cursojava.classes;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/* Essa é a classe/objeto que representa o Aluno */

public class Aluno extends Pessoa {
	
	/* ============== Atributos: ============== */

	private String dataMatricula;
	private String serieMatriculado;
	private ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();
	private String nomeEscola;

	/* ============== Métodos getters e setters: ============== */

	public ArrayList<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getSerieMatriculado() {
		return serieMatriculado;
	}

	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}
	
	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}
	
	/* ============== Outros Métodos: ============== */
	
	@Override
	public double salario() {
		return 0;
	}
	
	public static Aluno createAluno() {

		Aluno aluno = new Aluno();	/* Instanciação do aluno */
		
		/* Atributos do aluno sendo recebidos nas variáveis */
		
		String nome = JOptionPane.showInputDialog("Nome do aluno:");
		String idade = JOptionPane.showInputDialog("Idade:");
		String dataNascimento = JOptionPane.showInputDialog("Data de nascimento:");
		String registroGeral = JOptionPane.showInputDialog("RG:");
		String nomeMae = JOptionPane.showInputDialog("Nome da mãe:");
		String nomePai = JOptionPane.showInputDialog("Nome do pai:");
		String dataMatricula = JOptionPane.showInputDialog("Data de matrícula:");
		String numeroCpf = JOptionPane.showInputDialog("CPF:"); 

		/* =========== Inserção dos dados recebidos anteriormente dentro do objeto aluno: =========== */

		aluno.setNome(nome);
		aluno.setIdade(Integer.valueOf(idade));
		aluno.setDataNascimento(dataNascimento);
		aluno.setRegistroGeral(registroGeral);
		aluno.setNomeMae(nomeMae);
		aluno.setNumeroCpf(numeroCpf);
		aluno.setNomePai(nomePai);
		aluno.setDataMatricula(dataMatricula);
		
		return aluno;
		
	}
	
	public static void removerAluno(ArrayList<Aluno> listaAlunos, int escolhaRemoverAluno) {
		
		while(escolhaRemoverAluno == 0) {
			
			String alunoRemover = JOptionPane.showInputDialog("Insira o nome do aluno a ser removido:");
			
			/* Remover aluno da lista de alunos */
			
			for (Aluno aluno2 : listaAlunos) {
				
				if(aluno2.getNome().equalsIgnoreCase(alunoRemover)) {
					listaAlunos.remove(aluno2);
					JOptionPane.showMessageDialog(null, "Aluno removido: " + aluno2.getNome());
					break;
				}
				
			}

			escolhaRemoverAluno = Integer.valueOf(JOptionPane.showConfirmDialog(null, "Ainda deseja remover algum aluno ?"));
		}
	}


	/* ============== Método toString: ============== */

	@Override
	public String toString() {
		return "Aluno {nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral="
				+ registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai
				+ ", dataMatricula=" + dataMatricula + ", serieMatriculado=" + serieMatriculado + ", disciplinas="
				+ disciplinas + "\n}";
	}
	



	/* ============== Métodos hashCode e equals: ============== */

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numeroCpf == null) ? 0 : numeroCpf.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (numeroCpf == null) {
			if (other.numeroCpf != null)
				return false;
		} else if (!numeroCpf.equals(other.numeroCpf))
			return false;
		return true;
	}

	/* ============== Construtor padrão (sem nenhum argumento/parâmetro: ============== */

	public Aluno() {
		
	}

}