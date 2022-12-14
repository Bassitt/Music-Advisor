package advisor;

import java.util.Scanner;

/**
 * Advisor class. Here is the interface for communicating with the user.
 */
public class Advisor {

    public void start() {

        Service service = new Service();
        Scanner scanner = new Scanner(System.in);
        String[] query = scanner.nextLine().split(" ");
        while (!query[0].equals("exit")) {
            switch (query[0]) {
                case ("auth") -> service.setAuthorization();
                case ("new") -> System.out.println(service.getReleases());
                case ("featured") -> System.out.println(service.getFeatured());
                case ("categories") -> System.out.println(service.getCategories());
                case ("playlists") -> {
                    StringBuilder category = new StringBuilder();
                    for (int i = 1; i < query.length; i++) {
                        category.append(query[i]).append(" ");
                    }
                    System.out.println(service.getPlaylists(category.toString().trim()));
                }
            }
            query = scanner.nextLine().split(" ");
        }
    }
}