package pucrs.myflight.modelo;

import java.util.ArrayList;

public class GerenciadorAeroportos {
    // Classe de gerenciamento de aeroportos completa. Função de manipular os dados da classe Aeroporto.
    
	private ArrayList<Aeroporto> aeroportos;
	
	public GerenciadorAeroportos() {
		aeroportos = new ArrayList<>();
	}

	public void adicionar(Aeroporto porto){
		aeroportos.add(porto);
	}
	
	public ArrayList<Aeroporto> listarTodas(){
		return aeroportos;
	}

	public Aeroporto buscarCodigo(String cod){
		for(int i = 0; i < aeroportos.size(); i++){
			if (aeroportos.get(i).getCodigo().equals(cod))
				return aeroportos.get(i);
		}
		return null;
	}
	public ArrayList<Aeroporto> organizar(){
		//não terminei pq precisei ir pra casa
		return aeroportos;
	}
}