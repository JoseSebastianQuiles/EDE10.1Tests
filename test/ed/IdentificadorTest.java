package ed;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class IdentificadorTest {
    @Test
    public void test1() {
        Identificador identificador = new Identificador();
        boolean actual = identificador.validarIdentificador("abcd");
        boolean esperado = false;
        Assertions.assertEquals(esperado, actual);
    }

    @Test
    public void test2() {
        Identificador identificador = new Identificador();
        boolean actual = identificador.validarIdentificador("abcdefghijklmno");
        boolean esperado = false;
        Assertions.assertEquals(esperado, actual);
    }

    @Test
    public void test3() {
        Identificador identificador = new Identificador();
        boolean actual = identificador.validarIdentificador("abc@123");
        boolean esperado = false;
        Assertions.assertEquals(esperado, actual);
    }

    @Test
    public void test4() {
        Identificador identificador = new Identificador();
        boolean actual = identificador.validarIdentificador("-abc123");
        boolean esperado = false;
        Assertions.assertEquals(esperado, actual);
    }

    @Test
    public void test5() {
        Identificador identificador = new Identificador();
        boolean actual = identificador.validarIdentificador("abc123-");
        boolean esperado = false;
        Assertions.assertEquals(esperado, actual);
    }

    @Test
    public void test6() {
        Identificador identificador = new Identificador();
        boolean actual = identificador.validarIdentificador("123-456-789");
        boolean esperado = false;
        Assertions.assertEquals(esperado, actual);
    }

    @Test
    public void test7() {
        Identificador identificador = new Identificador();
        boolean actual = identificador.validarIdentificador("int");
        boolean esperado = false;
        Assertions.assertEquals(esperado, actual);
    }

    @Test
    public void test8() {
        Identificador identificador = new Identificador();
        boolean actual = identificador.validarIdentificador("abc123");
        boolean esperado = true;
        Assertions.assertEquals(esperado, actual);
    }

}