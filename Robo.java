public class Robo {

    char direcao = 'S';
    int maximoN,maximoS,maximoL,maximoO;
    int x,y;
    int posicaoinicialx = 0, posicaoinicialy = 0;
    
    Robo(int x, int y){
      this.maximoN = y; 
      this.maximoS = -y;
      this.maximoO = -x; 
      this.maximoL = x; 
      this.x = posicaoinicialx;
      this.y = posicaoinicialy;
    }

     Robo(int x, int y, int posicaoinicialx, int posicaoinicialy){
      this.maximoN = y; 
      this.maximoS = -y;
      this.maximoO = -x; 
      this.maximoL = x; 
      this.x = posicaoinicialx;
      this.y = posicaoinicialy;
      this.posicaoinicialx = posicaoinicialx;
      this.posicaoinicialy = posicaoinicialy; 
    }
    

    public void girarPara (char direcao) {


        switch (direcao) {

            case 'N':
                this.direcao = direcao; 
                System.out.println("Você está indo para o Norte");
                break;
            case 'S':
                this.direcao = direcao;
                System.out.println("Você está indo para o Sul");
                break;
            case 'L':
                this.direcao = direcao;
                System.out.println("Você está indo para o Leste");
                break;
            case 'O':
                this.direcao = direcao;
                System.out.println("Você está indo para o Oeste");
                break;

            default:
                System.out.println("Direção inválida");
        }

    }

    public String mostrarPosicao(){
      String posicao = Integer.toString(x)+", "+Integer.toString(y);
      return posicao;
    }

  public void andar(){
    switch(this.direcao) {
      case 'N': 
        if(this.y +1 <= maximoN){
          this.y += 1;}
        else{
          System.out.println("Limite não pode ser ultrapassado");
        }
        break;       
  
      case 'S': 
        if(this.y -1 >= maximoS){
          this.y -= 1;}
        else{
          System.out.println("Limite não pode ser ultrapassado");
        }
        break;

      case 'L': 
        if(this.x +1 <= maximoL){
          this.x += 1;}
        else{
          System.out.println("Limite não pode ser ultrapassado");
        }        
        break;
      
      case 'O':
         if(this.x -1 >= maximoO){
          this.x -= 1;}
        else{
          System.out.println("Limite não pode ser ultrapassado");
        }
        break;
    }
  } 
}