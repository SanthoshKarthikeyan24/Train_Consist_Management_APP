package Main;

import java.util.ArrayList;
import java.util.List;

public class Train_Consist_Management_APP {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");
        System.out.println();

        // Initialize empty train consist
        List<String> trainConsist = new ArrayList<>();

        // Display initial details
        System.out.println("Train initialized successfully...");
        System.out.println("Initial Bogie Count : " + trainConsist.size());
        System.out.println("Current Train Consist : " + trainConsist);
        System.out.println();

        // Ready message
        System.out.println("System ready for operations...");
    }
}