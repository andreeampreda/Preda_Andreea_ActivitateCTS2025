package agentie.clase;

import agentie.clase.clase.PachetCazare;
import agentie.clase.clase.PachetInchiriereMasina;
import agentie.clase.clase.PachetTuristic;
import agentie.clase.inchirieremasini.Masina;
import agentie.clase.inchirieremasini.MasinaInchiriata;

public class Program {
    private static void printeazaRezervare(PachetTuristic pachetTuristic) {
        System.out.print("Pentru client: ");
        pachetTuristic.descriere();
        System.out.print("Pentru Operator: ");
        pachetTuristic.rezervaPachet();
    }

    public static void main(String[] args) {
        PachetTuristic pachetCazare = new PachetCazare();
        printeazaRezervare(pachetCazare);

        System.out.println("");
        System.out.println("se doreste utilizarea librariei pentru masini inchiriate.");

        System.out.println();
        System.out.println("Utilizarea in modul clasic:");
        Masina masina = new Masina("Opel", 1300);
        MasinaInchiriata masinaInchiriata = new MasinaInchiriata(masina);

        System.out.println();
        System.out.println("Nu se foloseste metoda de printare.");
        System.out.print("Pentru client: ");
        System.out.println(masinaInchiriata.toString());
        System.out.print("Pentru Operator: ");
        masinaInchiriata.inchiriazaMasina();

        System.out.println();
        System.out.println("Se utilizeaza adapterul");
        Masina masina2 = new Masina("Renault", 1400);

        System.out.println();
        System.out.println("Acum pachetul este creat direct cu masina dorita");
        PachetInchiriereMasina pachetMasinaInchiriata = new PachetInchiriereMasina(masina2);
        System.out.println();
        System.out.println("Se foloseste metoda de printare");
        printeazaRezervare(pachetMasinaInchiriata);
    }
}
