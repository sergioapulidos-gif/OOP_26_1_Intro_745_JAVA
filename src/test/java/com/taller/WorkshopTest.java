package com.taller; 

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class WorkshopTest {

    private final Workshop tester = new Workshop();

    @Test
    public void testAreaCirculo() {
        assertEquals(Math.PI, tester.areaCirculo(1), 0.001);
        assertEquals((Math.PI * 10), tester.areaCirculo(10), 0.001);
        assertEquals(0, tester.areaCirculo(0), 0.001);
    }

    @Test
    public void testZoodiac() {
        assertEquals("Aries", tester.zoodiac(9, 4));
        assertNotEquals("Pisces", tester.zoodiac(30, 2));
        assertEquals("Invalid Date", tester.zoodiac(31, 2));
        assertEquals("Gemini", tester.zoodiac(14, 6));
        assertEquals("Cancer", tester.zoodiac(22, 6));
        assertNotEquals("Leo", tester.zoodiac(30, 8));
    }

    @Test
    public void testSumarDosNumeros() {
        assertEquals(8, tester.sumarDosNumeros(3, 5));
        assertEquals(7, tester.sumarDosNumeros(7, 0));
        assertEquals(-2, tester.sumarDosNumeros(-1, -1));
    }

    @Test
    public void testMayorDeTresNumeros() {
        assertEquals(10, tester.mayorDeTresNumeros(5, 7, 10));
        assertEquals(3, tester.mayorDeTresNumeros(-5, -7, 3));
        assertEquals(-1, tester.mayorDeTresNumeros(-10, -5, -1));
    }

    @Test
    public void testTablaMultiplicar() {
        assertArrayEquals(new int[]{2, 4, 6, 8, 10}, tester.tablaMultiplicar(2, 5));
        assertArrayEquals(new int[]{3}, tester.tablaMultiplicar(3, 1));
        assertArrayEquals(new int[]{0, 0, 0, 0, 0}, tester.tablaMultiplicar(0, 5));
    }

    @Test
    public void testFactorial() {
        assertEquals(120, tester.factorial(5));
        assertEquals(1, tester.factorial(0));
        assertEquals(1, tester.factorial(1));
    }

    @Test
    public void testEsPrimo() {
        assertTrue(tester.esPrimo(7));
        assertFalse(tester.esPrimo(4));
        assertFalse(tester.esPrimo(-3));
    }

    @Test
    public void testSerieFibonacci() {
        assertArrayEquals(new int[]{0, 1, 1, 2, 3}, tester.serieFibonacci(5));
        assertArrayEquals(new int[]{0}, tester.serieFibonacci(1));
        assertArrayEquals(new int[]{}, tester.serieFibonacci(0));
    }

    @Test
    public void testSumaElementos() {
        assertEquals(15, tester.sumaElementos(new int[]{1, 2, 3, 4, 5}));
        assertEquals(-15, tester.sumaElementos(new int[]{-1, -2, -3, -4, -5}));
        assertEquals(0, tester.sumaElementos(new int[]{0, 0, 0, 0}));
    }

    @Test
    public void testPromedioElementos() {
        assertEquals(3.0, tester.promedioElementos(new int[]{1, 2, 3, 4, 5}));
        assertEquals(-3.0, tester.promedioElementos(new int[]{-1, -2, -3, -4, -5}));
        assertEquals(0.0, tester.promedioElementos(new int[]{0, 0, 0, 0}));
    }

    @Test
    public void testEncontrarElementoMayor() {
        assertEquals(10, tester.encontrarElementoMayor(new int[]{1, 2, 3, 10, 5}));
        assertEquals(3, tester.encontrarElementoMayor(new int[]{-1, -2, -3, 3, -5}));
        assertEquals(7, tester.encontrarElementoMayor(new int[]{7}));
    }

    @Test
    public void testEncontrarElementoMenor() {
        assertEquals(1, tester.encontrarElementoMenor(new int[]{1, 2, 3, 10, 5}));
        assertEquals(-5, tester.encontrarElementoMenor(new int[]{-1, -2, -3, -5, -4}));
        assertEquals(7, tester.encontrarElementoMenor(new int[]{7}));
    }

    @Test
    public void testBuscarElemento() {
        assertTrue(tester.buscarElemento(new int[]{1, 2, 3, 4, 5}, 3));
        assertFalse(tester.buscarElemento(new int[]{1, 2, 3, 4, 5}, 6));
        assertFalse(tester.buscarElemento(new int[]{}, 1));
    }

    @Test
    public void testInvertirArreglo() {
        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, tester.invertirArreglo(new int[]{1, 2, 3, 4, 5}));
        assertArrayEquals(new int[]{7}, tester.invertirArreglo(new int[]{7}));
        assertArrayEquals(new int[]{}, tester.invertirArreglo(new int[]{}));
    }

    @Test
    public void testOrdenarArreglo() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, tester.ordenarArreglo(new int[]{5, 4, 3, 2, 1}));
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, tester.ordenarArreglo(new int[]{1, 2, 3, 4, 5}));
        assertArrayEquals(new int[]{1, 1, 2, 3, 3}, tester.ordenarArreglo(new int[]{3, 1, 2, 1, 3}));
    }

    @Test
    public void testEliminarDuplicados() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, tester.eliminarDuplicados(new int[]{1, 2, 2, 3, 4, 4, 5}));
        assertArrayEquals(new int[]{1}, tester.eliminarDuplicados(new int[]{1, 1, 1, 1}));
        assertArrayEquals(new int[]{}, tester.eliminarDuplicados(new int[]{}));
    }

    @Test
    public void testCombinarArreglos() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, tester.combinarArreglos(new int[]{1, 2, 3, 4}, new int[]{5, 6, 7, 8}));
        assertArrayEquals(new int[]{1, 2, 3}, tester.combinarArreglos(new int[]{1, 2, 3}, new int[]{}));
        assertArrayEquals(new int[]{}, tester.combinarArreglos(new int[]{}, new int[]{}));
    }

    @Test
    public void testRotarArreglo() {
        assertArrayEquals(new int[]{4, 5, 1, 2, 3}, tester.rotarArreglo(new int[]{1, 2, 3, 4, 5}, 2));
        assertArrayEquals(new int[]{3, 4, 5, 1, 2}, tester.rotarArreglo(new int[]{1, 2, 3, 4, 5}, -2));
        assertArrayEquals(new int[]{1}, tester.rotarArreglo(new int[]{1}, 3));
    }

    @Test
    public void testContarCaracteres() {
        assertEquals(10, tester.contarCaracteres("Hola mundo"));
        assertEquals(0, tester.contarCaracteres(""));
    }

    @Test
    public void testInvertirCadena() {
        assertEquals("odnum aloH", tester.invertirCadena("Hola mundo"));
        assertEquals("", tester.invertirCadena(""));
        assertEquals("!@#321", tester.invertirCadena("123@#!"));
    }

    @Test
    public void testEsPalindromo() {
        assertTrue(tester.esPalindromo("reconocer"));
        assertFalse(tester.esPalindromo("hola"));
        assertTrue(tester.esPalindromo(""));
    }

    @Test
    public void testContarPalabras() {
        assertEquals(3, tester.contarPalabras("Hola mundo hoy"));
        assertEquals(0, tester.contarPalabras(""));
    }

    @Test
    public void testConvertirAMayusculas() {
        assertEquals("HOLA MUNDO", tester.convertirAMayusculas("Hola mundo"));
        assertEquals("", tester.convertirAMayusculas(""));
    }

    @Test
    public void testConvertirAMinusculas() {
        assertEquals("hola mundo", tester.convertirAMinusculas("Hola Mundo"));
        assertEquals("", tester.convertirAMinusculas(""));
    }

    @Test
    public void testReemplazarSubcadena() {
        assertEquals("Hola a todos", tester.reemplazarSubcadena("Hola mundo", "mundo", "a todos"));
        assertEquals("Hola mundo", tester.reemplazarSubcadena("Hola mundo", "noexiste", "nuevo"));
    }

    @Test
    public void testBuscarSubcadena() {
        assertEquals(5, tester.buscarSubcadena("Hola mundo", "mundo"));
        assertEquals(-1, tester.buscarSubcadena("Hola mundo", "noexiste"));
    }

    @Test
    public void testPromedioLista() {
        assertEquals(3.0, tester.promedioLista(List.of(1, 2, 3, 4, 5)));
        assertEquals(7.0, tester.promedioLista(List.of(7)));
        assertEquals(0.0, tester.promedioLista(List.of()));
    }

    @Test
    public void testConvertirABinario() {
        assertEquals("1010", tester.convertirABinario(10));
        assertEquals("0", tester.convertirABinario(0));
    }

    @Test
    public void testConvertirAHexadecimal() {
        assertEquals("FF", tester.convertirAHexadecimal(255));
        assertEquals("0", tester.convertirAHexadecimal(0));
    }

    @Test
    public void testJugarPiedraPapelTijeraLagartoSpock() {
        String resultado = tester.jugarPiedraPapelTijeraLagartoSpock("Piedra");
        assertTrue(resultado.equals("Ganaste") || resultado.equals("Perdiste") || resultado.equals("Empate"));
    }

    @Test
    public void testValidarCorreoElectronico() {
        assertTrue(tester.validarCorreoElectronico("test@example.com"));
        assertFalse(tester.validarCorreoElectronico("testexample.com"));
    }

    @Test
    public void testPPTLS2() {
        assertEquals("Player 2", tester.pptls2(new String[]{"P", "S"}));
        assertEquals("Empate", tester.pptls2(new String[]{"S", "S"}));
        assertEquals("Player 1", tester.pptls2(new String[]{"V", "S"}));
        assertEquals("Player 2", tester.pptls2(new String[]{"R", "V"}));
    }
}