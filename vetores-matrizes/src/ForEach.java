public class ForEach {
    public static void main(String[] args) {
        String[] alunos = new String[]{
                "Wesley", "Matheus", "Silva", "Farias",
        };

        // Usando o laço for
        for (int i = 0; i < alunos.length; i++) {
            System.out.println(alunos[i]);
        }
        // Usando for each
        for (String nomes : alunos) {
            System.out.println(nomes);
        }
    }
}
