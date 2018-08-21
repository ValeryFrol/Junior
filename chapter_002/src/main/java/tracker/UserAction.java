package tracker;

public interface UserAction {
    /**
     * Метод, возвращющий ключ опции
     * @return ключ
     */
    String key();

    /**
     * Основной метод
     * @param input объект класса Input
     * @param tracker объект типа Tracker
     */
    void execute(Input input,Tracker tracker);

    /**
     * МЕтод, возврающий информацию о пункте
     * @return строка информации
     */
    String info();
    /**
     * метод реализует добавление новой заявки
     */

}
