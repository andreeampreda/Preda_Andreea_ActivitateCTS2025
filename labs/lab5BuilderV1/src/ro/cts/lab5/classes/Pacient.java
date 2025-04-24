package ro.cts.lab5.classes;

public class Pacient {
    private String nume;
    private boolean arePatRabatabil;
    private boolean areMicDeJun;
    private boolean arePapuciDeCamera;
    private boolean areHalat;
    private String numeInsotitor;

    protected Pacient(String nume, boolean arePatRabatabil, boolean areMicDeJun, boolean arePapuciDeCamera, boolean areHalat, String numeInsotitor) {
        this.nume = nume;
        this.arePatRabatabil = arePatRabatabil;
        this.areMicDeJun = areMicDeJun;
        this.arePapuciDeCamera = arePapuciDeCamera;
        this.areHalat = areHalat;
        this.numeInsotitor = numeInsotitor;
    }

    protected void setNume(String nume) {
        this.nume = nume;
    }

    protected void setArePatRabatabil(boolean arePatRabatabil) {
        this.arePatRabatabil = arePatRabatabil;
    }

    protected void setAreMicDeJun(boolean areMicDeJun) {
        this.areMicDeJun = areMicDeJun;
    }

    protected void setArePapuciDeCamera(boolean arePapuciDeCamera) {
        this.arePapuciDeCamera = arePapuciDeCamera;
    }

    protected void setAreHalat(boolean areHalat) {
        this.areHalat = areHalat;
    }

    protected void setNumeInsotitor(String numeInsotitor) {
        this.numeInsotitor = numeInsotitor;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pacient{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", arePatRabatabil=").append(arePatRabatabil);
        sb.append(", areMicDeJun=").append(areMicDeJun);
        sb.append(", arePapuciDeCamera=").append(arePapuciDeCamera);
        sb.append(", areHalat=").append(areHalat);
        sb.append(", numeInsotitor='").append(numeInsotitor).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
