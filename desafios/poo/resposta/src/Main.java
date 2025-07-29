public class Main {


    public static void main (String [] args){
        Iphone iphoneKaiky = new Iphone();
        Iphone iphoneBerlin = new Iphone();

        System.out.println("----- FUNÇÕES DE MUSICA IPHONE -----");
        iphoneKaiky.selectMusic("50 cent - Candy Shop");
        iphoneKaiky.play();
        iphoneKaiky.pause();
        System.out.printf("%n");

        System.out.println("----- FUNÇÕES DE LIGAÇÃO IPHONE -----");
        iphoneKaiky.turnPhone("(44) 99976-8456");
        iphoneKaiky.answerCall();
        iphoneKaiky.playVoiceBox();
        System.out.printf("%n");

        System.out.println("----- FUNÇÕES DE LIGAÇÃO IPHONE -----");

    }
}