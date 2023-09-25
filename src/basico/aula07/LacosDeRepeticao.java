package basico.aula07;

public class LacosDeRepeticao {
    public static void main (String[] args){

        for (int i= 0 ;i<1000000;i++){
            if(i%2 == 0){
                System.out.println("for: "+i);
            }
        }

        int j = 0;

        while(j<10){
            System.out.println("while "+j);
            j++;
        }
        int k=0;
        do{
            System.out.println("do while "+k);
            k++;
        }while(k<10);
    }
}
