public class Personnnes {

    public Montres affiche(){
        return  this.tool;
    }
    public void retirer(){
        if(this.tool!=null){
            this.tool = null;
        }

    }
    public void demander(personnes p){
        if(p.tool!=null){
            System.out.println(" Sur la montre de "+p.getNom()+" il est "+p.tool.getHeures()+" : "+p.tool.getMin());
        }
        System.out.println("");
    }
}

}
