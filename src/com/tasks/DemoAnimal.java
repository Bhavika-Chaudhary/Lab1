package com.tasks;

public class DemoAnimal {
    public static void main() {
        Animal animal[] = new Animal[6];
        animal[0] = new Mammal("Oscar", 5, "Carnivora");
        animal[1] = new Dog("Star", 5, 18,"Carnivora","Golden retriever");
        animal[2] = new Bird("Sky", 2, 1, "White");
        animal[3] = new Pigeon("Tweety", 2, 1, "black", "homing pigeon" );
        animal[4] = new Fish("Nemo", 1, 3, "Mixed");
        animal[5] = new Blowfish("Bubbles", 2, 1);

        for (Animal a : animal) {
            System.out.println(a.toString());
            AnimalName.name(a.getName());
            System.out.println("Voice: " + a.getVoice());
            a.eat();
            a.move();
            System.out.println();
        }

        AnimalBehavior[] animalBehavior = new AnimalBehavior[]{
            new Dog("Jackey", 3, 15, "Carnivora", "Beagle"),
                    new Pigeon("Flappy", 1, 0, "Grey", "Homing Pigeon"),
                    new Blowfish("Flowy", 1, 1, "Yellow", 3)
        };

        for (int i = 0; i < animalBehavior.length; i++) {
            System.out.print("Behaviour index " + i + ": ");
            animalBehavior[i].sleep();
        }
    }
}
