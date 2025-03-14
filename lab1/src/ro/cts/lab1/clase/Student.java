package ro.cts.lab1.clase;

public class Student extends Persoana {
    private int idStudent;

    public Student() {
        super("S", 18);
        this.idStudent = idStudent;
    }

    public Student(String nume, int varsta, int idStudent) {
        super(nume, varsta);
        this.idStudent = idStudent;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    @Override
    public float calculareVenit() {
        return 0;
    }


}
