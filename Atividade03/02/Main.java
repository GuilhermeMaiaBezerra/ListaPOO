public class Main{
    public static void main(String[] args){

        for(int i = 1; i <= 100; i++){

            int resto = i % 2;
            System.out.print(i);

            if(resto == 0){
                System.out.println(" é um número par");
            }
            else{
                System.out.println(" é um número impar");
            }
            
        }
    }
}