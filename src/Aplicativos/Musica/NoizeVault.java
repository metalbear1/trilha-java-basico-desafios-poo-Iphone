package Aplicativos.Musica;

public class NoizeVault implements ReprodutorMusical {

    public void tocar() {
        System.out.println("Tocando agora: " + selecionaMusica("Blade Runner - Beast in Black"));
        System.out.println("Tempo da faixa: 1:32 ------------- 3:40");
    }

    public void pausar() {
        System.out.println("Music Player pausado, aperte tocar para continuar.");
    }

    public String selecionaMusica(String musica) {
        return musica;
    }
}
