package Lesson_10.Ex004.V2;

public class Program {
    public static void main(String[] args) {
        Repository<AudioContent> audioStorage = new Repository<>("audioStorage");
        audioStorage.add(new AudioContent("track_001.mp3"));
        audioStorage.add(new AudioContent("03 Дорожка 03.wma"));
        
        for (int index = 0; index < audioStorage.count(); index++) {
            System.out.println(audioStorage.get(index));
        }
        
        Repository<VideoContent> videoStorage = new Repository<>("videoStorage");
        videoStorage.add(new VideoContent("Новый фильм 1.wmv"));
        videoStorage.add(new VideoContent("Новый фильм 5.3gp")); 

        for (int index = 0; index < videoStorage.count(); index++) {
            System.out.println(videoStorage.get(index));
        }
        
        //#region проблема решена

        // audioStorage.add(new VideoContent("jfvjdhdf7768.mp4")); 
        // videoStorage.add(new AudioContent("Дорожка 005.wav")); 

        //#endregion

        //#region 
        // (нет)
        
        Repository<String> stringRepository = new Repository<>("stringRepository");
        stringRepository.add("Кринж");
        stringRepository.add("Краш");
        stringRepository.add("Рофл");
        stringRepository.add("Криповый");
        stringRepository.add("Личинус");
        stringRepository.add("Шеймить");
        for (int i = 0; i < stringRepository.count(); i++) {
            System.out.println(stringRepository.get(i));
        }
        //#endregion
    }
}

// В данном коде используется принцип SOLID - принцип подстановки Барбары Лисков (Liskov Substitution Principle - LSP).
// Принцип LSP утверждает, что объекты должны быть заменяемыми экземплярами их базовых типов без изменения правильности программы. 
// В данном случае, классы AudioContent, VideoContent и String используются вместе с обобщенным классом Repository<T>, который хранит объекты различных типов.
// Использование обобщенного класса Repository<T>, который может хранить объекты различных типов (аудио, видео, строки), позволяет заменять типы объектов без изменения основного кода. 
// Это соответствует принципу LSP, так как каждый тип данных может быть подставлен вместо обобщенного типа T в Repository<T>, не нарушая работоспособность программы.