
public class Personnnes {
    private String nom;
    private Montres tool = null;
    Personnnes( String nom){
        this.nom=nom;

    }
    public void porter(Montres m){
        if(this.tool == null){
            this.tool = m;
        }
    }

    public String getNom() {
        return nom;
    }

    public Montres affiche(){
        return  this.tool;
    }
    public void retirer(){
        if(this.tool!=null){
            this.tool = null;
        }

    }
    public void demander(Personnes p){
        if(p.tool!=null){
            System.out.println(" Sur la montre de "+p.getNom()+" il est "+p.tool.getHeures()+" : "+p.tool.getMin());
        }
        System.out.println("");
    }
}
