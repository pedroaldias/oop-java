package ex04;

public class Moto extends Veiculo{
    @Override
    public void rodar(double qtdKm){
        setKmRodados(getKmRodados() + qtdKm);
        setTanqueCombustivel(getTanqueCombustivel() - qtdKm / 40);
    }

    @Override
    public String toString() {
        return "\nMoto\n" + "Quilômetros rodados: " + getKmRodados() + "km" + "\nTanque de combustível: " + getTanqueCombustivel() + 'l' + "\nPlaca: " + getPlaca();
    }
}
