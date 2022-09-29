package pucrs.myflight.modelo;

public class CiaAerea {
	// Completei o restante da classe CiaAerea
	private String codigo;
	private String nome;
	
	public CiaAerea(String codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public String getNome() {
		return nome;
	}

	@Override
	public String toString(){
		return " Codigo: " + codigo + " Nome: " + nome;
	}
}
