package Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lambda_01 {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>( Arrays.asList(14,12,5,5,8,9,14,12,4,16,20));

      yazdirJava(l);
        System.out.println();
      yazdirLambda(l);
        System.out.println();
        ciftSayiJava(l);
        System.out.println();
       ciftSayiLambda(l);
        System.out.println();
        tekSayiKaresiAl(l);
        System.out.println();
        farliTekKup(l);
        System.out.println();
        ciftSayiKareToplam(l);

    }

    public static void ciftSayiKareToplam(List<Integer> l) {
        System.out.println(l.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t).reduce(0, (a, b) -> a + b));
//distinct metodu ayni isimde olan kelime ve sayilarin sadece birini alma yarar icine bir sey yazmaya gere kalmadan
    }

    public static void farliTekKup(List<Integer> l) {
        l.stream().distinct().filter(t->t%2==1).map(t->t*t*t).forEach(t-> System.out.print("t = " + t));

    }

    public static void tekSayiKaresiAl(List<Integer> l) {
        l.stream().filter(t->t%2==1).map(t->t*t).forEach(t-> System.out.print("t = " + t));
    }


    public static void yazdirLambda(List<Integer> l) {
        l.stream().forEach(t-> System.out.print("t = " + t));
    }

    public static void yazdirJava(List<Integer> l){
        for (Integer w:l)
              {
                  System.out.print("w = " + w);

        }
    }
    private static void ciftSayiJava(List<Integer> l) {
        for (Integer w:l){
            if (w%2 == 0) {
                System.out.print("w = " + w);
            }
        }
    }private static void ciftSayiLambda(List<Integer> l) {
 l.stream().filter(t->t%2==0).forEach(t-> System.out.print("t = " + t));
    }
}
