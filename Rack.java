
import java.util.ArrayList;

class Rack{

  //private Node[] rack;
  private ArrayList<Node> noder;

  //oppretter en konstrutør med en tom array med noder
  public Rack(){
    noder = new ArrayList<Node>();
  }


  // legge til noder i array-en
  public void settInn(Node node){
    noder.add(node);
    }
  public ArrayList<Node> hentNoder(){
    return noder;
  }
  //returnerer array-en

  public int getAntNoder(){
  // returnerer antall noder i array-en
    return noder.size();
  }

  public int antaProsessorer(){
    // øker antall prosessorer
    int antall = 0;
    for (int i = 0; i < noder.size(); i++){
      antall += noder.get(i).antProsessorer();
    }
    return antall;
  }
  //finne antall noder med nok minne
  public int noderMedNokMinne(int paakrevdMinne){
    int teller = 0;
    for (int i = 0; i < noder.size(); i++){
      if(noder.get(i).nokminne(paakrevdMinne)) {
        teller++;
      }
    }
    return teller;
  }
}
