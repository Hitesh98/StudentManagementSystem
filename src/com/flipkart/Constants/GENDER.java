package com.flipkart.constants;

public enum GENDER {
    Male,
    Female;

    public static GENDER valueOfGender(String label) {
        for (GENDER e : values()) {
            if (e.name().toLowerCase().equals(label.toLowerCase())) {
                return e;
            }
        }
        return null;
    }
}
