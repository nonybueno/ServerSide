package com.example.test.entitire;

import lombok.*;

//@Getter
@Setter
@AllArgsConstructor
@ToString

public class Subject {
    private String id;
    private String title;
    private double credit;

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public double getCredit() {
        return credit;
    }

    public String getTestMethodEl() {
        return "test EL";
    }

    public double getGpax() {
        return 3.0;
    }
}
