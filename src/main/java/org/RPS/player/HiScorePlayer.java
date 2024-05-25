package org.RPS.player;

public class HiScorePlayer {
    Player player;
    int totalScore;

    public HiScorePlayer(Player player) {
        this.player = player;
    }

    public int getTotalScore(){
        return totalScore;
    }

    public void print(){
        System.out.println(player.getName() + " - " + totalScore);
    }



//
//    public void setTotalScore(){
//        totalScore++;
//    }
}
