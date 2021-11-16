package br.com.generation.heranca;

public class TestaTodoMundo {

	public static void main(String[] args) {
		
		//Scanner read = new Scanner(System.in);
		Professor prof1 = new Professor();
		Aluno aluno1 = new Aluno();
		
		//nome = read.nextLine();
		prof1.setNome("Antonio");
		prof1.setIdade(30);
		prof1.setEndereco("Rua Urbano Duarte, 228");
		prof1.setDisciplina("Matemática");
		prof1.setSalario(2500);
		
		System.out.println("Nome: " + prof1.getNome());
		System.out.println("Idade: " + prof1.getIdade());
		System.out.println("Endereço: " + prof1.getEndereco());
		System.out.println("Disciplina: " + prof1.getDisciplina());
		System.out.println("Salário: " + prof1.getSalario());
		
		System.out.println();
		
		aluno1.setNome("Junin");
		aluno1.setIdade(25);
		aluno1.setEndereco("Rua Dos Estudantes, 221");
		aluno1.setCurso("JavaScript");
		aluno1.setSemestre("Segundo");
		
		System.out.println("Nome: " + aluno1.getNome());
		System.out.println("Idade: " + aluno1.getIdade());
		System.out.println("Endereço: " + aluno1.getEndereco());
		System.out.println("Curso: " + aluno1.getCurso());
		System.out.println("Semestre: " + aluno1.getSemestre());
	}
}
