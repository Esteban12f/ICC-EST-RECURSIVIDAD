public class App {
    public static void main(String[] args) throws Exception {
        Recursividad rec = new Recursividad();
        
        System.out.println(rec.factorial(5));
        System.out.println(rec.sumaNumerosConsecutivos(5));
        System.out.println(rec.potencia(3, 3));
        System.out.println(rec.sumaDigitos(456));
        System.out.println(rec.fibonacci(8));
        
        RenombrarDirectorios rD = new RenombrarDirectorios();
        rD.renombrarDirectorios("src/directorios");
    }
}

