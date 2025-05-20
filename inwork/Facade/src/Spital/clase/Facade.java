package Spital.clase;

public class Facade {
    public void verificarePacient(Pacient pacient, Salon salon){
        Medic medic=new Medic();


        if(medic.esteInStareGrava(pacient)){
            if(salon.isArePaturiLibere()){
                System.out.println("Pacientul poate fi internat in salonul " + salon.getNrSalon());
            }
            else {
                System.out.println("Nu exista saloane disponibile.");
            }
        }else {
            System.out.println("Pacientul nu trebuie internat");
        }
    }
}
