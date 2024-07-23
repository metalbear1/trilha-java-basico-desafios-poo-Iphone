import Aplicativos.Browser.NavegadorDeInternet;
import Aplicativos.Browser.Tor;
import Aplicativos.Musica.NoizeVault;
import Aplicativos.Musica.ReprodutorMusical;
import Aplicativos.Telefone.AparelhoTelefonico;
import Aplicativos.Telefone.LigacaoTelefonica;
import Interfaces.SistemaAplicacoes;

public class HomeScreen {

    public static void main(String[] args) {
        SistemaAplicacoes app = new SistemaAplicacoes();

        String appEscolhido = "NoizeVault";

        if (appEscolhido.equals("NoizeVault")) {
            app.tocar();
            app.pausar();
            app.selecionaMusica("Blade Runner - Beast in Black");
        } else if (appEscolhido.equals("ligacoes")) {
            app.ligar("35-997008867");
            app.setAtender(false);
            boolean chamada = app.atenderLigacao();

            System.out.println("Ligação em Andamento: " + chamada);
        }else if (appEscolhido.equals("NavegadorWeb")) {
            app.exibirPagina("");
            app.adicionarNovaAba();
            app.atualizarPagina();
        }
    }
}
