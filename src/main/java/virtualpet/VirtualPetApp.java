package virtualpet;

import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		VirtualPet daveCat = new VirtualPet(30, 20, 35, 15);
		System.out.println("Dave the cat");
		System.out.println("Hunger: " + daveCat.getHunger());
		System.out.println("Thirst: " + daveCat.getThirst());
		System.out.println("Energy: " + daveCat.getEnergy());
		System.out.println("Sickness: " + daveCat.getSickness());
		System.out.println("");
		System.out.println("What would you like to do?");
		System.out.println("1. Give Dave some food");
		System.out.println("2. Give Dave some water");
		System.out.println("3. Play with Dave");
		System.out.println("4. Give Dave some medicine");
		System.out.println("5. Quit the game");
		String playerChoice = input.nextLine();

		while (!playerChoice.contentEquals("5")) {

			VirtualPet.tick();

			if (playerChoice.contentEquals("1")) {
				System.out.println("You gave Dave some cat food!");
				daveCat.reduceHunger(60);
				input.nextLine();
			} else if (playerChoice.contentEquals("2")) {
				System.out.println("You gave Dave some water!");
				daveCat.reduceThirst(65);
				input.nextLine();
			} else if (playerChoice.contentEquals("3")) {
				System.out.println("You gave Dave a toy to play with!");
				daveCat.reduceEnergy(55);
				input.nextLine();
			} else if (playerChoice.contentEquals("4")) {
				System.out.println("You gave Dave some medicine!");
				daveCat.reduceSickness(50);
				input.nextLine();
			} else {
				System.out.println("Goodbye!");
				System.exit(0);
			}
			System.out.println("Dave the cat");
			System.out.println("Hunger: " + daveCat.getHunger());
			System.out.println("Thirst: " + daveCat.getThirst());
			System.out.println("Energy: " + daveCat.getEnergy());
			System.out.println("Sickness: " + daveCat.getSickness());
			System.out.println("");
			System.out.println("What would you like to do?");
			System.out.println("1. Give Dave some food");
			System.out.println("2. Give Dave some water");
			System.out.println("3. Play with Dave");
			System.out.println("4. Give Dave some medicine");
			System.out.println("5. Quit the game");
			playerChoice = input.nextLine();
		}
		input.close();
	}

}
