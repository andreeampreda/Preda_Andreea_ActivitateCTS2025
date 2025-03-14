package ro.cts.lab1.main;

import ro.cts.lab1.clase.*;
import ro.cts.lab1.interfete.IPredabil;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Student> studentList= new ArrayList<>();
        studentList.add(new Student("sss",20,1));
        studentList.add(new Student("sss2",21,2));
        Curs curs=new Curs("CTS", 5,(IPredabil) new Profesor("aaa", 22, 1,6000,0.2f), studentList);
        ((IPredabil)curs.getProfesor()).preda();
        System.out.println(String.valueOf(((Persoana) curs.getProfesor()).calculareVenit()));

        curs.sustineExamen("17");
        Asistent asistent = new Asistent("ff", 45, 3, 2000);
        curs.setProfesor(asistent);
        curs.sustineExamen("21");

    }




}