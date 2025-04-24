package spital.Program;

import spital.clase.Internare;
import spital.clase.Pacient;
import spital.clase.ProxyInternare;

public class Program {
    public static void main(String[] args) {
        Pacient pacient=new Pacient("Mona", false);
        Internare internare=new Internare("artrita", pacient);
        internare.inregistrareInternare();

        ProxyInternare proxyInternare=new ProxyInternare(internare);
        proxyInternare.inregistrareInternare();
    }
}
