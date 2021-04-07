class Elevador {

  private String codigo;
  private int status;
  private int posicao;
  private int totalRun;

  public void ligar(){
    if (!estaLigado())
      status = 1;
    else
      System.out.println("(log) falha!");

  }

  public void desligar(){
    if(posicao == 0)
      status = 0; 
    else      
      System.out.println("(log) falha!");

  }

  public void inicializar(String codigo){
      if (!estaLigado()) {
        this.codigo = codigo;
        totalRun = 0;
        ligar();
      } else {
        System.out.println("(log) falha!");
      }
  }


  public void mover(int destino){

      int move;
      
      if (estaLigado()) {

          if (destino > posicao) 
            move = destino - posicao;
          else 
            move = posicao - destino;

          totalRun = totalRun + move;

          posicao = destino;
      } else 
        System.out.println("(log) falha!");

  }



  public int getPosicao(){
    return posicao;
  }
  
  public int getTotalRun(){
    return totalRun;
  }

  public String getCodigo(){
    return codigo;
  }




  /////////////////////////////////////////////////////// proposta fora

  //mover()
  //inicializar liga zera e liga
  
  //versaro 1.1 
  
  //codigo
  //inicializa(codigo)
  //uso do this

  public boolean estaLigado(){
    if (status == 1)
     return true;
    else 
      return false;
  }





}