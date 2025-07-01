package java8.optional;

import java.util.Optional;

class UserService {
    public Optional<String> findUserByName(String name) {
        if ("Riyaz".equalsIgnoreCase(name)) {
            return Optional.of("Riyaz");
        } else {
            return Optional.empty();
        }
    }
}

public class OptionalMain {
    public static void main(String[] args) {
        UserService userService = new UserService();
        Optional<String> user = userService.findUserByName("Riyaz");
        if(user.isPresent()){
            System.out.println(user.get());
        }else{
            System.out.println("Not Found");
        }
    }
}
