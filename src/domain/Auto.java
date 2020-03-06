package domain;

public class Auto {
    private String merk;
    private String model;
    private int Pk;
    private int aantalkm;
    private String bouwjaar;



    public Auto(String merk , String model , int Pk , int aantalkm , String bouwjaar){

        setMerk(merk);
        setModel(model);
        setPk(Pk);
        setAantalkm(aantalkm);
        setBouwjaar(bouwjaar);

    }



    public static boolean isValidString(String input){
        return (input != null) && !(input.trim().isEmpty());
    }

    public String getMerk(){
        return merk;
    }

    public void setMerk(String merk){
        if (isValidString(merk))
        {
            this.merk=merk;
        }else{
            throw new IllegalArgumentException("Geen valide merk");
        }
    }

    public String getModel(){
        return model;
    }

    public void setModel(String model){

        if (isValidString(model)){
            this.model = model;
        }else{
            throw new IllegalArgumentException("Geen valid model");
        }

    }

    public int getPk(){

        return Pk;
    }

    public static boolean isValidPpk(int pk){
        return pk > 0;
    }

    public void setPk(int Pk){
        if (isValidPpk(Pk)){
            this.Pk = Pk;
        }else{
            throw new IllegalArgumentException("Geen valide pk's");
        }

    }

    public int getAantalkm(){
        return aantalkm;
    }

    public static boolean isValidAantalkm(int aantalkm){
        return aantalkm > 0;
    }

    public void setAantalkm(int aantalkm){
        if (isValidAantalkm(aantalkm)){
            this.aantalkm = aantalkm;
        }else {
            throw new IllegalArgumentException("Geen valide aantalkm");
        }
    }

    public String getBouwjaar(){
        return bouwjaar;
    }

    public void setBouwjaar(String bouwjaar){
        if (isValidString(bouwjaar)){
            this.bouwjaar = bouwjaar;
        }else{
            throw new IllegalArgumentException("Geen valide datum");
        }

    }

}
