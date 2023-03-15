class Teste{
    public static void main(String[] args){
        Veiculo carro = new Carro("Ford", 48);
        Veiculo barco = new Barco("Pearl", 49);
        Veiculo moto = new Moto("XRE", 41);
 
        Corrida z = new Corrida();
        z.adiciona(carro);
        z.adiciona(barco);
        z.adiciona(moto);
        z.play();
    }
}