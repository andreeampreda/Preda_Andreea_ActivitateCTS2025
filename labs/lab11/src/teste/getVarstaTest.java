package teste;

import clase.Persoana;
import exceptii.CNPInexistent;
import exceptii.ExceptiiCNPinvalid;
import org.junit.Test;

import static org.junit.Assert.*;

public class getVarstaTest {

    Persoana persoana;

    @org.junit.Before
    public void setUp() throws Exception {
        persoana=new Persoana();
    }

    @org.junit.Test
    public void getVarstaRight() {
        persoana=new Persoana("Alina","60308082923");
      assertEquals(21,persoana.getVarsta());
    }

    @org.junit.Test
    public void getVarstaRight2() {
        persoana=new Persoana("Alina","19108082923");
        assertEquals(33,persoana.getVarsta());
    }

    @Test
    public void getVarsatBoundary(){
        persoana=new Persoana("Ana", "29912319826372");
        assertEquals(25, persoana.getVarsta());
    }

    @Test
    public void getVarstaBoundaryInferior(){
        persoana=new Persoana("Mara","6000101287457");
        assertEquals(25,persoana.getVarsta());
    }

    @org.junit.Test(expected = ExceptiiCNPinvalid.class)
    public void getVarstaError() {
        persoana=new Persoana("Mara","1dfgge8445495");
        persoana.getVarsta();
    }

    @Test(expected = ExceptiiCNPinvalid.class)
    public void getVarstaErrorLuna(){
        persoana=new Persoana("Marius", "195144995900");
        persoana.getVarsta();
    }

    @Test(timeout = 100)
    public void getVarstaPerformance(){
            persoana=new Persoana("Alina", "120100129763");
            persoana.getVarsta();

    }

    @Test(expected = CNPInexistent.class)
    public void getVarstaCNPInexistent(){
        persoana=new Persoana("Mara", null);
        persoana.getVarsta();
    }

    @Test
    public void getVarstaCardinality(){
        persoana=new Persoana("Mara", "524010123546");
        assertEquals(1,persoana.getVarsta());
    }

    @Test
    public void getVarstaCardinality0(){
        persoana=new Persoana("Mara", "525010128673974");
        assertEquals(0,persoana.getVarsta());
    }
}