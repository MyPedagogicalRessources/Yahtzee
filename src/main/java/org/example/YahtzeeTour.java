package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class YahtzeeTour {

    private final Map<Integer, Integer> valeursEtOccurencesDes;
    private final List<Integer> valeursOrdonnees;

    /**
     * Créé une instance de Yahtzee tour
     *
     * @param valeursDes la valeurs des dès non ordonnées
     */
    public YahtzeeTour(Integer... valeursDes) {
        if (valeursDes == null || valeursDes.length != 5) {
            throw new IllegalArgumentException("Valeurs des dés incorrectes");
        }
        Arrays.sort(valeursDes); // ordonne les valeurs
        valeursEtOccurencesDes = new LinkedHashMap<>();
        for (Integer num : valeursDes) {
            if (valeursEtOccurencesDes.containsKey(num)) {
                valeursEtOccurencesDes.put(num, valeursEtOccurencesDes.get(num) + 1);
            } else {
                valeursEtOccurencesDes.put(num, 1);
            }
        }
        valeursOrdonnees = new ArrayList<>(valeursEtOccurencesDes.keySet());
    }

    /**
     * @return le nombre de valeurs différentes issu du lancement des dés
     */
    public int getNombreValeursDifferentesDes() {
        return valeursEtOccurencesDes.size();
    }

    /**
     * Retourne la liste liste ordonnée des valeurs obtenues (sans duplication).
     * Par exemple, pour le lancer (2,3,2,4,4), la liste obtenue est (2,3,4)
     *
     * @return La liste ordonnée
     */
    public List<Integer> getValeursOrdonnees() {
        return valeursOrdonnees;
    }

    /**
     * @param valeurDes la valeur du dés pour laquelle on veut le nombre d'occurence
     * @return le nombre d'occurence de la valeur du dés
     */
    public int getNombreOccurencesPourValeurDes(int valeurDes) {
        Integer res = valeursEtOccurencesDes.get(valeurDes);
        return res != null ? res : 0;
    }

    /**
     * @return le score correspondant à la combinaison de dés
     */
    public int calculeScore() {
        int score = 0;
        if (getNombreValeursDifferentesDes() == 3) {
            for (int val : getValeursOrdonnees()) {
                if (getNombreOccurencesPourValeurDes(val) == 3) {
                    score = 3 * val;
                }
            }
        } else if (getNombreValeursDifferentesDes() == 5) {
            if (getValeursOrdonnees().containsAll(Arrays.asList(1, 2, 3, 4, 5))
                    || getValeursOrdonnees().containsAll(Arrays.asList(2, 3, 4, 5, 6))) {
                score = 40;
            } else if (getValeursOrdonnees().containsAll(Arrays.asList(1, 2, 3, 4))
                    || getValeursOrdonnees().containsAll(Arrays.asList(2, 3, 4, 5))
                    || getValeursOrdonnees().containsAll(Arrays.asList(3, 4, 5, 6))) {
                score = 30;
            }
        }else if (getNombreValeursDifferentesDes() == 4 || getNombreValeursDifferentesDes() == 5) {
            if (getValeursOrdonnees().containsAll(Arrays.asList(1, 2, 3, 4))
                    || getValeursOrdonnees().containsAll(Arrays.asList(2, 3, 4, 5))
                    || getValeursOrdonnees().containsAll(Arrays.asList(3, 4, 5, 6))) {
                score = 30;
            }
        }
        return score;
    }

}
