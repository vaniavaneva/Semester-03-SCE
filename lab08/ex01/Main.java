package lab08.ex01;

import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<String, Trainer> trainers = new LinkedHashMap<>();

        String input;
        while (!(input = in.nextLine()).equals("Tournament")) {
            try {
                String[] data = input.split(" ");
                String trainerName = data[0];
                String pokemonName = data[1];
                String element = data[2];
                int health = Integer.parseInt(data[3]);

                trainers.putIfAbsent(trainerName, new Trainer(trainerName));
                trainers.get(trainerName).addPokemon(new Pokemon(pokemonName, element, health));
            } catch (Exception e) {
                System.out.println("Invalid input line: " + input);
            }
        }

        while (!(input = in.nextLine()).equals("End")) {
            String element = input;
            for (Trainer trainer : trainers.values()) {
                trainer.processTournament(element);
            }
        }

        trainers.values().stream()
                .sorted(Comparator.comparingInt(Trainer::getBadges).reversed())
                .forEach(System.out::println);

        in.close();
    }
}
