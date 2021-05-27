package muscioalessandro.tamazoo;

import it.unibs.fp.mylib.Menu;
import it.unibs.fp.mylib.EstrazioniCasuali;
import it.unibs.fp.mylib.InputDati;

import muscioalessandro.tamazoo.tamagotchi.*;

import java.util.ArrayList;

public class ProgramMenu extends Menu {
  private int numero_massimo_tamagotchi;
  private ArrayList<TamaBase> tamazoo;

  public ProgramMenu(String titolo, String[] voci) {
    super(titolo, voci, true);
    tamazoo = new ArrayList<TamaBase>();
  }

  public void inizializzazione() {
    String nome;
    int specie;

    numero_massimo_tamagotchi = InputDati.leggiInteroConMinimo(OutputStringhe.INSERT_NUMERO_MASSIMO_TAMAGOTCHI, 1);

    for (int i = 0; i < numero_massimo_tamagotchi; i++) {
      nome = InputDati.leggiStringaNonVuota(String.format(OutputStringhe.INSERT_NOME_TAMAGOTCHI, (i + 1)), true);
      specie = EstrazioniCasuali.estraiIntero(0, (Specie.values().length - 1));

      tamazoo.add(TamaBuilder.creaTamagotchi(specie, nome));
    }

    System.out.println(OutputStringhe.MSG_INSERIMENTO_TAMAGOTCHI_COMPLETATO);
  }

  public void stampaTamazoo() {
    TamaBase current_tamagotchi;
    int i;

    for (i = 0; i < tamazoo.size(); i++) {
      current_tamagotchi = tamazoo.get(i);

      if (current_tamagotchi.isMorto()) {
        tamazoo.remove(current_tamagotchi);
        i--;
      } else {
        System.out.println(current_tamagotchi);
      }
    }
  }

  public void accarezzaTamazoo() {
    int massimo = Math.floorDiv(Tamagotchi.VALORE_MASSIMO_GRADI, Tamagotchi.AUMENTO_PER_CAREZZA);
    int numero_carezze = EstrazioniCasuali.estraiIntero(1, massimo);

    for (TamaBase tamagotchi : tamazoo) {
      tamagotchi.riceviCarezze(numero_carezze);

      if (tamagotchi.isMorto())
        System.out.println(String.format(OutputStringhe.MSG_MORTE_TAMAGOTCHI, tamagotchi.getNome()));
    }
  }

  public void nutriTamazoo() {
    int massimo = Math.floorDiv(Tamagotchi.VALORE_MASSIMO_GRADI, Tamagotchi.AUMENTO_PER_BISCOTTO);
    int numero_biscotti = EstrazioniCasuali.estraiIntero(1, massimo);

    for (TamaBase tamagotchi : tamazoo) {
      tamagotchi.riceviBiscotti(numero_biscotti);

      if (tamagotchi.isMorto())
        System.out.println(String.format(OutputStringhe.MSG_MORTE_TAMAGOTCHI, tamagotchi.getNome()));
    }
  }

  public boolean verificaMorteTamazoo() {
    for (TamaBase tamagotchi : tamazoo) {
      if (!tamagotchi.isMorto())
        return false;
    }

    return true;
  }
}
