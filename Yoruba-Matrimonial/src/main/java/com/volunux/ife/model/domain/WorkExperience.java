package com.volunux.ife.model.domain;

import java.time.LocalDate;

public class WorkExperience {

    private Member member;

    private String slug;
    private String company;
    private String companyLogo;
    private Boolean currentPosition;
    private String jobTitle;
    private String description;
    private String location; // Geography
    private LocalDate startDate;
    private LocalDate endDate;
}
