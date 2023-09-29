public class Team{

	String teamName;
	int teamRank;
	String playerName;
	

	public Team(String teamName){

		this.teamName=teamName;


	}

	public int setRank(int number){
		teamRank=0;
		teamRank+=number;
		return teamRank;
	}

	public String toString(){
		return teamName + ": De Uovervindelige:"+ teamRank;
	}
}