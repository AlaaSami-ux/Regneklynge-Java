import java.util.ArrayList;
class Regneklynge {
  private int noderPerRack;
  private ArrayList<Rack> racks = new ArrayList<Rack>();

  public Regneklynge(int antNoderPerRack){
    this.noderPerRack = antNoderPerRack;
  //  private rack[] rack = new rack[12];
  }

  public void settInnNode(Node node){
  /*  if (racks.size() == 0) {
      racks.add(new Rack());
      racks.get(0).settInn(node);
    }
    else if (racks.get(racks.size() - 1).getAntNoder() == noderPerRack) {
      racks.add(new Rack());
      racks.get(racks.size() - 1).settInn(node);
    }
    else {
      racks.get(racks.size() - 1).settInn(node);
    }*/


    for (int i = 0; i < racks.size() ; i++){
      if(racks.get(i).getAntNoder() < noderPerRack){
        racks.get(i).settInn(node);
        return;
      }
    }
    Rack rack = new Rack();
    rack.settInn(node);
    racks.add(rack);
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
