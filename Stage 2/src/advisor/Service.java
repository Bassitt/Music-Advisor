package advisor;

public class Service {
    boolean authorization = false;
    String releases = """
            Mountains [Sia, Diplo, Labrinth]
            Runaway [Lil Peep]
            The Greatest Show [Panic! At The Disco]
            All Out Life [Slipknot]""";
    String featured = """
            Mellow Morning
            Wake Up and Smell the Coffee
            Monday Motivation
            Songs to Sing in the Shower""";
    String categories = """
            Top Lists
            Pop
            Mood
            Latin""";
    String playlists = """
            Walk Like A Badass \s
            Rage Beats \s
            Arab Mood Booster \s
            Sunday Stroll""";

    public String setAuthorization(boolean authorization) {
        this.authorization = authorization;
        return "---SUCCESS---";
    }

    public String getReleases() {
        if (authorization) {
            return "---NEW RELEASES---\n" + releases;
        } else {
            return "Please, provide access for application.";
        }
    }

    public String getFeatured() {
        if (authorization) {
            return "---FEATURED---\n" + featured;
        } else {
            return "Please, provide access for application.";
        }
    }

    public String getCategories() {
        if (authorization) {
            return "---CATEGORIES---\n" + categories;
        } else {
            return "Please, provide access for application.";
        }
    }

    public String getPlaylists() {
        if (authorization) {
            return "---MOOD PLAYLISTS---\n" + playlists;
        } else {
            return "Please, provide access for application.";
        }
    }
}
