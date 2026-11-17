
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        //Scanner para a estrada de dados padrão.
        Scanner entrada = new Scanner(System.in);

        // Cria um objeto da classe Triangulo
        Triangulo triangulo = new Triangulo();

        // Entrada dos lados utilizando setters
        System.out.print("Lado A: ");
        triangulo.setA(entrada.nextDouble());
        System.out.print("Lado B: ");
        triangulo.setB(entrada.nextDouble());
        System.out.print("Lado C: ");
        triangulo.setC(entrada.nextDouble());

        // Verifica a validade do triangulo
        if (triangulo.ehValido()) {
            System.out.println("Triangulo valido!");
            System.out.println("Perimetro: " + triangulo.calcularPerimetro());
            System.out.println("Area: " + triangulo.calcularArea());
        } else {
            System.out.println("Triangulo invalido!");
        }

        //Fecha a entrada de dados padrão
        entrada.close();
    }
}
