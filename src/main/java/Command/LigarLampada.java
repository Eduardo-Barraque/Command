package Command;

public class LigarLampada implements Interruptor {
    private Lampada lampada;

    public LigarLampada(Lampada lampada) {
        this.lampada = lampada;
    }

    public void executar() {
        this.lampada.ligarLampada();
    }

    public void cancelar() {
        this.lampada.desligarLampada();
    }
}
