package teste;

import clase.Persoana;
import exceptii.ExceptiiCNPinvalid;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class getSexTest {


    @Test
    public void getSexRight() {
      Persoana persoana=new Persoana("Mara","5030310483674");
      assertEquals("M",persoana.getSex());
    }

    @Test
    public void getSexRight2() {
        Persoana persoana=new Persoana("Mara","6030310483674");
        assertEquals("F",persoana.getSex());
    }

    @Test
    public void getSexBoundary(){
        Persoana persoana=new Persoana("Mara", "1980310483674");
        assertEquals("M", persoana.getSex());
    }

    @Test
    public void getSexBoundarySuperior(){
        Persoana persoana=new Persoana("Mara", "8980310483674");
        assertEquals("F", persoana.getSex());
    }

    private String getSexPARITATE(String cnp){
        if(cnp.charAt(0)%2==0){
            return "F";
        }
        else
            return "M";
    }

    @Test
    public void getSexCrossCheck(){
        String cnp="5101010387583";
        Persoana persoana=new Persoana("Mara",cnp);
        assertEquals(getSexPARITATE(cnp),persoana.getSex());
    }


    @Test(expected = ExceptiiCNPinvalid.class)
    public void getSexError(){
        Persoana persoana=new Persoana("Mara", "900101094775");
        persoana.getSex();
    }
}