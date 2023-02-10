import java.awt.*;
import java.util.Arrays;

public class EightQueens {
    public static void main(String[] args) {
        char[][] brett = {
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',}
        };
        char leer = ' ';
        char queen = 'Q';
        boolean dort = false;
        int queens = 0;
        Point prüf = new Point(0, 0);
        suchFeld(brett, leer, queen, dort, prüf, queens);
        String ausgabe = "";
        for (int i = 0; i < brett.length; i++) {
            for (int j = 0; j < brett[i].length; j++) {
                ausgabe += brett[i][j];
            }
            ausgabe += ("\n");
        }
        System.out.println(ausgabe.replace(" ", " ░ ").replace("Q", " Q "));
    }
    public static boolean suchFeld(char[][] brett, char leer, char queen, boolean dort, Point prüf, int queens) {
        if (prüfW(brett, prüf) && prüfS(brett, prüf) && prüfD(brett, prüf)) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean prüfW(char[][] brett, Point prüf) {
        for (int i = 0; i < brett[prüf.x].length; i++) {
            if (brett[prüf.x][i] == 'Q') {
                return false;
            }
        }
        return true;
    }
    public static boolean prüfS(char[][] brett, Point prüf) {
        for (int i = 0; i < brett.length; i++) {
            if (brett[i][prüf.y] == 'Q') {
                return false;
            }
        }
        return true;
    }
    public static boolean prüfD(char[][] brett, Point prüf) {
        for (int i = 1; i < (brett.length * brett.length); i++) {
            if (prüf.x-i >= 0
             && prüf.y+i <= brett[prüf.x].length-1
             && prüf.y-i >= 0) {
                if (brett[prüf.x - i][prüf.y + i] == 'Q'
                 || brett[prüf.x - i][prüf.y - i] == 'Q') {
                    return false;
                }
            }

        }
        return true;
    }
}
