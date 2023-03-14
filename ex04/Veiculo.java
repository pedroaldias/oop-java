package ex04;

public abstract class Veiculo {
    String placa;
    private double tanqueCombustivel, kmRodados, kmPorLitros;
    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getTanqueCombustivel() {
        return tanqueCombustivel;
    }

    public void setTanqueCombustivel(double qtdLitros){
        this.tanqueCombustivel = qtdLitros;
    }

    public double getKmRodados() {
        return kmRodados;
    }

    public void setKmRodados(double qtdKm) {
        this.kmRodados = qtdKm;
    }

    public double getKmPorLitros() {
        return kmPorLitros;
    }

    public void setKmPorLitros(double qtdLitros) {
        this.kmPorLitros = qtdLitros;
    }

    public void abastecer(double qtdLitros){
       setTanqueCombustivel(getTanqueCombustivel() + qtdLitros);
    }

    public void consumir(double qtdLitros){
        setTanqueCombustivel(getTanqueCombustivel() - qtdLitros);
    }

    public abstract void rodar(double qtdKm);
    public abstract String toString();
}
