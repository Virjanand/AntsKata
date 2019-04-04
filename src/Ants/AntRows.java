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
        int j = 0;
        while (blackAnts.length() - 1 - j >= 0 && j < steps) {
            int i = 0;
            while (redAnts.length() - 1 - i >= 0 && i < steps - j) {
                swapAnts(finalOrder, redAnts.length() - 1 + j - i, redAnts.length() + j - i);
                i++;
            }
            j++;
        }
        return new String(finalOrder);
    }

    private void swapAnts(char[] finalOrder, int redAntPosition, int blackAntPosition) {
        char temp = finalOrder[blackAntPosition];
        finalOrder[blackAntPosition] = finalOrder[redAntPosition];
        finalOrder[redAntPosition] = temp;
    }
}
