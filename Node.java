class Node{
  private int minne;
  private int antPros;

  public Node(int m, int aP){
    minne = m;
    antPros = aP;
  }

  public int antProsessorer(){
    return antPros;
  }

  public boolean nokminne(int paakrevdMinne){
    if(minne >= paakrevdMinne){
      return true;
    }
    else{
      return false;
    }
  }
}
