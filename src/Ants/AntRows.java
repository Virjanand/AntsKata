package Ants;

class AntRows {
    private final String redAnts;
    private final String blackAnts;

    AntRows(String redAnts, String blackAnts) {
        this.redAnts = redAnts;
        this.blackAnts = blackAnts;
    }

    String advance(int steps) {
        String combinedAnts = redAnts + blackAnts;
        char[] finalOrder = combinedAnts.toCharArray();
        char temp = finalOrder[redAnts.length()];
        finalOrder[redAnts.length()] = finalOrder[combinedAnts.length() - blackAnts.length() - steps];
        finalOrder[combinedAnts.length() - blackAnts.length() - steps] = temp;
        return new String(finalOrder);
    }
}
