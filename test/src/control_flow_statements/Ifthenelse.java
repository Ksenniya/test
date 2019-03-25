package control_flow_statements;

public class Ifthenelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int testscore = 80;
char grade;

if (testscore>=90) {
	grade = 'A';
}
else if (testscore>=70) {
	grade = 'C';
}
else if (testscore>=80) {
	grade = 'B';
}



else {
	
	grade = 'F';
}


System.out.println(grade);
	}
	

}
