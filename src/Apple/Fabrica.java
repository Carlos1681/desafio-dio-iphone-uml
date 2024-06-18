package Apple;

import produtos.internet.NavegadorInternet;
import produtos.multifuncional.Iphone;
import produtos.musical.ReprodutorMusical;
import produtos.telefone.AparelhoTelefonico;

public class Fabrica{
    public static void main(String[] args) throws Exception {
        Iphone iphone = new Iphone();
        ReprodutorMusical reprodutorMusical = iphone;
        AparelhoTelefonico aparelhoTelefonico = iphone;
        NavegadorInternet navegadorInternet = iphone;
        reprodutorMusical.tocar();
        reprodutorMusical.pausar();
        reprodutorMusical.selecionarMusica("We Are!");

        aparelhoTelefonico.ligar("123456789");
        aparelhoTelefonico.atender();
        aparelhoTelefonico.iniciarCorreioVoz();

        navegadorInternet.exibirPagina("www.google.com");
        navegadorInternet.adicionarNovaAba();
        navegadorInternet.atualizarPagina();
    }
}
