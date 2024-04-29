package ed;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvertirCifrasTest {
    @Test
    public void test1(){
        InvertirCifras inv=new InvertirCifras();
        int actual=inv.getInvertido(123);
        int esperado=321;
        Assertions.assertEquals(actual, esperado);
    }
    @Test
    public void test2(){
        InvertirCifras inv=new InvertirCifras();
        int actual=inv.getInvertido(9999);
        int esperado=0;
        Assertions.assertEquals(actual, esperado);
    }
    @Test
    public void test3(){
        InvertirCifras inv=new InvertirCifras();
        int actual=inv.getInvertido(1);
        int esperado=0;
        Assertions.assertEquals(actual, esperado);
    }
    @Test
    public void test4(){
        InvertirCifras inv=new InvertirCifras();
        int actual=inv.getInvertido(1000);
        int esperado=0;
        Assertions.assertEquals(actual, esperado);
    }
    @Test
    public void test5(){
        InvertirCifras inv=new InvertirCifras();
        int actual=inv.getInvertido(-123);
        Assertions.assertEquals(actual, 0);
    }
    @Test
    public void test6(){
        InvertirCifras inv=new InvertirCifras();
        int actual=inv.getInvertido(333);
        int esperado=333;
        Assertions.assertEquals(actual, esperado);
    }
}