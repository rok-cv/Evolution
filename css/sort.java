import java.util.*;

public class sort {
    public static void urejanjeVstavljanje() {
        String beseda = "d o b e r s a l a m";
        String[] tab = new String[10];
        int i, j;
        String x;
        tab = beseda.split(" ");
        for (i = 1; i < tab.length; i++) {
            x = tab[i];
            j = i - 1;
            while (j >= 0 && x < tab[j].toString()) {
                tab[j + 1] = tab[j];
                izpis(tab);
                j--;
            }
            tab[j + 1] = x;
        }

    }

    public static void izpis(String[] tab) {
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i]);
        }
        System.out.println();
    }
}