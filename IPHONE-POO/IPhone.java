public class iPhone {
    public static void main(String[] args) {
        TelefoneMultifuncional tm = new TelefoneMultifuncional();

        AparelhoTelefonico aparelhotelefonico = tm;
        NavegadorInternet navegadorinternet = tm;
        ReprodutorMusical reprodutormusical = tm;

        aparelhotelefonico.atender();
        navegadorinternet.adicionarNovaAba();
        reprodutormusical.tocar();

    }
}
