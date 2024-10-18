package Application;

import Entities.Estoque;

import java.util.Locale;
import java.util.Scanner;

public class AulaFor {
    public static void main(String[] args) {

//        String original = "abcde FGHIJ ABC abc DEFG   ";
//        Triangle X = new Triangle();
//        Triangle Y = new Triangle();
//        Scanner insira = new Scanner(System.in);
//        System.out.println("Insira as medidas do triangulo 1: ");
//        System.out.println("Medida lado 1: ");
//        X.a =  insira.nextInt();
//        System.out.println("Medida lado 2: ");
//        X.b = insira.nextInt();
//        System.out.println("Medida lado 3: ");
//        X.c = insira.nextInt();
//        System.out.println("Insira as medidas do triangulo 2: ");
//        System.out.println("Medida lado 1: ");
//        Y.a  = insira.nextInt();
//        System.out.println("Medida lado 2: ");
//        Y.b  = insira.nextInt();
//        System.out.println("Medida lado 3: ");
//        Y.c = insira.nextInt();
//
//
//
//
//        double mediaX = X.calculaArea();
//        double mediaY = Y.calculaArea();
//
//
//
//
//
//        if(mediaX > mediaY){
//            System.out.println("Triangulo X tem a area maior que do Y");
//        }else{
//            System.out.println("Trianqulo Y tem a media maior que a do X");
//        }


        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        var entradaDados = new Estoque();

        System.out.println("Insira os dados do produto: ");
        System.out.println("Nome: ");
        entradaDados.nome = entrada.nextLine();
        System.out.println("Preço: ");
        entradaDados.preco = entrada.nextDouble();
        System.out.println("Quantidade: ");
        entradaDados.quantidade = entrada.nextInt();


        System.out.println(entradaDados);







        entrada.close();







        }



    }



