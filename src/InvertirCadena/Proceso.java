package InvertirCadena;
public class Proceso {
   private String Caf="";
   char let;
   public void Voltear (String a){
       Imprimir ob;
       setCaf("");
       for(int i=a.length()-1;i>=0;i--){
       let=a.charAt(i);       
       setCaf(getCaf()+let);
       }
       ob=new Imprimir(a);
       System.out.println("Tu palabra invertida es:"+getCaf());
   } 
    public String getCaf() {
        return Caf;
    }
    public void setCaf(String Caf) {
        this.Caf=Caf;
    }
}
