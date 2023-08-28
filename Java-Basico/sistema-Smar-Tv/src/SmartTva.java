
/**
* <h1>SmathTva</h1>
* Simula funções básicas de uma Smarth - Tv .
* <p>
* <b>Note:</b> Leia atentamente a documentação desta classes
* para desfrutar dos recursos oferecidos pelo autor
*
* @author  Washington Pereira
* @version 1.0
* @since   25/08/2023
*/
public class SmartTva{
    boolean ligada = false;
    int canal =1;
    int volume =25;


    public void ligar(){
            ligada = true;
    }

    public void deligar(){
            ligada = false;
    }

    public void aumentarVolume(){
        volume++;
    }

    public void diminuirVolume(){
        volume--;
    }
}