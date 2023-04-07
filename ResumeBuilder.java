/* 
Online Resume Builder Using Java Language
*/

import java.util.Scanner;

public class ResumeBuilder {
    private String name;
    private String email;
    private String phone;
    private String education;
    private String experience;
    private String skills;

    public ResumeBuilder() {
        // Constructor to initialize the resume builder
        this.name = "";
        this.email = "";
        this.phone = "";
        this.education = "";
        this.experience = "";
        this.skills = "";
    }

    public void enterPersonalInfo() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter your name: ");
            this.name = scanner.nextLine();
            System.out.println("Enter your email: ");
            this.email = scanner.nextLine();
            System.out.println("Enter your phone number: ");
            this.phone = scanner.nextLine();
        }
    }

    public void enterEducation() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter your education: ");
            this.education = scanner.nextLine();
        }
    }

    public void enterExperience() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter your experience: ");
            this.experience = scanner.nextLine();
        }
    }

    public void enterSkills() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter your skills: ");
            this.skills = scanner.nextLine();
        }
    }

    public void generateResume() {
        System.out.println("Resume:");
        System.out.println("Name: " + this.name);
        System.out.println("Email: " + this.email);
        System.out.println("Phone: " + this.phone);
        System.out.println("Education: " + this.education);
        System.out.println("Experience: " + this.experience);
        System.out.println("Skills: " + this.skills);
    }

    public static void main(String[] args) {
        ResumeBuilder resumeBuilder = new ResumeBuilder();
        resumeBuilder.enterPersonalInfo();
        resumeBuilder.enterEducation();
        resumeBuilder.enterExperience();
        resumeBuilder.enterSkills();
        resumeBuilder.generateResume();
    }
}
