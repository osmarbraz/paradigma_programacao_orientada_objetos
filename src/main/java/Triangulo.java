
public class Triangulo {

    // Atributos privados
    private double a;
    private double b;
    private double c;
    
    /**
     * Construtor sem parâmetros
     */
    public Triangulo(){
        setA(0);
        setB(0);
        setC(0);
    }

    // Getters
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    // Setters
    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    /** Verifica se os lados formam um triangulo
     * 
     * @return 
     */
    public boolean ehValido() {

        return a > 0 && b > 0 && c > 0
                && a < b + c
                && b < a + c
                && c < a + b;
    }

    /** Calcula o perimetro
     * 
     * @return 
     */
    public double calcularPerimetro() {
        return a + b + c;
    }

    /** Calcula a area pela formula de Heron
     * 
     * @return 
     */
    public double calcularArea() {
        double s = calcularPerimetro() / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
