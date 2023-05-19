package Command;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private List<Interruptor> interruptors = new ArrayList<Interruptor>();

    public void usarInterruptor(Interruptor interruptor) {
        this.interruptors.add(interruptor);
        interruptor.executar();
    }

    public void cancelarUsoInterruptor() {
        if (interruptors.size() != 0) {
            Interruptor interruptor = this.interruptors.get(this.interruptors.size() - 1);
            interruptor.cancelar();
            this.interruptors.remove(this.interruptors.size() - 1);
        }
    }
}
