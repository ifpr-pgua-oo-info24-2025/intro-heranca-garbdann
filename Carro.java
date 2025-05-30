public class Carro extends Veiculo {
    private int numeroDePortas;

    // Foi utilizado construtor vazio para atender ao requisitado no arquivo readme, descrito por "Utilize os métodos 'setters' para definir os valores dos atributos".
    public Carro() {
        super("", "", 0);
        this.numeroDePortas = 0;
    }

    public int getNumeroDePortas() {
        return numeroDePortas;
    }

    public void setNumeroDePortas(int numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }

    @Override
    protected String exibirDetalhes() {
        return super.exibirDetalhes() +
               "Número de portas: " + this.getNumeroDePortas() + "\n";
    }
}
