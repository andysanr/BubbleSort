public class Prog19_01 {
    public static void main(String[] args) {
    new Prog19_01();
    }
    public Prog19_01() {
        int[]a = new int[10];

        SortingAlgorithms.fillArray(a);
        SortingAlgorithms.printArray(a);
        SortingAlgorithms.bubblesort(a);
        SortingAlgorithms.printArray(a);
    }
}