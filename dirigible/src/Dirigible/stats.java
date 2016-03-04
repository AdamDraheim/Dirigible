package Dirigible;

public class stats {
	
	int water;
	int fuel;
	int food;
	int health;
	int experience;
	String rangedWeapon;
	String meleeWeapon;
	
	public stats(int water, int fuel, int food, int health, int experience, String rangedWeapon, String meleeWeapon) {
		this.water = water;
		this.fuel = fuel;
		this.food = food;
		this.health = health;
		this.experience = experience;
		this.rangedWeapon = rangedWeapon;
		this.meleeWeapon = meleeWeapon;
	}
	
	public int getWater(){
		return water;
		
	}
	public void setWater(int water){
		this.water = water;
		
	}
	
	public int getFuel(){
		return fuel;
		
	}
	public void setFuel(int fuel){
		this.fuel = fuel;
	}
	
	public int getFood(){
		return food;
		
	}
	
	public void setFood(int food){
		this.food = food;
	}
	
	public int getHealth(){
		return health;
		
	}
	
	public void setHealth(int health){
		this.health = health;
	}
	
	public int getExperience(){
		return experience;
		
	}
	
	public void setExperience(int experience){
		
		this.experience = experience;
		
	}
	
	public String getRangedWeapon(){
		return rangedWeapon;
	}
	
	public void setRangedWeapon(String rangedWeapon){
		this.rangedWeapon = rangedWeapon;
	}
	
	public String getMeleeWeapon(){
		return meleeWeapon;
	}
	
	public void setMeleeWeapon(String meleeWeapon){
		this.meleeWeapon = meleeWeapon;
	}
	
	public void printStats(){
		
		System.out.println();;
		System.out.println("Stats:");
		System.out.println();
		System.out.println(getWater() + " gallons of water");
		System.out.println(getFuel() + " gallons of CHO");
		System.out.println(getFood() + " boxes of food");
		System.out.println(getHealth() + " health");
		System.out.println(getExperience() + " experience");
		System.out.println();
		String rangedValue = rangedDamagePrint(rangedWeapon);
		System.out.println(getRangedWeapon() + rangedValue + " is equipped");
		String meleeValue = meleeDamagePrint(meleeWeapon);
		System.out.println(getMeleeWeapon() + meleeValue + " is equipped");

		
	}
	
	
	
	public static String location() {
		// TODO Auto-generated method stub
		String [] locationNames = {"Meridian Outpost", "Gale Crater", "Windsrow", "Tharsis Bulge", "Valles Marineris", "Cerberus Province", "Olympus Mons", "Schiaparelli Crater", "Kaiser Sea", "Lockyer Land", "Dominus Canyon", "Bellator", "Crash Site-7", "Baurus Delta", "Carnega", "Lucifen Range", "Tharsis Highway", "Halit"+ "urn Quarry", "The Burntside", "The old shipyard"};
		int locationNumber = (int) (Math.random()*20);
		String questZone = locationNames[locationNumber];
		return questZone;
	}

	public static int rangedDamage(String rangedWeapon){
		
		int damage = 0;
		if (rangedWeapon == "rusty pistol"){
			damage = (int)(Math.random()* 3) + 3;

		}
		
		return damage;
	}
	
	public static String rangedDamagePrint(String rangedWeapon){
		
		String rangedValue = "";
		if (rangedWeapon == "rusty pistol"){
			rangedValue = "(3-5 damage)";
		}
		return rangedValue;
	}
	
	public static String meleeDamagePrint(String meleeWeapon){
		
		String meleeValue = "";
		if (meleeWeapon == "worn dagger"){
			meleeValue = "(2 damage)";
		}
		return meleeValue;
	}
	
	public static int meleeDamage(String meleeWeapon){
		
		int damage = 0;
		if (meleeWeapon == "worn dagger"){
			damage = 2;
		}
		
		return damage;
	}
}
	

