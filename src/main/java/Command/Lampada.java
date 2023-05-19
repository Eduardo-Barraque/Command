package Command;

public class Lampada {
    private String situacao;
    private String Lugar;

    public Lampada(String Lugar) {
        this.Lugar = Lugar;
    }

    public String getSituacao() {
        return situacao;
    }

    public void ligarLampada() {
        this.situacao = "Lampada ligada";
    }

    public void desligarLampada() {
        this.situacao = "Lampada desligada";
    }
}
