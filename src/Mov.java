
// including nuances with classes and checking if the code is correct empty constructors etc. etc. etc.

    // Cinema class
    class Cinema {
        private String name;
        private int numberOfScreens;

        public Cinema() {

        }
        public Cinema(String name, int numberOfScreens) {
            this.name = name;
            this.numberOfScreens = numberOfScreens;
        }

        public String getName() {
            return name;
        }

        public int getNumberOfScreens() {
            return numberOfScreens;
        }

        public void displayInfo() {
            System.out.println("Cinema Name: " + name);
            System.out.println("Number of Screens: " + numberOfScreens);
        }
    }

    // Movie class extending Cinema
    class Movie extends Cinema {
        private String title;
        private int durationMinutes;

        public Movie(String cinemaName, int numberOfScreens, String title, int durationMinutes) {
            super(cinemaName, numberOfScreens);
            this.title = title;
            this.durationMinutes = durationMinutes;
        }

        public String getTitle() {
            return title;
        }

        public int getDurationMinutes() {
            return durationMinutes;
        }

        // Override displayInfo() to include movie-specific information
        @Override
        public void displayInfo() {
            super.displayInfo(); // Call the displayInfo() method of the parent class

            System.out.println("Movie Title: " + title);
            System.out.println("Duration: " + durationMinutes + " minutes");
        }
    }

    // Example usage
    public class Mov {
        public static void main(String[] args) {
            // Creating an instance of the Movie class
            Cinema movie = new Movie("Example Cinema", 3, "Sample Movie", 120);
            //Movie cinema = new Cinema("XD",213); wrong

            // Displaying information using the overridden displayInfo() method
            movie.displayInfo();
        }
    }
