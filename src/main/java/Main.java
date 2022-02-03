public class Main {
    public static void main(String[] args) {

        Montres m = new Montres(4, 54);

        Personnes p = new Personnes("paul");
        p.porter(m);
        System.out.println("je suis:" + p.getNom());
        p.affiche().Heure();
        p.affiche().Min();
        m.avance();
        p.affiche().Heure();
        p.affiche().Min();
        p.retirer();
        Montres montre_max = new Montres(12, 30);

        Personnes max = new Personnes("max");
        max.porter(montre_max);
        p.demander(max);
    }
}
