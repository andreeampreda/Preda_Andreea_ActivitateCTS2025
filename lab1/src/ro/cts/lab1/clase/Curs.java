package ro.cts.lab1.clase;

import ro.cts.lab1.interfete.IPersoana;
import ro.cts.lab1.interfete.IPredabil;

import java.util.ArrayList;
import java.util.List;

public class Curs {
    private String numeCurs;
    private  int credite;
    private IPredabil profesor;
    private List<Student> studenti;

    public Curs(String numeCurs, int credite, IPredabil profesor, List<Student> studenti) {
        this.numeCurs = numeCurs;
        this.credite = credite;
        this.profesor = profesor;
        this.studenti = studenti;
    }

    public Curs() {
        this.studenti = new ArrayList<>();
        this.profesor = new Profesor();
        this.credite = 5;
        this.numeCurs = "CTS";
    }

    public String getNumeCurs() {
        return numeCurs;
    }

    public void setNumeCurs(String numeCurs) {
        this.numeCurs = numeCurs;
    }

    public int getCredite() {
        return credite;
    }

    public void setCredite(int credite) {
        this.credite = credite;
    }

    public IPredabil getProfesor() {
        return profesor;
    }

    public void setProfesor(IPredabil profesor) {
        this.profesor = profesor;
    }

    public List<Student> getStudenti() {
        return studenti;
    }

    public void setStudenti(List<Student> studenti) {
        this.studenti = studenti;
    }

    public void afisareDetalii(){
        StringBuilder sb= new StringBuilder("La curs ")
                .append(this.numeCurs)
                .append(" cu ")
                .append(this.credite)
                .append(" puncte credite ")
                .append(" predat de ")
                .append(((IPersoana)this.profesor).getNume())
                .append(" are ")
                .append(studenti.size()).append(" studenti.");

        System.out.println(sb.toString());
    }

    public void sustineExamen(String date){
        StringBuilder sb= new StringBuilder("Pe data ")
                .append(date).append(" , profesorul ")
                .append(((IPersoana)this.profesor).getNume())
                .append(" sustine examenul cu urmatorii studenti: ");
        System.out.println(sb.toString());
        studenti.forEach(s-> System.out.println(s.getNume()));
    }
}
