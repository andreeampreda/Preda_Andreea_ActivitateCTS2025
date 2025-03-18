package ro.cts.lab2.main;

import ro.cts.lab2.clase.Aplicant;
import ro.cts.lab2.readers.AngajatiReader;
import ro.cts.lab2.readers.AplicantReader;

import java.io.FileNotFoundException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Aplicant> listaAplicanti;

        try {
            AplicantReader reader = new AngajatiReader("lab2/src/dataIN/angajati.txt");
            listaAplicanti = reader.readAplicanti();
            for(Aplicant aplicant:listaAplicanti) {
                System.out.println(aplicant.toString()+"\n");

            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}