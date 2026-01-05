package com.zoo.reports;

import com.zoo.animals.Animal;
import java.util.List;

public class ReportGenerator {
    public void generateReport(List<Animal> animals) {
        System.out.println("Отчет по зверям");
        System.out.println("Всего: " + animals.size());
        System.out.println("\nРасписание:");
        for (Animal animal : animals) {
            System.out.println("- " + animal.getName() + " (" + animal.getSpecies() + 
                             "): " + animal.getFoodType());
        }
        System.out.println("\nЖивотные:");
        for (Animal animal : animals) {
            System.out.println("- " + animal.getName() + ", " + animal.getSpecies() + 
                             ", Возраст: " + animal.getAge());
        }
    }
}

