package Objects;
import TDAS.CircularDoublyList;
import TDAS.DoublyNodeList;
import TDAS.DoublyLinkedList;
import java.util.Comparator;
import java.util.Collections;

public class ListaVehiculos implements Comparator{
    
    private DoublyLinkedList <Vehiculo> vehiculos = new DoublyLinkedList<>();

    public ListaVehiculos() {
        this.vehiculos = new DoublyLinkedList<Vehiculo>();
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.addLast(vehiculo);
    }

    public void eliminarVehiculo(Vehiculo vehiculo) {
        vehiculos.eliminar(vehiculo);
    }

    public DoublyLinkedList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public DoublyLinkedList<Vehiculo> ordenarPorPrecio() {
            

        return vehiculos;
    }

    public DoublyLinkedList<Vehiculo> ordenarPorKilometraje(Comparator cmp) {
        return vehiculos;
    }

    public DoublyLinkedList<Vehiculo> filtrarPorCriterios(Comparator cmp) {
        return vehiculos;
    }

    @Override
    public int compare(Object o1, Object o2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }




}