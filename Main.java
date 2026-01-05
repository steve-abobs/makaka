package com.zoo;

import com.zoo.animals.*;
import com.zoo.staff.*;
import com.zoo.reports.ReportGenerator;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Lion("Тигр", 5));
        animals.add(new Parrot("Попка", 3));
        animals.add(new Snake("Каа", 7));

        Keeper keeper = new Keeper("Иван");
        Veterinarian vet = new Veterinarian("Айболит");
        Cleaner cleaner = new Cleaner("Дженнифер");

        System.out.println("Животные процедуры\n");

        for (Animal animal : animals) {
            keeper.feed(animal);
            vet.checkHealth(animal);
            cleaner.clean(animal);
            System.out.println(animal.getName() + " говорит: " + animal.makeSound());
            System.out.println();
        }

        System.out.println("\nМедицинский осмотр для новых животных\n");
        Animal newLion = new Lion("Олег", 8);
        vet.checkHealth(newLion);
        vet.treat(newLion);
        animals.add(newLion);

        System.out.println("\n");
        ReportGenerator report = new ReportGenerator();
        report.generateReport(animals);
    }
}

