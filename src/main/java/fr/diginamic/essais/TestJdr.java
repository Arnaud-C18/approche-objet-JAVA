package fr.diginamic.essais;

import fr.diginamic.jdr.*;

import java.util.Scanner;

public class TestJdr {
    public static void main(String[] args) {

        int menu;
        int score = 0;
        boolean fin = false;

        System.out.println("\nBienvenue dans l'arène jeune gladiateur, ici vous allez pouvoir gagner en renommé et en richesses en affrontant toutes sortes de créatures!\n" +
                "Mais ce ne sera pas sans risques et il n'y a aucun retour en arrière possible, les portes ne se ré-ouvriront qu'aprés la mort d'un des participant...\n" +
                "Oserez vous tentez votre chance?\n\n" +
                "1: Entrez dans l'arène\n" +
                "2: Prendre ses jambes à son coup et sauver sa peau");
        do {
            Scanner scanner = new Scanner(System.in);
            menu = scanner.nextInt();
            if (menu == 1) {
                Personnage personnage = new Personnage();
                int pdvPersonnage;
                System.out.println("\nVous prenez votre courage à 2 mains et entrez dans l'arène.\n" +
                        "Points de vie: " + personnage.getPointsDeVie() + "\n" +
                        "Points de force: " + personnage.getForce() + "\n");
                while (!fin) {
                    Creature creature = choixAdversaire();
                    System.out.println("Points de vie de la créature: " + creature.getPointsDeVie() + "\n" +
                            "Points de force de la créature: " + creature.getForce() + "\n");
                    int pdvRestantPersonnage = combat(personnage.getForce(), personnage.getPointsDeVie(), creature.getForce(), creature.getPointsDeVie());
                    if (pdvRestantPersonnage <= 0) {
                        personnage.deces();
                        break;
                    } else {
                        personnage.setPointsDeVie(pdvRestantPersonnage);
                        if (creature.getNom() == "loup") {
                            personnage.setScore(1);
                        } else if (creature.getNom() == "gobelin") {
                            personnage.setScore(2);
                        } else if (creature.getNom() == "troll") {
                            personnage.setScore(5);
                        }
                        System.out.println("Vous avez triomphé lors de cette manche, vous avez maintenant " + personnage.getScore() + " point(s), souhaitez vous continuer?\n" +
                                "1: oui\n" +
                                "2: non\n");
                        int continuer;
                        continuer = scanner.nextInt();
                        if (continuer == 2) {
                            fin = true;
                            break;
                        }
                    }
                }
            } else if (menu == 2) {
                System.out.println("Vous pensez à tout ce que vous n'avez pas encore pu réaliser et fuyez comme un couard.");
                break;
            } else {
                System.out.println("Vous semblez confus, il n'y a que 2 choix possibles, 1 ou 2");
            }
        }while( menu < 0 || menu > 2);
    }

    // Retourne une variable creature
    public static Creature choixAdversaire() {
        Creature creature = new Creature(0,0,0,0, "");
        int ennemi = (int) (Math.random() * 3) + 1;
        if (ennemi == 1) {
            creature = new Loup();
            System.out.println("Un Loup apparait");
        } else if (ennemi == 2) {
            creature = new Gobelin();
            System.out.println("Un Gobelin apparait");
        } else if (ennemi == 3) {
            creature = new Troll();
            System.out.println("Un Troll apparait");
        }
        return creature;
    };

    // Deroulement d'un combat
    public static int combat(int forcePersonnage, int pdvPersonnage, int forceCreature, int pdvCreature) {
        System.out.println("Le combat s'engage!\n");
        while (pdvPersonnage > 0 && pdvCreature > 0) {
            int attaquePersonnage = calculAttaque(forcePersonnage);
            int attaqueCreature = calculAttaque(forceCreature);
            if (attaquePersonnage > attaqueCreature) {
                pdvCreature -= attaquePersonnage - attaqueCreature;
                System.out.println("Vous attaquez la créature\n" +
                        "Dégats infligés: " + (attaquePersonnage - attaqueCreature) + "\n" +
                        "Points de vie de la créature: " + pdvCreature + "\n");
            } else if (attaquePersonnage < attaqueCreature){
                pdvPersonnage -= attaqueCreature - attaquePersonnage;
                System.out.println("La créature vous attaque\n" +
                        "Dégats infligés: " + (attaqueCreature - attaquePersonnage) + "\n" +
                        "Points de vie du personnage: " + pdvPersonnage + "\n");
            } else {
                System.out.println("Vous vous fixez du regard et attendez le prochain mouvement de l'adversaire\n");
            }
        }
        if (pdvPersonnage <= 0) {
            System.out.println("La créature vous asséne un coup fatale et vous poussez votre dernier souffle");
        } else if (pdvCreature <= 0) {
            System.out.println("Vous achevez la créature d'un coup bien placé");
        }
        return pdvPersonnage;
    }

    // Calcul des dégats à chaque tour
    public static int calculAttaque(int force) {
        int attaque = force + (int)(Math.random() * 10) + 1;
        return attaque;
    }
}


