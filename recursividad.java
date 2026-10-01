public class Recursividad {

// 1. Suma de números del 1 al N
public int suma(int n) {
if (n == 1) {
return 1;
} else {
return n + suma(n - 1);
}
}

// 2. Fibonacci
public int fibonacci(int n) {
if (n == 0) {
return 0;
}
if (n == 1) {
return 1;
}
return fibonacci(n - 1) + fibonacci(n - 2);
}

// 3. Potencia
public int potencia(int base, int exponente) {
if (exponente == 0) {
return 1;
} else {
return base * potencia(base, exponente - 1);
}
}

// 4. Recorrer un String al revés
public String invertir(String texto) {
if (texto.length() <= 1) {
return texto;
} else {
return texto.charAt(texto.length() - 1)
+ invertir(texto.substring(0, texto.length() - 1));
}
}

public static void main(String[] args) {
Recursividad r = new Recursividad();

System.out.println("Suma 1..5: " + r.suma(5)); // 15
System.out.println("Fibonacci(6): " + r.fibonacci(6)); // 8
System.out.println("2^4: " + r.potencia(2, 4)); // 16
System.out.println("Hola al revés: " + r.invertir("Hola")); // aloH
}
}