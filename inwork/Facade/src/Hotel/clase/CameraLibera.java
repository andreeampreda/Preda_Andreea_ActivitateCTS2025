package Hotel.clase;

import java.util.ArrayList;
import java.util.List;

public class CameraLibera {
    private List<Integer> listaCamereLibere;

    public CameraLibera() {
        listaCamereLibere=new ArrayList<Integer>();
        for(int i=0;i<10;i++)
            listaCamereLibere.add(i+1);
    }

    public boolean verificareCameraLibera(int codCamera){
        return listaCamereLibere.contains(codCamera);
    }
}
