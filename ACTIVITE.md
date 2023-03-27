# R4-02 Qualité de développement - Yahtzee

## 0. Modification du fichier README

Clonez votre projet Github dans un dossier de travail sur votre machine.
Modifiez le fichier README avec vos nom, prénom.

> fix #0 Fichier README OK

## Développement en TDD du calcul du score d'un tour de partie de Yahtzee

[Extrait de Wikipedia](https://fr.wikipedia.org/wiki/Yahtzee)

Pour jouer au Yahtzee, il faut cinq dés classiques à six faces.
Le jeu se déroule tour à tour. A leur tour, chaque joueur lance les cinq dés dans le but d'obtenir une figure 
(c'est-à-dire, un arrangement particulier des dés) permettant de marquer des points.

Les différentes figures d'une partie sont les suivantes :


| Figure       | Condition                                    | Score                           | Exemple                   |
|--------------|----------------------------------------------|---------------------------------|---------------------------|
| Brelan       | Obtenir trois dés de même valeur             | Somme des trois dés identiques  | score de (1,2,2,2,3) : 6  |
| Carré        | Obtenir quatre dés de même valeur            | Somme des quatre dés identiques | score de (1,2,2,2,2) : 8  |
| Full         | Obtenir un brelan et deux dés de même valeur | 25 points                       | score de (1,1,2,2,2) : 25 |
| Petite suite | Obtenir une suite croissante de quatre dés   | 30 points                       | score de (1,2,2,3,4) : 30 |
| Grande suite | Obtenir une suite croissante de cinq dés     | 40 points                       | score de (1,2,3,4,5) : 40 |
| Yahtzee      | Obtenir cinq dés de même valeur              | 50 points                       | score de (2,2,2,2,2) : 50 |

Avant de répondre aux activités suivantes, étudiez la structure et le code présent dans le projet. 
Les méthodes implantées et testées de la classe YahtzeeTour ont été conçue pour vous faciliter la tâche. 
Il est donc pertinent de chercher à les utiliser dans les exercices suivants.

1. Implantez les tests de la méthode du calcul du score d'un tour de partie de Yahtzee pour les cas de figure fournis par votre enseignant (7,5 pts)

> fix #1 Implantation du code de test

2. Implantez la méthode du calcul du score d'un tour de partie de Yahtzee pour les cas de figure testés (9 pts)

> fix #2 Implantation du code principal 

3. Effectuez un remaniement du code principal pour en améliorer la qualité et la lisibilité (3,5 pts)

> fix #3 refactoring du code principal 

