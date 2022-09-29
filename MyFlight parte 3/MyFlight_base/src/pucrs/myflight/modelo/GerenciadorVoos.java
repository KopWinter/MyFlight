package pucrs.myflight.modelo;

import java.util.ArrayList;

public class GerenciadorVoos {
    // Classe de gerenciamento de voos completa. Função de manipular (adicionar, listar e buscar)
    // os dados da classe Voo.
	private ArrayList<Voo> voos;
	
	public GerenciadorVoos() {
		voos = new ArrayList<>();
	}

	public void adicionar(Voo voo){
		voos.add(voo);
	}
	
	public ArrayList<Voo> listarTodas(){
		return voos;
	}

	public ArrayList<Voo> buscarCodigo(String data){
        ArrayList<Voo> resultado = new ArrayList<>();
		for(int i = 0; i < voos.size(); i++){
			if (voos.get(i).getDatahora().equals(data))
				resultado.add(voos.get(i));
		}
		return resultado;
	}
}
