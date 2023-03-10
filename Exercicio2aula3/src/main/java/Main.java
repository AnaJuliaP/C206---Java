import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a nota da NP1");
        float NP1 = entrada.nextFloat();

        System.out.println("Digite a nota da NP2");
        float NP2 = entrada.nextFloat();

        float mediaNota = (NP1+NP2)/2;

        System.out.println("A media e: "+Math.round(mediaNota));
    }
}
