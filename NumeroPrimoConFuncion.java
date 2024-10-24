//Se trata de un programa que pide un número por teclado y luego dice si el número introducido es o no es primo.

public class NumeroPrimoConFuncion {

    public static void main(String[] args){

        System.out.println("Introduzca un número entero positvio");
        int n = Integrer.parseInt(System.console().readLine());

        if(EsPrimo){
            System.out.println ("El " + n + " es primo.");
        }
        else{
            System.out.println ("El " + n + " no es primo.");
        }
    }

    

    public static boolean EsPrimo(in x){
        for (int i = 2; i < x; i++){
            if((x % i) == 0){
                return false;
            }
        }
        return true;
    }
    
}
