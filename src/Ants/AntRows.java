package Ants;

class AntRows {
    private final String redAnts;
    private final String blackAnts;

    AntRows(String redAnts, String blackAnts) {
        this.redAnts = redAnts;
        this.blackAnts = blackAnts;
    }

    String advance(int steps) {
        return blackAnts + redAnts;
    }
}
