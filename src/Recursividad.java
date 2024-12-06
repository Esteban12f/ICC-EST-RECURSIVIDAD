public class Recursividad {
    
    public int factorial(int n){
        System.out.println("Calculando el factorial de " + n);
        if (n == 0 || n == 1){
            System.out.println("Caso base alcanzado, el factorial de" + n + "es = 1");
            return 1;
        }
        int resultado = n*factorial(n - 1);
        System.out.println("Resultado parcial para " + n + " * factorial("+ (n-1)+") = " + resultado);
        return resultado;
    }

    public int sumaNumerosConsecutivos(int n){
        if(n == 1){
            return 1;
        }
        return n + sumaNumerosConsecutivos(n - 1);
    }

    public int potencia(int base, int exponente){
        if (exponente == 0) return 1;
        return base * potencia(base, exponente - 1);
    }

    public int sumaDigitos(int n){
        if (n < 10) return n;
        return (n % 10) + sumaDigitos(n / 10);
    }

    public int fibonacci(int n){
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
