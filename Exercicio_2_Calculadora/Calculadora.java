package Exercicio_2_Calculadora;

public class Calculadora extends Thread {

    private Operacao operacao;

    public Calculadora(Operacao operacao) {
        this.operacao = operacao;
    }

    public void run() {

        switch (operacao.getOperacao()) {

            case "SOMA":
                System.out.println("SOMA: " + soma());
                break;
            case "SUBTRACAO":
                System.out.println("SUBTRACAO: " + subtracao());
                break;
            case "MULTIPLICACAO":
                System.out.println("MULTIPLICACAO: " + multiplicacao());
                break;
            case "DIVISAO":
                System.out.println("DIVISAO: " + divisao());

        }

    }

    public int soma() {
        return operacao.getValor_1() + operacao.getValor_2();
    }

    public int subtracao() {
        return operacao.getValor_1() - operacao.getValor_2();
    }

    public int multiplicacao() {
        return operacao.getValor_1() * operacao.getValor_2();
    }

    public float divisao() {
        return operacao.getValor_1() / operacao.getValor_2();
    }

    public Operacao getOperacao() {
        return operacao;
    }

    public void setOperacao(Operacao operacao) {
        this.operacao = operacao;
    }

}
