import java.util.ArrayList;
import java.util.Scanner;

public class Modul {
    Scanner sc=new Scanner(System.in);
    int codi;
    String nom;
    ArrayList<UF> UFsModul= new ArrayList<UF>();


    public Modul(int codi, String nom, ArrayList<UF> UFsModul) {
        this.codi = codi;
        this.nom = nom;
        this.UFsModul = UFsModul;
    }

    public int getCodi() {
        return codi;
    }

    public void setCodi(int codi) {
        this.codi = codi;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }



    public void AfegirUF(UF nom) {
        UFsModul.add(nom);
    }
    public void borrarUF(UF nom) {
        System.out.println("digues el nom de la uf que vols treure");
        String pepe=sc.nextLine();
        if (nom.getNom()==pepe){
        UFsModul.remove(nom);
        }
    }

}
