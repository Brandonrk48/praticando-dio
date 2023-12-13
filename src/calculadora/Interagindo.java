package calculadora;
import java.util.Scanner;

import calculadora.funcoes.Funcoes;
import calculadora.valores.Numero;

public class Interagindo {
    public static void main(String[] args) throws Exception {
        Scanner dados = new Scanner(System.in);
        int rep =1;
        boolean rodando = true;
         
        Funcoes f = new Funcoes();
        //tipos de calculos

        Numero numero1 = new Numero();
        Numero numero2 = new Numero();
        //objetos números


        while(rodando){   
            System.out.println("Informe a operação de interesse:");
            System.out.println("Somar:");
            System.out.println("Subtrair:");
            System.out.println("Dividir:");
            System.out.println("Multiplicar:");
            String opcao = dados.next();
            opcao = opcao.toLowerCase();

            System.out.println("Informe o primeiro valor: ");
            numero1.setNumero(dados.nextDouble());
            System.out.println("Infrmoe o segundo valor: ");
            numero2.setNumero(dados.nextDouble());

            if(opcao.equals("somar")){

                f.soma(numero1.getNumero(),numero2.getNumero());
                //passando os objetos no método soma

            } else if(opcao.equals("subtrair")){

                f.subtracao(numero1.getNumero(), numero2.getNumero());
                        
            } else if(opcao.equals("multiplicar")){

                f.multiplicacao(numero1.getNumero(),numero2.getNumero());
      
            } else if (opcao.equals("dividir")){


                f.divisao(numero1.getNumero(),numero2.getNumero());
            }

            System.out.println("1 para calcular novamente:\n2 para parar");
            rep = dados.nextInt();
        
            if(rep == 1){
                rodando = true;
            } else {
                rodando = false;
            }    
        } 
    }

}

/*
 * InputMismatchException
 */