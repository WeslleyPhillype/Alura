import java.util.Scanner;

public class PatinhoXuxa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o número inicial de patinhos: ");
        int numeroPatinhos = scanner.nextInt();
        
        while (numeroPatinhos > 0) {
            System.out.println(numeroPatinhos + " patinhos foram passear");
            System.out.println("Além das montanhas");
            System.out.println("Para brincar");
            System.out.println("A mamãe gritou: Quá, quá, quá, quá");
            
            numeroPatinhos--;
            
            if (numeroPatinhos > 0) {
                System.out.println("Mas só " + numeroPatinhos + " patinhos voltaram de lá.");
            } else {
                System.out.println("E os n patinhos voltaram de lá.");
            }
            
            System.out.println();
        }
        
        System.out.println("A mamãe patinha foi procurar");
        System.out.println("Além das montanhas");
        System.out.println("Na beira do mar");
        System.out.println("A mamãe gritou: Quá, quá, quá, quá");
        System.out.println("E os " + numeroPatinhos + " patinhos voltaram de lá.");
    }
}
