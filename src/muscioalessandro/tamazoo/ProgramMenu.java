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
      specie = Specie.values()[EstrazioniCasuali.estraiIntero(0, (Specie.values().length - 1))].ordinal();

      tamazoo.add(TamaBuilder.creaTamagotchi(specie, nome));
    }
  }
}
