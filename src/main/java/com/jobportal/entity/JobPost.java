package com.jobportal.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "jobpost")
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Setter
@Getter
@Data
public class JobPost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long jobId;
    private String jobTitle;
    private String jobDescription;
    private String companyName;
    private String location;
    private String jobType; // Full-time, Part-time, Internship, Contract

    private String experienceRequired;
    private String salaryRange;
    private String skillsRequired;

    private String postedBy; // recruiter or employer name
    private LocalDateTime postedDate;
    private LocalDateTime applicationDeadline;

    @Enumerated(EnumType.STRING)
    private JobStatus status; // OPEN, CLOSED, DRAFT, EXPIRED


}
