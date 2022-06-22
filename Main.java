import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
      Robo robo = new Robo(6,6);
      
     while(true){
       
       Scanner teclado = new Scanner(System.in);  
        char direcao;
  
        System.out.println("Informe a direcao: ");
        direcao = teclado.next().charAt(0);
        
        robo.girarPara(direcao);
        robo.andar();

        System.out.println("Posicao atual é: "+ robo.mostrarPosicao());

     }
        
    }
    
}