import java.util.Scanner;
public class Troll{
	public static void main(String[] Args){
		Scanner userInput = new Scanner(System.in);
		
		String[][] studentInfo = new String[2][3];
		
		for(int i = 0; i < studentInfo.length; i++){
			
			System.out.print("Enter your FirstName: ");
			studentInfo[i][0] = userInput.nextLine();

			System.out.print("Enter your LastName: ");
			studentInfo[i][1] = userInput.nextLine();

			studentInfo[i][2] = "0";

			String fullname = studentInfo[i][0] + " "+ studentInfo[i][1];
			System.out.println("fullname: "+ studentInfo[i][0] + " "+ studentInfo[i][1]);
				
			if( i+1 == studentInfo.length ){
				System.out.println("Thanks to all Students for supplying their details");
				System.out.println("CLICK TO WRITE TEST");
			}else {
				System.out.println("Thanks for registering your details!!! "+ fullname + ", Click enter for next student");
			}
			userInput.nextLine();
		}
		int[] allResult = new int[2];
		
		for(String[] stud : studentInfo) {
			String[] questions= {
						"Is Boolean a programming language? True or False",
						"Are you a programmer? Yes or No",
						"Does Java starts with an alphabet J? True or False",
				};
			int[] answerArr = {0,0,0};
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
					} else {
						System.out.println("This is Incorrect");
					}

				} else if(qq == 1){
					
					if (myAnswer.toLowerCase().equals("yes")) {
						answerArr[1] = 1;
					} else {
						System.out.println("This is Incorrect");
					}

				} else {
					if (myAnswer.toLowerCase().equals("true")) {
						answerArr[2] = 1;
					} else {
						System.out.println("This is Incorrect");
					}
				}
			}
			reslt = answerArr[0] + answerArr[1] + answerArr[2];
			System.out.println(stud[0].toUpperCase() + ", You scored "+ reslt +" out of "+ questions.length + " with " + (reslt*100)/questions.length + "%.");
			userInput.nextLine();
			stud[2] = "" + reslt;
			
		}

		for(int std = 0; std < studentInfo.length; std++){
			allResult[std] = Integer.parseInt(studentInfo[std][2]);
		}
		String winnerName = null;
		int maxRes = allResult[0];
		System.out.println(" All results are: "+ allResult[0] + " " + allResult[1]);
		for(int yy = 1; yy < allResult.length; yy++){
			int eachRes= allResult[yy];
		 	if(eachRes > maxRes){
				maxRes = eachRes;
			}
		}
		for(int std = 0; std < studentInfo.length; std++){
			if(maxRes == Integer.parseInt(studentInfo[std][2])){
				winnerName = studentInfo[std][0] + " " +studentInfo[std][1];
			}
		}
		System.out.println("The Winner is: " + winnerName);
		System.out.println("The maixmum score is: " + maxRes);
		// winnerName = eachname;
		// while(Integer.parseInt(studentInfo[ss][5]) == maxRes ){
		// 	winnerName = studentInfo[ss][0] + studentInfo[ss][1];
		// }
		// System.out.println("And the winner's name is: " + winnerName);
		
		// // System.out.println(eachRes);
		// // System.out.println("And the winner's name is: " + winnerName);
		// System.out.println("The maixmum score is: " + maxRes);

		// for(String[] studRes : studentInfo) {
		// 	int maxRes = studRes[5];
		// 	// System.out.println(studRes[5]);
		// }		
	}
}