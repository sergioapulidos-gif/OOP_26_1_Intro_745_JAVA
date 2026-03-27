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

    // Método que suma dos números enteros
    public int sumarDosNumeros(int a, int b) {
        return a+b;
    }

    // Método que encuentra el mayor de tres números enteros
    public int mayorDeTresNumeros(int a, int b, int c) {
        if (a >= b && a >= c) return a;
        if (b >= c) return b;
        return c;
    }

    // Método que retorna la tabla de multiplicar de un número
    public int[] tablaMultiplicar(int numero, int limite) {
        int[] tabla = new int[limite];
        for (int i = 0; i < limite; i++) {
            tabla[i] = numero * (i + 1);
        }
        return tabla;
    }

    // Método que calcula el factorial de un número entero
    public int factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("Numero negativo");
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res = res * i;
        }
        return res;
    }

    // Método que verifica si un número es primo
    public boolean esPrimo(int numero) {
        if (numero <= 1) return false;
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }

    // Método que genera una serie de Fibonacci
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

    // Método que suma todos los elementos de un arreglo
    public int sumaElementos(int[] arreglo) {
        int suma = 0;
        for (int i = 0; i < arreglo.length; i++) {
            suma = suma + arreglo[i];
        }
        return suma;
    }

    // Método que calcula el promedio de los elementos de un arreglo
    public double promedioElementos(int[] arreglo) {
        if (arreglo.length == 0) return 0.0;
        double suma = 0;
        for (int i = 0; i < arreglo.length; i++) {
            suma = suma + arreglo[i];
        }
        return suma / arreglo.length;
    }

    // Método que encuentra el elemento mayor en un arreglo
    public int encontrarElementoMayor(int[] arreglo) {
        int mayor = arreglo[0];
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] > mayor) {
                mayor = arreglo[i];
            }
        }
        return mayor;
    }

    // Método que encuentra el elemento menor en un arreglo
    public int encontrarElementoMenor(int[] arreglo) {
        int menor = arreglo[0];
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] < menor) {
                menor = arreglo[i];
            }
        }
        return menor;
    }

    // Método que busca un elemento en un arreglo
    public boolean buscarElemento(int[] arreglo, int elemento) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == elemento) return true;
        }
        return false; 
    }

    // Método que invierte un arreglo
    public int[] invertirArreglo(int[] arreglo) {
        int[] invertido = new int[arreglo.length];
        for (int i = 0; i < arreglo.length; i++) {
            invertido[i] = arreglo[arreglo.length - 1 - i];
        }
        return invertido;
    }

    // Método que ordena un arreglo en orden ascendente
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

    // Método que elimina los duplicados de un arreglo
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

    // Método que combina dos arreglos en uno solo
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

    // Método que rota un arreglo n posiciones
    public int[] rotarArreglo(int[] arreglo, int posiciones) {
        int n = arreglo.length;
        if (n == 0) return arreglo;
        posiciones = posiciones % n;
        int[] rotado = new int[n];
        for (int i = 0; i < n; i++) {
            int nuevaPos = (i + (n - posiciones)) % n;
            rotado[nuevaPos] = arreglo[i];
        }
        return rotado;
    }

    // Método que cuenta los caracteres en una cadena
    public int contarCaracteres(String cadena) {
        return cadena.length();
    }

    // Método que invierte una cadena
    public String invertirCadena(String cadena) {
        String invertida = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            invertida = invertida + cadena.charAt(i);
        }
        return invertida;
    }

    // Método que verifica si una cadena es un palíndromo
    public boolean esPalindromo(String cadena) {
        cadena = cadena.toLowerCase();
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

    // Método que cuenta el número de palabras en una cadena
    public int contarPalabras(String cadena) {
        if (cadena == null || cadena.length() == 0) return 0;
        int contador = 0;
        boolean esPalabra = false;
        int finDeCadena = cadena.length() - 1;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) != ' ') {
                if (!esPalabra) {
                    contador++;
                    esPalabra = true;
                }
            } else {
                esPalabra = false;
            }
        }
        return contador;
    }

    // Método que convierte una cadena a mayúsculas
    public String convertirAMayusculas(String cadena) {
        return cadena.toUpperCase();
    }

    // Método que convierte una cadena a minúsculas
    public String convertirAMinusculas(String cadena) {
        return cadena.toLowerCase();
    }

    // Método que reemplaza una subcadena en una cadena por otra subcadena
    public String reemplazarSubcadena(String cadena, String antiguaSubcadena, String nuevaSubcadena) {
        return cadena.replace(antiguaSubcadena, nuevaSubcadena);
    }

    // Método que busca una subcadena en una cadena y retorna su índice
    public int buscarSubcadena(String cadena, String subcadena) {
        int n = cadena.length();
        int m = subcadena.length();
        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (cadena.charAt(i + j) != subcadena.charAt(j)) {
                    break;
                }
            }
            if (j == m) return i;
        }
        return -1;
    }

    // Método que valida un correo electrónico
    public boolean validarCorreoElectronico(String correo) {
        boolean tieneArroba = false;
        boolean tienePunto = false;
        for (int i = 0; i < correo.length(); i++) {
            if (correo.charAt(i) == '@') tieneArroba = true;
            if (correo.charAt(i) == '.') tienePunto = true;
        }
        return tieneArroba && tienePunto;
    }

    // Método que calcula el promedio de una lista de números

    public double promedioLista(List<Integer> lista) {
        if (lista.size() == 0) return 0.0;
        double suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            suma = suma + lista.get(i);
        }
        return suma / lista.size();
    }

    // Método que convierte un número en su representación binaria
    public String convertirABinario(int numero) {
        if (numero == 0) return "0";
        String binario = "";
        while (numero > 0) {
            int residuo = numero % 2;
            binario = residuo + binario;
            numero = numero / 2;
        }
        return binario;
    }

    // Método que convierte un número en su representación hexadecimal
    public String convertirAHexadecimal(int numero) {
        if (numero == 0) return "0";
        String hexadecimal = "";
        char[] caracteresHex = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        
        while (numero > 0) {
            int residuo = numero % 16;
            hexadecimal = caracteresHex[residuo] + hexadecimal;
            numero = numero / 16;
        }
        return hexadecimal;
    }

    // Método para el juego de piedra, papel, tijera, lagarto, Spock
    public String jugarPiedraPapelTijeraLagartoSpock(String eleccionUsuario) {
        String eleccionPC = "Piedra"; 
        if (eleccionUsuario.equals(eleccionPC)) return "Empate";
        if (eleccionUsuario.equals("Piedra")) {
            if (eleccionPC.equals("Tijera") || eleccionPC.equals("Lagarto")) return "Ganaste";
        } else if (eleccionUsuario.equals("Papel")) {
            if (eleccionPC.equals("Piedra") || eleccionPC.equals("Spock")) return "Ganaste";
        } else if (eleccionUsuario.equals("Tijera")) {
            if (eleccionPC.equals("Papel") || eleccionPC.equals("Lagarto")) return "Ganaste";
        } else if (eleccionUsuario.equals("Lagarto")) {
            if (eleccionPC.equals("Spock") || eleccionPC.equals("Papel")) return "Ganaste";
        } else if (eleccionUsuario.equals("Spock")) {
            if (eleccionPC.equals("Tijera") || eleccionPC.equals("Piedra")) return "Ganaste";
        }
        return "Perdiste";
    }

    public String pptls2(String game[]) {
        String p1 = game[0];
        String p2 = game[1];
        if (p1.equals(p2)) return "Empate";
        if (p1.equals("S")) { // Tijera
            if (p2.equals("P") || p2.equals("L")) return "Player 1";
        } else if (p1.equals("P")) { // Papel
            if (p2.equals("R") || p2.equals("V")) return "Player 1";
        } else if (p1.equals("R")) { // Piedra
            if (p2.equals("L") || p2.equals("S")) return "Player 1";
        } else if (p1.equals("L")) { // Lagarto
            if (p2.equals("V") || p2.equals("P")) return "Player 1";
        } else if (p1.equals("V")) { // Spock
            if (p2.equals("S") || p2.equals("R")) return "Player 1";
        }
        return "Player 2";
    }

    public double areaCirculo(double radio) {
        return 3.14159 * radio * radio;
    }

    public String zoodiac(int day, int month) {
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
        return "Capricornio"; // Por defecto si cae en fechas de fin/inicio de año
    }


}

