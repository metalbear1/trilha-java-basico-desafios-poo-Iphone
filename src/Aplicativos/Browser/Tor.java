package Aplicativos.Browser;

public class Tor implements NavegadorDeInternet {

    public String exibirPagina(String url) {
        return url;
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("www.mangakakalot.com");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada com sucesso");
    }
}
