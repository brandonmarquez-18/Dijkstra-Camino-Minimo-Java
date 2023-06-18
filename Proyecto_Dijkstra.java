//package proyecto_dijkstra;
import javax.swing.JOptionPane;
public class Proyecto_Dijkstra {
    public static void main(String[] args) {
        ClsDijkstra GrafoDijkstra = new ClsDijkstra();
        
        //CREACIÓN DE NODOS Y SU COSTE:
        GrafoDijkstra.agregarRuta("MX", "CL", 2);
        GrafoDijkstra.agregarRuta("MX", "US", 3);
        GrafoDijkstra.agregarRuta("CA", "US", 5);
        GrafoDijkstra.agregarRuta("CA", "SV", 3);
        GrafoDijkstra.agregarRuta("US", "SV", 2);
        GrafoDijkstra.agregarRuta("SV", "VE", 4);
        GrafoDijkstra.agregarRuta("VE", "CL", 5);
        GrafoDijkstra.agregarRuta("VE", "EC", 3);
        GrafoDijkstra.agregarRuta("CL", "EC", 8);
        GrafoDijkstra.agregarRuta("VE", "BR", 6);
        GrafoDijkstra.agregarRuta("BR", "EC", 5);
        GrafoDijkstra.agregarRuta("AM", "SV", 15);
        GrafoDijkstra.agregarRuta("BR", "AM", 8);
        GrafoDijkstra.agregarRuta("EC", "CO", 7);
        GrafoDijkstra.agregarRuta("CO", "FR", 3);
        GrafoDijkstra.agregarRuta("FR", "AM", 1);
        
        int repetir = 0;
        while(repetir <= 1){
            String PaisOrigen = JOptionPane.showInputDialog("DIGÍTA EL PAÍS DE ORIGEN: \n\n"
                +"MX (MÉXICO)\n"
                +"US (ESTADOS UNIDOS)\n"
                +"CA (CANADA)\n"
                +"SV (SALVADOR)\n"
                +"VE (VENEZUELA)\n"
                +"CL (CHILE)\n"
                +"EC (ECUADOR)\n"
                +"BR (BRASIL)\n"
                +"CO (COLOMBIA)\n"
                +"FR (FRANCIA)\n"
                +"AM (ALEMANIA)\n\n");
        
        String PaisDestino = JOptionPane.showInputDialog("DIGÍTA EL PAÍS DE DESTINO: \n\n"
                +"MX (MÉXICO)\n"
                +"US (ESTADOS UNIDOS)\n"
                +"CA (CANADA)\n"
                +"SV (SALVADOR)\n"
                +"VE (VENEZUELA)\n"
                +"CL (CHILE)\n"
                +"EC (ECUADOR)\n"
                +"BR (BRASIL)\n"
                +"CO (COLOMBIA)\n"
                +"FR (FRANCIA)\n"
                +"AM (ALEMANIA)\n\n");
            
        String CaminoMasCorto = GrafoDijkstra.encontrarRutaMinimaDijkstra(PaisOrigen.intern(), PaisDestino.intern());
        JOptionPane.showMessageDialog(null, CaminoMasCorto);
        
        repetir = Integer.parseInt(JOptionPane.showInputDialog("¿QUIERES VOLVER A REALIZAR UNA BUSQUEDA? 1=SI, 2=NO"));
        
        if(repetir == 2){
            JOptionPane.showMessageDialog(null, "BYE...............");
        }
        }
    }
}