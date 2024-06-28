public class General {
    
    String punta, color, material, tipo;
    int tamaño;
    
    public void datos(String punta, String color, String material, 
                      String tipo, int tamaño){
    this.punta = punta;
    this.color = color;
    this.material = material;
    this.tipo = "El "+tipo;
    this.tamaño = tamaño;
    }
    
    public static void main(String[] args) {
        System.out.println("kjjlkjdsa");
    }
    
    public void escribir(){
        
    }
    public void pintar(){
        System.out.println(tipo+"Escribe de forma increible por su color " +color);
    }
    public void sub(){
        System.out.println(tipo+"Marca tan elegante por su " +material);
    }
    public void dibujar(){
        System.out.println(tipo+"");
    }
    public void borrar(){
        System.out.println(tipo+"");
    }
    
}