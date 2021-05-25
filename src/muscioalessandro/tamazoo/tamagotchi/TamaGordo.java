package muscioalessandro.tamazoo.tamagotchi;

public class TamaGordo extends TamaBase {
  public TamaGordo(String nome, int soddisfazione, int sazieta) {
    super(nome, soddisfazione, sazieta);
  }

  @Override
  public void riceviCarezze(int numero_carezze) {
    setSoddisfazione(VALORE_MASSIMO_GRADI);

    setSazieta(getSazieta() - ((int) ((numero_carezze * DIMINUZIONE_SAZIETA) * 2)));
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
