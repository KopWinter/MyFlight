package pucrs.myflight.modelo;

import java.util.ArrayList;

public class GerenciadorAeronaves {
    // classe de gerenciamento de aeronaves completa. Função de manipular os dados da classe Aeronave.

	private ArrayList<Aeronave> aeronaves;
	
	public GerenciadorAeronaves() {
		aeronaves = new ArrayList<>();
	}

	public void adicionar(Aeronave aviao){
		aeronaves.add(aviao);
	}
	
	public ArrayList<Aeronave> listarTodas(){
		return aeronaves;
	}

	public Aeronave buscarCodigo(String cod){
		for(int i = 0; i < aeronaves.size(); i++){
			if (aeronaves.get(i).getCodigo().equals(cod))
				return aeronaves.get(i);
		}
		return null;
	}
}