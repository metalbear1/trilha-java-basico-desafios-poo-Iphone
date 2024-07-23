package Interfaces;

import Aplicativos.Browser.NavegadorDeInternet;
import Aplicativos.Browser.Tor;
import Aplicativos.Musica.NoizeVault;
import Aplicativos.Musica.ReprodutorMusical;
import Aplicativos.Telefone.AparelhoTelefonico;
import Aplicativos.Telefone.LigacaoTelefonica;

public class SistemaAplicacoes implements ReprodutorMusical, AparelhoTelefonico, NavegadorDeInternet {
    //    Reprodutor musical
    NoizeVault noizeVault = new NoizeVault();

    @Override
    public void tocar() {
        noizeVault.tocar();
    }

    @Override
    public void pausar() {
        noizeVault.pausar();
    }

    @Override
    public String selecionaMusica(String musica) {
        System.out.println("Música selcionada: Blade Runner - Beast in Black");
        return noizeVault.selecionaMusica("");
    }

    //Ligação

    private boolean atender;

    public boolean setAtender(boolean atender) {
        return this.atender = atender;
    }

    public String ligar(String numeroTelefone) {
        return numeroTelefone;
    }

    public void correioDeVoz() {
        System.out.println("O número ligado encontra-se desligado ou fora da área de cobertura, tente novamente mais tarde, ou deixe uma mensagem após o BIP...*BIP*");
    }

    public boolean atenderLigacao() {
        if (atender == true) {
            System.out.println("Número discado: " + ligar("3599700-8867"));
            System.out.println("Alô, quem fala?...");
            return true;
        } else {
            correioDeVoz();
        }
        return false;
    }

    //Navegador Web
    Tor browser = new Tor();

    @Override
    public String exibirPagina(String url) {
        System.out.println("https://www.dio.me");
        return "";
}

    @Override
    public void adicionarNovaAba() {
        System.out.println("https://www.mangakakalot.com");
    }

    @Override
    public void atualizarPagina() {
       browser.atualizarPagina();
    }
}
