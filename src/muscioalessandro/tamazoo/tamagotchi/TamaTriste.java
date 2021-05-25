package muscioalessandro.tamazoo.tamagotchi;

public class TamaTriste extends TamaBase {
  /**
   * Crea un oggetto della classe <strong>TamaTriste</strong> specificando il
   * <em>nome</em>, il grado di <em>soddisfazione</em> e il grado di
   * <em>sazietà</em>
   * 
   * @param nome          Indica il nome del <em>tamabase</em>
   * @param soddisfazione Indica il grado di soddisfazione del <em>tamabase</em>
   * @param sazieta       Indica il grado di sazietà del <em>tamabase</em>
   */
  public TamaTriste(String nome, int soddisfazione, int sazieta) {
    super(nome, soddisfazione, sazieta);
  }

  @Override
  public boolean isInfelice() {
    return true;
  }

  @Override
  public boolean isMorto() {
    if (getSazieta() == VALORE_MINIMO_GRADI || getSazieta() == VALORE_MASSIMO_GRADI)
      return true;

    return false;
  }
}
