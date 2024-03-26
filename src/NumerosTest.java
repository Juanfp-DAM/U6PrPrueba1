import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumerosTest {
    static Numeros n;
    @Test
    void sonIguales() {
        //ARRANGE
        n=new Numeros();
        int a=4, b=55, c=7;
        //ACT
        int resultado=n.sonIguales(a,b,c);
        //ASSERT
        assertEquals(2, resultado);
    }

    @Test
    void sonIguales2(){
        //ARRANGE
        int a=14, b=23, c=27;
        //ACT
        int resultado=Numeros.sonIguales(a,b,c);
        //ASSERT
        assertEquals(2,resultado);
    }


    @Test
    void sonIguales3(){
        //ARRANGE
        int a=14, b=55, c=14;
        //ACT
        int resultado=Numeros.sonIguales(a,b,c);
        //ASSERT
        assertEquals(1, resultado);
    }
    
}