package muscioalessandro.tamazoo.tamagotchi;

public class TamaTriste extends TamaBase {
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
