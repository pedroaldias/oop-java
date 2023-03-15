import java.util.Scanner;
public abstract class Veiculo {
    String nome;
    int potencia;

    public Veiculo(String nome, int potencia){
        this.nome = nome;
        if(potencia >= 50 && potencia <= 1000){
            this.potencia = potencia;
        } else{
            Scanner input = new Scanner(System.in);
            while(potencia < 50 || potencia > 1000){
                System.out.print("Informe um valor inteiro entre 50 e 1000 para a potência: ");
                potencia = input.nextInt();
                this.potencia = potencia;
            }
        }
    }
    public abstract double acelera();
}
