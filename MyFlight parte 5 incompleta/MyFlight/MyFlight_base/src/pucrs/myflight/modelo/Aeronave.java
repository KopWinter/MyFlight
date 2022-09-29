package pucrs.myflight.modelo;

public class Aeronave implements Contavel{
	//Completei o restante da classe Aeronave.
	private String codigo;
	private String descricao;
	private String capacidade;
	private static int contador = 0;

	
	public Aeronave(String codigo, String descricao, String capacidade) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.capacidade = capacidade;
		novoObjeto();
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public String getDescricao() {
		return descricao;
	}

	public String getCapacidade(){
		return capacidade;
	}
@Override
	public String toString(){
		return "Codigo: " + codigo + " Descrição: " + descricao + " Capacidade: " + capacidade;
	}

@Override
public void novoObjeto() {
	// TODO Auto-generated method stub
	contador++;
	
}

@Override
public int getContavel() {
	// TODO Auto-generated method stub
	return contador;
}
}
