package com.zipcodewilmington.preassessment2;

public class AliceBobEvaluator {
    String input;

    public AliceBobEvaluator(String input) {
        this.input = input.toUpperCase();
    }

    public boolean isAlice() {

        return this.input.equals(AliceBobEnum.ALICE.name());
    }

    public boolean isBob() {
        return this.input.equals(AliceBobEnum.BOB.name());
    }
}
