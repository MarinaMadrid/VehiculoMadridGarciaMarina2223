
package vehiculo;

/**
 *
 * @author IES Aguadulce
 */
public class Main {
    
      public static void main(String[] args) {
        VehiculoMadridGarciaMarina2223 miVehiculoMadridGarciaMarina2223;
        int stockActual;
        
        miVehiculoMadridGarciaMarina2223 = new VehiculoMadridGarciaMarina2223("Seat",18000,100);
        operativaVehiculosMadridGarcia2223(miVehiculoMadridGarciaMarina2223, 50); 
        stockActual = miVehiculoMadridGarciaMarina2223.obtenerStock();
        System.out.println("El stock actual es"+ stockActual );
    }

    public static void operativaVehiculosMadridGarcia2223(VehiculoMadridGarciaMarina2223 miVehiculoMadridGarciaMarina2223, int cantidad) {
        try
        {
            System.out.println("Venta de Vehiculos");
            miVehiculoMadridGarciaMarina2223.vender(20);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
        
        try
        {
            System.out.println("Compra de Vehiculos");
            miVehiculoMadridGarciaMarina2223.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
    }

}
    
