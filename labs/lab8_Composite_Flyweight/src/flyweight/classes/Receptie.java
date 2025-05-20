package flyweight.classes;

import java.util.HashMap;
import java.util.Map;

public class Receptie {
    private Map<String, IPacient> pacienti;

    public Receptie() {
        this.pacienti = new HashMap<String,IPacient>();
    }

    public IPacient getPacient(String nume, String nrTelefon, String adresa){
        if(pacienti.containsKey(nume))
            pacienti.put(nume, new Pacient(nume,nrTelefon,adresa));
            return pacienti.get(nume);


    }

    public IPacient getPacient(String nume) throws Exception {
        if(pacienti.containsKey(nume))
            return pacienti.get(nume);
        else
            throw new Exception("Nu exista pacient");

    }
}
