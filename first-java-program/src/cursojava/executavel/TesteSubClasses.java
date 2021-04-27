package cursojava.executavel;

import java.util.ArrayList;
import java.util.List;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Disciplina;
import cursojava.classes.Pessoa;
import cursojava.classes.Secretario;

public class TesteSubClasses {
	
	public static void main(String[] args) {
		
		final List<Diretor> diretores = new ArrayList<Diretor>();
		
		Disciplina disciplina = new Disciplina();
		disciplina.setNome("Banco de dados");
		// disciplina.setNota(100);
		// disciplina.setProfessor("Pitoca de arroz");
		// disciplina.setResultado();
		
		Aluno aluno = new Aluno();
		aluno.setNome("Allan Bonitão");
		aluno.setDataMatricula("12/04/2020");
		aluno.setIdade(24);
		aluno.setNomeMae("Ivanete Alves Chavier");
		aluno.setNomePai("Gilberto Aparecido Felintro");
		aluno.setNumeroCpf("07371172906");
		aluno.getDisciplinas().add(disciplina);
		
		Secretario secretario = new Secretario();
		secretario.setDataNascimento("20/09/1966");
		secretario.setNome("Tiringa Pintoca de Souza");
		secretario.setIdade(54);
		secretario.setNomeMae("Charles");
		secretario.setNomePai("Maria Trovão");
		secretario.setNumeroCpf("45689516");
		secretario.setExperiencia("5 Anos");
		secretario.setNivelCargo("Mestre");
		secretario.setRegistroEducacao("146545");
		
		Diretor diretor = new Diretor();
		diretor.setNome("Arcindo Jubileu da Silva");
		diretor.setDataNascimento("20/09/1966");
		diretor.setIdade(54);
		diretor.setNomeMae("Sansa");
		diretor.setNomePai("Snow");
		diretor.setNumeroCpf("45689516");
		diretor.setRegistroEducacao("0564049798");
		diretor.setTempoDirecao(15);
		diretor.setTitulacao("Doutor");
		diretores.add(diretor);
		
		
		teste(aluno);
		teste(diretor);
		teste(secretario);
		
		
		System.out.println("Fim programa");
	}
	
	public static void teste(Pessoa pessoa) {
		
		System.out.println("Nome: " + pessoa.getNome() + "\nSalário: " + pessoa.salario());
		System.out.println("---------------------------------------------------------");
		
	}

}