package Chain_of_responsibility.main;

import Chain_of_responsibility.clase.*;
import Chain_of_responsibility.clase.*;

public class Main {
    public static void main(String[] args) {

        Transport trolibuz=new Trolibuz();
        Transport autobuz=new Autobuz();
        Transport tramvai=new Tramvai();
        Transport metrou=new Metrou();

        trolibuz.setUrmator(autobuz);
        autobuz.setUrmator(tramvai);
        tramvai.setUrmator(metrou);

        trolibuz.recomanda(12);
        trolibuz.recomanda(8);
        trolibuz.recomanda(5);
    }
}