package tracker;

public class StubInput implements Input {
    /**
     * последовательность ответов пользователя
     */
    private final String answers[];
    /**
     * считает количество вызовов метода ask
     */
    private int position;

    public StubInput(String[] value) {
        this.answers = value;
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
}
