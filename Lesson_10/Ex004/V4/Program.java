package Lesson_10.Ex004.V4;

public class Program {
    public static void main(String[] args) {
        Repository<AudioContent> mGlinka = new Repository<>("mGlinka");
        mGlinka.add(new AudioContent("ПРОИЗВЕДЕНИЕ mGlinka 1"));
        mGlinka.add(new AudioContent("ПРОИЗВЕДЕНИЕ mGlinka 2"));
        
        
        for (int index = 0; index < mGlinka.count(); index++) {
            System.out.println(mGlinka.get(index));
        }
        
        Repository<AudioContent> pTchaikovsky = new Repository<>("pTchaikovsky");
        pTchaikovsky.add(new AudioContent("ПРОИЗВЕДЕНИЕ pTchaikovsky 1"));
        pTchaikovsky.add(new AudioContent("ПРОИЗВЕДЕНИЕ pTchaikovsky 2"));
        
        
        for (int index = 0; index < pTchaikovsky.count(); index++) {
            System.out.println(pTchaikovsky.get(index));
        }

        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println(pTchaikovsky.count());
        for (int index = 0; index < pTchaikovsky.count(); index++) {
            System.out.println(pTchaikovsky.get(index));
        }



// В данном коде не соблюдается принцип SOLID - принцип подстановки Барбары Лисков (Liskov Substitution Principle - LSP).
// Принцип LSP гласит, что объекты должны быть заменяемыми экземплярами их базовых типов без неожиданных изменений в программе. 
// В данном случае, хотя mGlinka и pTchaikovsky являются объектами типа Repository<AudioContent>, они все равно имеют различные содержимое и поведение, что нарушает принцип LSP.
// Для соблюдения принципа LSP, объекты типа Repository<AudioContent> должны вести себя одинаково, независимо от конкретной реализации. 
// Если у разных объектов одного типа различное поведение, это может привести к непредсказуемым результатам при использовании этих объектов.

        // Repository<VideoContent> videoContent = new Repository<>("videoContent");
        // videoContent.add(new VideoContent("ВИДЕО 1"));
        // videoContent.add(new VideoContent("ВИДЕО 2"));
        
        // pTchaikovsky.merge(videoContent);

        // for (int index = 0; index < pTchaikovsky.count(); index++) {
        //     System.out.println(pTchaikovsky.get(index));
        // }



    }
}
