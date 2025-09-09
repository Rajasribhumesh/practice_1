import java.io.FileWriter;
import java.io.IOException;

public class SportsDayWebPage {
    public static void main(String[] args) {
        String htmlContent = """
        <!DOCTYPE html>
        <html lang="en">
        <head>
            <meta charset="UTF-8">
            <title>Sports Day 2025</title>
            <style>
                body { font-family: Arial, sans-serif; background: #f2f2f2; margin: 0; padding: 0; }
                header { background: #0077b6; color: #fff; padding: 20px; text-align: center; }
                section { margin: 40px auto; max-width: 800px; background: #fff; padding: 30px; border-radius: 8px; box-shadow: 0 2px 10px rgba(0,0,0,0.1);}
                h2 { color: #0077b6; }
                ul { list-style: square; }
                footer { text-align: center; padding: 15px; background: #0077b6; color: #fff; margin-top: 40px; }
            </style>
        </head>
        <body>
            <header>
                <h1>Welcome to Sports Day 2025!</h1>
                <p>Celebrate teamwork, fitness, and fun</p>
            </header>
            <section>
                <h2>Event Highlights</h2>
                <ul>
                    <li>100m Sprint</li>
                    <li>Relay Race</li>
                    <li>Long Jump</li>
                    <li>Football Tournament</li>
                    <li>Cricket Match</li>
                    <li>Fun Games & Activities</li>
                </ul>
                <h2>Venue & Date</h2>
                <p><strong>Date:</strong> September 20, 2025</p>
                <p><strong>Venue:</strong> School/College Sports Ground</p>
                <h2>Join Us!</h2>
                <p>
                    All students, staff, and parents are invited.<br>
                    For registration, contact the Sports Coordinator.
                </p>
            </section>
            <footer>
                &copy; 2025 Sports Day Committee
            </footer>
        </body>
        </html>
        """;

        try (FileWriter fw = new FileWriter("sports_day.html")) {
            fw.write(htmlContent);
            System.out.println("Webpage 'sports_day.html' created successfully.");
        } catch (IOException e) {
            System.out.println("Error creating the webpage: " + e.getMessage());
        }
    }
}