package Dirigible;

import javax.swing.JOptionPane;

public class meetDanton {

	public static void Danton(String[] args, stats s) throws InterruptedException {
		
		int currentHealth = s.getHealth();
		// TODO Auto-generated method stub
		System.out.println("Danton: Captain sir, I am to show you the ropes of this operation.");
		Thread.sleep(1000);
		System.out.println("Danton: Our target today is in an old resource depot near Tharsis highway.");
		Thread.sleep(1000);
		System.out.println("Danton: Do you have any questions about an operation, sir?");
		
		String opAnswers[] = {"What is an operation?", "What are the results of an operation?", "Nothing."};
		
		boolean answers = false;
		
		do{
		String opResponses = (String) JOptionPane.showInputDialog(null, "Questions?", null, JOptionPane.QUESTION_MESSAGE,null, opAnswers, opAnswers[0]);
		
		if (opResponses == "What is an operation?"){
			
			System.out.println("Danton: An operation is a mission where you head down to the surface of the planet with a specific purpose in mind.");
			answers = false;
			
		}
		
		if (opResponses == "What are the results of an operation?") {
			
			System.out.println("Danton: If you successfully complete the mission, the ship may get water, food, or raw materials. Cool items may also be found planetside");
			System.out.println("Whether you fail or pass an operation, however, your ship's food, water, and fuel supply diminish.");
			answers = false;
			
		}
		
		if (opResponses == "Nothing.")
		
			answers = true;
		
		}while (answers == false);
		
		
		System.out.println("Danton: Very well sir.");
		Thread.sleep(1000);
		System.out.println("Danton: Scanners indicate a hostile presence in the area. ");
		Thread.sleep(1000);
		System.out.println("Danton: Don't worry about getting shot too much, our med bay should patch you up so long as you aren't dead.");
		System.out.println("I'll head around, you hold guard.");
		Thread.sleep(2000);
		System.out.println();
		System.out.println("The ensuing, somber silence is shaken by a sniper shot");
		System.out.println();
		Thread.sleep(1000);
		System.out.println("Raider: Let's see what you're made of!");
		Thread.sleep(1000);
		
		boolean cantFlee = false;
		int raider = 25;
		int raiderR = 5;
		int raiderM = 1;
		int raiderMod = 0;
		
		boolean victory = combat.battle(s, currentHealth, raider, raiderR, raiderM, cantFlee, raiderMod);
		
		if (victory == false){
			System.out.println("Danton: Sir! Let's get you out of here.");
		}
		
		if (victory == true) {
			System.out.println("Danton: Nice job, sir! Alas, no resources here. Someone got here first.");
			Thread.sleep(1000);
			System.out.println("Roalds: Hello sir! Glad I caught up! Science officer Roalds reporting, sir!");
			Thread.sleep(1000);
			System.out.println("Danton: We don't need an egghead down here, Roalds.");
			Thread.sleep(1000);
			System.out.println("Roalds: Well, I am a field scientist, so I plan to analyze Mars. Could save your life, so...");
			Thread.sleep(1000);
			System.out.println("Danton: Watch your tongue. Fine, come along. Let's find those resources.");
			Thread.sleep(1000);
			System.out.println();
			Thread.sleep(1000);
			System.out.println("Roalds: Sir! There is a group of six down there, maybe they took the resources.");
			Thread.sleep(1000);
			System.out.println("Danton: Given they have their weapons drawn, and pointing at eachother, I would hazard a guess they are two groups.");
			Thread.sleep(1000);
			System.out.println("Roalds: Let's go investigate.");
			Thread.sleep(1000);
			System.out.println("A shot rings out across the road.");
			Thread.sleep(1000);
			System.out.println("Recruit: Get back you Ashen savages!");
			Thread.sleep(1000);
			System.out.println("Danton: Calm down, boy. We aren't with anyone.");
			Thread.sleep(1000);
			System.out.println("Colonel Howards: Who the heck are you?");
			Thread.sleep(1000);
			System.out.println("Danton: Crew of a dirigible. Everyone, put down your weapons, and tell us who you are.");
			Thread.sleep(1000);
			System.out.println("Colonel Howards: Not putting down the gun. This here's Viscount Brinsky. I'm Colonel Howards. You met the recruit.");
			Thread.sleep(1000);
			System.out.println("Recruit: Howdy. New Martian Army through and through. Reuniting the land, mate.");
			Thread.sleep(1000);
			System.out.println("Ban Greyus: I am Ban Greyus, Leader of the Ashen Tides. We are only interested in the tech here, it may bring insight unto us.");
			Thread.sleep(1000);
			System.out.println("Ban Greyus: This man here is Zealot, mind him not, and the other, a fellow tribesman.");
			Thread.sleep(1000);
			System.out.println("Roalds: Well, what is the problem here?");
			Thread.sleep(1000);
			System.out.println("Viscount Brinsky: These scavengers were raiding the nearby town, and it is time this ends.");
			Thread.sleep(1000);
			System.out.println("Zealot: Wrong blasphemer, they offered us their artifacts, then betrayed us.");
			Thread.sleep(1000);
			
			String [] faction = {"The NMA were right", "The Ashen were right", "Split the resources"};
			String factionChoice = (String) JOptionPane.showInputDialog(null, "Who is Right?", null, JOptionPane.QUESTION_MESSAGE,null, faction, faction[0]);
			
			if (factionChoice == "The NMA were right"){
				
				System.out.println("Ban Greyus: Well, I can't say I blame you. Let's get out of here, Zealot. We're outnumbered.");
				Thread.sleep(1000);
				System.out.println("Zealot: We can still fight. The heretics will not stand a chance.");
				Thread.sleep(1000);
				System.out.println("Ban Greyus: Not this time.");
				Thread.sleep(1000);
				System.out.println();
				System.out.println("The Ashen depart");
				System.out.println();
				Thread.sleep(1000);
				System.out.println("Colonel Howards: Thanks for the help. Take some of the resources. We owe you that.");
				Thread.sleep(1000);
				System.out.println("Viscount Brinksy: We need the resources colonel! We cannot afford-");
				Thread.sleep(1000);
				System.out.println("Colonel Howards: We need all the allies we can get out here, Viscount.");
				Thread.sleep(1000);
				System.out.println();
				System.out.println("The NMA depart");
				System.out.println();
				Thread.sleep(1000);
				System.out.println("Danton: Good plan, support the military");
				Thread.sleep(1000);
				System.out.println("Roalds: We probably could've reached an understanding, but oh well.");
				Thread.sleep(1000);
				
				
				int morality = s.getMorality();
    			morality -= 5;
    			s.setMorality(morality);
    			
    			System.out.println();
    			int water = s.getWater();
    			int food = s.getFood();
    			int fuel = s.getFuel();
    			water += 50;
    			food += 50;
    			fuel += 50;
    			s.setFood(food);
    			s.setWater(water);
    			s.setFuel(fuel);
    			System.out.println("You found fifty of each resource!");
    			System.out.println();
    			
    			int ashenRep = s.getAshenRep();
    			int nmaRep = s.getNMARep();
    			ashenRep -= 5;
    			nmaRep += 5;
    			s.setAshenRep(ashenRep);
    			s.setNMARep(nmaRep);
				
			}
			
			if (factionChoice == "The Ashen were right"){
			
				System.out.println("Colonel Howards: Clearly we appear the aggressors. Very well then, Viscount, let's be off.");
				Thread.sleep(1000);
				System.out.println("Viscount Brinsky: But, if we can hold out we might be able to-");
				Thread.sleep(1000);
				System.out.println("Colonel Howards: No, let them have this. The odds aren't with us.");
				Thread.sleep(1000);
				System.out.println();
				System.out.println("The NMA depart");
				System.out.println();
				Thread.sleep(1000);
				System.out.println("Zealot: I may have been fast to misjudge you, but I will await the words of the tech.");
				Thread.sleep(1000);
				System.out.println("Ban Greyus: May the tech watch over you in your future endeavors. And us, we thank you.");
				Thread.sleep(1000);
				System.out.println();
				System.out.println("The Ashen depart");
				System.out.println();
				Thread.sleep(1000);
				System.out.println("Roalds: I am untrusting of their worship of technology. Might be best left dormant.");
				Thread.sleep(1000);
				System.out.println("Danton: Nevermind that. Good choice, Captain. Let's try and get that good tech stuff.");
				Thread.sleep(1000);
				
				int morality = s.getMorality();
    			morality -= 5;
    			s.setMorality(morality);
    			
    			System.out.println();
    			int water = s.getWater();
    			int food = s.getFood();
    			int fuel = s.getFuel();
    			water += 50;
    			food += 50;
    			fuel += 50;
    			s.setFood(food);
    			s.setWater(water);
    			s.setFuel(fuel);
    			System.out.println("You found fifty of each resource!");
    			System.out.println();
    			
    			int ashenRep = s.getAshenRep();
    			int nmaRep = s.getNMARep();
    			ashenRep += 5;
    			nmaRep -= 5;
    			s.setAshenRep(ashenRep);
    			s.setNMARep(nmaRep);
    			
			}
			
			if(factionChoice == "Split the resources"){
				
				System.out.println("Ban Greyus: Can we agree on that, Colonel?");
				Thread.sleep(1000);
				System.out.println("Colonel Howards: I believe that is fair. We will still look into the village incident, be aware.");
				Thread.sleep(1000);
				System.out.println("We have nothing to hide, feel free to investigate.");
				Thread.sleep(1000);
				System.out.println("Viscount Brinsky: Now we're sharing with the savages...");
				Thread.sleep(1000);
				System.out.println("Colonel Howards: Viscount! He is being generous. Let us go.");
				Thread.sleep(1000);
				System.out.println();
				System.out.println("The NMA depart");
				System.out.println();
				Thread.sleep(1000);
				System.out.println("Zealot: I'd prefer to have salvaged some more tech...");
				Thread.sleep(1000);
				System.out.println("Ban Greyus: Do not pick a fight, Zealot. This is fair. Thank you, Captain.");
				Thread.sleep(1000);
				System.out.println();
				System.out.println("The Ashen depart");
				System.out.println();
				Thread.sleep(1000);
				System.out.println("Roalds: Nicely played, Captain. Worked out brilliantly, getting them to agree.");
				Thread.sleep(1000);
				System.out.println("Danton: Probably could've gotten more resources...");
				Thread.sleep(1000);
				
				int morality = s.getMorality();
    			morality += 5;
    			s.setMorality(morality);
    			System.out.println();
    			int water = s.getWater();
    			int food = s.getFood();
    			int fuel = s.getFuel();
    			water += 50;
    			food += 50;
    			fuel += 50;
    			s.setFood(food);
    			s.setWater(water);
    			s.setFuel(fuel);
    			System.out.println("You found fifty of each resource!");
    			System.out.println();
    			
    			int ashenRep = s.getAshenRep();
    			int nmaRep = s.getNMARep();
    			ashenRep += 5;
    			nmaRep += 5;
    			s.setAshenRep(ashenRep);
    			s.setNMARep(nmaRep);
    			
			}
			
			System.out.println("Danton: Okay, we'll bring these up Captain.");
			Thread.sleep(1000);
			System.out.println("Better be careful down here Captain, looks like storm clouds are coming on.");
			Thread.sleep(1000);
			System.out.println();
			System.out.println("Roalds and Danton depart");
			System.out.println();
			Thread.sleep(1000);
			System.out.println("Apparation: Captain, beware the day an object of non-mortal construct flies above Bellator. Beware.");
			Thread.sleep(1000);
			System.out.println();
			System.out.println("...");
			Thread.sleep(1000);
			System.out.println(".....");
			Thread.sleep(1000);
			System.out.println(".........Well, that was weird.");
			Thread.sleep(1000);
			System.out.println();
			
			
		}
	}
}


