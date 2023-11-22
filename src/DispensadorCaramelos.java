public class DispensadorCaramelos {
    public static void main(String[] args) {
        
        //Creacion de una pila para el dispensador de caramelos
        Pila dispensador = new Pila();   //se coloca la capacidad maxima de la pila

        //Se agrega caramelos al dispensador
        agregarCaramelo(dispensador,"verde", "Maestro Jed", "Yoda");
        agregarCaramelo(dispensador,"negro", "Imperio", "Storm Trooper A");
        agregarCaramelo(dispensador,"azul", "Jedi habil", "L. Skywalker");
        agregarCaramelo(dispensador,"rojo", "Maestro Sith", "Darth Vader");
        agregarCaramelo(dispensador,"blanco", "Rebelde", "Bail Organa");
        

        //Ejemplo de otro caramelo para superar la capacidad maxima y que se muestre el mensaje (La pila esta llena)
                                
        agregarCaramelo(dispensador,"YO XD", "Garces", "Oliver");


        // Muestra toda la pila      
        dispensador.mostrarPila();         

        // Operaciones de la pila
        System.out.println("Cima de la pila: " + dispensador.cima());
        System.out.println("Tamanio de la pila: " + dispensador.tamaño());
        
        //Extrae el caramelo de la cima y muestra al anterior como la nueva cima
        Caramelo carameloExtraido = dispensador.pop();
        System.out.println("Caramelo extraido: " + carameloExtraido);  
        
        //Muestra el estado actual de la pila despues de la extracion
        dispensador.mostrarPila();        

        // Limpiar la pila
        dispensador.limpiar();

        // Verificar si la pila está vacía 
        System.out.println("La pila esta vacia?: " + dispensador.pilaVacia());
        
        //Verifica si la pila esta llena
        System.out.println("La pila esta llena?: " + dispensador.pilaLlena ());

    }
    
    //Metodo para agregar un caramelo al dispensador verificando si la pila esta llena
    private static void agregarCaramelo(Pila pila, String color, String representante, String figura) {
        if (!pila.pilaLlena()) {
            pila.push(new Caramelo(color, representante, figura));
        } else {
            System.out.println("La pila esta llena. No se puede agregar mas caramelos.");
        }
    }
}
