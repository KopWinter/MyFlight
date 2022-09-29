package pucrs.myflight.consoleApp;

import pucrs.myflight.modelo.Aeronave;
import pucrs.myflight.modelo.Aeroporto;
import pucrs.myflight.modelo.CiaAerea;
import pucrs.myflight.modelo.Geo;
import pucrs.myflight.modelo.GerenciadorAeronaves;
import pucrs.myflight.modelo.GerenciadorAeroportos;
import pucrs.myflight.modelo.GerenciadorCias;
import pucrs.myflight.modelo.GerenciadorRotas;
import pucrs.myflight.modelo.GerenciadorVoos;
import pucrs.myflight.modelo.Rota;
import pucrs.myflight.modelo.Voo;

import java.time.LocalDateTime;
import java.time.Duration;

public class MyFlight{
    // criei essa classe pra testar se está funcionando. 
    // não finalizei ela, nem executei os testes ainda.


    private GerenciadorAeronaves gerenciadorAeronaves = new GerenciadorAeronaves();
    private GerenciadorAeroportos gerenciadorAeroportos = new GerenciadorAeroportos();
    private GerenciadorCias gerenciadorCias = new GerenciadorCias();
    private GerenciadorRotas gerenciadorRotas = new GerenciadorRotas();
    private GerenciadorVoos gerenciadorVoos = new GerenciadorVoos();

    public void inicializa(){

        Aeronave a1 = new Aeronave("733", "Boeing 737-300", "140");
        gerenciadorAeronaves.adicionar(a1);

        Geo geo1 = new Geo(-29.9939,	-51.1711);
        Geo geo2 = new Geo(-23.4356,    -46.4731);

        Aeroporto p1 = new Aeroporto("POA","Salgado Filho Intl Apt", geo1);
        gerenciadorAeroportos.adicionar(p1);
        Aeroporto p2 = new Aeroporto("GRU","São Paulo Guarulhos Intl Apt", geo2);
        gerenciadorAeroportos.adicionar(p1);

        CiaAerea c1 = new CiaAerea("AD","Azul Linhas Aéreas");
        gerenciadorCias.adicionar(c1);

        Rota r1 = new Rota(c1, p1, p2, a1);
        gerenciadorRotas.adicionar(r1);

        LocalDateTime datavoo = LocalDateTime.of(2022, 02, 28, 22, 32);
        Duration tvoo = Duration.ofMinutes(120);

        Voo v1 = new Voo(r1, datavoo, tvoo);
       gerenciadorVoos.adicionar(v1);

       System.out.println(gerenciadorAeronaves.listarTodas());
       System.out.println(gerenciadorAeroportos.listarTodas());
       System.out.println(gerenciadorCias.listarTodas());
       System.out.println(gerenciadorRotas.listarTodas());
       System.out.println(gerenciadorVoos.listarTodas());
       System.out.println(p1.getLocal().caldis(p2.getLocal()));
       System.out.println(Geo.distancia(p1.getLocal(), p2.getLocal()));
       System.out.println(a1.getContavel());
    }
}