package tracker;

public class StubInput implements Input {
    /**
     * последовательность ответов пользователя
     */
    private final String answers[];
    private int[] intAnswers; //не могу сделать ее final потому что тогда пишет, что она должна быть проинициализирована
    /**
     * считает количество вызовов метода ask
     */
    private int position;

    public StubInput(String[] value, int[] range) {
        this.answers = value;
        this.intAnswers = range;
    }

    public StubInput(String[] answers) {
        this.answers = answers;
    }

    /**
     * У нас есть объект в котором лежат заранее продуманные ответы
     * При вызове метода ask нужно возвращать соответствующие данные
     *
     * @param question
     * @return
     */
    @Override
    public String ask(String question) {
        return this.answers[position++];
    }

    public Integer ask(String question, int[] range) {return this.intAnswers[position++];
    }
}
