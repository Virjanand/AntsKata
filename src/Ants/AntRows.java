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
        swapAnts(finalOrder, redAnts.length(), combinedLength - blackAnts.length() - 1);
        return new String(finalOrder);
    }

    private void swapAnts(char[] finalOrder, int redAntPosition, int blackAntPosition) {
        char temp = finalOrder[redAntPosition];
        finalOrder[redAntPosition] = finalOrder[blackAntPosition];
        finalOrder[blackAntPosition] = temp;
    }
}
