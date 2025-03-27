package ro.cts.lab4.Rezervare;

public abstract class Rezervare {
    private String numeClient;
    private int nrPersoane;
    private String ora;
    private String data;

    public Rezervare(){
        this.numeClient="AAA";
        this.nrPersoane=20;
        this.data="20";
        this.ora="18";
    }

    public Rezervare(String numeClient, int nrPersoane, String ora, String data) {
        if(numeClient.length()>3){
            this.numeClient=numeClient;
        }
        else {
            this.numeClient="Necunoscut";
        }

        if(nrPersoane>2){
            this.nrPersoane=nrPersoane;
        }
        else {
            this.nrPersoane=20;
        }

        if(data.length()==0){
            this.data=data;
        }
        else {
            this.data="2020";
        }
        this.ora = ora;
    }

    public abstract void descriere();

    public abstract  Rezervare copiaza();
}
