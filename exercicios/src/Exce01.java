public class Exce01 {
    public static void main(String[] args) {
        try {
            int[] vetor = new int[5];
            for (int i = 0; i <= vetor.length; i++) {
                vetor[i] = i;
            }
            System.out.println(vetor[-1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}
