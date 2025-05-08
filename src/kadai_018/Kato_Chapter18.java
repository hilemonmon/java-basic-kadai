package kadai_018;

public abstract class Kato_Chapter18 {
    public String familyName = "加藤";
    public String givenName;
    public String address = "東京都中野区〇×";

    // 共通の紹介（名前＋住所）
    public void commonIntroduce() {
        System.out.println("名前は" + familyName + givenName + "です");
        System.out.println("住所は" + address + "です");
    }

    // 各自紹介（抽象メソッド）
    public abstract void eachIntroduce();

    // 実行メソッド（共通＋個別紹介）
    public void execIntroduce() {
        commonIntroduce();
        eachIntroduce();
        System.out.println(); // 区切り
    }
}
