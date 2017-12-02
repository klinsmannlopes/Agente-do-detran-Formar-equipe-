
public class Motorista extends funcionario {
	public Motorista(int matricula, String nome, int ano,boolean associado) {
		
		super(matricula, nome, ano);
		this.setAssociado(associado);
	}

	private boolean associado;

	public boolean getAssociado() {
		return associado;
	}

	public void setAssociado(boolean associado) {
		this.associado = associado;
	}
}
