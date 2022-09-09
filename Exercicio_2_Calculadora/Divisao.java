package Exercicio_2_Calculadora;

public class Divisao extends Thread {

    private Operacao operacao;

    public Divisao(Operacao operacao) {
        this.operacao = operacao;
    }

    public void run() {

        int val1 = 0, val2 = 0;

        while (true) {
            
            try {

                if (this.operacao.getOperacao() == "DIVISAO") {
                    val1 = this.operacao.getValor_1();
                    val2 = this.operacao.getValor_2();
                    System.out.println("DIVISAO: " + (val1 / val2));
                    sleep(3000);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }

}
