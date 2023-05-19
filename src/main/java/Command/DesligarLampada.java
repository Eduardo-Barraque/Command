package Command;

public class DesligarLampada implements Interruptor{
    private Lampada lampada;

    public DesligarLampada(Lampada lampada) {
        this.lampada = lampada;
    }

    public void executar() {
        this.lampada.desligarLampada();
    }

    public void cancelar() {
        this.lampada.ligarLampada();
    }
}
