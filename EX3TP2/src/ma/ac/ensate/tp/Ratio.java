package ma.ac.ensate.tp;

public class Ratio {
     private int numera;
     private int denomi;

    public Ratio(int numera, int denomi) {
        this.numera = numera;
        if(denomi != 0) {
            this.denomi = denomi;
        }else{
            System.out.println("Veuillez saisir un autre denominateur different de 0");
            System.exit(0);
        }
    }
    Ratio produit(Ratio a){
        int x = (a.numera) * (this.numera);
        int y = (a.denomi) * (this.denomi);
        this.numera=x;
        this.denomi=y;
        return  this;
    }
    Ratio addition(Ratio a){
        int x;
        int y;
        if(a.denomi==this.denomi){
             x =this.numera + a.numera;
             y =this.denomi;
            this.numera=x;
            this.denomi=y;
            return this;
        }else{
             x = (this.denomi) * (a.denomi);
             y = ((this.numera)*(a.denomi))+((this.denomi)*(a.numera));
            this.numera=y;
            this.denomi=x;
            return this;
        }
    }
    boolean egale(Ratio a){
        if(a.denomi == this.denomi){
            if(a.numera == this.numera){
                return true;
            }else{
                return false;
            }
        }else{
            int x =(this.numera)*(a.denomi);
            int y =(this.denomi)*(a.numera);
            if(x == y){
                return true;
            }else{
                return false;
            }
        }
    }
    boolean plusGrand(Ratio a){
        if(a.denomi == this.denomi){
            if(a.numera > this.numera){
                return true;
            }else{
                return false;
            }
        }else{
            int x =(this.numera)*(a.denomi);
            int y =(this.denomi)*(a.numera);
            if(x < y){
                return true;
            }else{
                return false;
            }
        }
    }

    @Override
    public String toString() {
        return "Mon nombre rationnel est : "+this.numera+"/"+this.denomi;
    }
}
