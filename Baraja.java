public class Baraja {
    private Carta[] cartas;

    public Baraja() {
        cartas = new Carta[40]; // Una array con espacio para 40 cartas
        inicializarBaraja();
    }

    private void inicializarBaraja() {
        String[] palos = {"Oros", "Copas", "Espadas", "Bastos"};
        String[] numeros = {"1", "2", "3", "4", "5", "6", "7", "Sota", "Caballo", "Rey"};

        int contador = 0;
        for (String palo : palos) {
            for (String numero : numeros) {
                cartas[contador++] = new Carta(palo, numero); // Añade nuevas cartas a la array
            }
        }
    }

    public Carta[] getCartas() {
        return cartas;
    }
}

class Carta {
    private String palo;
    private String numero;

    public Carta(String palo, String numero) {
        this.palo = palo;
        this.numero = numero;
    }

    // Métodos getters, setters y otros métodos que necesites
}
