 class Hovedprogram1 {
  public static void main(String[] args) {
    Regneklynge abel = new Regneklynge(12);
    for (int i = 0; i < 650; i++) {
      abel.settInnNode(new Node(64, 1));
    }
    for (int i = 0; i < 16; i++) {
      abel.settInnNode(new Node(1024, 2));
    }
    System.out.println("Noder med minst 32 GB: " + abel.noderMedNokMinne(32));
    System.out.println("Noder med minst 64 GB: " + abel.noderMedNokMinne(64));
    System.out.println("Noder med minst 128 GB: " + abel.noderMedNokMinne(128));
    System.out.println();
    System.out.println("Antall prosessorer: " + abel.antProsessorer());
    System.out.println("Antall rack: " + abel.antRacks());
  }
}
