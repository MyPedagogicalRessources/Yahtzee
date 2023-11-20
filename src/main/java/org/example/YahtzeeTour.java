package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class YahtzeeTour {

    private final Map<Integer, Integer> valeursEtOccurencesDes;
    private final List<Integer> valeursOrdonnees;

    /**
     * Créé une instance de Yahtzee tour
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
     *
     * @return le nombre de valeurs différentes issu du lancement des dés
     */
    public int getNombreValeursDifferentesDes() {
        return valeursEtOccurencesDes.size();
    }

    /**
     * Retourne la liste ordonnée des valeurs obtenues (sans duplication).
     * Par exemple, pour le lancer (2,3,2,4,4), la liste obtenue est (2,3,4)
     * @return La liste ordonnée
     */
    public List<Integer> getValeursOrdonnees() {
        return valeursOrdonnees;
    }

    /**
     *
     * @param valeurDes la valeur du dé pour laquelle on veut le nombre d'occurence
     * @return le nombre d'occurences de la valeur du dé
     */
    public int getNombreOccurencesPourValeurDes(int valeurDes) {
        Integer res = valeursEtOccurencesDes.get(valeurDes);
        return res != null ? res : 0;
    }

    /**
     *
     * @return le score correspondant à la combinaison de dés
     */
    public int calculeScore() {
        return 0;
    }

}
