public class Portfolio {

    // Basic information
    private String name;
    private String college;
    private String course;
    private int year;

    // Constructor
    public Portfolio(String name, String college, String course, int year) {
        this.name = name;
        this.college = college;
        this.course = course;
        this.year = year;
    }

    // Display portfolio
    public void displayPortfolio() {
        System.out.println("Portfolio of " + name);
        System.out.println("College: " + college);
        System.out.println("Course: " + course);
        System.out.println("Year: " + year);
        System.out.println("\nProjects and Skills:");
        listProjects();
        listSkills();
    }

    // List of projects
    private void listProjects() {
        System.out.println("- Project 1: Online Library Management System");
        System.out.println("- Project 2: E-commerce Website");
        System.out.println("- Project 3: Personal Portfolio Website");
    }

    // List of skills
    private void listSkills() {
        System.out.println("- Programming Languages: Java, Python, JavaScript");
        System.out.println("- Web Technologies: HTML, CSS, React.js");
        System.out.println("- Database: MySQL, MongoDB");
    }

    public static void main(String[] args) {
        // Create portfolio for Ajinkya Patil
        Portfolio ajinkyaPortfolio = new Portfolio("Ajinkya Patil", "VESIT", "IT Engineering", 3);
        
        // Display the portfolio
        ajinkyaPortfolio.displayPortfolio();
    }
}
