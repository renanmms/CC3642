import java.util.Scanner;

class Pessoa{
    private String cpf, nome;
    private int idade;


    // Métodos set e get para os atributos
    public String getNome(){
        return nome;
    }

    public String getCpf(){
        return cpf;
    }

    public int getIdade(){
        return idade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }
}

public class TestePessoa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        Pessoa p3 = new Pessoa();

        Scanner input = new Scanner(System.in);
        System.out.println("Digite o nome: ");
        p1.setNome(input.nextLine());
        
        System.out.println("Digite seu CPF: ");
        p1.setCpf(input.nextLine());

        System.out.println("Digite sua idade: ");
        p1.setIdade(input.nextInt());
    

      // TODO code application logic here
    }

}