
package santostapia_parcial;

import java.util.ArrayList;

public class TestSantosTapia_Parcial {

    public static void main(String[] args) {
        JardinBotanico jardin = new JardinBotanico();
        Planta p1 = new Arbol(5.0, "eucalipto", "arriba", "soleado");
        Planta p2 = new Arbusto(7, "ficus", "derecha", "lluvioso");
        Planta p3 = new Flor(Florecimiento.PRIMAVERA, "rosa", "izquierda", "templado");
        Planta p4 = new Arbol(5.0, "roble", "norte", "nublado");
        Planta p5 = new Arbol(5.0, "roble", "sur", "nublado");//norte
        
        try{
            jardin.agregarPlanta(p1);
            jardin.agregarPlanta(p2);
            jardin.agregarPlanta(p3);
            jardin.agregarPlanta(p4);
            jardin.agregarPlanta(p5);
            
            jardin.mostrarPlantas();
            
            jardin.podarPlantas();
            
        } catch (PlantaRepetidaException e) {
            System.out.println(e.getMessage());
        }
    }
    
}
