package Exercicio_2_Calculadora;

/*
    Escreva um programa que implemente as funcionalidades de uma calculadora.
    Para cada funcionalidade (Soma, Subtração, Multiplicação e Divisão) crie um
    thread que deverá ser instanciada a cada solicitação do usuário.
*/

public class Main {
    
    public static void main(String[] args) {
        
        Operacao operacao = new Operacao(2, 3, "SOMA");
        Calculadora calculadora = new Calculadora(operacao);
        calculadora.start();
        
        operacao = new Operacao(5, 7, "SUBTRACAO");
        calculadora = new Calculadora(operacao);
        calculadora.start();
        
        operacao = new Operacao(4, 3, "MULTIPLICACAO");
        calculadora = new Calculadora(operacao);
        calculadora.start();
        
        operacao = new Operacao(49, 7, "DIVISAO");
        calculadora = new Calculadora(operacao);
        calculadora.start();
        
    }
    
}
