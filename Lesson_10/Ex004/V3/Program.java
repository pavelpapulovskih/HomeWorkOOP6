package Lesson_10.Ex004.V3;

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
        
        В данном коде используется принцип SOLID - принцип открытости/закрытости (Open/Closed Principle - OCP).

// Принцип OCP утверждает, что классы должны быть открыты для расширения, но закрыты для модификации. 
// В данном случае, классы Repository, AudioContent и VideoContent позволяют добавлять новые типы контента (аудио, видео) без изменения существующего кода.
// При добавлении нового типа контента, например, TextContent, необходимо просто создать новый класс TextContent и использовать его существующим обобщенным классом Repository<T>, не изменяя код в классе Repository или других местах. 
// Это соответствует принципу OCP, так как система легко расширяема для добавления новых типов контента без модификации существующего кода.
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        //#region проблема решена

        // audioStorage.add(new VideoContent("jfvjdhdf7768.mp4")); 
        // videoStorage.add(new AudioContent("Дорожка 005.wav")); 

        //#endregion

        //#region  проблема решена
        //
        
        // Repository<String> stringRepository = new Repository<>("stringRepository");
        // stringRepository.add("Кринж");
        // stringRepository.add("Краш");
        // stringRepository.add("Рофл");
        // stringRepository.add("Криповый");
        // stringRepository.add("Личинус");
        // stringRepository.add("Шеймить");
        // for (int i = 0; i < stringRepository.count(); i++) {
        //     System.out.println(stringRepository.get(i));
        // }
        //#endregion
    }
}
