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

  public void daiCarezze(int numero_massimo_tamagotchi) {
    TamaBase current_tamagotchi;
    int numero_carezze;

    current_tamagotchi = tamazoo.get(numero_massimo_tamagotchi);
    numero_carezze = InputDati.leggiInteroCompreso("", 0, )
  }
}
