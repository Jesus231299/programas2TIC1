
package Raices;


public class Control {
    char letra;
    
    public Control(char letra){
        opcion(letra);
        
    }
        
     public void opcion (char letra){
         switch (letra) {
            case 'a':
                System.out.println(" LA RAIZ CUIBICA ES ");

                break;
            case 'b':
                System.out.println(" LA POTENCIA ES ");

                break;
            case 'c':
                System.out.println(" LA RAIZ CUADRADA ES ");

                break;
         }
    }
}
