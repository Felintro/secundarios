package cursojava.classes;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;
import cursojava.constantes.StatusAluno;

public class Disciplina {

	/* ============= Atributos: ============= */

	private String nome;
	private double[] notas = new double[4];
	private String professor;
	private String resultado;
	private double media;

	/* ============= Métodos Setter & Getter: ============= */

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
	
	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	public void setMedia() {
		
		double somaTotal = 0;
		
		for (int i = 0; i < notas.length; i++) {
			somaTotal += notas[i];
		}
		
		this.media = somaTotal / 4;
		
	}
	
	public double getMedia() {
		return media;
	}
	
	public void setResultado() {
			
		if (this.getMedia() >= StatusAluno.NOTARECUPERACAO) {
			
			if (this.getMedia() >= StatusAluno.NOTAAPROVADO) {
				
				this.resultado = StatusAluno.APROVADO;
				
			} else this.resultado = StatusAluno.RECUPERACAO;
			
		} else this.resultado = StatusAluno.REPROVADO;
			
	}
	
	public String getResultado() {
		return resultado;
	}
	
	public void setProfessor(String professor) {
		this.professor = professor;
	}
	
	public String getProfessor() {
		return professor;
	}
	
	/* Métodos de teste: */
	
public static Disciplina adcDisciplina() {
		
		double[] notasDisciplina = new double[4];
		String nomeDisciplina = JOptionPane.showInputDialog("Nome da Disciplina ?");
		String nomeProfessor = JOptionPane.showInputDialog("Nome do professor ?");
		
		for(int i=0; i<=3; i++) {

			notasDisciplina[i] = Double.valueOf(JOptionPane.showInputDialog("Nota "+ i+1 + " da Disciplina ?"));
			
		}

		Disciplina disciplina = new Disciplina();	/* Instanciando uma variável (objeto) do tipo Disciplina */
		
		disciplina.setNome(nomeDisciplina);				/* Atributo disciplina/nome recebe a variável nomeDisciplina */
		disciplina.setNotas(notasDisciplina);			/* Atributo disciplina/nota recebe a variável notaDisciplina */
		disciplina.setProfessor(nomeProfessor);			/* Atributo disciplina/professor recebe a variável nomeProfessor */
		disciplina.setResultado();						/* Atributo disciplina/resultado é setado de acordo com o método setResultado() */
		
		return disciplina;
		
	}
	
	public static ArrayList<Disciplina> createDisciplinas() {
		
		ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();
		
		int escolhadAdcDisciplina = Integer.valueOf(JOptionPane.showConfirmDialog(null, "Deseja adicionar uma disciplina ?"));
		
		while(escolhadAdcDisciplina==0) {
			
			Disciplina disciplina = adcDisciplina();
			
			disciplinas.add(disciplina);					/* Lista aluno/disciplinas recebe a variável/objeto disciplina */
			escolhadAdcDisciplina = Integer.valueOf(JOptionPane.showConfirmDialog(null, "Ainda deseja adicionar uma disciplina ?"));
		}
		
		return disciplinas;
		
	}
	
	public static ArrayList<Disciplina> removeDisciplina(ArrayList<Disciplina> disciplinas, int escolhaRemoverDisciplina) {
		
		while (escolhaRemoverDisciplina == 0) { 				/* Método para remover alguma disciplina */
			
			String disciplinaRemover = JOptionPane.showInputDialog("Qual disciplina deseja remover ?");

			for (Disciplina disciplina1 : disciplinas) {
				
				/* Remover disciplina da lista de disciplinas */
				 
				if(disciplina1.getNome().equalsIgnoreCase(disciplinaRemover)) {
					disciplinas.remove(disciplina1);
					JOptionPane.showMessageDialog(null, "Disciplina removida: " + disciplina1.getNome());
					break;
				} 
			}
			
			escolhaRemoverDisciplina = JOptionPane.showConfirmDialog(null, "Ainda deseja remover alguma disciplina ?"); 
			
		}
		
		return disciplinas;
		
	}

	/* ============= Métodos equals e hashCode: ============= */

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + Arrays.hashCode(notas);
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
		Disciplina other = (Disciplina) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (!Arrays.equals(notas, other.notas))
			return false;
		return true;
	}

	/* ============= Método toString: ============= */

	@Override
	public String toString() {
		return "Disciplina [nome=" + nome + ", notas=" + Arrays.toString(notas) + "]";
	}

}
