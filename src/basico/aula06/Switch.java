package basico.aula06;

public class Switch {
    public static void main(String[] args) {
        int dia = 7;
        switch (dia) {
            case 1:
                System.out.println("domingo, fim de semana ");
                break;
            case 2:
                System.out.println("segunda, dia utíl");
                break;
            case 3:
                System.out.println("terça, dia utíl");
                break;
            case 4:
                System.out.println("quarta, dia utíl");
                break;
            case 5:
                System.out.println("quinta, dia utíl");
                break;
            case 6:
                System.out.println("sexta, dia utíl");
                break;
            case 7:
                System.out.println("sabado, final de semana");
                break;
            default:
                System.out.println("opção invalida");
                break;
        }

    }
}
