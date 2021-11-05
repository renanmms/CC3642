import java.util.Scanner;

class Swapper {
  private float x, y;
  
  public float getX(){
    return x;
  }

  public float getY(){
    return y;
  }

  public void setX(float x){
    this.x = x;
  }

  public void setY(float y){
    this.y = y;
  }

  public void swap(float x, float y){
    float temp = x;
    this.x = y;
    this.y = temp;
  }
}

public class SwapperDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Swapper troca = new Swapper();
      Scanner input = new Scanner(System.in);


      troca.setX(input.nextFloat()); // Setando valor de x
      troca.setY(input.nextFloat()); // Setando valor de y

      System.out.println("x = " + troca.getX());
      System.out.println("y = " + troca.getY());
      
      // Trocando valores de x e y
      troca.swap(troca.getX(), troca.getY());

      System.out.println("x = " + troca.getX());
      System.out.println("y = " + troca.getY());
      

      // TODO code application logic here
    }

}