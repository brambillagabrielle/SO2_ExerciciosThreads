package Exercicio_2_Calculadora;

public class Soma extends Thread {

    private Operacao operacao;

    public Soma(Operacao operacao) {
        this.operacao = operacao;
    }

    public void run() {

        int val1 = 0, val2 = 0;

        while (true) {

            try {

                if (this.operacao.getOperacao() == "SOMA") {
                    val1 = this.operacao.getValor_1();
                    val2 = this.operacao.getValor_2();
                    System.out.println("SOMA: " + (val1 + val2));
                    sleep(3000);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }

}
