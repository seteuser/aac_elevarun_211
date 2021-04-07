import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);
    Elevador e = new Elevador();
    
    e.inicializar("EGRUA001");
    int op = 0;

    while (e.estaLigado()) { //-1 para o uso do elevador

      System.out.print("-> [" + e.getPosicao() + "] andar:_");
      op = teclado.nextInt();
      if (op == -1)
        e.desligar();
      else 
        e.mover(op);

    }  
    
    e.desligar();
    System.out.println("-------------");
    System.out.println("Relatorio ***");
    System.out.println(e.getCodigo() + " ->[" + e.getPosicao() + "] Deslocamento total: " + e.getTotalRun());

  }
}