import java.util.Scanner;
public class FirstClassAssignment{
	public static void main(String[] Args){
		// System.out.println("It is working");
		Scanner userInput = new Scanner(System.in);
		
		String[][] studentInfo = new String[5][6];
		
		for(int i = 0; i < studentInfo.length; i++){
			
			System.out.print("Enter your FirstName: ");
			studentInfo[i][0] = userInput.nextLine();

			System.out.print("Enter your LastName: ");
			studentInfo[i][1] = userInput.nextLine();

			System.out.print("Enter your Course: ");
			studentInfo[i][2] = userInput.nextLine();

			System.out.print("Enter your Level: ");
			studentInfo[i][3] = userInput.nextLine();

			System.out.print("Enter your Age: ");
			studentInfo[i][4] = userInput.nextLine();
			
			String fullname = studentInfo[i][0] + " "+ studentInfo[i][1];
			System.out.println("fullname: "+ studentInfo[i][0] + " "+ studentInfo[i][1]);
			System.out.println("Course: "+ studentInfo[i][2]);
			System.out.println("Level: "+ studentInfo[i][3]);
			System.out.println("Age: "+ studentInfo[i][4]);
				
			if( i+1 == studentInfo.length ){
				System.out.println("Thanks to all Students for supplying their details");
				System.out.println("CLICK TO WRITE TEST");
			}else {
				System.out.println("Thanks for registering your details!!! "+ fullname + ", Click enter for next student");
			}
			userInput.nextLine();
		}

		for(String[] stud : studentInfo) {
			String[] questions= {
						"Is Boolean a programming language? True or False",
						"Are you a programmer? Yes or No",
						"Does Java starts with an alphabet J? True or False",
						"Are you are a Human Being?  A. Yes   B. Not yet   C. None of the Above   D. No",
						"Which of the following is a JAVA file extension?  A. jsx   B.js   C. html   D. java   E. None of the Above",
				};
		int[] answerArr = {0,0,0,0,0};
		int reslt = 0;
		System.out.println("Welcome "+ stud[0].toUpperCase() + " " + stud[1].toUpperCase());
		System.out.println("Click to write your Test "+ stud[0].toUpperCase());
		userInput.nextLine();
		for(int qq = 0; qq < questions.length; qq++){
			System.out.print("Question "+ (qq+1 + ": "));
			System.out.println(questions[qq]);
			System.out.print("Answer: ");
			String myAnswer = userInput.nextLine();
			if (qq==0) {
				
				if (myAnswer.toLowerCase().equals("false")) {
					answerArr[0] = 1;
					// System.out.println("This is the first " + myAnswer.toLowerCase());
				} else {
					System.out.println("This is Incorrect");
				}

			} else if(qq == 1){
				
				if (myAnswer.toLowerCase().equals("yes")) {
					answerArr[1] = 1;
					// System.out.println("This is the second " + myAnswer.toLowerCase());
				} else {
					System.out.println("This is Incorrect");
				}

			} else if(qq == 2){
				if (myAnswer.toLowerCase().equals("true")) {
					answerArr[2] = 1;
					// System.out.println("This is the third " + myAnswer.toLowerCase());
				} else {
					System.out.println("This is last Incorrect");
				}
			} else if (qq == 3){
				if (myAnswer.toLowerCase().equals("yes") || myAnswer.toLowerCase().equals("a")) {
					answerArr[3] = 1;
					// System.out.println("This is the second " + myAnswer.toLowerCase());
				} else {
					System.out.println("This is Incorrect");
				}
			} else if(qq == 4){
				if (myAnswer.toLowerCase().equals("java") || myAnswer.toLowerCase().equals("d")) {
					answerArr[4] = 1;
					// System.out.println("This is the second " + myAnswer.toLowerCase());
				} else {
					System.out.println("This is Incorrect");
				}
			}
		}
			reslt = answerArr[0] + answerArr[1] + answerArr[2] + answerArr[3] + answerArr[4];
			System.out.println(stud[0].toUpperCase() + ", You scored "+ reslt +" out of "+ questions.length + " with " + (reslt*100)/questions.length + "%.");
			userInput.nextLine();
			stud[5] = "" + reslt;
		}
		

		// for(String[] stud : studentInfo) {
		// 	System.out.print(stud);
		// 	// for(String studer : stud){
		// 	// 	System.out.print(studer);
		// 	// }
			
		// }
	}
}