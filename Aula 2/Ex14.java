class Data {
    private int dia;
    private int mes;
    private int ano;

    // Construtor padrão
    Data(){
        dia = 1;
        mes = 1;
        ano = 1;
    }

    // Construtor parametrizado
    Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public void imprimeData(){
        System.out.println(mes + "/" + dia + "/" + ano);
    }

}


public class Ex14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Data d1 = new Data();
        d1.imprimeData();
        
    }
      // TODO code application logic here
}