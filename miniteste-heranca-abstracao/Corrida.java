class Corrida {
    private Veiculo[] veiculos = new Veiculo[5];
    private int pos = 0;
    public void adiciona(Veiculo a){
        if (pos < 5){
            veiculos[pos] = a;
            pos++;
        }
    }
    public void play(){
        for (Veiculo a : veiculos){
            if (a != null) System.out.println(a.acelera() + "\n");
        }
    }
}