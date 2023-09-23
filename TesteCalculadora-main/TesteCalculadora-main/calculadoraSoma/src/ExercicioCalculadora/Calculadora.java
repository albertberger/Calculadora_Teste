package ExercicioCalculadora;

public class Calculadora {
	
	public static void main(String[] args) {
        testSoma();
        testSubtracao();
        testMultiplicacao();
        testDivisao();
    }

	public static void testSoma() {
        Soma sum = new Soma();

        // Teste de soma com dois números inteiros positivos
        int soma = sum.somar(1, 10);
        System.out.println("Soma(1, 10): " + soma); // Deve imprimir 11

        // Teste de soma com um número positivo e outro negativo
        soma = sum.somar(-1, 10);
        System.out.println("Soma(-1, 10): " + soma); // Deve imprimir 9
    }

    public static void testSubtracao() {
        Subtracao sub = new Subtracao();

        // Teste de subtração com dois números inteiros positivos
        int subtrai = sub.subtrair(10, 1);
        System.out.println("Subtracao(10, 1): " + subtrai); // Deve imprimir 9

        // Teste de subtração com um número positivo e outro negativo
        subtrai = sub.subtrair(10, -1);
        System.out.println("Subtracao(10, -1): " + subtrai); // Deve imprimir 11

        // Teste de subtração com dois números inteiros negativos
        subtrai = sub.subtrair(-10, -1);
        System.out.println("Subtracao(-10, -1): " + subtrai); // Deve imprimir -9
    }

    public static void testMultiplicacao() {
        Multiplicar mult = new Multiplicar();

        // Teste de multiplicação com dois números inteiros positivos
        int multi = mult.multiplicacao(10, 2);
        System.out.println("Multiplicacao(10, 2): " + multi); // Deve imprimir 20

        // Teste de multiplicação com um número positivo e outro negativo
        multi = mult.multiplicacao(10, -2);
        System.out.println("Multiplicacao(10, -2): " + multi); // Deve imprimir -20

        // Teste de multiplicação com dois números inteiros negativos
        multi = mult.multiplicacao(-10, -2);
        System.out.println("Multiplicacao(-10, -2): " + multi); // Deve imprimir 20

        // Teste de multiplicação com um número positivo e 0
        multi = mult.multiplicacao(10, 0);
        System.out.println("Multiplicacao(10, 0): " + multi); // Deve imprimir 0
    }

    public static void testDivisao() {
        Dividir div = new Dividir();

        // Teste de divisão com dois números inteiros positivos
        int divs = div.divisao(10, 2);
        System.out.println("Divisao(10, 2): " + divs); // Deve imprimir 5

        // Teste de divisão com um número positivo e outro negativo
        divs = div.divisao(10, -2);
        System.out.println("Divisao(10, -2): " + divs); // Deve imprimir -5

        // Teste de divisão com dois números inteiros negativos
        divs = div.divisao(-10, -2);
        System.out.println("Divisao(-10, -2): " + divs); // Deve imprimir 5

        // Teste de divisão por zero
        try {
            divs = div.divisao(10, 0);
            System.out.println("Divisao(10, 0): " + divs);
        } catch (ArithmeticException e) {
            System.out.println("Divisao por zero: " + e.getMessage()); // Deve imprimir "Divisão por zero"
        }
    }
    
}
