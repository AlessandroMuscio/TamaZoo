package muscioalessandro.tamazoo;

public class App {
  public static void main(String[] args) throws Exception {
    ProgramMenu menu = new ProgramMenu(OutputStringhe.TITOLO_PROGRAM_MENU, OutputStringhe.VOCI_PROGRAM_MENU);
    int scelta;
    boolean morte_tamazoo;

    System.out.println(OutputStringhe.MSG_BENVENUTO);

    menu.inizializzazione();

    do {
      menu.stampaTamazoo();

      scelta = menu.scegli();

      switch (scelta) {
        case 1:
          menu.accarezzaTamazoo();
          break;

        case 2:
          menu.nutriTamazoo();
          break;
      }

      morte_tamazoo = menu.verificaMorteTamazoo();
    } while (scelta != 0 && !morte_tamazoo);

    if (morte_tamazoo)
      System.out.println(OutputStringhe.MSG_MORTE_TAMAZOO);

    System.out.println(OutputStringhe.MSG_USCITA_TAMAZOO);
  }
}
