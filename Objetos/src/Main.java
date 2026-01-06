import model.Coche;

public class Main {
    public static void main(String[] args) {
        //En todas las clases solo debe tener un método Main
        /*static -> Es un elemento accesible directamente
            Pertenece a la clase, no al Objeto(instancia de la clase)

            TIpos de variable:
                Primitivas-> wrapper  -> solo sirve para guardar un dato
                Complejas -> poniendo un . y tiene funciones adicionales

                Clases -> Molde de lo que será un objeto
                            Se escriben en Mayúscula y en singular
                            Contenido de las clases:
                            Variables -> aquellas que cualifican al futuro objeto
                            métodos -> aquellas funcionalidades que indican como puede trabajar el futuro objeto, constructor, getters y setters, métodos propios.
                                        toString ->  permite la representación por consola el objeto
                                        equal -> permite indicar como se compara este objeto.
                                        nuestros métodos -> funciones necesarias de la clase

                            Conceptos importantes:
                            - Abstracción -> hacer privada las variables propias
                            - Encapsulación ->
                            - Constructor -> En toda clase hay un constructor vacío por defecto
                                  Se sobrescribe si se define un constructor distinto
                                  **Puede tener tantos constructores como necesites pero con firma diferente;

                    instancia: crear una nueva clase de un tipo en una parte del código

        */
        Coche ford = new Coche("1234A", "AJSHDHDhhhsjjIAIA", "Ford", "Focus", "verde", 150);
        Coche opel = new Coche("6547V", "ALCBHSSJSKOAOAI", "Opel", "Astra", "rojo", 200);
        Coche mercedes = new Coche("Mercedes", "Vito", 25056);

        System.out.println(ford);

    }

}

