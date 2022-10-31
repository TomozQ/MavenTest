package tuyano.framework;

public class Page1Bean {
  // <s:〇〇>というStruts2のカスタムタグで用意されたもののvalueは、フォーム送信時、アクションクラスに用意されたkey名のフィールドにアクセサを通じて保管される
  private String text1;
  private String field1;

  public String getText1 () {
    return text1;
  }

  public void setText1 (String text1) {
    this.text1 =  text1;
  }

  public String getField1 () {
    return field1;
  }

  public void setField1 (String field1) {
    this.field1 =  field1;
  }

  // アクション時（今回の場合フォームを送信した際）に実行される処理
  public String execute() throws Exception {
    this.setField1("あなたは、" + this.getField1() + "と書いたね。");
    return "page1";   // アクションの名前 ... "page1"という名前のページ遷移を行う
  }
}
