package muscioalessandro.tamazoo.tamagotchi;

public class TamaGordo extends TamaBase {
  /**
   * Crea un oggetto della classe <strong>TamaGordo</strong> specificando il
   * <em>nome</em>, il grado di <em>soddisfazione</em> e il grado di
   * <em>sazietà</em>
   * 
   * @param nome          Indica il nome del <em>tamabase</em>
   * @param soddisfazione Indica il grado di soddisfazione del <em>tamabase</em>
   * @param sazieta       Indica il grado di sazietà del <em>tamabase</em>
   */
  public TamaGordo(String nome, int soddisfazione, int sazieta) {
    super(nome, soddisfazione, sazieta);
  }

  @Override
  public void riceviCarezze(int numero_carezze) {
    setSoddisfazione(VALORE_MASSIMO_GRADI);

    setSazieta(getSazieta() - ((int) ((numero_carezze * DIMINUZIONE_SAZIETA) * 2)));

    if (getSazieta() < VALORE_MINIMO_GRADI)
      setSazieta(VALORE_MINIMO_GRADI);
  }

  @Override
  public boolean isInfelice() {
    if (getSazieta() < SOGLIA_INFELICITA_SAZIETA_MINORE)
      return true;

    return false;
  }

  @Override
  public boolean isMorto() {
    if (getSazieta() == VALORE_MINIMO_GRADI)
      return true;

    return false;
  }
}
