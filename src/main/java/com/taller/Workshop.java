package com.taller; 

import java.util.*;

public class Workshop {
    public static void main(String[] args) {
        Workshop taller = new Workshop();
        System.out.println("--- PRUEBAS DEL TALLER ---");
        System.out.println("¿Es 'Reconocer' palindromo?: " + taller.esPalindromo("Reconocer"));
        System.out.println("Palabras en 'Hola mundo Java': " + taller.contarPalabras("Hola mundo Java"));
        System.out.println("Numero 10 en binario: " + taller.convertirABinario(10));
        System.out.println("Signo para 10 de Marzo: " + taller.zoodiac(10, 3));
    }

    public int sumarDosNumeros(int a, int b) {
        return a + b;
    }

    public int mayorDeTresNumeros(int a, int b, int c) {
        if (a >= b && a >= c) return a;
        if (b >= c) return b;
        return c;
    }

    public int[] tablaMultiplicar(int numero, int limite) {
        int[] tabla = new int[limite];
        for (int i = 0; i < limite; i++) {
            tabla[i] = numero * (i + 1);
        }
        return tabla;
    }

    public int factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("Numero negativo");
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res = res * i;
        }
        return res;
    }

    public boolean esPrimo(int numero) {
        if (numero <= 1) return false;
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }

    public int[] serieFibonacci(int n) {
        if (n < 0) throw new IllegalArgumentException("n no puede ser negativo");
        int[] serie = new int[n];
        if (n >= 1) serie[0] = 0;
        if (n >= 2) serie[1] = 1;
        for (int i = 2; i < n; i++) {
            serie[i] = serie[i - 1] + serie[i - 2];
        }
        return serie;
    }

    public int sumaElementos(int[] arreglo) {
        int suma = 0;
        for (int i = 0; i < arreglo.length; i++) {
            suma = suma + arreglo[i];
        }
        return suma;
    }

    public double promedioElementos(int[] arreglo) {
        if (arreglo.length == 0) return 0.0;
        double suma = 0;
        for (int i = 0; i < arreglo.length; i++) {
            suma = suma + arreglo[i];
        }
        return suma / arreglo.length;
    }

    public int encontrarElementoMayor(int[] arreglo) {
        int mayor = arreglo[0];
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] > mayor) {
                mayor = arreglo[i];
            }
        }
        return mayor;
    }

    public int encontrarElementoMenor(int[] arreglo) {
        int menor = arreglo[0];
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] < menor) {
                menor = arreglo[i];
            }
        }
        return menor;
    }

    public boolean buscarElemento(int[] arreglo, int elemento) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == elemento) return true;
        }
        return false; 
    }

    public int[] invertirArreglo(int[] arreglo) {
        int[] invertido = new int[arreglo.length];
        for (int i = 0; i < arreglo.length; i++) {
            invertido[i] = arreglo[arreglo.length - 1 - i];
        }
        return invertido;
    }

    public int[] ordenarArreglo(int[] arreglo) {
        int[] copia = arreglo.clone();
        for (int i = 0; i < copia.length - 1; i++) {
            for (int j = 0; j < copia.length - 1 - i; j++) {
                if (copia[j] > copia[j + 1]) {
                    int temp = copia[j];
                    copia[j] = copia[j + 1];
                    copia[j + 1] = temp;
                }
            }
        }
        return copia;
    }

    public int[] eliminarDuplicados(int[] arreglo) {
        if (arreglo.length == 0) return new int[0];
        int[] temp = new int[arreglo.length];
        int count = 0;
        for (int i = 0; i < arreglo.length; i++) {
            boolean yaExiste = false;
            for (int j = 0; j < count; j++) {
                if (arreglo[i] == temp[j]) {
                    yaExiste = true;
                    break;
                }
            }
            if (!yaExiste) {
                temp[count] = arreglo[i];
                count++;
            }
        }
        int[] resultado = new int[count];
        for (int i = 0; i < count; i++) {
            resultado[i] = temp[i];
        }
        return resultado;
    }

    public int[] combinarArreglos(int[] arreglo1, int[] arreglo2) {
        int[] resultado = new int[arreglo1.length + arreglo2.length];
        for (int i = 0; i < arreglo1.length; i++) {
            resultado[i] = arreglo1[i];
        }
        for (int i = 0; i < arreglo2.length; i++) {
            resultado[arreglo1.length + i] = arreglo2[i];
        }
        return resultado;
    }

    public int[] rotarArreglo(int[] arreglo, int posiciones) {
        int n = arreglo.length;
        if (n == 0) return arreglo;
        posiciones = posiciones % n;
        if (posiciones < 0) posiciones += n;
        int[] rotado = new int[n];
        for (int i = 0; i < n; i++) {
            rotado[(i + posiciones) % n] = arreglo[i];
        }
        return rotado;
    }

    public int contarCaracteres(String cadena) {
        return cadena.length();
    }

    public String invertirCadena(String cadena) {
        if (cadena == null) return null;
        StringBuilder sb = new StringBuilder(cadena);
        return sb.reverse().toString();
    }

    public boolean esPalindromo(String cadena) {
        cadena = cadena.toLowerCase().replace(" ", "");
        int izquierda = 0;
        int derecha = cadena.length() - 1;
        while (izquierda < derecha) {
              if (cadena.charAt(izquierda) != cadena.charAt(derecha)) {
               return false;
              }
              izquierda++;
              derecha--;
        }
        return true;
    }

    public int contarPalabras(String cadena) {
        if (cadena == null || cadena.trim().isEmpty()) return 0;
        return cadena.trim().split("\\s+").length;
    }

    public String convertirAMayusculas(String cadena) {
        return cadena.toUpperCase();
    }

    public String convertirAMinusculas(String cadena) {
        return cadena.toLowerCase();
    }

    public String reemplazarSubcadena(String cadena, String antiguaSubcadena, String nuevaSubcadena) {
        return cadena.replace(antiguaSubcadena, nuevaSubcadena);
    }

    public int buscarSubcadena(String cadena, String subcadena) {
        return cadena.indexOf(subcadena);
    }

    public boolean validarCorreoElectronico(String correo) {
        return correo != null && correo.contains("@") && correo.contains(".");
    }

    public double promedioLista(List<Integer> lista) {
        if (lista == null || lista.isEmpty()) return 0.0;
        double suma = 0;
        for (int num : lista) {
            suma += num;
        }
        return suma / lista.size();
    }

    public String convertirABinario(int numero) {
        return Integer.toBinaryString(numero);
    }

    public String convertirAHexadecimal(int numero) {
        return Integer.toHexString(numero).toUpperCase();
    }

    public String jugarPiedraPapelTijeraLagartoSpock(String eleccionUsuario) {
        String eleccionPC = "Piedra"; 
        if (eleccionUsuario.equalsIgnoreCase(eleccionPC)) return "Empate";
        if (eleccionUsuario.equalsIgnoreCase("Piedra")) {
            if (eleccionPC.equals("Tijera") || eleccionPC.equals("Lagarto")) return "Ganaste";
        } else if (eleccionUsuario.equalsIgnoreCase("Papel")) {
            if (eleccionPC.equals("Piedra") || eleccionPC.equals("Spock")) return "Ganaste";
        } else if (eleccionUsuario.equalsIgnoreCase("Tijera")) {
            if (eleccionPC.equals("Papel") || eleccionPC.equals("Lagarto")) return "Ganaste";
        } else if (eleccionUsuario.equalsIgnoreCase("Lagarto")) {
            if (eleccionPC.equals("Spock") || eleccionPC.equals("Papel")) return "Ganaste";
        } else if (eleccionUsuario.equalsIgnoreCase("Spock")) {
            if (eleccionPC.equals("Tijera") || eleccionPC.equals("Piedra")) return "Ganaste";
        }
        return "Perdiste";
    }

    public String pptls2(String game[]) {
        String p1 = game[0];
        String p2 = game[1];
        if (p1.equals(p2)) return "Empate";
        if (p1.equals("S")) { 
            if (p2.equals("P") || p2.equals("L")) return "Player 1";
        } else if (p1.equals("P")) { 
            if (p2.equals("R") || p2.equals("V")) return "Player 1";
        } else if (p1.equals("R")) { 
            if (p2.equals("L") || p2.equals("S")) return "Player 1";
        } else if (p1.equals("L")) { 
            if (p2.equals("V") || p2.equals("P")) return "Player 1";
        } else if (p1.equals("V")) { 
            if (p2.equals("S") || p2.equals("R")) return "Player 1";
        }
        return "Player 2";
    }

    public double areaCirculo(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    public String zoodiac(int day, int month) {
        if (day < 1 || month < 1 || month > 12) return "Invalid Date";
        int[] diasMes = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (day > diasMes[month]) return "Invalid Date";

        if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) return "Acuario";
        if ((month == 2 && day >= 19) || (month == 3 && day <= 20)) return "Piscis";
        if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) return "Aries";
        if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) return "Tauro";
        if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) return "Geminis";
        if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) return "Cancer";
        if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) return "Leo";
        if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) return "Virgo";
        if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) return "Libra";
        if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) return "Escorpio";
        if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) return "Sagitario";
        return "Capricornio";
    }
}