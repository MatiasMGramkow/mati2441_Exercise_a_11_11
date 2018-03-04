import java.util.HashSet;
import java.util.Set;

public class Exercise11
{
    /*
Write a method called symmetricSetDifference that accepts two Sets as parameters and returns a new Set con-
taining their symmetric set difference (that is, the set of elements contained in either of the two sets but not in both).
For example, the symmetric difference between the sets [1, 4, 7, 9] and [2, 4, 5, 6, 7] is [1, 2, 5, 6, 9].
     */
    public static void main(String[] args)
    {
        // Laver et sæt til set1
        Set<Integer> set1 = new HashSet<Integer>();

        // Tilføjer til set1
        set1.add(1);
        set1.add(4);
        set1.add(7);
        set1.add(9);

        // Laver et sæt til set2
        Set<Integer> set2 = new HashSet<Integer>();

        // Tilføjer til set2
        set2.add(2);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(7);

        // Printer listerne ud
        System.out.println("Første set er: " + set1);
        System.out.println("Andet set er: " + set2);

        // laver et sæt som ligner metoden nedenfor
        Set<Integer> sysmetriskSet = symmetricSetDifference(set1,set2);

        // Printer listen ud symetrisk
        System.out.println("Sysmetrisk sammen er det således: " + sysmetriskSet);
    }
    private static Set symmetricSetDifference (Set<Integer> set1, Set<Integer> set2)
    {
        // laver en liste til set1
        Set<Integer> skæringspunktet = new HashSet<Integer>(set1);

        // Holder på set2 også
        skæringspunktet.retainAll(set2);

        // Set1 fjerner alt fra Settet
        set1.removeAll(skæringspunktet);
        // Set1 fjerner alt fra Settet
        set2.removeAll(skæringspunktet);

        // Tilføjer alt fra set2 til set1
        set1.addAll(set2);

        // Returnerer set1
        return set1;
    }
}
