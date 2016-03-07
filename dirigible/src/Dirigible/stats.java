package Dirigible;

import javax.swing.JOptionPane;

public class stats {
	
	int water;
	int fuel;
	int food;
	int credits;
	int health;
	int experience;
	String rangedWeapon;
	String meleeWeapon;
	int nmaRep;
	int ashenRep;
	
	public stats(int water, int fuel, int food, int credits, int health, int experience, String rangedWeapon, String meleeWeapon, int nmaRep, int ashenRep) {
		this.water = water;
		this.fuel = fuel;
		this.food = food;
		this.credits = credits;
		this.health = health;
		this.experience = experience;
		this.rangedWeapon = rangedWeapon;
		this.meleeWeapon = meleeWeapon;
		this.nmaRep = nmaRep;
		this.ashenRep = ashenRep;
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
	
	public int getCredits(){
		return credits;
	}
	
	public void setCredits(int credits){
		this.credits = credits;
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
	
	public int getNMARep() {
		return nmaRep;
	}
	
	public void setNMARep(int nmaRep) {
		this.nmaRep = nmaRep;
	}
	
	public int getAshenRep(){
		return ashenRep;
	}
	
	public void setAshenRep(int ashenRep){
		this.ashenRep = ashenRep;
	}
	
	public void printStats(){
		
		System.out.println();;
		System.out.println("Stats:");
		System.out.println();
		System.out.println(getWater() + " gallons of water");
		System.out.println(getFuel() + " gallons of CHO");
		System.out.println(getFood() + " boxes of food");
		System.out.println(getCredits() + " credits");
		System.out.println(getHealth() + " health");
		System.out.println(getExperience() + " experience");
		System.out.println();
		String rangedValue = rangedDamagePrint(rangedWeapon);
		System.out.println(getRangedWeapon() + rangedValue + " is equipped");
		String meleeValue = meleeDamagePrint(meleeWeapon);
		System.out.println(getMeleeWeapon() + meleeValue + " is equipped");
		System.out.println();
		System.out.println("NMA reputation level: " + getNMARep());
		System.out.println("Ashen reputation level: " + getAshenRep());

		
	}
	
	
	
	public static String location() {
		// TODO Auto-generated method stub
		String [] locationNames = {"Meridian Outpost", "Gale Crater", "Windsrow", "Tharsis Bulge", "Valles Marineris", "Cerberus Province", "Olympus Mons", "Schiaparelli Crater", "Kaiser Sea", "Lockyer Land", "Dominus Canyon", "Bellator", "Crash Site-7", "Baurus Delta", "Carnega", "Lucifen Range", "Tharsis Highway", "Halit"+ "urn Quarry", "The Burntside", "The old shipyard"};
		int locationNumber = (int) (Math.random()*20);
		String questZone = locationNames[locationNumber];
		return questZone;
	}
	
	public static String weaponsDropActOne(){
		
		int randomDrop = (int)(Math.random()*276);
		
		String weaponRangedList [] = {"Flintlock", "Revolver", "Repurpose SMG", "Dirigible Rifle", "22c Shotgun", "Bellatorian Rifle", "Experimental SMG", "dagger", "switchblade", "scimitar", "worker's hammer", "crowbar", "Dirigible Guard Sword"};
		
		String weapon = "rusty pistol";
		
		//Flintlock (4-6)
		if (randomDrop >= 0 && randomDrop <= 30){
			weapon = weaponRangedList [0];
		}
		//Revolver (5-7)
		if (randomDrop >= 31 && randomDrop <= 56){
			weapon = weaponRangedList [1];
		}
		//Rep. SMG (2-6)
		if (randomDrop >= 57 && randomDrop <= 80){
			weapon = weaponRangedList [2];
		}
		//Dirigible Rifle (4-5, 7)
		
		if (randomDrop >= 81 && randomDrop <= 105){
			weapon = weaponRangedList [3];
		}
		
		//22c shotgun (2-4, 9)
		
		if (randomDrop >= 106 && randomDrop <= 130){
			weapon = weaponRangedList [4];
		}
		
		//Bellatorian Rifle (7-8, 10)
		
		if (randomDrop >= 131 && randomDrop <= 140){
			weapon = weaponRangedList [5];
		}
		
		//Experimental SMG (4-8)
		if (randomDrop >= 141 && randomDrop <= 150){
			weapon = weaponRangedList [6];
		}
		
		//dagger (5)
		
		if (randomDrop >= 151 && randomDrop <= 185){
			weapon = weaponRangedList [7];
		}
		
		//switchBlade (6)
		
		if (randomDrop >= 186 && randomDrop <= 210){
			weapon = weaponRangedList [8];
		}
		
		//scimitar (4)
		
		if (randomDrop >= 211 && randomDrop <= 230){
			weapon = weaponRangedList [9];
		}
		
		//workers hammer (7)
		
		if (randomDrop >= 231 && randomDrop <= 250){
			weapon = weaponRangedList [10];
		}
		
		//crowbar (8)
		
		if (randomDrop >= 251 && randomDrop <= 265){
			weapon = weaponRangedList [11];
		}
		
		//Dirigible Guard Sword (9)
		
		if (randomDrop >= 266 && randomDrop <= 275){
			weapon = weaponRangedList [12];
		}
		
		return weapon;
		
	}
	
	public static void setWeapon(stats s, String weapon){
		
		if (weapon == "Flintlock" || weapon == "Revolver" ||weapon == "Repurpose SMG" || weapon == "Dirigible Rifle" || weapon == "22c Shotgun" || weapon == "Bellatorian Rifle" || weapon == "Experimental SMG") {
			
			String rangedWeapon = s.getRangedWeapon();
			int weaponSwap = JOptionPane.showConfirmDialog(null, "You found a" + weapon + "(" + ")" + ". Swap it for your " + rangedWeapon + "(" + ")" + "?");
			if (weaponSwap == JOptionPane.YES_OPTION){
				s.setRangedWeapon(rangedWeapon);
			}
			
		if (weapon == "dagger" || weapon == "switchblade" || weapon == "scimitar" || weapon == "worker's hammer" || weapon == "crowbar" || weapon == "Dirigible Guard Sword" ) {
			String meleeWeapon = s.getRangedWeapon();
			weaponSwap = JOptionPane.showConfirmDialog(null, "You found a" + weapon + "(" + ")" + ". Swap it for your " + meleeWeapon + "(" + ")" + "?");
			if (weaponSwap == JOptionPane.YES_OPTION){
				s.setMeleeWeapon(meleeWeapon);
			}
		}
		}
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
	

