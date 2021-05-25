package muscioalessandro.tamazoo.tamagotchi;

/**
 * <p>
 * La classe <strong>TamaBase</strong> mi permette di creare oggetti che
 * rappresentano un qualsiasi TamaBase
 * </p>
 * 
 * @author Alessandro Muscio
 * @version 1.0
 */
public class TamaBase implements Tamagotchi {
  /**
   * Indica il <strong>nome</strong> del <em>tamabase</em>
   */
  private String nome;
  /**
   * Indica il grado di <strong>soddisfazione</strong> del <em>tamabase</em>
   */
  private int soddisfazione;
  /**
   * Indica il grado di <strong>sazietà</strong> del <em>tamabase</em>
   */
  private int sazieta;

  /**
   * Crea un oggetto della classe <strong>TamaBase</strong> specificando il
   * <em>nome</em>, il grado di <em>soddisfazione</em> e il grado di
   * <em>sazietà</em>
   * 
   * @param nome          Indica il nome del <em>tamabase</em>
   * @param soddisfazione Indica il grado di soddisfazione del <em>tamabase</em>
   * @param sazieta       Indica il grado di sazietà del <em>tamabase</em>
   */
  public TamaBase(String nome, int soddisfazione, int sazieta) {
    this.nome = nome;
    this.soddisfazione = soddisfazione;
    this.sazieta = sazieta;
  }

  /**
   * Restituisce il <strong>nome</strong> del <em>tamabase</em>
   * 
   * @return Una <code>String</code> rappresentante il <strong>nome</strong>
   */
  public String getNome() {
    return nome;
  }

  /**
   * Restituisce il grado di <strong>soddisfazione</strong> del <em>tamabase</em>
   * 
   * @return Un <code>int</code> rappresentante il grado di
   *         <strong>soddisfazione</strong>
   */
  public int getSoddisfazione() {
    return soddisfazione;
  }

  /**
   * Restituisce il grado di <strong>sazietà</strong> del <em>tamabase</em>
   * 
   * @return Un <code>int</code> rappresentante il grado di
   *         <strong>sazietà</strong>
   */
  public int getSazieta() {
    return sazieta;
  }

  /**
   * Imposta il <strong>nome</strong> del <em>tamabase</em>
   * 
   * @param nome Valore da assegnare al <strong>nome</strong>
   */
  public void setNome(String nome) {
    this.nome = nome;
  }

  /**
   * Imposta il grado di <strong>soddisfazione</strong> del <em>tamabase</em>
   * 
   * @param soddisfazione Valore da assegnare al grado di
   *                      <strong>soddisfazione</strong>
   */
  public void setSoddisfazione(int soddisfazione) {
    this.soddisfazione = soddisfazione;
  }

  /**
   * Imposta il grado di <strong>sazietà</strong> del <em>tamabase</em>
   * 
   * @param sazieta Valore da assegnare al grado di <strong>sazietà</strong>
   */
  public void setSazieta(int sazieta) {
    this.sazieta = sazieta;
  }

  @Override
  public void riceviCarezze(int numero_carezze) {
    soddisfazione += numero_carezze;
    sazieta -= (int) (numero_carezze * DIMINUZIONE_SAZIETA);

    if (soddisfazione > VALORE_MASSIMO_GRADI)
      soddisfazione = VALORE_MASSIMO_GRADI;

    if (sazieta < VALORE_MINIMO_GRADI)
      sazieta = VALORE_MINIMO_GRADI;

  }

  @Override
  public void riceviBiscotti(int numero_biscotti) {
    sazieta += (numero_biscotti * AUMENTO_PER_BISCOTTO);
    soddisfazione -= (int) (numero_biscotti * DIMINUZIONE_SODDISFAZIONE);

    if (sazieta > VALORE_MASSIMO_GRADI)
      sazieta = VALORE_MASSIMO_GRADI;

    if (soddisfazione < VALORE_MINIMO_GRADI)
      sazieta = VALORE_MINIMO_GRADI;
  }

  @Override
  public boolean isInfelice() {
    if (soddisfazione < SOGLIA_INFELICITA_SODDISFAZIONE || sazieta < SOGLIA_INFELICITA_SAZIETA_MINORE
        || sazieta > SOGLIA_INFELICITA_SAZIETA_MAGGIORE)
      return true;

    return false;
  }

  @Override
  public boolean isMorto() {
    if (sazieta == VALORE_MINIMO_GRADI || sazieta == VALORE_MASSIMO_GRADI || soddisfazione == VALORE_MINIMO_GRADI)
      return true;

    return false;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof TamaBase) {
      TamaBase tamaBase_obj = (TamaBase) obj;

      if (nome.equals(tamaBase_obj.getNome()) && soddisfazione == tamaBase_obj.getSoddisfazione()
          && sazieta == tamaBase_obj.getSazieta())
        return true;
    }

    return false;
  }

  @Override
  public String toString() {
    return String.format("%s: [Nome: %s, Soddisfazione: %d, Sazieta: %d]", this.getClass().getSimpleName(), nome,
        soddisfazione, sazieta);
  }
}
