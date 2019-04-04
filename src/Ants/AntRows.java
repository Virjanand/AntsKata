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
        int i = 0;
        while (redAnts.length() - 1 - i >= 0 && i < steps) {
            swapAnts(finalOrder, redAnts.length() - 1 - i, redAnts.length() - i);
            i++;
        }
        i = 0;
        while (blackAnts.length() - 1 - i > 0 && i < steps) {
            swapAnts(finalOrder, redAnts.length() - i, redAnts.length() + 1 - i);
            i++;
        }
        if (steps > 2) {
            swapAnts(finalOrder, redAnts.length() - 1, redAnts.length());
        }
        return new String(finalOrder);
    }

    private void swapAnts(char[] finalOrder, int redAntPosition, int blackAntPosition) {
        char temp = finalOrder[blackAntPosition];
        finalOrder[blackAntPosition] = finalOrder[redAntPosition];
        finalOrder[redAntPosition] = temp;
    }
}
