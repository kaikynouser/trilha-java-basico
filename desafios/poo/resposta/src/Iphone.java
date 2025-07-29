public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{

    @Override
    public void turnPhone(String numero) {
        System.out.println("Ligando para " + numero);
    }

    @Override
    public void answerCall() {
        System.out.println("Atender o celular");
    }

    @Override
    public void playVoiceBox() {
        System.out.println("Reproduzir caixa de correio em voz");
    }

    @Override
    public void showPage(String url) {
        System.out.println("mostrando a pagina: " + url);
    }

    @Override
    public void addNewAba() {
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void updatePage() {
        System.out.println("Atualizando a pagina");
    }

    @Override
    public void play() {
        System.out.println("Tocando a musica");
    }

    @Override
    public void pause() {
        System.out.println("Pausando a musica");
    }

    @Override
    public void selectMusic(String music) {
        System.out.println("Musica " + music + "selecionada!!");
    }
}
