package ro.cts.lab4.factory;

import ro.cts.lab4.clase.Supa;
import ro.cts.lab4.clase.SupaCiuperci;
import ro.cts.lab4.clase.SupaLegume;
import ro.cts.lab4.clase.SupaVita;

public class Factory {

    private int gramaj;
    private double pretPerSutaGrame;

    public Factory(int gramaj, double pretPerSutaGrame) {
        this.gramaj = gramaj;
        this.pretPerSutaGrame = pretPerSutaGrame;
    }

    public Supa getSupa(TipuriSupe tipuriSupe, double extra, String ingrediente){
        switch (tipuriSupe){
            case LEGUME:
                SupaLegume supaLegume=new SupaLegume(gramaj,pretPerSutaGrame,ingrediente,extra);
                return supaLegume;
            case VITE:
                SupaVita supaVita=new SupaVita(gramaj, pretPerSutaGrame,ingrediente,extra);
                return supaVita;

            case CIUPERCI:
                SupaCiuperci supaCiuperci=new SupaCiuperci(gramaj,pretPerSutaGrame,ingrediente,extra);
                return supaCiuperci;

                default: return null;

        }

    }
}
