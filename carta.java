public class Carta {
  private String palo;
  private String numero;
  private double valor;

  public Carta(String palo, String numero) {
      this.palo = palo;
      this.numero = numero;
      if (numero.equals("Sota") || numero.equals("Caballo") || numero.equals("Rey")) {
          this.valor = 0.5;
      } else {
          this.valor = Double.parseDouble(numero);
      }
  }

  public String getPalo() {
      return palo;
  }

  public String getNumero() {
      return numero;
  }

  public double getValor() {
      return valor;
  }

  @Override
  public String toString() {
      return numero + " de " + palo + " (" + valor + " puntos)";
  }
}
