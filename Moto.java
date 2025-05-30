public class Moto extends Veiculo {
    private String tipoDeGuidao;

    // Foi utilizado construtor vazio para atender ao requisitado no arquivo readme, descrito por "Utilize os métodos 'setters' para definir os valores dos atributos".
    public Moto() {
        super("", "", 0);
        this.tipoDeGuidao = "";
    }

    public String getTipoDeGuidao() {
        return tipoDeGuidao;
    }

    public void setTipoDeGuidao(String tipoDeGuidao) {
        this.tipoDeGuidao = tipoDeGuidao;
    }

    @Override
    protected String exibirDetalhes() {
        return super.exibirDetalhes() +
               "Tipo de guidão: " + this.getTipoDeGuidao() + "\n";
    }
}
