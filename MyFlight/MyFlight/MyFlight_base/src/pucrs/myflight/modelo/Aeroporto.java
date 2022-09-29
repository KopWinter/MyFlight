package pucrs.myflight.modelo;

public class Aeroporto implements Comparable<String>{
	//Completei o restante da classe Aeroporto.
	private String codigo;
	private String nome;
	private Geo loc;
	
	public Aeroporto(String codigo, String nome, Geo loc) {
		this.codigo = codigo;
		this.nome = nome;
		this.loc = loc;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public Geo getLocal() {
		return loc;
	}

	@Override
		public String toString(){
			return "Codigo: " + codigo + " Nome: " + nome + " Local: " + loc;
		}

	@Override
	public int compareTo(String o) {
		// TODO Auto-generated method stub
		return nome.compareTo(o);
	}
}
