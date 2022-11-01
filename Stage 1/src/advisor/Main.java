package advisor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String query = scanner.nextLine();
        while(!query.equals("exit")) {
            switch (query) {
                case ("new") -> {
                    System.out.println("---NEW RELEASES---");
                    System.out.println("""
                            Mountains [Sia, Diplo, Labrinth]
                            Runaway [Lil Peep]
                            The Greatest Show [Panic! At The Disco]
                            All Out Life [Slipknot]""");
                }
                case ("featured") -> {
                    System.out.println("---FEATURED---");
                    System.out.println("""
                            Mellow Morning
                            Wake Up and Smell the Coffee
                            Monday Motivation
                            Songs to Sing in the Shower""");
                }
                case ("categories") -> {
                    System.out.println("---CATEGORIES---");
                    System.out.println("""
                            Top Lists
                            Pop
                            Mood
                            Latin""");
                }
                case ("playlists Mood") -> {
                    System.out.println("---MOOD PLAYLISTS---");
                    System.out.println("""
                            Walk Like A Badass \s
                            Rage Beats \s
                            Arab Mood Booster \s
                            Sunday Stroll""");
                }
            }
            query = scanner.nextLine();
        }
        System.out.println("---GOODBYE!---");
    }
}
