public class Barco extends Veiculo{
    Barco(String nome, int potencia){
        super(nome, potencia);
    }
    @Override
    public double acelera(){
        return this.potencia / 1.5;
    }
}
