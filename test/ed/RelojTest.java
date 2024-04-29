package ed;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RelojTest {
    @Test
    public void test0(){
        Reloj reloj=new Reloj();
        boolean actual= reloj.getReloj(1,2,3);
        boolean esperado=true;
        Assertions.assertEquals(actual, esperado);
    }
    @Test
    public void test1() {
        Reloj reloj = new Reloj();
        boolean actual = reloj.getReloj(12, 30, 45);
        boolean esperado = true;
        Assertions.assertEquals(esperado, actual);
    }

    @Test
    public void test2() {
        Reloj reloj = new Reloj();
        boolean actual = reloj.getReloj(25, 70, 80);
        boolean esperado = false;
        Assertions.assertEquals(esperado, actual);
    }

    @Test
    public void test3() {
        Reloj reloj = new Reloj();
        boolean actual = reloj.getReloj(-1, -5, -10);
        boolean esperado = false;
        Assertions.assertEquals(esperado, actual);
    }

    @Test
    public void test4() {
        Reloj reloj = new Reloj();
        boolean actual = reloj.getReloj(1, -5, 10);
        boolean esperado = false;
        Assertions.assertEquals(esperado, actual);
    }

    @Test
    public void test5() {
        Reloj reloj = new Reloj();
        boolean actual = reloj.getReloj(1, 5, -10);
        boolean esperado = false;
        Assertions.assertEquals(esperado, actual);
    }

    @Test
    public void test6() {
        Reloj reloj = new Reloj();
        boolean actual = reloj.getReloj(23, 59, 59);
        boolean esperado = true;
        Assertions.assertEquals(esperado, actual);
    }

    @Test
    public void test7() {
        Reloj reloj = new Reloj();
        boolean actual = reloj.getReloj(0, 0, 0);
        boolean esperado = true;
        Assertions.assertEquals(esperado, actual);
    }
}