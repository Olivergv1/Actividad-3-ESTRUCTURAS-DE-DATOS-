class Caramelo {
    //Atributos del caramelo
    private String color;
    private String representante;
    private String figura;

    public Caramelo(String color, String representante, String figura) {
        //Inicializa los atributos con los valores al crear un nuevo caramelo
        this.color = color;
        this.representante = representante;
        this.figura = figura;
    }

        //Metodo para obtener el color del caramelo
    public String getColor() {
        return color;
    }

        //Metodo para obtener el representante del color del caramelo
    public String getRepresentante() {
        return representante;
    }
        
        //Metodo para obtener el la figura especifica del caramelo
    public String getFigura() {
        return figura;
    }

        //Metodo toString que devuelve una representacion en cadena del caramelo 
    public String toString() {
        return "Caramelo{" +
                "color='" + color + '\'' +
                ", representante='" + representante + '\'' +
                ", figura='" + figura + '\'' +
                '}';
    }
}
