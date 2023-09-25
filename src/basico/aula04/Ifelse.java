package basico.aula04;

public class Ifelse {
    public static void main (String[] args){
        int valor= 1;
        int valor2 = 1;
        boolean isTrue = true;
        boolean isFalse = false;

        if(isTrue){
            System.out.println("isTrue é verdadeiro!");
        }

        if(valor == valor2){
            System.out.println("valor == valor2 são iguais!");
        }

        if (isFalse){

        }else{
            System.out.println("isFalse: valor falso");
        }
        if (!isFalse){
            System.out.println("!isFalse: valor é verdadeiro");
        }


    }
}
