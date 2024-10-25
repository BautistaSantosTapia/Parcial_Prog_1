
package santostapia_parcial;

import java.util.ArrayList;
import java.util.List;

public class JardinBotanico {
    private List<Planta> plantas = new ArrayList<>();

    
    
    public void agregarPlanta(Planta planta){
        if(planta == null){
            throw new NullPointerException("Hay un null en lugar de una planta");
        }
        for (Planta plantaRepe : plantas) {
            if (plantaRepe.getNombre().equals(planta.getNombre()) && plantaRepe.getUbicacion().equals(planta.getUbicacion())) {
                throw new PlantaRepetidaException();
            }
        }
        plantas.add(planta);
    }
    
    public void mostrarPlantas(){
        if(plantas.isEmpty()){
            System.out.println("Lista de plantas vacia");
        }
        for(Planta planta : plantas){
            System.out.println(planta);
        }
    }
    
    public void podarPlantas() {
        for (Planta planta : plantas) {
            /*if(planta.podar() == null){
                System.out.println("No se puede podar");
            }*/
            planta.podar();
            
        }
    }
}
