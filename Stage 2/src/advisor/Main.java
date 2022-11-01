package advisor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();
        Scanner scanner = new Scanner(System.in);
        String query = scanner.nextLine();
        while(!query.equals("exit")) {
            switch (query) {
                case ("auth") -> {
                    System.out.println("https://accounts.spotify.com/authorize?client_id=30a4442eea954024b600f184843378ed&redirect_uri=http://localhost:8080&response_type=code");
                    System.out.println(service.setAuthorization(true));
                }
                case ("new") -> System.out.println(service.getReleases());
                case ("featured") -> System.out.println(service.getFeatured());
                case ("categories") -> System.out.println(service.getCategories());
                case ("playlists Mood") -> System.out.println(service.getPlaylists());
            }
            query = scanner.nextLine();
        }
        service.setAuthorization(false);
        System.out.println("---GOODBYE!---");
    }
}
