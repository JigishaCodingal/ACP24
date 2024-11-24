// Base class: Wonder
class Wonder {
    // Method to display information about the wonder
    public void displayInfo() {
        System.out.println("This is a wonder of the world.");
    }
}

// Derived classes for each wonder
class GreatWallOfChina extends Wonder {
    @Override
    public void displayInfo() {
        System.out.println("Wonder: Great Wall of China\nLocation: China");
    }
}

class Petra extends Wonder {
    @Override
    public void displayInfo() {
        System.out.println("Wonder: Petra\nLocation: Jordan");
    }
}

class ChristTheRedeemer extends Wonder {
    @Override
    public void displayInfo() {
        System.out.println("Wonder: Christ the Redeemer\nLocation: Brazil");
    }
}

class MachuPicchu extends Wonder {
    @Override
    public void displayInfo() {
        System.out.println("Wonder: Machu Picchu\nLocation: Peru");
    }
}

class ChichenItza extends Wonder {
    @Override
    public void displayInfo() {
        System.out.println("Wonder: Chichen Itza\nLocation: Mexico");
    }
}

class RomanColosseum extends Wonder {
    @Override
    public void displayInfo() {
        System.out.println("Wonder: Roman Colosseum\nLocation: Italy");
    }
}

class TajMahal extends Wonder {
    @Override
    public void displayInfo() {
        System.out.println("Wonder: Taj Mahal\nLocation: India");
    }
}

// Main class


public class polymorphism {
    public static void main(String[] args) {
        // Create an array of Wonder objects
        Wonder[] wonders = {
                new GreatWallOfChina(),
                new Petra(),
                new ChristTheRedeemer(),
                new MachuPicchu(),
                new ChichenItza(),
                new RomanColosseum(),
                new TajMahal()
        };
    
        // Loop through the wonders and display their information
        System.out.println("The Seven Wonders of the World:");
        for (Wonder wonder : wonders) {
            wonder.displayInfo();
            System.out.println();
        }
    
}}
