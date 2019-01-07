package JavaPortfolio1;
import java.util.Scanner;
/*
 * Caleb Mouritsen
 * 11/13/18
 * This text adventure game, while short, will prompt the user with choices based on scenarios. 
 * Different choices will lead to different scenarios, the game will either end in a death or victory.
 * Some ASCII Art will be implemented for better visibility, however not every choice will contain ASCII art
 * as it isn't always required.
 */
import java.util.concurrent.ThreadLocalRandom;

public class RPGGame {

	public static void main(String[] args) {
		
		//implementing a scanner so that the user can make choices
		Scanner input = new Scanner (System.in);
		start(input);
		}
			

	
	private static void start(Scanner input) {
		
		// First choice / Menu. 
		System.out.println("Welcome to");
		System.out.println("  ____    ___ ______  ______  ____  ____    ____       _____  ___   ___ ___    ___      ___ ___  ____  _      __  _ \r\n" + 
				" /    |  /  _]      ||      ||    ||    \\  /    |     / ___/ /   \\ |   |   |  /  _]    |   |   ||    || |    |  |/ ]\r\n" + 
				"|   __| /  [_|      ||      | |  | |  _  ||   __|    (   \\_ |     || _   _ | /  [_     | _   _ | |  | | |    |  ' / \r\n" + 
				"|  |  ||    _]_|  |_||_|  |_| |  | |  |  ||  |  |     \\__  ||  O  ||  \\_/  ||    _]    |  \\_/  | |  | | |___ |    \\ \r\n" + 
				"|  |_ ||   [_  |  |    |  |   |  | |  |  ||  |_ |     /  \\ ||     ||   |   ||   [_     |   |   | |  | |     ||     \\\r\n" + 
				"|     ||     | |  |    |  |   |  | |  |  ||     |     \\    ||     ||   |   ||     |    |   |   | |  | |     ||  .  |\r\n" + 
				"|___,_||_____| |__|    |__|  |____||__|__||___,_|      \\___| \\___/ |___|___||_____|    |___|___||____||_____||__|\\_|");
		System.out.println("\nthe text adventure game where you go to get some milk");
		
		System.out.println("\nYou go to the fridge because you need some milk for your cereal, you open it to find a large cockroach\n"
				+ "The roach scurries out of the fridge but you shut the door before he can escape, forcing him to fight");
		fight(input);
		
	}
	private static void victory(Scanner input) {
		System.out.println("      @ V; .Z~M\r\n" + 
				"          || :|:@  d\r\n" + 
				"          d' d\\@  jf\r\n" + 
				"   .*\\   :P  #P  |P\r\n" + 
				"   M `|  W  .@   Z\r\n" + 
				"   | .b :!  d'  W'\r\n" + 
				"   |  V W   #  .W**=m_\r\n" + 
				"    |  !||   @  W'_   ~V;\r\n" + 
				"    ||  M| _ Nm4| YmjL|PN_\r\n" + 
				"     #   W#~    YN_W'YL#W#b\r\n" + 
				"     |;  +       |f   `#'#8L\r\n" + 
				"     W        ._#L_  .#,`'||\r\n" + 
				"     |,     .WMP' ~Mm#`Nm;d|\r\n" + 
				"     `|       W   Mmd#; .df\r\n" + 
				"      |       M    `M#@-W'\r\n" + 
				"      W       !b     WtZ'\r\n" + 
				"      M        V;    |P\r\n" + 
				"      ||        b   .@\r\n" + 
				"       D        Y| .W'\r\n" + 
				"      j|         'j@'\r\n" + 
				"     jP'  L_mq=-_@'\r\n" + 
				"   .Z!         jf\r\n" + 
				"  mf         .W'\r\n" + 
				"            .@'\r\n" + 
				"           .@'\r\n" + 
				"          .@\r\n" + 
				"  from   :@");
		System.out.println("\nYou won! You got your precious milk back, \n you go home and have a delicious bowl of captain crunch™️");
	}

	private static void death(Scanner input) {
		
		//creating a death method that will run any time the player dies
		System.out.println("88                               88           \r\n" + 
				"         88                         ,d    88           \r\n" + 
				"         88                         88    88           \r\n" + 
				" ,adPPYb,88  ,adPPYba, ,adPPYYba, MM88MMM 88,dPPYba,   \r\n" + 
				"a8\"    `Y88 a8P_____88 \"\"     `Y8   88    88P'    \"8a  \r\n" + 
				"8b       88 8PP\"\"\"\"\"\"\" ,adPPPPP88   88    88       88  \r\n" + 
				"\"8a,   ,d88 \"8b,   ,aa 88,    ,88   88,   88       88  \r\n" + 
				" `\"8bbdP\"Y8  `\"Ybbd8\"' `\"8bbdP\"Y8   \"Y888 88       88 ");
		System.out.println("\nYou died, run the program again to try again");
	}
	private static void fight(Scanner input) {
		
		//initialize variables for fight
		int choice = 0;
				int health = 10;
				int enemyhealth = 2;
				System.out.println(" .--.       .--.\r\n" + 
						"    _  `    \\     /    `  _\r\n" + 
						"     `\\.===. \\.^./ .===./`\r\n" + 
						"            \\/`\"`\\/\r\n" + 
						"         ,  |     |  ,\r\n" + 
						"        / `\\|`-.-'|/` \\\r\n" + 
						"       /    |  \\  |    \\\r\n" + 
						"    .-' ,-'`|   ; |`'-, '-.\r\n" + 
						"        |   |    \\|   | \r\n" + 
						"        |   |    ;|   |\r\n" + 
						"        |   \\    //   |\r\n" + 
						"        |    `._//'   |\r\n" + 
						"      .'             `.\r\n" + 
						"    _,'                 `,_\r\n" + 
						"    `                     `");
				// while loop containing the cockroach fight, once cockroach dies the loop exits
				while (true) {
					if (enemyhealth == 2) {
						System.out.println("\nThe cockroach seems afraid of you but seems ready to fight");
					}
					else if (enemyhealth == 1) {
						System.out.println("\nThe cockroach is weakened and looks ready to accept death\n");
					}
					else {
						System.out.println("\nThe cockroach limps over and dies horribly\n");
						choose(input);
					}
					System.out.println("\nWhat will you do? \n you have three options \n 1. Punch \n 2. Bug Spray \n 3. Cower");
					System.out.println("\nInput the number of what you will do: ");
					choice = input.nextInt();
					
					if (choice == 1) {
						System.out.println("You punched the cockroach, but you punched really hard, the cockroach got smashed and its remains got all over your fist");
						System.out.println("\nYou are repulsed from this, you vomit and pass out, never waking up, you eventually choke on your own vomit");
						death(input);
						break;
					}
					else if (choice == 2) {
						System.out.println("you sprayed the cockroach, damaging it and leaving it weak");
						enemyhealth -=1;
					}
					else if (choice == 3) {
						System.out.println("The cockroach grows in strength at the sight of your cowering, it grows ten feet tall and gains 200 lbs of muscle mass and kills you instantly\n");
						death(input);
						break;
					}
					else {
						System.out.println("What? That's not any of the options I gave you. Make sure you enter the number of the choice");
					}
					
		
	}
				
	}
	
	// method containing the final fight
	private static void finalfight(Scanner input) {
		
		// story dialogue
		System.out.println("You wake up in a daze, you feel as though you just got the wind knocked out of you");
		System.out.println("\n You're in a colliseum, you sit upright to see the milk culprit");
		System.out.println("‡õàš†' . ', ….. ', …………… ¯º•›,¸\r\n" + 
				"©¥'' …… ', ….. ', ………………… 'º›¸\r\n" + 
				"…………. ', ….. ', …………………… º›¸\r\n" + 
				"''…………. ', ….. ', ……………………... º›¸\r\n" + 
				"…………… ', ….. ', ………………………. º¸\r\n" + 
				"'……………. ', ….. ', ……………………….. º¸\r\n" + 
				"''…………….. ', ….. ', . _,,,,,,_……………….. º¸\r\n" + 
				"……………..., -'''''''''','''¯ …….. ¯ˆ'º•›,¸ ………… ',\r\n" + 
				"…………….. ' , ….. ', …. ¸,.‹‹‹--›››,¸ . º›¸ ………. ',\r\n" + 
				"…………… ¸,‹•'º•›.,¸ ',¸‹•º ………… ˆ”º•'›.¸ …….. ',\r\n" + 
				"………… ¸‹º .. ,' …... º•›,¸ ………………... º•¸ ….. ',\r\n" + 
				"……….. ¸º …. ; ………… º•›,¸ ……………... º¸ …. ',\r\n" + 
				"………. ; …... '; ……………… º•›¸ ………….. '', …. ;\r\n" + 
				"………. ; …... ;' ………………….. º›¸ ………... ; …. ;\r\n" + 
				"………. ; …... ; ……………………... º›¸ ……... ; …. ;\r\n" + 
				"………. ; …... ; ………………………... 'º›¸ ….. ; …. ';\r\n" + 
				"………. ; …... ; ………………….. ¸,., …… º›¸ . ; ….. ';\r\n" + 
				"………. '•.¸ ... '; ………... _¸,.‹•º”ˆ¯ .. '', ……... º¸ …... ';\r\n" + 
				"………… ;;ˆ”º,; ... ,‹-•º”ˆ¯ ………. ¸,.‹•' ………. ; …... ';\r\n" + 
				"………… ;¸ ... ; ... ', ……… _¸,.‹•º ………. , --,--.., … ';\r\n" + 
				"………….. ; ˆ”'; …. º¸ˆ'º•›¸º¯ ……………... ; ...', .. ', ... ';\r\n" + 
				"…………... ; .. ; . ¸,.‹º' … ', ……………….. º¸ . ', .. ', . '';\r\n" + 
				"…………... ', .. ;'' ………. ', ……………… ¸º ... ', .. ', ..;\r\n" + 
				"…………… '; . ; ………... '; ……………. ¸º ….. '', .. ', ';\r\n" + 
				"……………. '; .; ………… ; …………. ¸‹º …….. ', .. ',';\r\n" + 
				"…………….. ';.; ………… '; ………. ¸‹º ……….. '', .. ',\r\n" + 
				"……………... ';; …………. ; ……. ¸‹º …………... '', . ';\r\n" + 
				"……………….'; …………. ; .. ¸,‹•º ……………….. ");
		System.out.println("\nYou're confused because you aren't sure how this beefy spartan warrior got in your house and why he wants your milk in the first place\n"
				+ "You draw a crystal sword out of thin air, ready to kill the guy who dared defy your right to eat cereal");
		
		//fight variables
		int enemyhealth = 50;
		int health = 30;
		int damage = 0;
		int enemydamage = 0;
		
			// multi-way if statement giving different scenarios based on enemy health
		int enemychoice = ThreadLocalRandom.current().nextInt(1, 3);
		System.out.println("Input your choice");
		System.out.println("\ninput 1 to slash \n input 2 to kick really hard in the shin \n input 3 to try and steal the milk");
		System.out.println("\n Hint: T= THE WARRIOR HAS AN ARMOR WEAKPOINT IN HIS SHIN");
		int choice = input.nextInt();
		if (choice == 2) {
			System.out.println("\nYou kick the warrior in his armor weakpoint, all of his armor falls off and is now useless");
			enemyhealth = 25;
			System.out.println("\nAfter taking down the warrior's armor, you took down his total health!");
			System.out.println("The warrior has: " + enemyhealth + " health");
		}
		while (true) {
			enemychoice = ThreadLocalRandom.current().nextInt(1, 3);
			System.out.println("\nInput your choice");
			System.out.println("\ninput 1 to slash \n input 2 to kick really hard in the shin \n input 3 to try and steal the milk");
			choice = input.nextInt();
			if (choice == 1) {
				System.out.println("\nYou slash the warrior across the chest");
				damage = 5;
				enemyhealth -=5;
				System.out.println("\nYou did: " + damage + " damage");
				System.out.println("\nThe warrior has: " + enemyhealth + " health");
				
			}
			else if (choice == 2) {
				System.out.println("\nThis attack can't be used twice, otherwise it would be overpowered, the kick does nothing on the second attempt");
			}
			else if (choice == 3) {
				System.out.println("\nYou make a quick dash for the milk, the warrior stabs you on the spot and drinks the milk in front of you as you die");
				death(input);
				break;
			}
			else {
				System.out.println("\nThat isn't a valid choice, try putting in the integers that the game gives you as options");
			}
			if (enemychoice == 1) {
				System.out.println("\nThe warrior slashes you");
				health -= 5;
				enemydamage = 5;
				System.out.println("\nThe warrior did: " + enemydamage + " damage");
				System.out.println("\nYou have: " + health + " health");
				
			}
			else if (enemychoice == 2) {
				System.out.println("\nThe warrior goes in for a punch");
				System.out.println("\nThe warrior misses because you're so skinny, he thought you had more mass");
			}
			if (health == 0) {
				System.out.println("\nYou fought valiantly, however, the warrior killed you, he claims the milk until the end of time");
				death(input);
				break;
			}
			else {
				System.out.println("\nYou are determined to get your milk back\n");
			}
			if (enemyhealth == 0){
				System.out.println("\nThe warrior falls to his knees, the milk drops to your feet \n You ensure that the warrior is dead by stabbing him");
				System.out.println("\nYou will give no mercy to the one who dared defy your ability to eat cereal");
				victory(input);
				break;
		}
			else {
				System.out.println("\nThe warrior looks ready to fight");
			}
		}
	}
		
	
	private static void choose4(Scanner input) {
		System.out.println("\n You're tempted to just take the pot of gold and go home \n you could easily buy more milk with the immense riches");
		System.out.println("However, unfortunately, that milk which was stolen happened to be your best friend, he can't be replaced");
		System.out.println("After sensing your sorrow and love for your milk, a wizard appears before you, understanding that you really want some cereal");
		System.out.println("       ,---.\r\n" + 
				"                       /    |\r\n" + 
				"                      /     |\r\n" + 
				"                     /      |\r\n" + 
				"                    /       |\r\n" + 
				"               ___,'        |\r\n" + 
				"             <  -'          :\r\n" + 
				"              `-.__..--'``-,_\\_\r\n" + 
				"                 |o/ ` :,.)_`>\r\n" + 
				"                 :/ `     ||/)\r\n" + 
				"                 (_.).__,-` |\\\r\n" + 
				"                 /( `.``   `| :\r\n" + 
				"    yo           \\'`-.)  `  ; ;\r\n" + 
				"                 | `       /-<\r\n" + 
				"                 |     `  /   `.\r\n" + 
				" ,-_-..____     /|  `    :__..-'\\\r\n" + 
				"/,'-.__\\\\  ``-./ :`      ;       \\\r\n" + 
				"`\\ `\\  `\\\\  \\ :  (   `  /  ,   `. \\\r\n" + 
				"  \\` \\   \\\\   |  | `   :  :     .\\ \\\r\n" + 
				"   \\ `\\_  ))  :  ;     |  |      ): :\r\n" + 
				"  (`-.-'\\ ||  |\\ \\   ` ;  ;       | |\r\n" + 
				"   \\-_   `;;._   ( `  /  /_       | |\r\n" + 
				"    `-.-.// ,'`-._\\__/_,'         ; |\r\n" + 
				"       \\:: :     /     `     ,   /  |\r\n" + 
				"        || |    (        ,' /   /   |\r\n" + 
				"        ||                ,'   / SSt|");
		System.out.println("The wizard offers you a choice, have him kill you to end the suffering or fight one last triumphant battle against the milk culprit");
		System.out.println("Input 1 to die, Input 2 to fight the final battle");
		//while loop allowing the user to choose
		while(true) {
			int choice = input.nextInt();
			if (choice == 1) {
				System.out.println("\nThe wizard looks disappointed as this isn't much of a happy ending, but he follows your request");
				System.out.println("\n The Wizard kills you");
				death(input);
				System.out.println("\nSorry I know this is lazy, but I'm on a time limit here");
			}
			else if (choice == 2) {
				System.out.println("\nThe wizard conjures up a teleportation spell and teleports you to the culrpit of your milk");
				finalfight(input);
			}
			else {
				System.out.println("\nInvalid choice, do it again (Make sure you're entering integers as the game tells you to");
			}
			
		}
	}
	
	private static void choose3(Scanner input) {
		
		//Choice that occurs if the player opted to go left in the first choice
		System.out.println("\n You head down the left path, you see a giant rainbow in the distance, filling you with determination");
		System.out.println("\nYou come upon a cave, the cave has a giant sign above it that reads \"ENTER HERE TO WIN GAME\"");
		System.out.println("\nInput 1 to enter the cave, Input 2 to keep going down the path");
		
		// while loop allowing the player to choose
		while (true) {
			int choice = input.nextInt();
			if (choice == 1) {
				System.out.println("\nYou enter the cave, you instantly get hit in the back of the head with a baseball bat");
				System.out.println("\n A bunch of rascal kids leave you with brain trauma and steal your wallet, they take out several loans in your name, you die");
				death(input);
			}
			else if (choice == 2) {
				System.out.println("\nYou didn't heed the cave's words, and rightfully so, you stumble across a pot of gold");
				choose4(input);
			}
			else {
				System.out.println("\nInvalid choice, do it again (Make sure you're entering integers as the game tells you to");
			}
		}
	}
	
	private static void choose2(Scanner input) {
		
		//second choice after first choice
		System.out.println("\nAfter going down the right path, you come upon a hole\n The deepness of the hole knows no bounds.");
		System.out.println("\nYou can either input 1 to jump in the hole or input 2 to rest, as the path ends here");
		
		//while loop allowing the user to choose
		while (true) {
			int choice = input.nextInt();
			if (choice == 1) {
				System.out.println("\nYou jump in the hole, you fall endlessly until you eventually crash into the ground");
				System.out.println("\nYou break several bones and eventually die from internal bleeding\n sorry that's kind of brutal\n");
				death(input);
			}
			else if (choice == 2) {
				System.out.println("\nYou rest your head, you haven't gotten sleep in a few days somehow so you sleep for a long time\n eventually a troll comes upon you and eats you\n");
				death(input);
			}
			else {
				System.out.println("\nInvalid choice, do it again (Make sure you're entering integers as the game tells you to");
			}
		}
	}
				
	private static void choose(Scanner input) {
		
		//first choice after initial fight
		System.out.println("\nAfter your victorious fight, you step out of your home in search of your milk \n"
				+ "There are two paths, one going left, one going right, which one will you take?\n"
				+ "input 1 to go right, input 2 to go left");
		
		// loop containing the choice
		while (true) {
			int choice = input.nextInt();
			if (choice == 1) {
				System.out.println("\nYou go down the right path, you almost trip on a rock but you continue on\n");
				choose2(input);
			}
			else if (choice == 2) {
				System.out.println("\nYou head down the left path, skipping as you go");
				choose3(input);
			}
			else {
				System.out.println("\nNot a valid choice, do it again >:(");
			}
			
		}
		
		
	}
	
		
	}


