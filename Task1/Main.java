public class Main{
	public static void main(String [] args){

		Team teamB= new Team("TeamB");
		Team teamA= new Team("TeamA");
		Team teamC= new Team("TeamC");
		Team teamD= new Team("TeamD");
		Team teamE= new Team("TeamE");
		Team teamF= new Team("TeamF");
		

		int rank=teamB.setRank(10);
		System.out.println(rank);

		String toStringB=teamB.toString();
		System.out.println(toStringB);

		String toStringA=teamA.toString();
		System.out.println(toStringA);

		String toStringC=teamC.toString();
		System.out.println(toStringC);

		String toStringD=teamD.toString();
		System.out.println(toStringD);

		String toStringE=teamE.toString();
		System.out.println(toStringE);

		String toStringF=teamF.toString();
		System.out.println(toStringF);
	}
}