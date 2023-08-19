import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Carro c1, c2, c3, c4;
        Motor m1, m2, m3, m4;
        Locale.setDefault(new Locale("en"));

        m1 = new Motor(1.0f);
        c1 = new Carro("Ford Ka", m1);
        System.out.printf("Carro: %s | Motor: %.1f | Velocidade máxima: %.0fKm/h\n", c1.getModelo(), c1.getMotor().getCilindrada(), c1.velocidadeMaxima());

        m2 = new Motor(1.6f);
        c2 = new Carro("Fiat Argo", m2);
        System.out.printf("Carro: %s | Motor: %.1f | Velocidade máxima: %.0fKm/h\n", c2.getModelo(), c2.getMotor().getCilindrada(), c2.velocidadeMaxima());

        m3 = new Motor(2.0f);
        c3 = new Carro("Honda Civic", m3);
        System.out.printf("Carro: %s | Motor: %.1f | Velocidade máxima: %.0fKm/h\n", c3.getModelo(), c3.getMotor().getCilindrada(), c3.velocidadeMaxima());

        m4 = new Motor(3.0f);
        c4 = new Carro("Ford Ranger", m4);
        System.out.printf("Carro: %s | Motor: %.1f | Velocidade máxima: %.0fKm/h\n", c4.getModelo(), c4.getMotor().getCilindrada(), c4.velocidadeMaxima());
    }
}
