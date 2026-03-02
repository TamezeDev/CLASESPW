package model;

public enum Categoria {
    ALIMENTICIOS(),  //constructor vacio por defe
    MUEBLES("Esta categoria es de mueble para decorar"),
    ROPA(),
    TECNOLOGICO("Esta categoria marca productos de ultima generacion");
    private String descripcion;
    Categoria(){}
    Categoria(String descripcion){
        this.descripcion= descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
