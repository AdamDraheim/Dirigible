package Dirigible;

import javax.swing.JOptionPane;

public class waterShortage {

public static boolean water(String[] args, stats s) throws InterruptedException{
	
	boolean operationSuccess = false;
	
	int currentHealth = s.getHealth();
	
	int waterShortageBegin = JOptionPane.showConfirmDialog(null, "Captain, we found a source of water. Do you want to go landside and find it?");
	
	if (waterShortageBegin == JOptionPane.YES_OPTION) {
		
		String questZone = stats.location();
		
		System.out.println("Great captain, we found water in " + questZone + ". Your transport is awaiting your order to leave.");
		
		Thread.sleep(1000);
		System.out.println();
		System.out.println(questZone + ":0400 hours");
		System.out.println();
		
		Thread.sleep(1000);
		System.out.println("You arrive at a small farm, and notice the area is full of NMA troops");
		Thread.sleep(1000);
		System.out.println("You recognize Colonel Howards, and evidentially so does he, because he approaches you.");
		Thread.sleep(2000);
		System.out.println("Colonel Howards: Captain, what do you need?");
		Thread.sleep(1000);
		
		String[] choices = { "We need water.", "We want to trade.", "None of your business."};
	    String Purpose = (String) JOptionPane.showInputDialog(null, "Purpose?", null, JOptionPane.QUESTION_MESSAGE, null, choices, choices[0]);
	    
	    if (Purpose == "We need water.") {
	    	System.out.println("Colonel Howards: Well, we need water as well.");
	    	Thread.sleep(1000);
	    	System.out.println("Roalds: Surely we can reach a compromise.");
	    	Thread.sleep(1000);
	    	System.out.println("Colonel Howards: There is water under raider control down a bit. We can't spare the forces, but if you wish to help...");
	    	Thread.sleep(2000);
	    	
	    	String[] howardsResponse = {"We'll help with those raiders", "Sorry, not today", "I know someone else I can fight..."};
	    	String water = (String) JOptionPane.showInputDialog(null, "Help?", null, JOptionPane.QUESTION_MESSAGE,null, howardsResponse, howardsResponse[0]);
	    	
	    	if (water == "We'll help with those raiders"){
	    		System.out.println("Colonel Howards: Glad to hear that.");
	    		Thread.sleep(1000);
	    		System.out.println("Roalds: Captain, I see two raiders down there; I've got one and you get the other.");
	    		Thread.sleep(1000);
	    		int raider = 20;
	    		int raiderR = 5;
	    		int raiderM = 5;
	    		boolean cantFlee = false;
	    		int raiderMod = 0;

	    		boolean victory = combat.battle(s, currentHealth, raider, raiderR, raiderM, cantFlee, raiderMod);
	    		
	    		if (victory == true){
	    			System.out.println("Colonel Howards: Nice work there, Captain.");
	    			System.out.println("Roalds: We really showed them a thing or two");
	    			System.out.println("Colonel Howards: I suppose we did. Here, we brought some water to your transport. ");
	    			System.out.println("I'd be happy to fight with you again.");
	    			
	    			int waterSupply = s.getWater();
	    			int waterAmount = (int)(Math.random() * 10) * 10;
	    			waterSupply += waterAmount;
	    			s.setWater(waterSupply);
	    			
	    			int morality = s.getMorality();
	    			morality += 25;
	    			s.setMorality(morality);
	    			
	    			System.out.println("You gained " + waterAmount + " gallons of water!");
	    			
	    			int nmaRep = s.getNMARep();
	    			nmaRep += 50;
	    			s.setNMARep(nmaRep);
	    			operationSuccess = true;
	    		}
	    		
	    		
	    	}
	    	
	    	if (water == "Sorry, not today"){
	    		System.out.println("Colonel Howards: Well, you better be on your way then.");
	    		Thread.sleep(1000);

	    	}
	    	
	    	if (water == "I know someone else I can fight...") {
	    		System.out.println("Colonel Howards: Then a fight you shall have. Guards! Seize him!");
	    		Thread.sleep(1000);
	    		
	    		int recruitHealth = 30;
	    		int recruitRange = 4;
	    		int recruitMelee = 3;
	    		boolean cantFlee = false;
	    		int recruitMod = 2;
	    		boolean victory = combat.battle(s, currentHealth, recruitHealth, recruitRange, recruitMelee, cantFlee, recruitMod);
	    		
	    		if (victory == false){
	    			
	    			System.out.println("Colonel Howards: Maybe next time you will consider working with us a bit more... jovially. Guards, release them.");
	    			int morality = s.getMorality();
	    			morality -= 25;
	    			s.setMorality(morality);

	    			
	    		}
	    		
	    		if (victory == true) {
	    			
	    			System.out.println("Danton: Haha! Run you cowards! This here's our water!");
	    			System.out.println("Roalds: Let's hope this was worth it, Captain. The NMA will not be happy");
	    			int nmaRep = s.getNMARep();
	    			nmaRep -= 50;
	    			s.setNMARep(nmaRep);
	    			
	    			int waterSupply = s.getWater();
	    			int waterAmount = (int)(Math.random() * 10) * 10;
	    			waterSupply += waterAmount;
	    			s.setWater(waterSupply);
	    			
	    			int morality = s.getMorality();
	    			morality -= 25;
	    			s.setMorality(morality);
	    			
	    			System.out.println("You found " + waterAmount + " gallons of water!");
	    			operationSuccess = true;
	    			
	    		}
	    		
	    	}
	    		
	    }
	    
	    if (Purpose == "We want to trade.") {
	    	
	    	System.out.println("Colonel Howards: We have some water for trade.");
    		Thread.sleep(1000);
    		System.out.println("Colonel Howards: We can sell you 50 gallons of water for 100 credits. Is that good?");
    		String [] trade = {"Yes", "No", "I know a way to get it for free..."};
    		String tradechoice = (String) JOptionPane.showInputDialog(null, "Purchase?", null, JOptionPane.QUESTION_MESSAGE, null, trade, trade[0]);
    		
    		if (tradechoice == "Yes" && s.getCredits() - 100 >= 0) {
    			System.out.println("Colonel Howards; Pleasure doing business");
    			System.out.println("Water rations have increased");
    			int waterSupply = s.getWater();
    			waterSupply += 50;
    			s.setWater(waterSupply);
    			
    			int credits = s.credits;
    			credits -= 100;
    			s.setCredits(credits);
    			operationSuccess = true;
    		}
    			
    			else{
    			
    			System.out.println("Colonel Howards: Sorry, looks like you can't afford the water. Maybe some other time.");
    			
    			
    		}
	    	
    		if (tradechoice == "No") {
    			System.out.println("Colonel Howard: Well, sorry but we can't afford to part with water for anything less.");
    			operationSuccess = false;
    		}
    		if (tradechoice == "I know a way to get it for free...") {
    			
    			System.out.println("Colonel Howards: Haha, very funny. Let's see who's laughing now. GUARDS!");
    			
    			int recruitHealth = 30;
	    		int recruitRange = 4;
	    		int recruitMelee = 3;
	    		boolean cantFlee = false;
	    		int recruitMod = 2;
	    		boolean victory = combat.battle(s, currentHealth, recruitHealth, recruitRange, recruitMelee, cantFlee, recruitMod);
	    		
	    		if (victory == false){
	    			
	    			System.out.println("Colonel Howards: Maybe next time you will consider working with us a bit more... jovially. Guards, release them.");
	    			
	    			
	    		}
	    		
	    		if (victory == true) {
	    			
	    			System.out.println("Danton: Haha! Run you cowards! This here's our water!");
	    			System.out.println("Roalds: Let's hope this was worth it, Captain. The NMA will not be happy");
	    			int nmaRep = s.getNMARep();
	    			nmaRep -= 50;
	    			s.setNMARep(nmaRep);
	    			
	    			int waterSupply = s.getWater();
	    			int waterAmount = (int)(Math.random() * 10) * 10;
	    			waterSupply += waterAmount;
	    			s.setWater(waterSupply);
	    			
	    			int morality = s.getMorality();
	    			morality -= 25;
	    			s.setMorality(morality);
	    			
	    			System.out.println("You found " + waterAmount + " gallons of water!");
	    			operationSuccess = true;
    			
    		}
	    }
	    
	    if (Purpose == "None of your business.")
	    	System.out.println("Colonel Howards: Then you have no business to be here. Be on your way.");
    		Thread.sleep(1000);

		
	}
		
	if (waterShortageBegin == JOptionPane.NO_OPTION) {
		System.out.println("I'm sure we have enough water to last us a while longer.");
		Thread.sleep(1000);


	}
		
	if (waterShortageBegin == JOptionPane.CANCEL_OPTION) {
		System.out.println("I'm sure we have enough water to last us a while longer.");
		Thread.sleep(1000);
	
}
}
	return operationSuccess;
}
}

