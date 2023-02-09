import java.awt.*;

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
        boolean dort;
        dort = suchFeld(brett, leer, queen, dort);
    }
    public static boolean suchFeld(char[][] brett, char leer, char queen, boolean dort) {
            Point prüf = new Point(0, 0);

            prüfW(brett, prüf);
            prüfS(brett, prüf);
            prüfD(brett, prüf);
        return dort;
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
        if ()
        return true;
    }
}
