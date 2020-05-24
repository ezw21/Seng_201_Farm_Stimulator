FarmStimulator README
-=-=-=-=-=

Introduction
============

Farm_Stimulator is designed as a simple single-player farming game.
The plot of the game was started when the player is going back to his/her
grandpa farm to take over and run the farm. Player will started with a setup
frame thask ask for certain details and select game duration between 5 / 10.
After selection, contract of game is made and will end when the times come.  
The program was designed, tested and runs under Windows.


The stimulator has been designed to be as easy to use as possible 
- in most cases there will be information button or direct info on dialog.
Beside of the main game flow, theres bunch of hidden event

i.Relic chair  - Sitting on chair gain aura, triggered when aura = 3
ii.Crate bonus - Sell more than 400G worth in a crate will get bonus 100G
iii.Mask       - Special item Mask will be multiply by 300G/each
		 on the endday calculation
iv.Random Event - random event happens on the day before ending (in morning)
	a. Cooking contest - Chef offer to buy 3 tomato for 1500G
	b. Wolf attack 	   - Wolf attacked (nothing happnes if no animal)
			   Cow can protect chicken,or chicken will be stolen
	3.Mysterious berry - Mysterious person gift a berry that +3 Energy

Installation // building
============

Extract all files from the .zip file including folders.

The stimulator requires Java and it was designed in JRE 1.8
Project can be build automaticallty in Eclipse ide. Under project tab >
Build Automatically .Compile and run from GUI_Setup - For whole game Process
	GUI_body - Skip setup and start with a set of value by constructor


Running games
=============

It is also possible to start a game from the
command line:

	java -jar ezw21_yli406_FarmingSimulator.jar


Controllers
-----------
In setup frame		:

Button A	Select/Proceed
Button B	Cancel/remove
Text Field	Allow user to type input

In main game frame	:

Button A	Select/Proceed
Button B	No action (Design purpose)
MenuBar 	Come with 4 tab - Home, Animal, Farm, Town
Trigger Button	Button located in panel to trigger specific action

Home 		Go home, Open inventory, Sit on relic chait,
		
		Eat burger, Sleep without making diary

Animal		Go to Barn & Chicken hoop

Farm		Go to farm, Chop tree stumps, Use fertilizer on Crops
	
Town		Go to Supermarket, Go to Trading Market

Trigger Button	Info, purchase, feed animal etc..

History
======= Release to discord group for player to test and give feedback
19/05/2020
v1.0 (fixed)
     Game is fully designed and exported in JAR file for the 1st time

19/05/2020
v1.1 (fixed)
     Initial release to test all basic function and component designed
     Able to run from setup screen to End game

19/05/2020
v1.2 (fixed)
     Going into next day
     Unlimited watering
     Daily allowance 1000G
     Extra allowance (Animal happiness * 300)(if farmer have animal)

19/05/2020 (fixed)
v1.3 Seeding didnt update Crop plot icon
     Seeding wont deduct farmer seed quantity
     Cant purchase animal

19/05/2020 (fixed)
v1.4 Seeding didnt update seed quantity label in inventory
     Fertilizer show price in shop
     Watering(bug after going next day)
     Harvesting(bug after going next day)

19/05/2020 (fixed)
v1.5 	1.Faultly display -Info board in shop               (Font)
	2. Display animal(healthiness & happiness)
	3. Trading market corn feed display error        (less)
	4. Inventory Pea_qtn label wrong placing         (Yaxis)
	5. Main Screen Info details improved.
	6. Add new feature - Expand farm        	 (crop4)
	7. Cannot seed crop plot 4 after expanding farm
	8. 4type farmer
   		8.1 blacksmith extra energy        	 (daily)
    		8.2 traveller extra happiness            (daily)
    		8.3 Engineer extra 30G on selling crops  (each)

21/05/2020 (fixed)
v1.6 	1. Feed animal didnt update healthiness
	1. modulizing source code
	2. Farm no crop plot selected display wrong message
	3. Extend farm can be done with less than 2000G
	4. A & B button for setup to go backward (setup)
	5. Condition for farmer name and farmer type selection
	6. Select end day
	7. End game calculation
	8. Can proceed to next day after end game

21/05/2020 (fixed)
v1.7 	1. Seeding button
	2. Blacksmith extra energy from day_1 not day_2
	3. Info for sleeping and energy recover

22/05/2020 (fixed)
v1.8 	1. Wrong display in supermarket info
	2. Crop plot 4 wrong message when its ready to harvest
	3. Farmer advantage was not applied
	4. Animal healthiness drop even when there is no animal

22/05/2020 (fixed)
v1.9 	1. Animal happiness drop even without animal in barn or chicken hoop
	2. Farmer advantage update solved

23/05/2020 (fixed)
v2.0 	1. No response when feed (no animal)
	2. finish modulizing into class(except farm)
	3. Cant eat burger in 2nd day after modulize
	4. seed, harvest, watering is shorten in src
	TODO:
		i. Offer to trade 3 tomatoes with 1500G
		ii.Wolf appear, eat  chicken if cow is not exist(no chicken)
		iii.Receive power berry from mysterious person energy + 3

23/05/2020 (fixed)
v2.1 	1. Feed animal no response
	2. Animal allowance not updated daily
	3. Crop plot 4 wrong message after expand
	4. Blacksmith start with 2 extra energy
	5. Added random event 
    		i. Offer to trade 3 tomatoes with 1500G
    		ii.Wolf appear, eat  chicken if cow is not exist(no chicken)
   		iii.Receive power berry from mysterious person energy + 3)


Credits
=======

Icon and imported Graphics : Harvest Moon BTN, Dont Starve
Everything else: stimulator Author ;)

Idea of some function is from Harvest moon! I played Harvest moon before
starting to develop this game to get a better idea.

Contact
=======
Used git kraken to Stage, commit, push
Github : https://github.com/ezw21/Seng_201_Farm_Stimulator
Course : University of Canterbury Seng_201 - 2020
Author : Edward Wong ezw21

Course : University of Canterbury Seng_201 - 2020
Samuel Lin Help with Use case diagram, JUnit test (by init local variable)
	   Basic draft of game function < 20line/class
	   (Sam's contribution was stored seperately in a folder 
	   for marking purpose)

	   Programe actual JUnit was implemented again by Edward on the 
	   day before due after receiving Sam Test classes (hard to merge)
	   as he knows how to access Model Class from View, Controller Class	
