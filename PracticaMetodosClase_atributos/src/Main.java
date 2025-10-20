public class Main {
    public static void main(String[] args){
        System.out.println("Proyecto metodos");
/*        Operaciones operacionesMatematicas = new Operaciones();
        operacionesMatematicas.sumar(95,200);
        operacionesMatematicas.restar(100,50);*/
        Operaciones.sumar(3,3)    ;

        String data = "Laura";
        saludar("Maria");
        System.out.println("");
        saludar(data);
        despedir(data);
        saludar(Operaciones.testing);

    }

    public static void saludar(String name){
        System.out.println("Hola " + name);
        System.out.println("Encantado de saludarte, vamos a practicar");
        System.out.println("Vamos a practicar el llamado de metodos");
        System.out.println("Animo, no decaigas en tu tarea");
    }
    public static void despedir(String name){
        System.out.println("Adios, " + name);
    }
}
