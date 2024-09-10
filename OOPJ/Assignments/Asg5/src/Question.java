public class Question {
    private static int instanceCount = 0;

    public Question() {
        instanceCount++;
    }

    public static int getInstanceCount() {
        return instanceCount;
    }

    public static void main(String[] args) {
        new Question();
        new Question();
        new Question();

        System.out.println("Number of instances created: " + Question.getInstanceCount());
    }
}
