public class Main {
    public static void main(String[] args) {
        String[] words = {"the", "red", "fox", "the", "red"};
        WordPairList wpList = new WordPairList(words);
        System.out.println(wpList.numMatches());

        String[] wordNums = {"one", "two", "three"};
        WordPairList exampleOne = new WordPairList(wordNums);
        System.out.println(exampleOne.numMatches());

        String[] words2 = {"apple", "banana", "cherry", "date"};
        WordPairList exampleTwo = new WordPairList(words2);
        System.out.println(exampleTwo.numMatches());

        String[] moreWords = {"the", "red", "fox", "the", "red"};
        WordPairList exampleThree = new WordPairList(moreWords);
        System.out.println(exampleThree.numMatches());
    }
}
