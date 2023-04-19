package atividadedesign;

public class Main {
     
    public static void main(String[] args) {
        Hamburguer burguer = new Hamburguer("100.00", "x-suculento", "19.00"); 
        Sobremesa sobremesa = new Sobremesa("Grande", "sunday", "10.00"); 
        Bebida bebida = new Bebida ("500.00", "coca-cola", "15.00"); 
        
    	
        Combo combo = new Combo(burguer, sobremesa, bebida);
        System.out.println(combo);
    }

}
