package ex04;

public class Carro extends Veiculo{
    @Override
    public void rodar(double qtdKm){
        setKmRodados(getKmRodados() + qtdKm);
        setTanqueCombustivel(getTanqueCombustivel() - qtdKm / 12);
    }

    @Override
    public String toString() {
        return "\nCarro\n" + "Quilômetros rodados: " + getKmRodados() + "km" + "\nTanque de combustível: " + getTanqueCombustivel() + 'l' + "\nPlaca: " + getPlaca();
    }
}
