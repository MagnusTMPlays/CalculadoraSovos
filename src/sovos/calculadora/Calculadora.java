package sovos.calculadora;

import sovos.calculadora.main.divisao.Divisao;
import sovos.calculadora.main.multiplicacao.Multiplicacao;
import sovos.calculadora.main.soma.Soma;
import sovos.calculadora.main.subtracao.Subtracao;

public class Calculadora {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        System.out.println("Resultado da soma por Atributo: " + calculadora.getSomarAtributo(100,1));
        System.out.println("Resultado da soma por Parametro: " + calculadora.getSomarParametro(200,1));
        System.out.println("Resultado da soma por Atributo e Parametro: " + calculadora.getSomarAtribParam(300,1));


        System.out.println("\nResultado da subtracao por Atributo: " + calculadora.getSubtracaoAtributo(100,1));
        System.out.println("Resultado da subtracao por Parametro: " + calculadora.getSubtracaoParametro(200,1));
        System.out.println("Resultado da subtracao por Atributo e Parametro: " + calculadora.getSubtracaoAtribParam(300,1));

        System.out.println("\nResultado da multiplicacao por Atributo: " + calculadora.getMultiplicacaoAtributo(100,1));
        System.out.println("Resultado da multiplicacao por Parametro: " + calculadora.getMultiplicacaoParametro(200,1));
        System.out.println("Resultado da multiplicacao por Atributo e Parametro: " + calculadora.getMultiplicacaoAtribParam(300,1));

        System.out.println("\nResultado da divisão por Atributo: " + calculadora.getDividirAtributo(100,1));
        System.out.println("Resultado da divisão por Parametro: " + calculadora.getDividirParametro(200,1));
        System.out.println("Resultado da divisão por Atributo e Parametro: " + calculadora.getDividirAtribParam(300,1));

    }



    private int getSomarAtributo(int i, int i1) {
        Soma somatoria = new Soma();
        somatoria.setValor1(i);
        somatoria.setValor2(i1);
        somatoria.somarValores();
        return somatoria.getResultado();
    }

    private int getSomarParametro(int i,int i1){
        Soma somatoria = new Soma();
        somatoria.somarValores(i,i1);
        return somatoria.getResultado();
    }

    private int getSomarAtribParam(int i, int i1) {
        Soma somatoria = new Soma();
        somatoria.setValor2(i1);
        return somatoria.somarValores(i);
    }


    private int getSubtracaoAtributo(int i, int i1) {
        Subtracao subtracao = new Subtracao();
        subtracao.setValor1(i);
        subtracao.setValor2(i1);
        subtracao.subrairValores();
        return subtracao.getResultado();
    }

    private int getSubtracaoParametro(int i,int i1){
        Subtracao subtracao = new Subtracao();
        subtracao.subrairValores(i,i1);
        return subtracao.getResultado();
    }

    private int getSubtracaoAtribParam(int i, int i1) {
        Subtracao subtracao = new Subtracao();
        subtracao.setValor2(i1);
        return subtracao.subrairValores(i);
    }


    private int getMultiplicacaoAtributo(int i, int i1) {
        Multiplicacao multiplicacao = new Multiplicacao();
        multiplicacao.setValor1(i);
        multiplicacao.setValor2(i1);
        multiplicacao.multiplicarValores();
        return multiplicacao.getResultado();
    }

    private int getMultiplicacaoParametro(int i,int i1){
        Multiplicacao multiplicacao = new Multiplicacao();
        multiplicacao.multiplicarValores(i,i1);
        return multiplicacao.getResultado();
    }

    private int getMultiplicacaoAtribParam(int i, int i1) {
        Multiplicacao multiplicacao = new Multiplicacao();
        multiplicacao.setValor2(i1);
        return multiplicacao.multiplicarValores(i);
    }


    private int getDividirAtributo(int i, int i1) {
        Divisao divisao = new Divisao();
        divisao.setValor1(i);
        divisao.setValor2(i1);
        divisao.dividirValores();
        return divisao.getResultado();
    }

    private int getDividirParametro(int i,int i1){
        Divisao divisao = new Divisao();
        divisao.dividirValores(i,i1);
        return divisao.getResultado();
    }

    private int getDividirAtribParam(int i, int i1) {
        Divisao divisao = new Divisao();
        divisao.setValor2(i1);
        return divisao.dividirValores(i);
    }

}
