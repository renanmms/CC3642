class Funcionario{
    private String nome;
    private int idade;
    private String sexo;
    private int numero;

    // Construtor padrão
    Funcionario(){
        nome = "None";
        idade = -1;
        sexo = "None";
        numero = -1;
    }

    // Construtor com 4 parâmetros
    Funcionario(String nome, int idade, String sexo, int numero){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.numero = numero;
    }

    public String getNome(){
        return nome;
    }
};



public class Ex13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        Funcionario f2 = new Funcionario("Pedro", 45, "Masculino", 25);
        Funcionario f3 = new Funcionario("Joao", 32, "Masculino", 10);
        
        System.out.println(f1.getNome());
        System.out.println(f2.getNome());
        System.out.println(f3.getNome());

      // TODO code application logic here
    }

}