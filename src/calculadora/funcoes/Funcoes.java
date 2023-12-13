package calculadora.funcoes;

public class Funcoes {
    
    public double soma(double a, double b) {
        double soma;
        soma = a + b;
        System.out.println("A soma é: " + soma);

        return soma;
   }


   public double subtracao(double a, double b) {
        double sub;
        sub = a - b;
        System.out.println("A subtração é: " + sub);

        return sub;
   }


   public double multiplicacao (double a, double b) {
        double multi;
        multi = a * b;
        System.out.println("A a multiplicação é: " + multi);

        return multi;
   }

   
   public double divisao(double a, double b) {
        double divisao;
        divisao = a / b;
        if(a < b){
          System.out.println("Valores inválidos.");
        } else {
          System.out.println("A divisão é: " + divisao);
        }
     return divisao;
   }
}   
