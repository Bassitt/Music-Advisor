package advisor;

/**
 * The engine of the advisor. Here are all the methods of work.
 */
public class Service {
    boolean isAuthorised = false;
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

    public void setAuthorization() {
        Authorisation authorisation = new Authorisation();
        authorisation.getAccessCode();
        authorisation.getAccessToken();
        this.isAuthorised = true;
    }

    public String getReleases() {
        if (isAuthorised) {
            return "---NEW RELEASES---\n" + releases;
        } else {
            return "Please, provide access for application.";
        }
    }

    public String getFeatured() {
        if (isAuthorised) {
            return "---FEATURED---\n" + featured;
        } else {
            return "Please, provide access for application.";
        }
    }

    public String getCategories() {
        if (isAuthorised) {
            return "---CATEGORIES---\n" + categories;
        } else {
            return "Please, provide access for application.";
        }
    }

    public String getPlaylists() {
        if (isAuthorised) {
            return "---MOOD PLAYLISTS---\n" + playlists;
        } else {
            return "Please, provide access for application.";
        }
    }
}