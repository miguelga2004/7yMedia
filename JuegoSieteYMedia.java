public class JuegoSieteYMedia {
  public static void main(String[] args) {
      Baraja baraja = new Baraja();

      System.out.println("Baraja Completa con Valores:");
      for (Carta carta : baraja.getCartas()) {
          System.out.println(carta);
      }
  }
}
