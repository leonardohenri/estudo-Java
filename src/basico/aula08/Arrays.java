package basico.aula08;

public class Arrays {
    public static void main(String[] args) {
        int[] idades = new int[3];
        idades[0] = 123;
        idades[1] = 44;
        idades[2] = 23;

        char[] caracteres = new char[]{'A', 'B', 'C'};
        for (int i = 0; i < idades.length; i++) {
            System.out.println(idades[i]);
        }
        //foreach
        for (char carac : caracteres) {
            System.out.println(carac);
        }
        // Arrays multidimensionais
        int[][] number = new int[2][];
        number[0] = new int[2];
        number[1] = new int[4];

        number[0][0] = 22;
        number[0][1] = 25;
        number[1][0] = 33;
        number[1][1] = 65;
        number[1][2] = 165;
        number[1][3] = 235;
        System.out.println("_____________Arrays multidimensionais______________");
        for (int[] num : number) {
            System.out.println("array do endereço " + num);
            for (int numero : num) {
                System.out.println(numero);
            }
        }

    }

}
