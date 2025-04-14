package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CuentaTest {

    @Test
    void getNumero() {
    }

    @Test
    void getSaldo() {
    }

    @Test
    void setNumero() {
    }

    @Test
    void setSaldo() {
    }

    @Test
    void ingresarDinero() {
    }

    @Test
    void extraerDinero_exception() {
        try{
            Cuenta cuentaPedro = new Cuenta("ES20",100);
            cuentaPedro.extraerDinero(120);
            fail ("ERROR. Se debería haber lanzado una excepción al resultar un saldo negativo");
        }
        catch (ArithmeticException ae){ //Prueba correcta

        }
    }


    @Test
    void mostrarCuenta() {
    }
    @Test
    void getSaldo1() {
        Cuenta cuentaPedro = new Cuenta("ES20",100);
        float saldo = cuentaPedro.getSaldo();
        assertEquals(100,saldo);
    }
    @Test
    void getSaldo2() {
        Cuenta cuentaPedro = new Cuenta("ES20",100);
        float saldo = cuentaPedro.getSaldo();
        assertEquals(100,saldo);
    }

}