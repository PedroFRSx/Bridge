import org.example.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DispositivoTest {

    @Test
    public void deveRetornarDescricaoComputadorComWindows() {
        SistemaOperacional windows = new Windows();
        Dispositivo computador = new Computador(windows);
        assertEquals("Computador rodando: Windows", computador.descrever());
    }

    @Test
    public void deveRetornarDescricaoComputadorComLinux() {
        SistemaOperacional linux = new Linux();
        Dispositivo computador = new Computador(linux);
        assertEquals("Computador rodando: Linux", computador.descrever());
    }

    @Test
    public void deveRetornarDescricaoSmartphoneComAndroid() {
        SistemaOperacional android = new Android();
        Dispositivo smartphone = new Smartphone(android);
        assertEquals("Smartphone rodando: Android", smartphone.descrever());
    }

    @Test
    public void deveRetornarDescricaoSmartphoneComIOS() {
        SistemaOperacional ios = new IOS();
        Dispositivo smartphone = new Smartphone(ios);
        assertEquals("Smartphone rodando: iOS", smartphone.descrever());
    }

}