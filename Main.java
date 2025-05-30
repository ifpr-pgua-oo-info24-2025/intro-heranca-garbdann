public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setMarca("Toyota");
        carro.setModelo("Corolla");
        carro.setAno(2022);
        carro.setNumeroDePortas(4);

        Moto moto = new Moto();
        moto.setMarca("Honda");
        moto.setModelo("CB 500");
        moto.setAno(2021);
        moto.setTipoDeGuidao("Esportivo");

        System.out.println("Detalhes do carro:");
        System.out.println(carro.exibirDetalhes());

        System.out.println("\nDetalhes da moto:");
        System.out.println(moto.exibirDetalhes());
    }
}
