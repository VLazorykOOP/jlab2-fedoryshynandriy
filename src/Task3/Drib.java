package Task3;

public class Drib {
    private int chyselnyk;
    private int znamennyk;

    public Drib(int chyselnyk, int znamennyk) {
        int greatestCommonDivisor = greatestCommonDivisor(chyselnyk, znamennyk);
        this.chyselnyk = chyselnyk / greatestCommonDivisor;
        this.znamennyk = znamennyk / greatestCommonDivisor;
       // System.out.println("DRIB= " +this.chyselnyk+ "/" +this.znamennyk);
    }


    public Drib add(Drib Drib2) {     // "+"
        int chyselnyk = this.chyselnyk * Drib2.znamennyk + this.znamennyk * Drib2.chyselnyk;
        int znamennyk = this.znamennyk * Drib2.znamennyk;
        int greatestCommonDivisor = greatestCommonDivisor(chyselnyk, znamennyk);
        chyselnyk = chyselnyk / greatestCommonDivisor;
        znamennyk = znamennyk / greatestCommonDivisor;
        return new Drib(chyselnyk, znamennyk);
    }

    public Drib subtract(Drib Drib2) { // "-"
        int chyselnyk = this.chyselnyk * Drib2.znamennyk - this.znamennyk * Drib2.chyselnyk;
        int znamennyk = this.znamennyk * Drib2.znamennyk;
        int greatestCommonDivisor = greatestCommonDivisor(chyselnyk, znamennyk);
        chyselnyk = chyselnyk / greatestCommonDivisor;
        znamennyk = znamennyk / greatestCommonDivisor;
        return new Drib(chyselnyk, znamennyk);
    }

    public Drib multiply(Drib Drib2) {  // "*"
        int chyselnyk = this.chyselnyk * Drib2.chyselnyk;
        int znamennyk = this.znamennyk * Drib2.znamennyk;
        int greatestCommonDivisor = greatestCommonDivisor(chyselnyk, znamennyk);
        chyselnyk = chyselnyk / greatestCommonDivisor;
        znamennyk = znamennyk / greatestCommonDivisor;
        return new Drib(chyselnyk, znamennyk);
    }

    public Drib divide(Drib Drib2) {    // "/"
        int chyselnyk = this.chyselnyk * Drib2.znamennyk;
        int znamennyk = this.znamennyk * Drib2.chyselnyk;
        int greatestCommonDivisor = greatestCommonDivisor(chyselnyk, znamennyk);
        chyselnyk = chyselnyk / greatestCommonDivisor;
        znamennyk = znamennyk / greatestCommonDivisor;
        return new Drib(chyselnyk, znamennyk);
    }

    public String toString() {
        if (chyselnyk == znamennyk) {
            return "1";
        }
        else if(znamennyk==1){
            return chyselnyk +"";
        }
        else {
            return chyselnyk + "/" + znamennyk;
        }
    }

    private int greatestCommonDivisor(int chyselnyk, int znamennyk) {
        if (znamennyk == 0) {
            return chyselnyk;
        } else {
            return greatestCommonDivisor(znamennyk, chyselnyk % znamennyk);
        }
    }
}






