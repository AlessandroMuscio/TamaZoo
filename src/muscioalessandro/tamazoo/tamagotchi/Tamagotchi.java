package muscioalessandro.tamazoo.tamagotchi;

/**
 * <p>
 * L'interfaccia <strong>Tamagotchi</strong> racchiude tutti i metodi che sono
 * comuni ad ogni specie di tamagotchi
 * </p>
 * 
 * @author Alessandro Muscio
 * @version 1.0
 */
public interface Tamagotchi {
  /**
   * Indica la percentuale con cui aumentare la sazietà per ogni biscotto che
   * viene dato al tamagotchi
   */
  static final int AUMENTO_PER_BISCOTTO = 10;
  /**
   * Indica il valore che, moltiplicato al numero di carezze, va tolto alla
   * sazietà
   */
  static final double DIMINUZIONE_SAZIETA = .5;
  /**
   * Indica il valore che, moltiplicato al numero di biscotti, va tolto alla
   * soddisfazione
   */
  static final double DIMINUZIONE_SODDISFAZIONE = .25;
  /**
   * Indica la soglia di soddisfazione sotto la quale il tamagotchi è infelice
   */
  static final int SOGLIA_INFELICITA_SODDISFAZIONE = 30;
  /**
   * Indica la soglia di sazietà sotto la quale il tamagotchi è infelice
   */
  static final int SOGLIA_INFELICITA_SAZIETA_MINORE = 30;
  /**
   * Indica la soglia di sazietà sopra la quale il tamagotchi è infelice
   */
  static final int SOGLIA_INFELICITA_SAZIETA_MAGGIORE = 90;
  /**
   * Indica il <strong>valore massimo</strong> della <em>sazietà</em> o della
   * <em>soddisfazione</em>
   */
  static final int VALORE_MASSIMO_GRADI = 100;
  /**
   * Indica il <strong>valore minimo</strong> della <em>sazietà</em> o della
   * <em>soddisfazione</em>
   */
  static final int VALORE_MINIMO_GRADI = 0;

  /**
   * Aumenta la <strong>soddisfazione</strong> del <em>tamagotchi</em> in base al
   * numero di carezze e diminuisce la sazietà di conseguenza
   * 
   * @param numero_carezze Indica quante carezze sono state fatte al
   *                       <em>tamagotchi</em>
   */
  void riceviCarezze(int numero_carezze);

  /**
   * Aumenta la <strong>sazietà</strong> del <em>tamagotchi</em> in base al numero
   * di biscotti e diminuisce la soddisfazione di conseguenza
   * 
   * @param numero_biscotti Indica quanti biscotti sono stati dati al
   *                        <em>tamagotchi</em>
   */
  void riceviBiscotti(int numero_biscotti);

  /**
   * Verifica se il <em>tamagotchi</em> è <strong>morto</strong> oppure no
   * 
   * @return <code>true</code> se il tamagotchi è morto, altrimenti
   *         <code>false</code>
   */
  boolean isMorto();

  /**
   * Verifica se il <em>tamagotchi</em> è <strong>infelice</strong> oppure no
   * 
   * @return <code>true</code> se il tamagotchi è infelice
   * 
   *         , altrimenti <code>false</code>
   */
  boolean isInfelice();
}
