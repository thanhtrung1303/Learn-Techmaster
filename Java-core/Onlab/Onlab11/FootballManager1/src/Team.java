import java.util.ArrayList;
import java.util.Random;

public class Team {
    public ArrayList<Player> getAllTeam(){
        ArrayList<Player> players = new ArrayList<>();
        players.add(new Player(1, "Nguyễn Văn A", Position.GK));
        players.add(new Player(2, "Nguyễn Văn B", Position.DF));
        players.add(new Player(3, "Nguyễn Văn C", Position.DF));
        players.add(new Player(4, "Nguyễn Văn D", Position.DF));
        players.add(new Player(5, "Nguyễn Văn F", Position.DF));
        players.add(new Player(6, "Nguyễn Văn H", Position.MF));
        players.add(new Player(8, "Nguyễn Văn J", Position.MF));
        players.add(new Player(9, "Nguyễn Văn K", Position.MF));
        players.add(new Player(10, "Nguyễn Văn L", Position.MF));
        players.add(new Player(11, "Nguyễn Văn Z", Position.MF));
        players.add(new Player(12, "Nguyễn Văn C", Position.FW));
        players.add(new Player(13, "Nguyễn Văn V", Position.FW));
        players.add(new Player(14, "Nguyễn Văn B", Position.FW));

        return players;
    }

    public void show(ArrayList<Player> players){
        for (Player player : players ){
            System.out.println(player);
        }
    }

    public ArrayList<Player> buildTeam(int df, int mf, int fw, ArrayList<Player> allPlayer){
        ArrayList<Player> choiceTeam = new ArrayList<>();

        int teamNumber = allPlayer.size();
        Random random = new Random();

        int gkNumber = 0;
        int dfNumber = 0;
        int mfNumber = 0;
        int fwNumber = 0;

//        chon thu mon

        while (gkNumber < 1){
            int gkRandom = random.nextInt(teamNumber);
            if (allPlayer.get(gkRandom).getPosition() == Position.GK){
                Player choicePlayer = allPlayer.get(gkRandom);
                choiceTeam.add(choicePlayer);
                gkNumber++;
            }
        }

//        chon hau ve

        while (dfNumber < df){
            int dfRandom = random.nextInt(teamNumber);
            if (allPlayer.get(dfRandom).getPosition() == Position.DF){
                if (!choiceTeam.contains(allPlayer.get(dfRandom))){
                    choiceTeam.add(allPlayer.get(dfRandom));
                    dfNumber++;
                }
            }
        }

        //        chon tien ve

        while (mfNumber < mf){
            int mfRandom = random.nextInt(teamNumber);
            if (allPlayer.get(mfRandom).getPosition() == Position.MF){
                if (!choiceTeam.contains(allPlayer.get(mfRandom))){
                    choiceTeam.add(allPlayer.get(mfRandom));
                    mfNumber++;
                }
            }
        }

        //        chon tien dao

        while (fwNumber < fw){
            int fwRandom = random.nextInt(teamNumber);
            if (allPlayer.get(fwRandom).getPosition() == Position.FW){
                if (!choiceTeam.contains(allPlayer.get(fwRandom))){
                    choiceTeam.add(allPlayer.get(fwRandom));
                    fwNumber++;
                }
            }
        }
        return choiceTeam;
    }
}
