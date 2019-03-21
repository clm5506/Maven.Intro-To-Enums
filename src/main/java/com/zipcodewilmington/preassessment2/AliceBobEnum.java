package com.zipcodewilmington.preassessment2;

public enum AliceBobEnum {
    ALICE,
    BOB;

    public String getCatchPhrase() {
        return "Hey, my name is " + this.name() + "!";
    }

    public boolean isAlice() {
        return this == AliceBobEnum.ALICE;
    }

    public boolean isBob() {
        return this == AliceBobEnum.BOB;
    }
}
