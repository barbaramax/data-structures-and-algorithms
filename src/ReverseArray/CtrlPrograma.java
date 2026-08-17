

package ReverseArray;

import java.util.Scanner;

public class CtrlPrograma {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("quantos cursos pretende digitar: ");
        int cursos =  sc.nextInt();
        Curso[] vect = new Curso[cursos];
        for (int i = 0; i < cursos; i++) {
            System.out.print("Digite o codigo do Curso: ");
            int codigo = sc.nextInt();
            System.out.print("Digite o nome do curso: ");
            sc.nextLine();
            String nome = sc.nextLine();
            vect[i] = new Curso(codigo, nome);
        }

        for (int i = cursos - 1; i >= 0; i--) {
            System.out.println(vect[i]);
        }
        sc.close();
    }
}
