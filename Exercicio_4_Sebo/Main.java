package Exercicio_4_Sebo;

/*
    Uma loja de sebo possui livros que podem ser consumidos por diferentes
    usuários. Cada usuário poderá consumir o livro por um determinado tempo,
    porém o acesso ao material deverá ser sincronizado. Após ler o livro o usuário
    deverá notificar os demais usuários que o livro está disponível
*/

public class Main {
    
    public static void main(String[] args) {
        
        Livro livro = new Livro("Dom Casmurro");
        
        Usuario usuario1 = new Usuario("Ana", livro);
        usuario1.start();
        
        Usuario usuario2 = new Usuario("João", livro);
        usuario2.start();
        
        Usuario usuario3 = new Usuario("Maria", livro);
        usuario3.start();
        
    }
    
}
