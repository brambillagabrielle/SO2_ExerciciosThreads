package Exercicio3_Tweets;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
    Crie três threads onde o Thread1 fica enviando Tweets a cada 8 segundos, o
    Thread2 fica enviando a hora a cada 10 segundos e o Thread3 fica enviando o
    nome do usuário (aleatório) que publicou o Tweet a cada 8 segundos. Após a
    hora ser informada 10 vezes os Threads devem ser encerrados.
*/

public class Main {
    
    public static void main(String[] args) {
        
        EnviaDado enviaDado = new EnviaDado(false);

        Tweet tweet = new Tweet(enviaDado);
        tweet.start();
        
        Hora hora = new Hora(enviaDado);
        hora.start();
        
        Usuario usuario = new Usuario(enviaDado);
        usuario.start();
        
    }
    
}
