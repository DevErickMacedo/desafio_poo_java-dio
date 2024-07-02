public class TelefoneMultifuncional implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    
    public void exibirPagina(String url){
        System.out.println("Exibindo página atual..");
    }

    public void adicionarNovaAba(){
        System.out.println("Nova aba adicionada.");
    }

    public void atualizarPagina(){
        System.out.println("Página atualizada com sucesso.");
    }

    public void ligar(String numero){
        System.out.println("Ligando para: " + numero);
    }

    public void atender(){
        System.out.println("Ligação atendida!");
    }

    public void iniciarCorreioVoz(){
        System.out.println("Correio de voz ativo.");
    }

    public void tocar(){
        System.out.println("Tocando a música!");
    }

    public void pausar(){
        System.out.println("Música pausada...");
    }

    public void selecionarMusica(String musica){
        System.out.println("Selecione a próxima música: ");
    }
}
