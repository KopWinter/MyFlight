package pucrs.myflight.consoleApp;

import pucrs.myflight.modelo.Aeronave;
import pucrs.myflight.modelo.GerenciadorAeronaves;
import pucrs.myflight.modelo.GerenciadorAeroportos;
import pucrs.myflight.modelo.GerenciadorCias;
import pucrs.myflight.modelo.GerenciadorRotas;
import pucrs.myflight.modelo.GerenciadorVoos;

public class MyFlight{
    private GerenciadorAeronaves gerenciadorAeronaves = new GerenciadorAeronaves();
    private GerenciadorAeroportos gerenciadorAeroportos = new GerenciadorAeroportos();
    private GerenciadorCias gerenciadorCias = new GerenciadorCias();
    private GerenciadorRotas gerenciadorRotas = new GerenciadorRotas();
    private GerenciadorVoos gerenciadorVoos = new GerenciadorVoos();

    public void inicializa(){
        Aeronave a1 = new Aeronave("733", "Boeing 737-300", "140");
        gerenciadorAeronaves.adicionar(a1);
    }
}