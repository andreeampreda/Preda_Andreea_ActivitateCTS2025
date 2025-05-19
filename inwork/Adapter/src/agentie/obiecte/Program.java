package agentie.obiecte;

import agentie.obiecte.classes.PachetCazare;
import agentie.obiecte.classes.PachetMasinaInchiriata;
import agentie.obiecte.classes.PachetTuristic;
import agentie.obiecte.rentcar.Masina;
import agentie.obiecte.rentcar.MasinaInchiriata;

public class Program {
    private  static void printrareRezervare(PachetTuristic pachetTuristic){
        System.out.println("Pentru client: ");
        pachetTuristic.descriere();
        System.out.println("Pentru operator: ");
        pachetTuristic.rezervaPachet();
    }
    public static void main(String[] args) {
        PachetTuristic pachetCazare=new PachetCazare();
        printrareRezervare(pachetCazare);



        Masina masinaM=new Masina("M",100);
        Masina masinaO=new Masina("O", 120);

        MasinaInchiriata masinaInchiriataM=new MasinaInchiriata(masinaM);
        MasinaInchiriata masinaInchiriataO=new MasinaInchiriata(masinaO);

        PachetTuristic pachetMasinaIncr=new PachetMasinaInchiriata(masinaInchiriataM);
        printrareRezervare(pachetMasinaIncr);



    }
}
