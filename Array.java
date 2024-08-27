import java.util.Random;

public class Array {
    public static void main(String[] args) {
        // Crear un arreglo de 1000 elementos
        int[] randomArray = new int[1000];
        
        // Instanciar un objeto de la clase Random
        Random rand = new Random();
        
        // Llenar el arreglo con números aleatorios
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = rand.nextInt(); // Genera un número aleatorio
        }
        
        // Imprimir el arreglo (opcional)
        for (int num : randomArray) {
            System.out.println(num);
        }
    }
}
