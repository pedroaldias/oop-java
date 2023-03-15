public class Carro extends Veiculo{
    Carro(String nome, int potencia){
        super(nome, potencia);
    }
    @Override
    public double acelera(){
        return this.potencia / 2;
    }
}