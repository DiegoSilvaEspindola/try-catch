import java.util.Scanner;

public class Main {
    public static void main(String arg[]){
        Scanner teclado = new Scanner(System.in);
        int n1, n2 ;
        int resultado = 0 ;

        System.out.println("digite o primeiro numero");
        n1= teclado.nextInt();
        System.out.println("digite segundo numero");
        n2= teclado.nextInt();

        try{
            resultado = n1 / n2;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println(resultado);
        }



    }
}
