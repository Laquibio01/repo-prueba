public class General {
    
    String punta, color, material, tipo;
    int tamaño, propiedad;
    
    public void datos(String punta, String color, String material, 
                      String tipo, int tamaño, int propiedad){
    this.punta = punta;
    this.color = color;
    this.material = material;
    this.tipo = "El "+tipo;
    this.tamaño = tamaño;
    this.propiedad = propiedad;
    }
        
    
    public void escribir(){
        System.out.println("Cambio en mi propio repositorio");
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
    public void material(){
        System.out.println("Las propiedades del material son: " + propiedad);
    }
    
}