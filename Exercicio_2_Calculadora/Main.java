package Exercicio_2_Calculadora;

/*
    Escreva um programa que implemente as funcionalidades de uma calculadora.
    Para cada funcionalidade (Soma, Subtração, Multiplicação e Divisão) crie um
    thread que deverá ser instanciada a cada solicitação do usuário.
*/

import javax.swing.JOptionPane;

public class Main {
    
    public static void main(String[] args) {
             
        Operacao operacao = new Operacao();

        Soma soma = new Soma(operacao);
        soma.start();
        
        Subtracao subtracao = new Subtracao(operacao);
        subtracao.start();
        
        Multiplicacao multiplicacao = new Multiplicacao(operacao);
        multiplicacao.start();
        
        Divisao divisao = new Divisao(operacao);
        divisao.start();
        
        operacao.setValor_1(4);
        operacao.setValor_2(2);
        
        operacao.setOperacao("SOMA");
        operacao.setOperacao("SUBTRACAO");
        operacao.setOperacao("MULTIPLICACAO");
        operacao.setOperacao("DIVISAO");
        
    }
    
}
