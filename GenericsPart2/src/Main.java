public class Main {
    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");
        //adelaideCrows football teaam
        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        adelaideCrows.addPlayer(joe);
        //adelaideCrows.addPlayer(beckham);
        //adelaideCrows.addPlayer(pat);
        System.out.println(adelaideCrows.numPlayers());
        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago clubs");
        baseballTeam.addPlayer(pat);
        Team<SoccerPlayer> soccerTeam = new Team<>("AC MILAN");
        soccerTeam.addPlayer(beckham);
        //Team<String> brokenTeam = new Team<>("this won't work");
        //brokenTeam.addPlayer("no-one");
        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        FootballPlayer banks = new FootballPlayer("Gordon");
        melbourne.addPlayer(banks);
        Team<FootballPlayer> hawthorn = new Team<>("Hawthron");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");
        hawthorn.matchResult(fremantle,1,0);
        hawthorn.matchResult(adelaideCrows,3,8);
        adelaideCrows.matchResult(fremantle,2,1);
        //adelaideCrows.matchResult(baseballTeam,1,1);
        System.out.println("Ranking");
        System.out.println(adelaideCrows.getName() + " : " + adelaideCrows.ranking());
        System.out.println(melbourne.getName() + " : " + melbourne.ranking());
        System.out.println(fremantle.getName() + " : " + fremantle.ranking());
        System.out.println(hawthorn.getName() + " : " + hawthorn.ranking());
        System.out.println(adelaideCrows.compareTo(melbourne));
        System.out.println(adelaideCrows.compareTo(hawthorn));
    }
}
