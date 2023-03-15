public class Moto extends Veiculo{
    Moto(String nome, int potencia){
        super(nome, potencia);
    }
    @Override
    public double acelera(){
        return this.potencia / 2;
    }
}
