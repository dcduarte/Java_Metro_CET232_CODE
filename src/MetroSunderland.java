
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class MetroSunderland {
	static Scanner keyboard = new Scanner(System.in);
	static final String[] files = {"trains.txt", "carriages.txt", "lines.txt", "metros.txt", "storedcar.txt","storedtrains.txt"};
	static File file;
	static String trainsdata[][]=new String[0][2];
	static String carriagesdata[][]= new String[0][2];	
	static String metrosdata[][]=new String[0][3];
	static String linesdata[][]=new String[0][3];
	static String stationsdata[][]=new String[0][3];
	static String storedcardata[][]=new String[0][2];
	static String storedtrainsdata[][]=new String[0][2];
	static String FileName_carriages = "carriages.txt";
	static String FileName_trains = "trains.txt";
	static String FileName_stations = "stations.txt";
	static String FileName_lines = "lines.txt";
	static String FileName_metros= "metros.txt";
	static String FileName_storedcar= "storedcar.txt";
	static String FileName_storedtrains= "storedtrains.txt";

	public static void main(String[] args) throws Exception {


//Initialise values
		carriagesdata=readCardata();
		trainsdata=readTraindata();
		metrosdata=readMetrodata();
		linesdata=readLinesdata();
		storedcardata=readStorescardata();
		storedtrainsdata=readStoredtrainsdata();
		metrosdata=readMetrosdata();
				
		
		for (int i=0; i<files.length;i++) {
			file = new File(files[i]);

			if (!file.exists()) {
				createFile(files[i]);
			}

		}

		int choice = 0;

		do {
			System.out.println("*************************************************");
			System.out.println("\t\tSunderland Metro");
			System.out.println("*************************************************\n");

			mainmenu();
		}while (choice !=8) ;
	}
	public static void loadArray(String fileName, String[][] arrayName)
	{
		try {
			BufferedWriter buffer = new BufferedWriter(new FileWriter(fileName));
			
			for(int i=0; i<arrayName.length; i++)
			{
				for(int y=0; y<arrayName[0].length; y++)
				{
					buffer.write(arrayName[i][y]+";");
				}
				buffer.newLine();
			}
			buffer.close();
		} catch(FileNotFoundException e) {
			System.out.println("File not found!");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error!");
			e.printStackTrace();
		}
	}

	

	public static String [][] readCardata(){

		try{
			File file = new File(FileName_carriages);

			if (!file.exists()) {
				file.createNewFile(); 
			}
		}catch(IOException e) {
			System.out.println("There was an error creating the file! [DEBUG: "+e.getMessage()+"]");
			System.out.println("Try again!");
			readCardata();
		}
		try {
			File file = new File(FileName_carriages);
			Scanner sc1 = new Scanner(file);

			int lineNumber = 0;
			while(sc1.hasNextLine()) {
				lineNumber++;
				sc1.nextLine();
			}
			sc1.close();

			sc1 = new Scanner(file);

			carriagesdata = new String[lineNumber][2];

			for(int i=0; sc1.hasNextLine(); i++)
			{
				String line = sc1.nextLine();
				carriagesdata[i][0] = String.valueOf((line.split(";")[0]));
				carriagesdata[i][1] = String.valueOf((line.split(";")[1]));

			}
			sc1.close();
		} catch (FileNotFoundException e) {
			System.out.println("There was an error creating the file! [DEBUG: "+e.getMessage()+"]");
		}

		return carriagesdata;
	}

	public static String [][] readTraindata(){

		try{
			File file = new File(FileName_trains);

			if (!file.exists()) {
				file.createNewFile(); 
			}
		}catch(IOException e) {
			System.out.println("There was an error creating the file [DEBUG: "+e.getMessage()+"]");
			System.out.println("Try again!");
			readTraindata();
		}
		try {
			File file = new File(FileName_trains);
			Scanner sc1 = new Scanner(file);

			int lineNumber = 0;
			while(sc1.hasNextLine()) {
				lineNumber++;
				sc1.nextLine();
			}
			sc1.close();

			sc1 = new Scanner(file);

			trainsdata = new String[lineNumber][2];

			for(int i=0; sc1.hasNextLine(); i++)
			{
				String line = sc1.nextLine();
				trainsdata[i][0] = String.valueOf((line.split(";")[0]));
				trainsdata[i][1] = String.valueOf((line.split(";")[1]));

			}
			sc1.close();
		} catch (FileNotFoundException e) {
			System.out.println("There was an error reading the file! [DEBUG: "+e.getMessage()+"]");
		}

		return trainsdata;
	}
	public static String [][] readMetrodata(){

		try{
			File file = new File(FileName_stations);

			if (!file.exists()) {
				file.createNewFile(); 
			}
		}catch(IOException e) {
			System.out.println("There was an error creating the file! [DEBUG: "+e.getMessage()+"]");
			System.out.println("Try again!");
			readMetrodata();
		}
		try {
			File file = new File(FileName_stations);
			Scanner sc1 = new Scanner(file);

			int lineNumber = 0;
			while(sc1.hasNextLine()) {
				lineNumber++;
				sc1.nextLine();
			}
			sc1.close();

			sc1 = new Scanner(file);

			stationsdata = new String[lineNumber][3];

			for(int i=0; sc1.hasNextLine(); i++)
			{
				String line = sc1.nextLine();
				stationsdata[i][0] = String.valueOf((line.split(";")[0]));
				stationsdata[i][1] = String.valueOf((line.split(";")[1]));
				stationsdata[i][2] = String.valueOf((line.split(";")[2]));
			}
			sc1.close();
		} catch (FileNotFoundException e) {
			System.out.println("There was an error reading the file! [DEBUG: "+e.getMessage()+"]");
		}

		return stationsdata;
	}
	public static String [][] readLinesdata(){

		try{
			File file = new File(FileName_lines);

			if (!file.exists()) {
				file.createNewFile(); 
			}
		}catch(IOException e) {
			System.out.println("There was an error reading the file! [DEBUG: "+e.getMessage()+"]");
			System.out.println("Try again!");
			readLinesdata();
		}
		try {
			File file = new File(FileName_lines);
			Scanner sc1 = new Scanner(file);

			int lineNumber = 0;
			while(sc1.hasNextLine()) {
				lineNumber++;
				sc1.nextLine();
			}
			sc1.close();

			sc1 = new Scanner(file);

			linesdata = new String[lineNumber][3];

			for(int i=0; sc1.hasNextLine(); i++)
			{
				String line = sc1.nextLine();
				linesdata[i][0] = String.valueOf((line.split(";")[0]));
				linesdata[i][1] = String.valueOf((line.split(";")[1]));
				linesdata[i][2] = String.valueOf((line.split("")[2]));

			}
			sc1.close();
		} catch (FileNotFoundException e) {
			System.out.println("There was an error reading the file! [DEBUG: "+e.getMessage()+"]");
		}

		return linesdata;
	}
	public static String [][] readMetrosdata(){
	try{
		File file = new File(FileName_metros);

		if (!file.exists()) {
			file.createNewFile(); 
		}
	}catch(IOException e) {
		System.out.println("There was an error creating the file! [DEBUG: "+e.getMessage()+"]");
		System.out.println("Try again!");
		readMetrosdata();
	}
	try {
		File file = new File(FileName_metros);
		Scanner sc1 = new Scanner(file);

		int lineNumber = 0;
		while(sc1.hasNextLine()) {
			lineNumber++;
			sc1.nextLine();
		}
		sc1.close();

		sc1 = new Scanner(file);

		metrosdata = new String[lineNumber][4];

		for(int i=0; sc1.hasNextLine(); i++)
		{
			String line = sc1.nextLine();
			metrosdata[i][0] = String.valueOf((line.split(";")[0]));
			metrosdata[i][1] = String.valueOf((line.split(";")[1]));
			metrosdata[i][2] = String.valueOf((line.split(";")[2]));
			
			

		}
	} catch (FileNotFoundException e) {
		System.out.println("There was an error reading the file! [DEBUG: "+e.getMessage()+"]");
	}

	return metrosdata;
	}
	public static String [][] readStorescardata(){

		try{
			File file = new File(FileName_storedcar);

			if (!file.exists()) {
				file.createNewFile(); 
			}
		}catch(IOException e) {
			System.out.println("There was an error creating the file! [DEBUG: "+e.getMessage()+"]");
			System.out.println("Try again!");
			readStorescardata();
		}
		try {
			File file = new File(FileName_storedcar);
			Scanner sc1 = new Scanner(file);

			int lineNumber = 0;
			while(sc1.hasNextLine()) {
				lineNumber++;
				sc1.nextLine();
			}
			sc1.close();

			sc1 = new Scanner(file);

			storedcardata = new String[lineNumber][2];

			for(int i=0; sc1.hasNextLine(); i++)
			{
				String line = sc1.nextLine();
				storedcardata[i][0] = String.valueOf((line.split(";")[0]));
				storedcardata[i][1] = String.valueOf((line.split(";")[1]));

			}
			sc1.close();
		} catch (FileNotFoundException e) {
			System.out.println("There was an error reading the file! [DEBUG: "+e.getMessage()+"]");
		}

		return storedcardata;
	}
	public static String [][] readStoredtrainsdata(){

		try{
			File file = new File(FileName_storedtrains);

			if (!file.exists()) {
				file.createNewFile(); 
			}
		}catch(IOException e) {
			System.out.println("There was an error creating the file! [DEBUG: "+e.getMessage()+"]");
			System.out.println("Try again!");
			readStoredtrainsdata();
		}
		try {
			File file = new File(FileName_storedtrains);
			Scanner sc1 = new Scanner(file);

			int lineNumber = 0;
			while(sc1.hasNextLine()) {
				lineNumber++;
				sc1.nextLine();
			}
			sc1.close();

			sc1 = new Scanner(file);

			storedtrainsdata = new String[lineNumber][2];

			for(int i=0; sc1.hasNextLine(); i++)
			{
				String line = sc1.nextLine();
				storedtrainsdata[i][0] = String.valueOf((line.split(";")[0]));
				storedtrainsdata[i][1] = String.valueOf((line.split(";")[1]));

			}
			sc1.close();
		} catch (FileNotFoundException e) {
			System.out.println("There was an error reading the file! [DEBUG: "+e.getMessage()+"]");
		}

		return storedtrainsdata;
	}

	public static void createFile(String name) {
		try {
			file = new File(name);

			if (file.createNewFile()) {
				System.out.println("File created sucessfully!");
			} else {
				System.out.println("Error creating file!");
			}
		} catch(IOException e) {
			System.out.println("Error!");
			e.printStackTrace();
		}
	}

	public static void mainmenu() throws Exception {
		int choice;
		System.out.println("*************************************************");
		System.out.println("\t\tMain Menu");
		System.out.println("*************************************************");
		System.out.println("1. List Company");
		System.out.println("2. Manage Trains/Carriages");
		System.out.println("3. Manage Depot");
		System.out.println("4. Manage Metro Compositions");
		System.out.println("5. Manage Stations/Lines");
		System.out.println("6. Manage changes");
		System.out.println("7. Stats");
		System.out.println("8. Exit");
		System.out.println("*************************************************\n");
		choice = keyboard.nextInt();
		do {
			switch(choice) {
			case 1:
				menu2();
				break;
			case 2:
				menu3();
				break;
			case 3:
				menu4();
				break;
			case 4:
				menu5();
				break;
			case 5:
				menu6();
				break;
			case 6:
				menu7();
				break;
			case 7:
				menu8();
				break;
			case 8:
				exitmenu();
				break;
			}
		}while (choice != 8);




	}
	public static void menu2() throws Exception {
		int choice;
		System.out.println("*************************************************");
		System.out.println("\t\tList Company");
		System.out.println("*************************************************");
		System.out.println("1. List Metro Compositions");
		System.out.println("2. List all trains/carriages");
		System.out.println("3. List free trains/carriages");
		System.out.println("4. List busy trains/carriages");
		System.out.println("5. Search train/carriage");
		System.out.println("6. Return to Main Menu");
		System.out.println("*************************************************\n");
		choice = keyboard.nextInt();
		switch(choice) {
		case 1:
			listallmetro();
			break;
		case 2:
			listalltraincarr();
			break;
		case 3:
			listallfreetraincarr();
			break;
		case 4:
			listallbusytraincarr();
			break;
		case 5:
			searchtraincarr();
			break;
		case 6:
			mainmenu();
			break;
		}


	}

	private static void searchtraincarr() throws Exception {
		int choice;
		System.out.println("*************************************************");
		System.out.println("\t\tSearch Train/Carriage");
		System.out.println("*************************************************");
		System.out.println("1. Search all Trains");
		System.out.println("2. Search all Carriages");
		System.out.println("3. Return to previous menu");
		System.out.println("*************************************************\n");
		choice = keyboard.nextInt();

		switch(choice) {
		case 1:
			searchtrain();
			break;
		case 2:
			searchcarriage();
			break;
		case 3:
			menu2();
			break;
		}
	}

	private static void listallbusytraincarr() throws Exception {
		
	}
	private static void searchcarriage() throws Exception {
		int number = 0;
		String element = null;
		try
		{
			System.out.print("What value do you want to search: ");
			String searchValue = keyboard.next();

			for (int i=0; i<carriagesdata.length;i++){
				for (int j=0; j<carriagesdata[0].length; j++) {
					if (carriagesdata[i][0].equals(searchValue)) {
						element = "["+i+"]["+0+"]";
					}
				}
			}
			for (int i=0; i<carriagesdata.length;i++){
				for (int j=0; j<carriagesdata[1].length; j++) {
					if (carriagesdata[i][1].equals(searchValue)) {
						element = "["+0+"]["+i+"]";
					}
				}
			}

			if (element == null) {
				System.out.println("Value not found");
			} else {
				System.out.println("The value "+searchValue+" was found on position "+element);
			}
		} catch(Exception e) {
			System.out.println("There was an error reading the file[DEBUG: "+e.getMessage()+"]");
		}		
		do{
			System.out.println("Press 1 to search for a new carriage or 0 to return to the previous menu.");
			number=keyboard.nextInt();
			if(number==1) {
				searchcarriage();
			}
			if(number==0) {
				searchtraincarr();

			}
			if(number!=0&&number!=1){
				System.out.println("You can only press 1 or 0");
				number=2;
			}

		}while(number==2);

	}



	private static void searchtrain() throws Exception {
		int number = 0;
		String element = null;
		try
		{
			System.out.print("What value do you want to search ");
			String searchValue = keyboard.next();

			for (int i=0; i<trainsdata.length;i++){
				for (int j=0; j<trainsdata[0].length; j++) {
					if (trainsdata[i][0].equals(searchValue)) {
						element = "["+i+"]["+0+"]";
					}
				}
			}
			for (int i=0; i<trainsdata.length;i++){
				for (int j=0; j<trainsdata[1].length; j++) {
					if (trainsdata[i][1].equals(searchValue)) {
						element = "["+0+"]["+i+"]";
					}
				}
			}

			if (element == null) {
				System.out.println("Value not found");
			} else {
				System.out.println("The value "+searchValue+" was found in position "+element);
			}
		} catch(Exception e) {
			System.out.println("There was an error reading the file [DEBUG: "+e.getMessage()+"]");
		}
		do{
			System.out.println("Press 1 to search for a new train or 0 to return to the previous menu");
			number=keyboard.nextInt();
			if(number==1) {
				searchtrain();
			}
			if(number==0) {
				searchtraincarr();

			}
			if(number!=0&&number!=1){
				System.out.println("You can only press 1 or 0");
				number=2;
			}

		}while(number==2);
			
		
	}		
	



	private static void listallfreetraincarr() throws Exception {
		int choice;
		System.out.println("*************************************************");
		System.out.println("\t\tList free trains/carriages");
		System.out.println("*************************************************");
		System.out.println("1. List all free trains");
		System.out.println("2. List all free carriages");
		System.out.println("3. Return to previous menu");
		System.out.println("*************************************************\n");
		choice = keyboard.nextInt();

		switch(choice) {
		case 1:
			listfreetrains();
			break;
		case 2:
			listfreecarriages();
			break;
		case 3:
			menu2();
			break;
		}
	}
	private static void listfreetrains() {
		int siezeoffreetrain =storedtrainsdata.length;


		for(int i=0; i<siezeoffreetrain; i++){

			System.out.println(storedtrainsdata[i][0]+"|"+storedtrainsdata[i][1]);

		}

	}



	private static void listfreecarriages() {
		int sizeoffreecar =storedcardata.length;


		for(int i=0; i<sizeoffreecar; i++){

			System.out.println(storedcardata[i][0]+"|"+storedcardata[i][1]);

		}

		
	}



	private static void listalltraincarr() throws Exception {
		int choice;
		System.out.println("*************************************************");
		System.out.println("\t\tList all trains/carriages");
		System.out.println("*************************************************");
		System.out.println("1. List all trains");
		System.out.println("2. List all carriages");
		System.out.println("3. Return to previous menu");
		System.out.println("*************************************************\n");
		choice = keyboard.nextInt();

		switch(choice) {
		case 1:
			listcarriages();
			break;
		case 2:
			listtrains();
			break;
		case 3:
			menu2();
			break;
		}
	}
	public static void listtrains()  {

		int sizeofTrains =carriagesdata.length;


		for(int i=0; i<sizeofTrains; i++){

			System.out.println(carriagesdata[i][0] +" : "+carriagesdata[i][1]);

		}

	}
	public static void listcarriages() throws Exception {
		int sizeofCarriages =trainsdata.length;


		for(int i=0; i<sizeofCarriages; i++){

			System.out.println(trainsdata[i][0] +" : "+trainsdata[i][1]);
		}
	}
		private static void listallmetro() {
			int sizeofcompositions =metrosdata.length;


			for(int i=0; i<sizeofcompositions; i++){

				System.out.println(metrosdata[i][0]+"|"+metrosdata[i][1]+"|"+metrosdata[i][2]);
			}

		}

		public static void menu3() throws Exception {
			int choice;
			System.out.println("*************************************************");
			System.out.println("\t\tManage trains/carriages");
			System.out.println("*************************************************");
			System.out.println("1. Create trains/carriages");
			System.out.println("2. Change trains/carriages");
			System.out.println("3. Remove trains/carriages");
			System.out.println("4. List trains/carriages");
			System.out.println("5. Return to previous menu");
			System.out.println("*************************************************\n");
			choice = keyboard.nextInt();
				switch(choice) {
				case 1:
					createtraincar();
					break;
				case 2:
					changetraincar();
					break;
				case 3:
					removetraincar();
					break;
				case 4:
					listalltraincarr();
					break;
				case 5:
					mainmenu();
					break;
				}
		}
		private static void createtraincar() throws Exception {
			int choice;
			System.out.println("*************************************************");
			System.out.println("\t\tAdd train/carriage");
			System.out.println("*************************************************");
			System.out.println("1. Add train");
			System.out.println("2. Add carriage");
			System.out.println("3. Return to previous menu");
			System.out.println("*************************************************\n");
			choice = keyboard.nextInt();

			switch(choice) {
			case 1:
				createTrain();
				break;
			case 2:
				createCarriage();
				break;
			case 3:
				menu3();
				break;}
		}





		private static void createCarriage() {
			int number=1;
			do{

				String arraytemp[][] = new String[carriagesdata.length+1][2];

				for(int i=0; i<carriagesdata.length;i++) 
				{
					arraytemp[i][0]=carriagesdata[i][0];
					arraytemp[i][1]=carriagesdata[i][1];
				}

				System.out.println("Insert carriage");

				arraytemp[arraytemp.length-1][0]= keyboard.next();

				System.out.println("Insert the number of passangers");

				arraytemp[arraytemp.length-1][1]= keyboard.next();

				carriagesdata=arraytemp;
				storedcardata=arraytemp;
				
				
				

				do{
					System.out.println("Press 1 to add a new carriage or 0 to return to previous menu.");
					number=keyboard.nextInt();
					if(number!=0&&number!=1){
						System.out.println("you can only use 1 or 0");
						number=2;
					}

				}while(number==2);
				
			}while(number!=0);
			loadArray(FileName_carriages,carriagesdata);
			loadArray(FileName_storedcar,storedcardata);
		}



		private static void createTrain() {
			int number=1;
			do{

				String arraytemp[][] = new String[trainsdata.length+1][2];

				
				for(int i=0; i<trainsdata.length;i++) 
				{
					arraytemp[i][0]=trainsdata[i][0];
					arraytemp[i][1]=trainsdata[i][1];
				}

				System.out.println("Insert the train");


				arraytemp[arraytemp.length-1][0]= keyboard.next();

				System.out.println("Insert the type of train");


				arraytemp[arraytemp.length-1][1]= keyboard.next();


				trainsdata=arraytemp;
				storedtrainsdata=arraytemp;

				do{
					System.out.println("Press 1 to add a new train or 0 to return to previous menu.");
					number=keyboard.nextInt();
					if(number!=0&&number!=1){
						System.out.println("you can only use 1 or 0");
						number=2;
					}

				}while(number==2);

			}while(number!=0);
			loadArray(FileName_trains,trainsdata);
			loadArray(FileName_storedtrains,storedtrainsdata);
		}




	
		private static void removetraincar() throws Exception {
			int escolha;
			System.out.println("*************************************************");
			System.out.println("\t\tRemove train/carriage");
			System.out.println("*************************************************");
			System.out.println("1. Remove Trains");
			System.out.println("2. Remove Carriage");
			System.out.println("3. Return to previous menu");
			System.out.println("*************************************************\n");
			escolha = keyboard.nextInt();

			switch(escolha) {
			case 1:
				removeTrain();
				break;
			case 2:
				removecarriages();
				break;
			case 3:
				menu3();
				break;}

		}

		private static void removecarriages() {

			String carriage;
			String arraytemp[][]= new String[carriagesdata.length-1][2];



			
			System.out.println("ID	 | Number of Passangers");
			for (int i = 0; i<carriagesdata.length; i++){
				if(carriagesdata[i][0].compareToIgnoreCase("0")!=0){
					System.out.println(carriagesdata[i][0]+ "  | " + carriagesdata[i][1]);
				}
			}
			System.out.println("Insert the ID of the carriage to remove");
			carriage=keyboard.next();
			int i=0;

			for(int j=0;j<carriagesdata.length;j++){
				

				if(carriagesdata[j][0].equalsIgnoreCase(carriage)){
					continue;
				}

				arraytemp[i][0]= carriagesdata[j][0];
				arraytemp[i][1]= carriagesdata[j][1];
				i++;	
			}
			carriagesdata=arraytemp;
			loadArray(FileName_carriages,carriagesdata);

		}
		private static void removeTrain() {

			String train;
			String arraytemp[][]= new String[trainsdata.length-1][2];
			System.out.println("ID	 | Type of train");
			for (int i = 0; i<trainsdata.length; i++){
				if(trainsdata[i][0].compareToIgnoreCase("0")!=0){
					System.out.println(trainsdata[i][0]+ "  | " + trainsdata[i][1]);
				}
			}
			System.out.println("Insert the ID of the train you want to remove");
			train=keyboard.next();
			int i=0;
			for(int j=0;j<trainsdata.length;j++){

				if(trainsdata[j][0].equalsIgnoreCase(train)){
					continue;
				}
				arraytemp[i][0]= trainsdata[j][0];
				arraytemp[i][1]= trainsdata[j][1];
				i++;	
			}
			trainsdata=arraytemp;
			loadArray(FileName_trains,trainsdata);

		}
		private static void changetraincar() throws Exception {
			int choice;
			System.out.println("*************************************************");
			System.out.println("\t\tChange Train/carriage");
			System.out.println("*************************************************");
			System.out.println("1. Change Train");
			System.out.println("2. Change Carriage");
			System.out.println("3. Return to previous menu");
			System.out.println("*************************************************\n");
			choice = keyboard.nextInt();

			switch(choice) {
			case 1:
				changeTrain();
				break;
			case 2:
				changecarr();
				break;
			case 3:
				menu3();
				break;}

		}
		private static void changecarr() {

			String carriage;
			String change;
			
				System.out.println("Insert the new number of passangers");
				System.out.println("ID     | Number of passangers");
				for (int i = 0; i<carriagesdata.length; i++){
					if(carriagesdata[i][0].compareToIgnoreCase("0")!=0)
						System.out.println(carriagesdata[i][0]+ "  | " + carriagesdata[i][1]);
				}	
				carriage=keyboard.next();
				for(int h=0;h<carriagesdata.length;h++){
					if(carriage.equals(carriagesdata[h][0])){
						System.out.println("Insert the new number of passangers");
						change=keyboard.next();
						for(int j=0;j<carriagesdata.length;j++){
							if(carriagesdata[j][0].equalsIgnoreCase(carriage)){
								carriagesdata[j][1]=change;

							}
						}
					}
				}
				loadArray(FileName_carriages,carriagesdata);
		}
		private static void changeTrain() {
			String train;
			String change;
		
				System.out.println("Insert the ID of the train to change");
				System.out.println("ID     | Type of Train");
				for (int i = 0; i<trainsdata.length; i++){
					if(trainsdata[i][0].compareToIgnoreCase("0")!=0)
						System.out.println(trainsdata[i][0]+ "  | " + trainsdata[i][1]);
				}	
				train=keyboard.next();
				for(int h=0;h<trainsdata.length;h++){
					if(train.equals(trainsdata[h][0])){
						System.out.println("Insert the new type");
						change=keyboard.next();
						for(int j=0;j<trainsdata.length;j++){
							if(trainsdata[j][0].equalsIgnoreCase(train)){
								trainsdata[j][1]=change;

							}
						}
					}
				}
				loadArray(FileName_trains,trainsdata);	
		}





		public static void menu4() throws Exception {
			int choice;
			System.out.println("*************************************************");
			System.out.println("\t\tManage Storage");
			System.out.println("*************************************************");
			System.out.println("1. Add Trains/Carriages");
			System.out.println("2. Remove Trains/Carriages");
			System.out.println("3. List Trains/Carriages");
			System.out.println("4. Return to previous menu");
			System.out.println("*************************************************\n");
			choice = keyboard.nextInt();
				switch(choice) {
				case 1:
					insertTrainCarrStore();
					break;
				case 2:
					removetraincarrstore();
					break;
				case 3:
					listtrainscarstore();
					break;
				case 4:
					mainmenu();
					break;
				}
		}
		private static void listtrainscarstore() throws Exception {
			int choice;
			System.out.println("*************************************************");
			System.out.println("\t\tList trains/carriages in storage");
			System.out.println("*************************************************");
			System.out.println("1. List all trains in storage");
			System.out.println("2. List all carriages in storage");
			System.out.println("3. Return to previous menu");
			System.out.println("*************************************************\n");
			choice = keyboard.nextInt();

			switch(choice) {
			case 1:
				listtrainsstorage();
				break;
			case 2:
				listcarstore();
				break;
			case 3:
				menu4();
				break;
			}
		}
		private static void listcarstore() {
			int sizeofcarriagesstore =storedcardata.length;


			for(int i=0; i<sizeofcarriagesstore; i++){

				System.out.println(storedcardata[i][0]+"|"+storedcardata[i][1]);

			}

			
		}



		private static void listtrainsstorage() {
			int sizeoftrainstorage =storedtrainsdata.length;


			for(int i=0; i<sizeoftrainstorage; i++){

				System.out.println(storedtrainsdata[i][0]+"|"+storedtrainsdata[i][1]);

			}

			
		}



		private static void removetraincarrstore() throws Exception {
			int choice;
			System.out.println("*************************************************");
			System.out.println("\t\tRemove train/carriage from storage");
			System.out.println("*************************************************");
			System.out.println("1. Remove train from storage");
			System.out.println("2. Remove carriage from storage");
			System.out.println("3. Return to previous menu");
			System.out.println("*************************************************\n");
			choice = keyboard.nextInt();

			switch(choice) {
			case 1:
				removetrainstore();
				break;
			case 2:
				removecarriagestore();
				break;
			case 3:
				menu4();
				break;}

		}
		private static void removetrainstore() {
			String storage;
			String arraytemp[][]= new String[storedtrainsdata.length-1][2];



			
			System.out.println("ID	 | Type of train");
			for (int i = 0; i<storedtrainsdata.length; i++){
				if(storedtrainsdata[i][0].compareToIgnoreCase("0")!=0){
					System.out.println(storedtrainsdata[i][0]);
				}
			}
			System.out.println("Insert the ID of the train to remove from storage");
			storage=keyboard.next();
			int i=0;

			for(int j=0;j<storedtrainsdata.length;j++){
				

				if(storedtrainsdata[j][0].equalsIgnoreCase(storage)){
					continue;
				}

				arraytemp[i][0]= storedtrainsdata[j][0];
				arraytemp[i][1]= storedtrainsdata[j][1];
				i++;	
			}
			storedtrainsdata=arraytemp;
			loadArray(FileName_storedtrains,storedtrainsdata);
			
		}



		private static void removecarriagestore() {
			String storage;
			String arraytemp[][]= new String[storedcardata.length-1][2];



			
			System.out.println("ID	 | number of passangers");
			for (int i = 0; i<storedcardata.length; i++){
				if(storedcardata[i][0].compareToIgnoreCase("0")!=0){
					System.out.println(storedcardata[i][0]);
				}
			}
			System.out.println("Insert the ID of the carriage to delete");
			storage=keyboard.next();
			int i=0;

			for(int j=0;j<storedcardata.length;j++){
				

				if(storedcardata[j][0].equalsIgnoreCase(storage)){
					continue;
				}

				arraytemp[i][0]= storedcardata[j][0];
				arraytemp[i][1]= storedcardata[j][1];
				i++;	
			}
			storedcardata=arraytemp;

			
			loadArray(FileName_storedcar,storedcardata);
		}



		private static void insertTrainCarrStore() throws Exception {
			int choice;
			System.out.println("*************************************************");
			System.out.println("\t\tInsert trains/carriages in storage");
			System.out.println("*************************************************");
			System.out.println("1. Insert a train in storage");
			System.out.println("2. Insert a carriage in storage");
			System.out.println("3. Return to previous menu");
			System.out.println("*************************************************\n");
			choice = keyboard.nextInt();

			switch(choice) {
			case 1:
				inserttrainstorage();
				break;
			case 2:
				insertcarriagestorage();
				break;
			case 3:
				menu4();
				break;}
		}
		private static void insertcarriagestorage() {
			//TODO
		}



		private static void inserttrainstorage() {
			//TODO
			
		}
		


		public static void menu5() throws Exception {
			int choice;
			System.out.println("*************************************************");
			System.out.println("\t\tManage Compositions");
			System.out.println("*************************************************");
			System.out.println("1. Create composition");
			System.out.println("2. Associate train/carriage");
			System.out.println("3. Change Composition");
			System.out.println("4. Change assotiation");
			System.out.println("5. Remove Composition");
			System.out.println("6. Remove association");
			System.out.println("7. Return to the previous menu");
			System.out.println("*************************************************\n");
			choice = keyboard.nextInt();
				switch(choice) {
				case 1:
					createMetroComp();
					break;
				case 2:
					associateTrainCarr();
					break;
				case 3:
					changeComp();
					break;
				case 4:
					alteassoautocarru();
					break;
				case 5:
					remocompmetro();
					break;
				case 6:
					remoassoautocarru();
					break;
				case 7:
					mainmenu();
					break;
				}
		}
		private static void remoassoautocarru() {
			//TODO
		}
		private static void remocompmetro() {
			String composition;
			String arraytemp[][]= new String[metrosdata.length-1][3];
			System.out.println("ID  | Train | Carriage");
			for (int i = 0; i<metrosdata.length; i++){
				if(metrosdata[i][0].compareToIgnoreCase("0")!=0){
					System.out.println(metrosdata[i][0]+ "  | " + metrosdata[i][1]+ "  | " + metrosdata[i][2]);
				}
			}
			System.out.println("Insert the ID of the composition you want to remove");
			composition=keyboard.next();
			int i=0;
			for(int j=0;j<metrosdata.length;j++){

				if(metrosdata[j][0].equalsIgnoreCase(composition)){
					continue;
				}
				arraytemp[i][0]=metrosdata[j][0];
				arraytemp[i][1]=metrosdata[j][1];
				arraytemp[i][2]=metrosdata[j][2];
				i++;	
			}
			metrosdata=arraytemp;
			loadArray(FileName_metros,metrosdata);

		}
		
		private static void alteassoautocarru() {
			
			//TODO
		}
		private static void changeComp() {
			String composition;
			String change;
			String change2;
			
				
				System.out.println("ID  | Train | Carriage");
				for (int i = 0; i<metrosdata.length; i++){
					if(metrosdata[i][0].compareToIgnoreCase("0")!=0)
						System.out.println(metrosdata[i][0]+ "  | " + metrosdata[i][1]+ "  | " + metrosdata[i][2]);
				}	
				System.out.println("Insert the ID of the composition to change");
				composition=keyboard.next();
				for(int h=0;h<metrosdata.length;h++){
					if(composition.equals(metrosdata[h][0])){
						System.out.println("Insert a new train to a composition");
						change=keyboard.next();
						System.out.println("Insert a new carriage to a composition");
						change2=keyboard.next();
						for(int j=0;j<metrosdata.length;j++){
							if(metrosdata[j][0].equalsIgnoreCase(composition)){
								metrosdata[j][1]=change;
								metrosdata[j][2]=change2;

							
						}
					}
				}
					
					
				}
			
				loadArray(FileName_metros,metrosdata);
		}
		private static void associateTrainCarr() {
			
			String arraytemp[][] = new String[metrosdata.length+1][4];
			for(int i=0; i<metrosdata.length; i++) 
			{
				System.out.println(metrosdata[i][0]);
			}
			
			System.out.println("Insert the composition ID");
			arraytemp[arraytemp.length-1][0]= keyboard.next();
			
			System.out.println("Insert only one train");

			arraytemp[arraytemp.length-1][1]= keyboard.next();
			
			System.out.println("Insert only one carriage");
			
			
			arraytemp[arraytemp.length-1][2]= keyboard.next();
			
			metrosdata=arraytemp;
			loadArray(FileName_metros,metrosdata);
			
		}
		


		private static void createMetroComp() {
			

				String arraytemp[][] = new String[metrosdata.length+1][3];

				for(int i=0; i < metrosdata.length ;i++) 
				{
					arraytemp[i] = metrosdata[i];
				
				}

				System.out.println("Insert the Composition ID");

				arraytemp[arraytemp.length-1][0]= keyboard.next();
				
				
				metrosdata=arraytemp;
				
			

				
				loadArray(FileName_metros,metrosdata);
		
		}
		

		public static void menu6() throws Exception {
			int choice;
			System.out.println("*************************************************");
			System.out.println("\t\tManage Stations/Lines");
			System.out.println("*************************************************");
			System.out.println("1. Add Station");
			System.out.println("2. Change Station");
			System.out.println("3. Remove Station");
			System.out.println("4. Add Line");
			System.out.println("5. Change Line");
			System.out.println("6. Remove Line");
			System.out.println("7. Add station to line");
			System.out.println("8. Change station from line");
			System.out.println("9. Remove station from line");
			System.out.println("10. List Stations");
			System.out.println("11. List lines");
			System.out.println("12. Return to previous menu");
			System.out.println("*************************************************\n");
			choice = keyboard.nextInt();
			
				switch(choice) {
				case 1:
					createStation();
					break;
				case 2:
					changeStation();
					break;
				case 3:
					removeStation();
					break;
				case 4:
					createLine();
					break;
				case 5:
					changeLine();
					break;
				case 6:
					removeLine();
					break;
				case 7:
					assosStationtoLines();
					break;
				case 8:
					changeLineStation();
					break;
				case 9:
					remoestacaolinha();
					break;
				case 10:
					listStations();
					break;
				case 11:
					listLines();
					break;
				case 12:
					mainmenu();
					break;

				}
			
		}

		private static void listLines() {
			int sizeofLines =linesdata.length;


			for(int i=0; i<sizeofLines; i++){

				System.out.println(linesdata[i][0] +" | "+linesdata[i][1]+" | "+linesdata[i][2]);
			}
		}

		private static void listStations() throws Exception  {

			int sizeOfStations = metrosdata.length;


			for(int i=0; i<sizeOfStations; i++){

				System.out.println(metrosdata[i][0] +" | "+metrosdata[i][1]+" | "+metrosdata[i][2]);
			}
		}

		private static void remoestacaolinha() {
		//TODO
		}



		private static void changeLineStation() {
			String line;
			String change;
			
				
				System.out.println("ID | Line Colour | Station");
				for (int i = 0; i < linesdata.length; i++){
					if(linesdata[i][0].compareToIgnoreCase("0")!=0)
						System.out.println(linesdata[i][0]+ "  | " + linesdata[i][1]+ "  | " + linesdata[i][2]);
				}	
				
				System.out.println("Insert the ID of the line you want to change");
				line=keyboard.next();

				for(int h=0; h<linesdata.length; h++){

					if(line.equals(linesdata[h][0])){

						System.out.println("Insert the new station");
						change=keyboard.next();

						for(int j=0;j<linesdata.length;j++){

							if(linesdata[j][0].equalsIgnoreCase(line)){

								linesdata[j][2]=change;

							}

						}
					}
				}
				loadArray(FileName_lines,linesdata);
		}
		private static void assosStationtoLines() {
			  System.out.println("ID     | Line Colour");
		        for (int i = 0; i<linesdata.length; i++){
		            if(linesdata[i][0].compareToIgnoreCase("0")!=0){
		                System.out.println(linesdata[i][0]+ "  | " + linesdata[i][1]);
		            }
		        }
		        System.out.println("\nStations");
		        for(int i=0; i<metrosdata.length; i++)
		        {
		            System.out.println(metrosdata[i][0]);
		        }

		        System.out.println("\nWhat station do you want to add");
		        String estacao= keyboard.next();

		        System.out.println("What line to do you want to add this to");
		        String linha = keyboard.next();

		        for (int i=0; i<linesdata.length; i++)
		        {
		            if(linesdata[i][0].equalsIgnoreCase(linha))
		            {
		                linesdata[i][2]= estacao;

		            }
		        }


		        loadArray(FileName_lines,linesdata);
		}

		private static void removeLine() {
			String line;
			String arraytemp[][]= new String[linesdata.length-1][3];
			System.out.println("ID     | Line Colour | Line Stops");
			for (int i = 0; i<linesdata.length; i++){
				if(linesdata[i][0].compareToIgnoreCase("0")!=0){
					System.out.println(linesdata[i][0]+ "  | " + linesdata[i][1]+ "  | " + linesdata[i][2]);
				}
			}
			System.out.println("Insert the line ID to remove");
			line=keyboard.next();
			int i=0;
			for(int j=0;j<linesdata.length;j++){

				if(linesdata[j][0].equalsIgnoreCase(line)){
					continue;
				}
				arraytemp[i][0]=linesdata[j][0];
				arraytemp[i][1]=linesdata[j][1];
				arraytemp[i][2]=linesdata[j][2];
				i++;	
			}
			linesdata=arraytemp;
			loadArray(FileName_lines,linesdata);
		}
		private static void changeLine() {
			String line;
			String change;
			
				
				System.out.println("ID     | Line colour | Line Stops");
				for (int i = 0; i < linesdata.length; i++){
					if(linesdata[i][0].compareToIgnoreCase("0")!=0)
						System.out.println(linesdata[i][0]+ "  | " + linesdata[i][1]);
				}	
				System.out.println("Insert the ID of the line you want to change");
				line=keyboard.next();

				for(int h=0; h<linesdata.length; h++){

					if(line.equals(linesdata[h][0])){

						System.out.println("Insert the new line colour");
						change=keyboard.next();

						for(int j=0;j<linesdata.length;j++){

							if(linesdata[j][0].equalsIgnoreCase(line)){

								linesdata[j][1]=change;

							}

						}
					}
				}
				loadArray(FileName_lines,linesdata);
		}
		private static void createLine() {
			int number=1;
			do{

				String arraytemp[][] = new String[linesdata.length+1][3];


				for(int i=0; i<linesdata.length;i++) 
				{
					arraytemp[i][0]=linesdata[i][0];
					arraytemp[i][1]=linesdata[i][1];
				}

				System.out.println("Insert the line ID");


				arraytemp[arraytemp.length-1][0]= keyboard.next();

				System.out.println("Insert the line colour");


				arraytemp[arraytemp.length-1][1]= keyboard.next();

				linesdata=arraytemp;

				do{
					System.out.println("Press 1 to add a new line or 0 to go back");
					number=keyboard.nextInt();
					if(number!=0&&number!=1){
						System.out.println("You can only use 1 or 0");
						number=2;
					}

				}while(number==2);

			}while(number!=0);
			loadArray(FileName_lines,linesdata);
		}
		private static void removeStation() {
			String station;
			String arraytemp[][]= new String[stationsdata.length-1][3];
			System.out.println("ID     | Station Name | Station Location");
			for (int i = 0; i<stationsdata.length; i++){
				if(stationsdata[i][0].compareToIgnoreCase("0")!=0){
					System.out.println(stationsdata[i][0]+ "  | " + stationsdata[i][1]+ "  | " + stationsdata[i][2]);
				}
			}
			System.out.println("Insert the ID of the station that you want to change");
			station=keyboard.next();
			int i=0;
			for(int j=0;j<stationsdata.length;j++){

				if(stationsdata[j][0].equalsIgnoreCase(station)){
					continue;
				}
				arraytemp[i][0]= stationsdata[j][0];
				arraytemp[i][1]=stationsdata[j][1];
				arraytemp[i][2]=stationsdata[j][2];
				i++;	
			}
			stationsdata=arraytemp;
			loadArray(FileName_stations,stationsdata);
		}
		private static void changeStation() {
			String station;
			String change;
			String change2;
			
				
				System.out.println("ID     | Station Name | Station Location");
				for (int i = 0; i<stationsdata.length; i++){
					if(stationsdata[i][0].compareToIgnoreCase("0")!=0)
						System.out.println(stationsdata[i][0]+ "  | " + stationsdata[i][1]+ "  | " + stationsdata[i][2]);
				}	
				System.out.println("Insert the ID of the station that you want to change");
				station=keyboard.next();
				for(int h=0;h<stationsdata.length;h++){
					if(station.equals(stationsdata[h][0])){
						System.out.println("Insert the new name of the station");
						change=keyboard.next();
						System.out.println("Insert the new location of the station");
						change2=keyboard.next();
						for(int j=0;j<stationsdata.length;j++){
							if(stationsdata[j][0].equalsIgnoreCase(station)){
								stationsdata[j][1]=change;
								stationsdata[j][2]=change2;

							
						}
					}
				}
					
				}
				loadArray(FileName_stations,stationsdata);

		}
		private static void createStation() {
			int number=1;
			do{

				String arraytemp[][] = new String[stationsdata.length+1][3];


				for(int i=0; i<stationsdata.length;i++) 
				{
					arraytemp[i][0]=stationsdata[i][0];
					arraytemp[i][1]=stationsdata[i][1];
				}

				System.out.println("Insert the station ID");


				arraytemp[arraytemp.length-1][0]= keyboard.next();

				System.out.println("Insert the station name");


				arraytemp[arraytemp.length-1][1]= keyboard.next();
				

				stationsdata=arraytemp;

				do{
					System.out.println("Prima 1 para inserir uma nova carruagem ou 0 para voltar.");
					number=keyboard.nextInt();
					if(number!=0&&number!=1){
						System.out.println("Apenas pode inserir 0 ou 1");
						number=2;
					}

				}while(number==2);

			}while(number!=0);
			loadArray(FileName_stations,stationsdata);

		}
		public static void menu7() throws Exception {
			int choice;
			System.out.println("*************************************************");
			System.out.println("\t\tManage Movements");
			System.out.println("*************************************************");
			System.out.println("1. TODO");
			System.out.println("4. Return to previous menu");
			System.out.println("*************************************************\n");
			choice = keyboard.nextInt();
				switch(choice) {
				case 1:
					menu7();
					break;
				case 2:
					menu7();
					break;
				case 3:
					menu7();
					break;
				case 4:
					mainmenu();
					break;
				}
		}

		public static void menu8() throws Exception {
			int choice;
			System.out.println("*************************************************");
			System.out.println("\t\tStatistics");
			System.out.println("*************************************************");
			System.out.println("1. TODO ");;
			System.out.println("7. Return");
			System.out.println("*************************************************\n");
			choice = keyboard.nextInt();
			
				switch(choice) {
				case 1:
					menu8();
					break;
				case 2:
					menu8();
					break;
				case 3:
					menu8();
					break;
				case 4:
					menu8();
					break;
				case 5:
					menu8();
					break;
				case 6:
					menu8();
					break;
				case 7:
					mainmenu();
					break;
				}
		}
		public static void exitmenu() throws Exception {
			int choice;
			System.out.println("*************************************************");
			System.out.println("Do you really want to exit? 1-Yes 2-No");
			System.out.println("*************************************************");
			choice = keyboard.nextInt();
			switch(choice) {
			case 1:
				System.exit(0);
				break;
			case 2:
				mainmenu();
				break;

			}

		}
	}

