class Pila {
    private Nodo cima;              // Cima de la pila
    private int tamanio;            // Tamaño de la pila
    
    private static class Nodo {     // Clase para implementar los nodos de la lista enlazada 
        Caramelo caramelo;
        Nodo siguiente;

        public Nodo(Caramelo caramelo) {
            this.caramelo = caramelo;
            this.siguiente = null;
        }
    }

    // Constructor de la clase pila
    public Pila() {
        this.cima = null;   // se indica que inicialmente la pila está vacía
        this.tamanio =0;   // se indica que inicialmente la pila tiene tamaño cero
    }

    // Método que comprueba si la pila no tiene elementos.
    public boolean pilaVacia() {
        return cima == null;
    }

    // Método que comprueba si la pila está llena y establece el tamañod de la pila (solo para la practica ya que al ser dinámica  no hay un tamaño fijo predeterminado y la pila puede seguir creciendo según sea necesario.
    public boolean pilaLlena() {
        int limiteMaximo = 5;
        return tamanio >= limiteMaximo;  //siempre devolverá "false" ya que  la pila puede seguir creciendo según sea necesario.
    }
    
    // Método para agregar un elemento en la cima de la pila
    public void push(Caramelo caramelo) {
        Nodo nuevoNodo = new Nodo(caramelo);  // Crea un nuevo nodo con el caramelo
        nuevoNodo.siguiente = cima;           // Establece el siguiente nodo como la cima actual
        cima = nuevoNodo;                     // Se actualiza la cima para el nuevo nodo                                      
        tamanio++;                            // Incrementa el tamaño de la pila
    }

    // Método para eliminar o quitar el elemento que se encuentra en la cima de la pila 
    public Caramelo pop() {
        if (pilaVacia()) {
            return null;    // Si la pila está vacía, no habrá elementos para extraer
        }
        Caramelo caramelo = cima.caramelo;  // Obtiene el caramelo de la cima actual
        cima = cima.siguiente;              // Se actualiza la cima para el nuevo nodo
        tamanio--;                          // Decrementa el tamaño de la pila
        return caramelo;
    }

    // Método para obtener el elemento en la cima de la pila sin extraerlo
    public Caramelo cima() {
        return pilaVacia() ? null : cima.caramelo;
    }
    
    // Método para obtener el tamaño actual de la pila
    public int tamaño() {
        return tamanio;
    }

    // Método para limpiar la pila, eliminando todos los elementos 
    public void limpiar() {
        cima = null;    // Se establece la cima como null para vaciar la pila
        tamanio = 0;    // y se reinicia el tamaño a cero
    }

    // Método para mostrar el estado actual de la pila 
    public void mostrarPila() {
        Nodo actual = cima;
        System.out.println("Pila:");
        while (actual != null) {
            System.out.println(actual.caramelo);
            actual = actual.siguiente;
        }
    }
}
