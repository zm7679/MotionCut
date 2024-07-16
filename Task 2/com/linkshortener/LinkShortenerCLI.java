package com.linkshortener;

import java.util.Scanner;

public class LinkShortenerCLI {
    public static void main(String[] args) {
        LinkShortener linkShortener = new LinkShortener();
        Scanner scanner = new Scanner(System.in);
        String command;

        while (true) {
            System.out.println("Enter command (shorten/expand/exit): ");
            command = scanner.nextLine();
            if (command.equals("exit")) {
                break;
            }

            switch (command) {
                case "shorten":
                    System.out.println("Enter long URL: ");
                    String longURL = scanner.nextLine();
                    String shortURL = linkShortener.shortenURL(longURL);
                    System.out.println("Shortened URL: " + shortURL);
                    break;
                case "expand":
                    System.out.println("Enter short URL: ");
                    shortURL = scanner.nextLine();
                    longURL = linkShortener.expandURL(shortURL);
                    System.out.println("Long URL: " + longURL);
                    break;
                default:
                    System.out.println("Invalid command. Please try again.");
            }
        }

        scanner.close();
    }
}
