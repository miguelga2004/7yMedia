import java.util.ArrayList;
import java.util.List;

public class Baraja {
    private List<Carta> cartas;

    public Baraja() {
        inicializarBaraja();
    }

    private void inicializarBaraja() {
        String[] palos = {"Oros", "Copas", "Espadas", "Bastos"};
        String[] numeros = {"1", "2", "3", "4", "5", "6", "7", "Sota", "Caballo", "Rey"};

        cartas = new ArrayList<>();
        for (String palo : palos) {
            for (String numero : numeros) {
                cartas.add(new Carta(palo, numero));
            }
        }
    }

    public List<Carta> getCartas() {
        return cartas;
    }
}
