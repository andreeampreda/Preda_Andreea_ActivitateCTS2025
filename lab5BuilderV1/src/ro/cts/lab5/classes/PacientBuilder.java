package ro.cts.lab5.classes;

public class PacientBuilder implements AbastractBuilder{
    private Pacient pacient;

    public PacientBuilder(String nume) {
        this.pacient=new Pacient(nume,false,false,false,false,"altPacient");
    }

    public PacientBuilder setArePatRabatabil(boolean arePatRabatabil){
        this.pacient.setArePatRabatabil(arePatRabatabil);
        return this;
    }

    public PacientBuilder setAreMicDeJun(boolean areMicDeJun){
        this.pacient.setAreMicDeJun(areMicDeJun);
        return this;
    }

    public PacientBuilder setArePapuciDeCamera(boolean arePapuciDeCamera){
        this.pacient.setArePapuciDeCamera(arePapuciDeCamera);
        return this;
    }

    public PacientBuilder setAreHalat(boolean areHalat){
        this.pacient.setAreHalat(areHalat);
        return this;
    }

    public PacientBuilder setNumeInsotitor(String numeInsotitor){
        this.pacient.setNumeInsotitor(numeInsotitor);
        return this;
    }

    @Override
    public Pacient getPacient() {
        return pacient;
    }
}
