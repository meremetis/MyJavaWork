package gr.aueb.elearn.chapter6;

/**
 * orizei enan pinaka me vathmous
 * emfanizei thn sixnotitakathe vathmou
 */
public class GradesFrequency {
    public static void main(String[] args) {
        int[] grades = {1, 2, 5, 3, 5, 4, 2, 3, 1 ,1 ,3, 0, 5, 4, 5};
        int[] frequency = new int[6];

        for (int i=0; i<grades.length;i++){
            frequency[grades[i]]++;
        }

        for (int x : frequency)
            System.out.println(x);
    }
}
