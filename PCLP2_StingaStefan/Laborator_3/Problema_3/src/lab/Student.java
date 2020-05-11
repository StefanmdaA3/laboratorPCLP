package lab;

public class

Student {
    String nume;
    int varsta;
    public String getNume(){
        return nume;
    }
    public void setNume(String nume){
        this.nume=nume;
    }
    public int getVarsta(){
        return varsta;
    }
    public void setVarsta(int varsta){
        this.varsta=varsta;
    }
    public void afisare(){
        System.out.println("Nume:" + getNume());
        System.out.println("Varsta:" + getVarsta());
    }
}
