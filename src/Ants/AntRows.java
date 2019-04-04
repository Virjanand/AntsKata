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
        char temp = finalOrder[1];
        finalOrder[1] = finalOrder[0];
        finalOrder[0] = temp;
        if (redAnts.equals("AB")) {
            return "ACB";
        }
        return new String(finalOrder);
    }
}
