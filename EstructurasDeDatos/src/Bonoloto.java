import java.util.Scanner;

public class Bonoloto {
    int[] numerosSistema = new int[5];
    int[] numerosUsuario = new int[5];
    private int aciertos = 0;

    Scanner scanner = new Scanner(System.in);

    public void iniciarJuegi() {
        for (int i = 0; i < numerosSistema.length; i++) {
            numerosSistema[i] = (int) (Math.random() * 21);
        }
        System.out.println("Procedemos a sellar tu boleto");
        for (int i = 0; i < numerosUsuario.length; i++) {
            int numeroIntroducido;
            do {
                System.out.println("Introduce el numero con el que quieres jugar");
                numeroIntroducido = scanner.nextInt();
            } while (numeroIntroducido < 0 || numeroIntroducido > 20);
            numerosUsuario[i] = numeroIntroducido;
        }
        for (int numero : numerosUsuario) {
            buscaNumero(numero);
        }
    }

    public void listarNumeros() {
        System.out.println("Los numero del sistema son");
        for (int numero : numerosSistema) {
            System.out.println(numero);
        }
    }

    public void listarNumerosUsuario() {
        System.out.println("Los numero del usuario son");
        for (int numero : numerosUsuario) {
            System.out.println(numero);
        }
    }

    private void buscaNumero(int numeroUser) {
        for (int numero : numerosSistema) {
            if (numero == numeroUser) {
                aciertos++;
            }
        }
    }

    public void decirAciertos() {
        System.out.println("Has acertado " + aciertos + " numeros");
    }
}
