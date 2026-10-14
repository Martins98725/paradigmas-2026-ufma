public class FichaCarro {
    private String placa;
    private double km;
    private String chassi;
    private int anoFabricacao;
    private String dono; //aqui no melhor caso seria um objeto
    private Boolean isRevisado;
    private String propulsao;

    public String adicionarFichaCarro(){
        System.out.println("Ficha do carro adicionada");
    }

    public String atualizaFichaCarro(){
        System.out.println("Ficha do carro atualizada");
    }
    public Boolean isRevisaoCarro(){
        System.out.println("Ficha do carro isRevisao");
        isRevisado = true;
    }

    public String excluirFichaCarro(){
        System.out.println("Ficha do carro excluida");
    }

    public String listarFichasCarros(){
        System.out.println("Ficha do carro listada");
    }

    public String listarFichasDeCarroPorDono(){
        System.out.println("Ficha do carro listada por dono");
    }
}