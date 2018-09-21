package Interviewquestions;

public class RemoveJunk {


	public static void main(String[] args) {
		System.out.println("Hello");
		String s="##@#@ hello world 012345566";
			//Regular expression: [^a-zA-Z0-9]
			
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
		
	}
}
