public class Personnnes<String> {
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
}
