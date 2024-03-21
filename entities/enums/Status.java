package entities.enums;

public enum Status {
	
	PENDENTE ("Matrícula pendente"),
	CURSANDO ("Aluno está cursando"),
	TRANCADO ("Matrícula está trancada"),
	CONCLUIDO("Aluno(a) aprovado(a)"),
	REPROVADO ("Aluno(a) reprovado(a)");
	
	private String descricao;
	
	Status(String string) {
		this.descricao = string;
	}
	
	public String getDescricao () {
		return this.descricao;
		
	}
	
	
}
