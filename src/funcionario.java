
public class funcionario {
	private int numMatricula;
	private String nome;
	private int anoDeAdmicao;
	
	
	public funcionario(int matricula,String nome,int ano){
		this.setNumMatricula(matricula);
		this.setNome(nome);
		this.setAnoDeAdmicao(ano);
	}
	
	
	
	public int getNumMatricula() {
		return numMatricula;
	}
	public void setNumMatricula(int numMatricula) {
		this.numMatricula = numMatricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAnoDeAdmicao() {
		return anoDeAdmicao;
	}
	public void setAnoDeAdmicao(int anoDeAdmicao) {
		this.anoDeAdmicao = anoDeAdmicao;
	}
	
	
}

