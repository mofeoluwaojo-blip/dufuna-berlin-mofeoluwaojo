package com.dufuna.berlin.mofeoluwaojo.practice;

// 1. java.lang is imported automatically! (No import statement needed for String, Integer, etc.)

// 2. java.util imports
import java.util.ArrayList;
import java.util.List;

// 3. java.io imports
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// 4. java.net imports
import java.net.URI;
import java.net.URISyntaxException;

// 5. java.nio imports
import java.nio.file.Files;
import java.nio.file.Path;

public class CorePackagesDemo {

    public static void main(String[] args) {
        System.out.println("=== 1. java.lang Demo ===");
        // String, Integer, Double, and Boolean live in java.lang
        String propertyName = "Lekki Duplex";
        Integer bedrooms = Integer.valueOf(4); // Wrapper class
        Double price = 85000000.50;
        Boolean isAvailable = Boolean.TRUE;

        System.out.println("Property: " + propertyName.toUpperCase()
                + " | Bedrooms: " + bedrooms
                + " | Available: " + isAvailable);

        System.out.println("\n=== 2. java.util Demo ===");
        // List and ArrayList live in java.util
        List<String> amenities = new ArrayList<>();
        amenities.add("Swimming Pool");
        amenities.add("24/7 Security");
        amenities.add("Fitted Kitchen");
        System.out.println("Amenities (" + amenities.size() + "): " + amenities);

        System.out.println("\n=== 3. java.io Demo ===");
        // Classic file creation and writing using java.io
        File ioFile = new File("property_summary.txt");
        try (FileWriter writer = new FileWriter(ioFile)) {
            writer.write("Property: " + propertyName + "\n");
            writer.write("Price: " + price + "\n");
            System.out.println("Wrote data using java.io.FileWriter to: " + ioFile.getName());
        } catch (IOException e) {
            System.out.println("IO Error: " + e.getMessage());
        }

        System.out.println("\n=== 4. java.net Demo ===");
        // Parsing and inspecting a web address using java.net
        try {
            URI listingUri = new URI("https://example.com/properties/lekki-duplex?bedrooms=4");
            System.out.println("Host: " + listingUri.getHost());
            System.out.println("Path: " + listingUri.getPath());
            System.out.println("Query: " + listingUri.getQuery());
        } catch (URISyntaxException e) {
            System.out.println("Invalid URI: " + e.getMessage());
        }

        System.out.println("\n=== 5. java.nio Demo ===");
        // Modern file reading using java.nio.file.Path and Files
        try {
            Path nioPath = Path.of("property_summary.txt");
            String fileContent = Files.readString(nioPath);
            System.out.println("Read back using java.nio.file.Files:\n" + fileContent.trim());

            // Clean up the temporary file
            Files.deleteIfExists(nioPath);
        } catch (IOException e) {
            System.out.println("NIO Error: " + e.getMessage());
        }
    }
}
