
public class Viatura {
	private String placa;
	private boolean associado;
	
	Viatura(String plac,boolean asso ){
		this.setPlaca(plac);
		this.setAssociado(asso);
	}

	
	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public boolean getAssociado() {
		return associado;
	}

	public void setAssociado(boolean associado) {
		this.associado = associado;
	}
}
