package Aplicativos.Telefone;

public class LigacaoTelefonica implements AparelhoTelefonico {

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
}
