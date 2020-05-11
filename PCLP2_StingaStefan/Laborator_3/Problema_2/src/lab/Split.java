package lab;

public class Split {
    String fraza;
    public Split(String f) {
        fraza = f;
        String[] cuvant = fraza.split(" ");
        int i;
        for (i = 0; i < cuvant.length; i++) {
            System.out.println(cuvant[i]);
        }
    }
}
