public class Carro extends Veiculo {
    // Atributos
    private String placa;

    // Construtores
    public Carro() {
    }

    public Carro(String marca, String modelo, String cor, int ano, long numChassi, String placa) {
        super(marca, modelo, cor, ano, numChassi);
        this.placa = placa;
    }

    // Get e Set
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
  
}