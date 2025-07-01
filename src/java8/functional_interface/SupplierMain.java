package java8.functional_interface;

import java.util.Optional;
import java.util.function.Supplier;

public class SupplierMain {
    public static void main(String[] args) {
        Supplier<String> greetingSupplier = ()->"Hello Riyaz";
        System.out.println(greetingSupplier.get());

        Optional<String> cachedProfile = Optional.empty(); // Profile not yet loaded

        Supplier<String> profileLoader = () -> loadUserProfileFromDatabase();

        // Load profile only if not already available
        String profile = cachedProfile.orElseGet(profileLoader);

        System.out.println("User Profile: " + profile);
    }
    // Simulates a real, time-consuming database fetch
    public static String loadUserProfileFromDatabase() {
        System.out.println("Fetching profile from database...");
        return "Name: Riyaz, Role: Admin, Joined: 2021";
    }
}
