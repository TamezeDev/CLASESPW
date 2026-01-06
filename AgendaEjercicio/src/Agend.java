import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Agend {
    List<User> userList;

    public Agend(){
        userList = new ArrayList<>();
    }

    public void addUserToList(User user) {
        if (userList == null) {
            userList = new ArrayList<>();
        }
        userList.add(user);

    }

    public void searchUser(String dni) {
        if (userList == null) {
            System.out.println("La agenda está vacía");
            return;
        }
        boolean found = false;
        for (User user : userList) {
            if (user.getDni().equals(dni)) {
                System.out.println(user);
                break;
            }
            if (!found){
                System.out.println("El dni indicado no está en la agenda");
            }
        }
    }

    public void deleteUser(String dni) {
        if (userList == null) {
            System.out.println("La agenda está vacía");
            return;
        }
        if (userList.removeIf(new Predicate<User>() {
            @Override
            public boolean test(User user) {
                return user.getDni().equals(dni);
            }
        })) {
            System.out.println("Usuario eliminado correctamente");
        } else {
            System.out.println("El dni no se encuentra en la agenda");
        }

    }

    public void showAgend() {
        if (userList == null) {
            System.out.println("La agenda está vacía");
            return;
        }
        for (User user : userList) {
            System.out.println(user);
        }
    }

}
