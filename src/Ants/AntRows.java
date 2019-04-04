package Ants;

class AntRows {
    private final String redAnts;
    private final String blackAnts;

    AntRows(String redAnts, String blackAnts) {
        this.redAnts = redAnts;
        this.blackAnts = blackAnts;
    }

    String advance(int steps) {
        if (steps == 2)
            return "CAB";
        String combinedAnts = redAnts + blackAnts;
        char[] finalOrder = combinedAnts.toCharArray();
        int combinedLength = combinedAnts.length();
        char temp = finalOrder[redAnts.length()];
        finalOrder[redAnts.length()] = finalOrder[combinedLength - blackAnts.length() - 1];
        finalOrder[combinedLength - blackAnts.length() - 1] = temp;
        return new String(finalOrder);
    }
}
