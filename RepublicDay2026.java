import java.time.LocalDate;
import java.time.DayOfWeek;
import java.time.format.DateTimeFormatter;

public class RepublicDay2026 {
    
    public static void main(String[] args) {
        displayRepublicDayDetails();
    }
    
    public static void displayRepublicDayDetails() {
        // Create the date for 26th January 2026
        LocalDate republicDay = LocalDate.of(2026, 1, 26);
        
        // Get day of week
        DayOfWeek dayOfWeek = republicDay.getDayOfWeek();
        
        // Format the date
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy");
        String formattedDate = republicDay.format(formatter);
        
        System.out.println("====================================");
        System.out.println("  REPUBLIC DAY 2026 - DETAILS");
        System.out.println("====================================\n");
        
        System.out.println("Date: " + formattedDate);
        System.out.println("Day: " + dayOfWeek);
        System.out.println("Date (DD/MM/YYYY): " + republicDay.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        
        System.out.println("\n--- About Republic Day ---");
        System.out.println("Republic Day is celebrated on 26th January every year in India.");
        System.out.println("It commemorates the adoption of the Indian Constitution.");


         System.out.println("This Jenkins CI pipeline uses SCM polling to automatically trigger a build whenever a developer pushes changes to the Git repository");
        

        
        System.out.println("\n====================================");
        
        // Additional details
        System.out.println("\n--- Days Information ---");
        System.out.println("Days until Republic Day 2026 (from today's perspective):");
        LocalDate today = LocalDate.of(2026, 1, 31);
        long daysPassed = java.time.temporal.ChronoUnit.DAYS.between(republicDay, today);
        System.out.println("Days passed since Republic Day 2026: " + daysPassed + " days");
        
        System.out.println("\n====================================\n");
    }
}
