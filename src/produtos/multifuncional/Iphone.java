package produtos.multifuncional;
import produtos.internet.NavegadorInternet;
import produtos.musical.ReprodutorMusical;
import produtos.telefone.AparelhoTelefonico;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    public void tocar() {
        System.out.println("Tocando música");
    }
    public void pausar() {
        System.out.println("Música pausada");
    }
    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica);
    }

    public void ligar(String numero) {
        System.out.println("Chamando: " + numero);
    }
    public void atender() {
        System.out.println("Atender chamada");
    }
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }
    public void adicionarNovaAba(){
        System.out.println("Nova aba adicionada");
    }
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }
}
