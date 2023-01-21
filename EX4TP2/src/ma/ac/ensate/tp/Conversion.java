package ma.ac.ensate.tp;

public class Conversion {
    private int heure;
    private int minute;
    private int seconde;
    private double heureDec;

    public Conversion(int heure, int minute, int seconde) {
        this.heure = heure;
        this.minute = minute;
        this.seconde = seconde;
    }

    public Conversion(double heureDec) {
        this.heureDec = heureDec;
    }
    public double getDec(){
        if(this.heureDec!=0){
            return this.heureDec;
        }else{
            this.heureDec=this.heure+ this.minute*0.0166667 + this.seconde * 0.000277778;
            System.out.println("La convertion de nombre sexagésimaux vers nombres decimales est: "+this.heureDec);
            return this.heureDec;
        }
    }
    public int getH() { 
        if(this.heure!=0){
            return this.heure;
        }else{
            this.heure=(int)(this.heureDec);
            return this.heure;
        }

    }

    public int getM() {
        if(this.minute!=0){
            return this.minute;
        }else{
            this.minute =(int)((this.heureDec-this.heure)*60);
            return this.minute;
        }
    }

    public int getS() {
        if(this.seconde!=0){
            return this.seconde;
        }else{
            this.seconde=(int)((((this.heureDec-this.heure)*60)-this.minute)*60);
            return  this.seconde;
        }

    }
//    public void ConvertionToSexa(){
//        this.heure=(int)(this.heureDec);
//        this.minute =(int)((this.heureDec-this.heure)*60);
//        this.seconde=(int)((((this.heureDec-this.heure)*60)-this.minute)*60);
//        System.out.println(this.heure+":"+this.minute+":"+this.seconde);
//    }
}
