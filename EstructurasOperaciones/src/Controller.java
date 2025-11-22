public class Controller {
    //Guardar
    String [] correos = new String[5];
    public boolean metodoAnadir(String correo){
        for (int i = 0; i < correo.length(); i++) {
            if (correos[i] == null){
                correos[i] = correo;
                return true;
            }
        }return false;

    }
    public void metodosListar(){
        for(String email: correos){
            System.out.println(email);
        }

    }
    public void metodosBuscar(String email){
        for (int i = 0; i < correos.length; i++) {
            if (correos[i] != null && correos[i].equals(email)){
                System.out.println("Correo encontrado en la agenda, está en la posicion " + (i +1));
                break;
            }
        }

    }
}
