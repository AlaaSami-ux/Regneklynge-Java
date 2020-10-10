import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

class Regneklynge {
  private ArrayList<Rack> racks = new ArrayList<Rack>();
  int antNoderPerRack;

  public Regneklynge(String filen){
    LeseFil(filen);
  }

  public void LeseFil(String filen){

    Scanner filnavn = null;
    try{
      filnavn = new Scanner(new File(filen));
    }
    catch(Exception e){
      System.out.println("ingen element");
    }

    this.antNoderPerRack = filnavn.nextInt();
    while(filnavn.hasNextInt()){
      int antNoder = filnavn.nextInt();
      int antMinn = filnavn.nextInt();
      int antPro = filnavn.nextInt();
      for (int i = 0; i < antNoder; i++) {
        settInnNode(new Node(antMinn, antPro));
      }
    }
  }

/*    this.filnavn = filnavn;
    //int i=0;
    //filnavn= filnavn.splitt(" ");
     //String s =NextLine(); first line

    while(filnavn.hasNextLine()){
      int[] element = filnavn.NextInt().splitt(" ");
      List<int> elementListe = Arrays.asList(element);

       // listeofElementerifil[i]= filnavn.NextInt();
       // i++;
       //
       // listeofElementerifil[i][i]=filnavn.NextInt().split("");

    }

  //  private rack[] rack = new rack[2];
  }

  // public int antNoderPerRack(antall){
  //
  // }*/

  public void settInnNode(Node node){
    if (racks.size() == 0) {
      racks.add(new Rack());
      racks.get(0).settInn(node);
    }
    else if (racks.get(racks.size() - 1).getAntNoder() == antNoderPerRack) {
      racks.add(new Rack());
      racks.get(racks.size() - 1).settInn(node);
    }
    else {
      racks.get(racks.size() - 1).settInn(node);
    }
  }

  // Beregner totalt antall prosessorer i hele regneklyngen og returnere det.
  public int antProsessorer(){
    int antPros = 0;
    for (int i = 0; i < racks.size(); i++){
      antPros += racks.get(i).antaProsessorer();
      // antPros++
    }
    return antPros;
  }
    //Beregner antall noder i regneklynge
  public int noderMedNokMinne(int paakrevdMinne){
    int tell = 0;
    for (int i = 0; i < racks.size(); i++) {
      tell += racks.get(i).noderMedNokMinne(paakrevdMinne);
    }
    // for (int rack = 0; rack < racks.size(); rack++){
    //   for(int node = 0; node < racks.hentNoder(); node++){
    //     tell++;
    //   }
    // }
    return tell;
  }
  //finne antall racks i regneklynge
  public int antRacks(){
    return racks.size();
  }
}
