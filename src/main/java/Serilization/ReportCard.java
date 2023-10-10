package Serilization;

public class ReportCard {
    private final int id;
    private final ScienceMarks scienceMarks;
    private final ArtsMarks artsMarks;
    private final double finalPercentage;

    public ReportCard(int id, ScienceMarks scienceMarks, ArtsMarks artsMarks, double finalPercentage) {
        this.id = id;
        this.scienceMarks = scienceMarks;
        this.artsMarks = artsMarks;
        this.finalPercentage = finalPercentage;
    }

}
