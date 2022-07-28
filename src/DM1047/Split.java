package DM1047;

public class Split {
    public static void main(String[] args) {
        String str = "I love Java.";
        String[] words = str.split("\\s"); // "\\s"
        System.out.printf("str句子有 %d 個字\n", words.length);
        for (String w : words) {
            System.out.println(w);
        }
        String[] words2 = str.split(" "); // " "
        System.out.printf("str句子有 %d 個字\n", words2.length);
        for (String w : words2) {
            System.out.println(w);
        }
    }
}
