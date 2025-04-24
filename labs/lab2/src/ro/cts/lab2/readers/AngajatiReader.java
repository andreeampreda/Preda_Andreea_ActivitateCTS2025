package ro.cts.lab2.readers;

import ro.cts.lab2.clase.Angajat;
import ro.cts.lab2.clase.Aplicant;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AngajatiReader extends AplicantReader{
    public AngajatiReader(String fileName) {
        super(fileName);
    }

    @Override
    public List<Aplicant> readAplicanti() throws FileNotFoundException {
        Scanner input=new Scanner(new File(super.fileName));
        input.useDelimiter(",");
        List<Aplicant> aplicanti=new ArrayList<Aplicant>();

        while(input.hasNext()){
            Angajat angajat=new Angajat();
            super.readAplicantData(input,angajat);

            int salariul=input.nextInt();
            String ocupatie=input.next();

            angajat.setSalariu(salariul);
            angajat.setOcupatie(ocupatie);

            aplicanti.add(angajat);
        }

        input.close();
        return aplicanti;
    }
}
