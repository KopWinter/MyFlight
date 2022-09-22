package pucrs.myflight.modelo;

import java.util.ArrayList;

public class GerenciadorAeronaves {
    ArrayList<Aeronave> aeronaves = new ArrayList<>();

    public void adicionar(Aeronave aviao){
        aeronaves.add(aviao);
    }
}
