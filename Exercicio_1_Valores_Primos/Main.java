package Exercicio_1_Valores_Primos;

/*
    Escreva um programa que imprima os números primos existentes entre 0 e
    99999 utilizando threads. Para cada mil valores crie um thread que inicia um
    novo processo.
*/

public class Main {
    
    public static void main(String[] args) {
        
        int intervalo = 1000, min = 0, max = intervalo;
        
        while (min <= 99999)
        {
            ValoresPrimos valPrimos = new ValoresPrimos(min, max);
            valPrimos.start();
            
            min = max;
            max += intervalo;
        }
        
    }
 
}
