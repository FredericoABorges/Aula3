package entities.enums;

public enum Status {
	
	PENDENTE ("Matr�cula pendente"),
	CURSANDO ("Aluno est� cursando"),
	TRANCADO ("Matr�cula est� trancada"),
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
