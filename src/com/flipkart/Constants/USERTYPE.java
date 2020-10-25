package com.flipkart.constants;

public enum USERTYPE {
    Admin,
    Professor,
    Student;

    public static USERTYPE valueOfType(String label) {
        for (USERTYPE e : values()) {
            if (e.name().toLowerCase().equals(label.toLowerCase())) {
                return e;
            }
        }
        return null;
    }
}
