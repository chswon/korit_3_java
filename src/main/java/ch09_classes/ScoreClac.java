package ch09_classes;

public class ScoreClac {
    public double addScores(double totalscore, double addedScore) {
        return totalscore + addedScore;
    }

    public double calculateAvg(double totalScore, int numberOfSubs) {
        return totalScore / numberOfSubs;
    }
}
