package Objects;



import TDAS.ArrayList;
import java.util.Comparator;
import TDAS.List;
import java.util.stream.Collectors;

public class ListaVehiculos {
    private List<Vehiculo> vehiculos;

    public ListaVehiculos() {
        this.vehiculos = new ArrayList<>();
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    public void eliminarVehiculo(Vehiculo vehiculo) {
        vehiculos.remove(vehiculo);
    }

    public List<Vehiculo> ordenarPorPrecio() {
        return vehiculos.stream().sorted(Comparator.comparingDouble(Vehiculo::getPrecio)).collect(Collectors.toList());
    }

    public List<Vehiculo> ordenarPorKilometraje() {
        return vehiculos.stream().sorted(Comparator.comparingInt(Vehiculo::getKilometraje)).collect(Collectors.toList());
    }

    public List<Vehiculo> filtrarPorCriterios(String marca, String modelo, double precioMin, double precioMax, int kmMin, int kmMax) {
        return vehiculos.stream().filter(v -> 
            (marca == null || v.getMarca().equalsIgnoreCase(marca)) &&
            (modelo == null || v.getModelo().equalsIgnoreCase(modelo)) &&
            (precioMin <= v.getPrecio() && v.getPrecio() <= precioMax) &&
            (kmMin <= v.getKilometraje() && v.getKilometraje() <= kmMax)
        ).collect(Collectors.toList());
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }
}
