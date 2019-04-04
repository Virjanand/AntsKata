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
        int combinedLength = combinedAnts.length();
            for (int i = 0; i < steps; i++) {
                swapAnts(finalOrder, redAnts.length() - i, redAnts.length() - 1 - i);
            }
        if (blackAnts.length() == 2) {
            swapAnts(finalOrder, 2, 3);
        }
            return new String(finalOrder);
    }

    private void swapAnts(char[] finalOrder, int blackAntPosition, int redAntPosition) {
        char temp = finalOrder[blackAntPosition];
        finalOrder[blackAntPosition] = finalOrder[redAntPosition];
        finalOrder[redAntPosition] = temp;
    }
}
