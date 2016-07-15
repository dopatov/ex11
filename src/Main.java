public class Main {
//Mostrar la suma de los primeros 10 numeros impares

    public static void main(String[] args) {
        System.out.println("Hello World!");


        long producto=1;

        for (int i=1; i<20; i+=2){

            producto = i*producto;
        }
        System.out.println("el producto de los primeros impares es: " +producto);

    }
}
