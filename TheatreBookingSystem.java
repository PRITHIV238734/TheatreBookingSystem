import java.util.Scanner;

public class TheatreBookingSystem {
    private static final int ROWS = 5;
    private static final int SEATS = 10;
    private static boolean[][] bookedSeats = new boolean[ROWS][SEATS];
    private static final int TICKET_PRICE = 150;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n THEATRE BOOKING SYSTEM ");
            System.out.println("1. Show Seats");
            System.out.println("2. Book Ticket");
            System.out.println("3. Show Statistics");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    showSeats();
                    break;
                case 2:
                    bookTicket(sc);
                    break;
                case 3:
                    showStatistics();
                    break;
                case 4:
                    System.out.println("Thank you for using Theatre Booking System!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 4);

        sc.close();
    }

    private static void showSeats() {
        System.out.println("\nSeating Arrangement (O = Available, X = Booked)");
        System.out.print("   ");
        for (int seat = 1; seat <= SEATS; seat++) {
            System.out.printf("%2d ", seat);
        }
        System.out.println();
        for (int row = 0; row < ROWS; row++) {
            System.out.printf("R%d ", (row + 1));
            for (int seat = 0; seat < SEATS; seat++) {
                if (bookedSeats[row][seat]) {
                    System.out.print(" X ");
                } else {
                    System.out.print(" O ");
                }
            }
            System.out.println();
        }
    }

    private static void bookTicket(Scanner sc) {
        System.out.print("Enter row number (1-" + ROWS + "): ");
        int row = sc.nextInt() - 1;
        System.out.print("Enter seat number (1-" + SEATS + "): ");
        int seat = sc.nextInt() - 1;

        if (row < 0 || row >= ROWS || seat < 0 || seat >= SEATS) {
            System.out.println(" Invalid seat selection!");
            return;
        }

        if (bookedSeats[row][seat]) {
            System.out.println(" Seat already booked! Choose another.");
        } else {
            bookedSeats[row][seat] = true;
            System.out.println(" Ticket booked successfully! Price: ₹" + TICKET_PRICE);
        }
    }

    private static void showStatistics() {
        int bookedCount = 0;
        int totalIncome = 0;

        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < SEATS; j++) {
                if (bookedSeats[i][j]) {
                    bookedCount++;
                    totalIncome += TICKET_PRICE;
                }
            }
        }

        System.out.println("\n Booking Statistics:");
        System.out.println("Total Seats: " + (ROWS * SEATS));
        System.out.println("Booked Seats: " + bookedCount);
        System.out.println("Available Seats: " + ((ROWS * SEATS) - bookedCount));
        System.out.println("Total Income: ₹" + totalIncome);
    }
}
