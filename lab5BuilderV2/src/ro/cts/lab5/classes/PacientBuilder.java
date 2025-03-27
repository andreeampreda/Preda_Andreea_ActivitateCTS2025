package ro.cts.lab5.classes;

public class PacientBuilder implements AbstractBuilder{

    private String nume;
    private boolean arePatRabatabil;
    private boolean areMicDeJun;
    private boolean arePapuciDeCamera;
    private boolean areHalat;
    private String numeInsotitor;

    public PacientBuilder(){
        this.nume = "";
        this.arePatRabatabil = false;
        this.areMicDeJun = false;
        this.arePapuciDeCamera = false;
        this.areHalat = false;
        this.numeInsotitor = "Altcineva";

    }

    public PacientBuilder(String nume, boolean arePatRabatabil, boolean areMicDeJun, boolean arePapuciDeCamera, boolean areHalat, String numeInsotitor) {
        this.nume = nume;
        this.arePatRabatabil = arePatRabatabil;
        this.areMicDeJun = areMicDeJun;
        this.arePapuciDeCamera = arePapuciDeCamera;
        this.areHalat = areHalat;
        this.numeInsotitor = numeInsotitor;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setArePatRabatabil(boolean arePatRabatabil) {
        this.arePatRabatabil = arePatRabatabil;
    }

    public void setAreMicDeJun(boolean areMicDeJun) {
        this.areMicDeJun = areMicDeJun;
    }

    public void setArePapuciDeCamera(boolean arePapuciDeCamera) {
        this.arePapuciDeCamera = arePapuciDeCamera;
    }

    public void setAreHalat(boolean areHalat) {
        this.areHalat = areHalat;
    }

    public void setNumeInsotitor(String numeInsotitor) {
        this.numeInsotitor = numeInsotitor;
    }

    @Override
    public Pacient getPacient() {
        return null;
    }
}


