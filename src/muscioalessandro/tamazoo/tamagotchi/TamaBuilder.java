package muscioalessandro.tamazoo.tamagotchi;

import it.unibs.fp.mylib.EstrazioniCasuali;

/**
 * <p>
 * La classe <strong>TamaBuilder</strong> mi permette di creare oggetti di ogni
 * specie di tamagotchi conosciuta
 * </p>
 * 
 * @author Alessandro Muscio
 * @version 1.0
 */
public class TamaBuilder {
  /**
   * Crea un tamagotchi della <strong>specie</strong> specificata
   * 
   * @param specie Indica la specie del <em>tamagotchi</em>
   * @param nome   Indica il nome del <em>tamagotchi</em>
   * @return Un <code>Tamagotchi</code> della specie specificata
   */
  public static TamaBase creaTamagotchi(int specie, String nome) {
    int soddisfazione, sazieta;

    switch (specie) {
      case 0:
        soddisfazione = EstrazioniCasuali.estraiIntero(Tamagotchi.SOGLIA_INFELICITA_SODDISFAZIONE,
            Tamagotchi.VALORE_MASSIMO_GRADI);
        sazieta = EstrazioniCasuali.estraiIntero(Tamagotchi.SOGLIA_INFELICITA_SAZIETA_MINORE,
            Tamagotchi.VALORE_MASSIMO_GRADI);
        return new TamaBase(nome, soddisfazione, sazieta);

      case 1:
        soddisfazione = EstrazioniCasuali.estraiIntero(Tamagotchi.SOGLIA_INFELICITA_SODDISFAZIONE,
            Tamagotchi.VALORE_MASSIMO_GRADI);
        sazieta = EstrazioniCasuali.estraiIntero(Tamagotchi.SOGLIA_INFELICITA_SAZIETA_MINORE,
            Tamagotchi.VALORE_MASSIMO_GRADI);
        return new TamaTriste(nome, soddisfazione, sazieta);

      case 2:
        soddisfazione = Tamagotchi.VALORE_MASSIMO_GRADI;
        sazieta = EstrazioniCasuali.estraiIntero(TamaBase.SOGLIA_INFELICITA_SAZIETA_MINORE,
            TamaBase.VALORE_MASSIMO_GRADI);
        return new TamaGordo(nome, soddisfazione, sazieta);

      default:
        return null;
    }
  }
}
