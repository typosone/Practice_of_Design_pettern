package jp.ac.it_college.std.nakasone.pdp.builder;

/**
 * Created by tsuyoshi on 2015/06/09.
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.makeTitle("Greeting")
                .makeString("朝から昼にかけて")
                .makeItems(new String[]{"おはようございます。", "こんにちは。",})
                .makeString("夜に")
                .makeItems(new String[]{"こんばんは。", "おやすみなさい。", "さようなら。",})
                .close();
    }
}
