package ru.netology;

import java.util.Objects;

public class Task {
    protected int id;

    public Task(int id) { //конструктор, который принимает id
        this.id = id;
    }

    public int getId() {  //геттер, который id возвращает
        return id;
    }

    // Ниже находятся вспомогательные методы для корректной работы equals
    // Переопределять их в наследниках не нужно

    @Override
    public boolean equals(Object o) { //метод equals для того, чтобы сравнивать обьекты с сылочными типами данных
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return id == task.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    /**
     * Метод, проверяющий подходит ли эта задача поисковому запросу.
     * Эта логика должна быть определена в наследниках, у каждого она будет своя
     *
     * @param query Поисковый запрос
     * @return Ответ на вопрос, подходит ли эта задача под поисковый запрос
     */
    public boolean matches(String query) {
        return false;
    }
}
