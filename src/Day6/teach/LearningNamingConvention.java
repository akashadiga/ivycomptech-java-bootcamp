package Day6.teach;

public class LearningNamingConvention implements Learnable {
    private String topic;
    static final int TOTAL_NUMBER_OF_TOPICS=7;
    enum Subject{
        HINDI,
        TELUGU,
        ENGLISH,
        MATH
    }

    public LearningNamingConvention(String topic) {
        this.topic = topic;
    }

    @Override
    public void solveQuestions() {
        System.out.println("problem is solved");
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
}
