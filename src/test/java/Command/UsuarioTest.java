package Command;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UsuarioTest {
    Usuario usuario;
    Lampada lampada;

    @BeforeEach
    void setUp() {
        usuario = new Usuario();
        lampada = new Lampada ("Cozinha");
    }

    @Test
    void deveLigarLampada() {
        Interruptor ligarLampada = new LigarLampada(lampada);
        usuario.usarInterruptor(ligarLampada);

        assertEquals("Lampada ligada", lampada.getSituacao());
    }

    @Test
    void deveDesligarLampada() {
        Interruptor desligarLampada = new DesligarLampada(lampada);
        usuario.usarInterruptor(desligarLampada);

        assertEquals("Lampada desligada", lampada.getSituacao());
    }

    @Test
    void deveCancelarDesligamentoLampada() {
        Interruptor ligarLampada = new LigarLampada(lampada);
        Interruptor desligarLampada = new DesligarLampada(lampada);

        usuario.usarInterruptor(ligarLampada);
        usuario.usarInterruptor(desligarLampada);

        usuario.cancelarUsoInterruptor();

        assertEquals("Lampada ligada", lampada.getSituacao());
    }
    @Test
    void deveCancelarLigamentoLampada() {
        Interruptor ligarLampada = new LigarLampada(lampada);
        Interruptor desligarLampada = new DesligarLampada(lampada);

        usuario.usarInterruptor(desligarLampada);
        usuario.usarInterruptor(ligarLampada);

        usuario.cancelarUsoInterruptor();

        assertEquals("Lampada desligada", lampada.getSituacao());
    }
}
