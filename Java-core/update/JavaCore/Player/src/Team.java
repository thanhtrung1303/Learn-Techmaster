import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Team {
    public ArrayList<Player> getAllPlayers() {
        ArrayList<Player> list = new ArrayList<>();
        list.add(new Player(1, "Đặng Văn Lâm", Position.GK));
        list.add(new Player(32, "Đặng Văn Trường", Position.GK));
        list.add(new Player(2, "Quế Ngọc Hải", Position.DF));
        list.add(new Player(4, "Sergio Ramos", Position.DF));
        list.add(new Player(3, "Pepe", Position.DF));
        list.add(new Player(5, "Nacho", Position.DF));
        list.add(new Player(26, "Vidic", Position.DF));
        list.add(new Player(30, "Van Dijk", Position.DF));
        list.add(new Player(6, "Kroos", Position.MF));
        list.add(new Player(8, "Iniesta", Position.MF));
        list.add(new Player(17, "Modric", Position.MF));
        list.add(new Player(36, "Casemiro", Position.MF));
        list.add(new Player(45, "Xavi", Position.MF));
        list.add(new Player(7, "Ronaldo", Position.FW));
        list.add(new Player(9, "Benzema", Position.FW));
        list.add(new Player(11, "Bale", Position.FW));
        list.add(new Player(10, "Messi", Position.FW));
        list.add(new Player(60, "Cavani", Position.FW));
        list.add(new Player(15, "Suarez", Position.FW));
        list.add(new Player(99,"Navas",Position.GK));
        return list;
    }

    public void show(ArrayList<Player> list) {
        for (Player player : list
        ) {
            System.out.println(player);
        }
    }


    public ArrayList<Player> buildTeamByMe(int df, int mf, int fw, ArrayList<Player> allPlayer){
        ArrayList<Player> chooseTeam = new ArrayList<>();
        int gkNumber = 0;
        int dfNumber = 0;
        int mfNumber = 0;
        int fwNumber = 0;

        //        Chọn thủ môn
        while (gkNumber < 1) {
            Collections.shuffle(allPlayer); //Trộn mảng
            if (allPlayer.get(0).getPosition() == Position.GK) {
                Player choicePlayer = allPlayer.get(0);
                chooseTeam.add(choicePlayer);
                gkNumber++;
            }
        }

        //        Chọn hậu vệ
        while (dfNumber < df) {
           Collections.shuffle(allPlayer);
            if (allPlayer.get(0).getPosition() == Position.DF) {
                if (!chooseTeam.contains(allPlayer.get(0))) {
                    chooseTeam.add(allPlayer.get(0));
                    dfNumber++;
                }
            }
        }

        //Chọn tiền vệ
        while (mfNumber < mf) {
            Collections.shuffle(allPlayer);
            if (allPlayer.get(0).getPosition() == Position.MF) {
                if (!chooseTeam.contains(allPlayer.get(0))) {
                    chooseTeam.add(allPlayer.get(0));
                    mfNumber++;
                }
            }
        }

        while (fwNumber < fw) {
            Collections.shuffle(allPlayer);
            if (allPlayer.get(0).getPosition() == Position.FW) {
                if (!chooseTeam.contains(allPlayer.get(0))) {
                    chooseTeam.add(allPlayer.get(0));
                    fwNumber++;
                }
            }
        }
        return chooseTeam;

    }



    public ArrayList<Player> buildTeam(int df, int mf, int fw, ArrayList<Player> allPlayer) {
        ArrayList<Player> chooseTeam = new ArrayList<>();

        int teamNumber = allPlayer.size();


        Random random = new Random();
        int gkNumber = 0;
        int dfNumber = 0;
        int mfNumber = 0;
        int fwNumber = 0;

        //        Chọn thủ môn
        while (gkNumber < 1) {
            int gkRandum = random.nextInt(teamNumber);
            if (allPlayer.get(gkRandum).getPosition() == Position.GK) {
                Player choicePlayer = allPlayer.get(gkRandum);
                chooseTeam.add(choicePlayer);
                gkNumber++;
            }
        }

//        Chọn hậu vệ
        while (dfNumber < df) {
            int dfRandom = random.nextInt(teamNumber);
            if (allPlayer.get(dfRandom).getPosition() == Position.DF) {
                if (!chooseTeam.contains(allPlayer.get(dfRandom))) {
                    chooseTeam.add(allPlayer.get(dfRandom));
                    dfNumber++;
                }
            }
        }
//Chọn tiền vệ
        while (mfNumber < mf) {
            int mfRandom = random.nextInt(teamNumber);
            if (allPlayer.get(mfRandom).getPosition() == Position.MF) {
                if (!chooseTeam.contains(allPlayer.get(mfRandom))) {
                    chooseTeam.add(allPlayer.get(mfRandom));
                    mfNumber++;
                }
            }
        }

        while (fwNumber < fw) {
            int fwRandom = random.nextInt(teamNumber);
            if (allPlayer.get(fwRandom).getPosition() == Position.FW) {
                if (!chooseTeam.contains(allPlayer.get(fwRandom))) {
                    chooseTeam.add(allPlayer.get(fwRandom));
                    fwNumber++;
                }
            }
        }
        return chooseTeam;
    }


    public ArrayList<Player> getAllGK(ArrayList<Player> list) {
        ArrayList<Player> listGk = new ArrayList<>();
        for (Player player : list
        ) {
            if (player.getPosition() == Position.GK) listGk.add(player);
        }
        return listGk;
    }

    public ArrayList<Player> getAllDf(ArrayList<Player> list) {
        ArrayList<Player> listDf = new ArrayList<>();
        for (Player player : list
        ) {
            if (player.getPosition() == Position.DF) listDf.add(player);
        }
        return listDf;
    }

    public ArrayList<Player> getAllMF(ArrayList<Player> list) {
        ArrayList<Player> listMf = new ArrayList<>();
        for (Player player : list
        ) {
            if (player.getPosition() == Position.MF) listMf.add(player);
        }
        return listMf;
    }

    public ArrayList<Player> getAllFw(ArrayList<Player> list) {
        ArrayList<Player> listFw = new ArrayList<>();
        for (Player player : list
        ) {
            if (player.getPosition() == Position.FW) listFw.add(player);
        }
        return listFw;
    }

    public void buildTeam442(ArrayList<Player> list) {
        System.out.println("Đội hình là:");
        Random rnd = new Random();
        ArrayList<Player> listGk = getAllGK(list);
        Collections.shuffle(listGk);
        System.out.println(list.get(0));

        ArrayList<Player> listDF = getAllDf(list);
        Collections.shuffle(listDF);
        for (int i = 0; i < 4; i++) {
            System.out.println(listDF.get(i));
        }

        ArrayList<Player> listMF = getAllMF(list);
        Collections.shuffle(listMF);
        for (int i = 0; i < 4; i++) {
            System.out.println(listMF.get(i));
        }
        ArrayList<Player> listFW = getAllFw(list);
        Collections.shuffle(listFW);
        for (int i = 0; i < 2; i++) {
            System.out.println(listFW.get(i));
        }

    }


    public void buildTeam(ArrayList<Player> list) {

        Scanner sc = new Scanner(System.in);
        int choice;
        choice = sc.nextInt();
        while (choice < 4) {
            switch (choice) {
                case 1:

                    break;
            }
        }

    }
}
