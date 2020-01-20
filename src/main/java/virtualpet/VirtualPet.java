package virtualpet;

public class VirtualPet {

	private static int hunger;
	private static int thirst;
	private static int energy;
	private static int sickness;

	public VirtualPet(int hunger, int thirst, int energy, int sickness) {

		this.hunger = hunger;
		this.thirst = thirst;
		this.energy = energy;
		this.sickness = sickness;
	}

	public int getHunger() {
		return hunger;
	}

	public int getThirst() {
		return thirst;
	}

	public int getEnergy() {
		return energy;
	}

	public int getSickness() {
		return sickness;
	}

	public void reduceEnergy(int activity) {
		if (energy >= activity) {
			energy -= activity;
		} else {
			energy = 0;
		}
	}

	public void reduceHunger(int food) {
		if (hunger >= food) {
			hunger -= food;
		} else {
			energy = 0;
		}
	}

	public void reduceThirst(int water) {
		if (thirst >= water) {
			thirst -= water;
		} else {
			thirst = 0;
		}
	}

	public void reduceSickness(int medicine) {
		if (sickness >= medicine) {
			sickness -= medicine;
		} else {
			sickness = 0;
		}
	}

	public static void tick() {
		int hungerIncrease = 10;
		int thirstIncrease = 5;
		int energyIncrease = 15;
		int sicknessIncrease = 5;

		for (int tick = 0; tick < 2; tick++) {
			VirtualPet.hunger = VirtualPet.hunger + hungerIncrease;
			VirtualPet.thirst = VirtualPet.thirst + thirstIncrease;
			VirtualPet.energy = VirtualPet.energy + energyIncrease;
			VirtualPet.sickness = VirtualPet.sickness + sicknessIncrease;

		}
	}

}
