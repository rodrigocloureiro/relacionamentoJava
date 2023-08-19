class Carro {
    private String modelo;
    private Motor motor;

    public Carro(String modelo, Motor motor) {
        this.modelo = modelo;
        this.motor = motor;
    }

    public String getModelo() { return modelo; }

    public void setModelo(String modelo) { this.modelo = modelo; }

    public Motor getMotor() { return motor; }

    public void setMotor(Motor motor) { this.motor = motor; }

    public float velocidadeMaxima() {
        if (motor.getCilindrada() <= 1.0f) return 140;
        else if (motor.getCilindrada() > 1.0f && motor.getCilindrada() <= 1.6f) return 180;
        else if (motor.getCilindrada() > 1.6f && motor.getCilindrada() <= 2.0f) return 220;
        else return 260;
    }
}