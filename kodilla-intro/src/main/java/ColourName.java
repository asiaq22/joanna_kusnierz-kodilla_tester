public class ColourName {
    public static String colour(String letter){
        switch (letter) {
            case "W":
            case "w": return "WHITE";
            case "R":
            case "r": return "RED";
            case "Y":
            case "y": return "YELLOW";
            case "O":
            case "o": return "ORANGE";
            case "P":
            case "p": return "PINK";
            case "G":
            case "g": return "GREEN";
            case "B":
            case "b": return "BLUE";
            default: return "Wrong. Only W, R, Y, O, P, G or B.";

        }
    }
}
