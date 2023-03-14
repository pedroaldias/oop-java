package ex04;

public class Main {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        Carro c2 = new Carro();
        Moto m1 = new Moto();
        Moto m2 = new Moto();

        c1.setPlaca("RGU5C27");
        c2.setPlaca("WHY7838");
        m1.setPlaca("OWH1447");
        m2.setPlaca("SAA5916");

        c1.setTanqueCombustivel(55);
        c2.setTanqueCombustivel(60);
        m1.setTanqueCombustivel(7);
        m2.setTanqueCombustivel(9);

        c1.rodar(10);
        c2.rodar(10);
        m1.rodar(10);
        m2.rodar(10);

        System.out.printf(c1.toString());
        System.out.println(c2.toString());
        System.out.println(m1.toString());
        System.out.println(m2.toString());
    }
}
