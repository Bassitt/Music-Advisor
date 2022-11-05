package advisor;

import java.util.Scanner;

/**
 * Advisor class. Here is the interface for communicating with the user.
 */
public class Advisor {

    public void start() {

        Service service = new Service();
        PrintPage printPage = new PrintPage(Main.PAGE);
        Scanner scanner = new Scanner(System.in);
        String[] query = scanner.nextLine().split(" ");
        while (!query[0].equals("exit")) {
            switch (query[0]) {
                case ("auth") -> service.setAuthorization();
                case ("new") -> printPage.print(service.getReleases());
                case ("featured") -> printPage.print(service.getFeatured());
                case ("categories") -> printPage.print(service.getCategories());
                case ("playlists") -> {
                    StringBuilder category = new StringBuilder();
                    for (int i = 1; i < query.length; i++) {
                        category.append(query[i]).append(" ");
                    }
                    printPage.print(service.getPlaylists(category.toString().trim()));
                }
                case ("next") -> printPage.printNext();
                case ("prev") -> printPage.printPrev();
            }
            query = scanner.nextLine().split(" ");
        }
    }
}