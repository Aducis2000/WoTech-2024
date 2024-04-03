public class Lesson5 {
    public static void main(String[] args) {

        String season = "Autumn";
        var temperature = -25.7;
        if (temperature <=5) {
            System.out.println("Super warm!");
        } else if (temperature <= 15) {
            System.out.println("Warm!");
        } else if (temperature <= 30) {
            System.out.println("Wear normal!");
        } else {
            System.out.println("You need cooling!");
        }

        if (season == "Winter") {
            System.out.println("Wear a warm jacket!");
        } else if (season == "Spring") {
            System.out.println("Wear a T-shirt");
        } else if (season == "Summer") {
            System.out.println("Wear a swimming suit!");
        } else if (season == "Autumn") {
            System.out.println("Wear a rain coat!");
        } else {
            System.out.println("I do not recognise this season!");
        }

    }

}
