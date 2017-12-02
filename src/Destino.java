
public class Destino {
	private String destino;
	private boolean associado;
	
	Destino(String dest,boolean asso){
		this.setDestino(dest);
		this.setAssociado(asso);
	}
	
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public boolean getAssociado() {
		return associado;
	}
	public void setAssociado(boolean associado) {
		this.associado = associado;
	}
}
