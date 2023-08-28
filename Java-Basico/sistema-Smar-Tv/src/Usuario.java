/**
 * 
 * <h1>Usuário</h1>
 * <p>Simula um usuário controlando a Smart-Tv</p>
 * 
 * 
 * 
 * 
 * 
 * @author Washington Pereira
 * @Since 25/08/2023
 * @version 1.0 


*/


public class Usuario {
    
    public static void main(String[] args) {
        SmartTva smartTva = new SmartTva();
        System.out.println("Tv Ligada ? "+smartTva.ligada);
        System.out.println("Canala Atual: " +smartTva.canal);
        System.out.println("Volume:" +smartTva.volume);


        smartTva.ligar();   
        System.out.println("Novo Status ? -> Tv Ligada"+smartTva.ligada);
        smartTva.aumentarVolume();
        System.out.println("Volume Atual:" + smartTva.volume);
        smartTva.deligar();
        System.out.println(("Novo Status ? -> Tv Ligada"+smartTva.ligada)); 
    }


    
}
