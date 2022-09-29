package pucrs.myflight.modelo;

import java.util.ArrayList;

public class GerenciadorRotas {

	/*Criei e completei a classe como pedido no modelo conceitual.
	 *Ela tem por sua função adicionar, listar e buscar, ou seja, manipular dos dados da classe Rota.
	 */

	private ArrayList<Rota> rotas;
	
	public GerenciadorRotas() {
		rotas = new ArrayList<>();
	}

	public void adicionar(Rota rota){
		rotas.add(rota);
	}
	
	public ArrayList<Rota> listarTodas(){
		return rotas;
	}

	public ArrayList<Rota> buscarCodigo(String orig){
        ArrayList<Rota> resultado = new ArrayList<>();
		for(int i = 0; i < rotas.size(); i++){
			if (rotas.get(i).getOrigem().equals(orig))
				resultado.add(rotas.get(i));
		}
		return resultado;
	}
}
