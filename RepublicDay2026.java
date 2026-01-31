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
        
        System.out.println("\n--- Historical Significance ---");
        System.out.println("• Constitution adopted: 26 January 1950");
        System.out.println("• India became a sovereign democratic republic");
        System.out.println("• Dr. B.R. Ambedkar: Architect of the Indian Constitution");
        System.out.println("• Constitution came into effect: 26 January 1950");
        
        System.out.println("\n--- Celebration Details ---");
        System.out.println("• National Holiday: Yes");
        System.out.println("• Main Celebration: New Delhi (India Gate)");
        System.out.println("• Flag Hoisting: Throughout the country");
        System.out.println("• National Anthem: Sung across the nation");
        System.out.println("• Parade: Grand parade with military and cultural displays");
        
        System.out.println("\n--- Republic Day 2026 Facts ---");
        System.out.println("• Year of celebration: 77th Republic Day");
        System.out.println("• Constitution age: 76 years old");
        System.out.println("• Day of week: " + dayOfWeek);
        System.out.println("• Status: National Holiday");
        
        System.out.println("\n--- Important Points ---");
        System.out.println("• Preamble of Constitution starts with 'We the People'");
        System.out.println("• India has the world's longest written constitution");
        System.out.println("• Constitution has 448 articles and 12 schedules");
        System.out.println("• Dr. B.R. Ambedkar led the Drafting Committee");
        
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
