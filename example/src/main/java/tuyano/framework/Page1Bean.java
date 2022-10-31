package tuyano.framework;

public class Page1Bean {
  private String text1;
  private String field1;

  public String getText1 () {
    return text1;
  }

  public void setText1 (String text1) {
    this.text1 =  text1;
  }

  public String getField1 () {
    return text1;
  }

  public void setField1 (String text1) {
    this.text1 =  text1;
  }

  public String execute() throws Exception {
    this.setField1("あなたは、" + this.getField1() + "と書いたね。");
    return "page1";
  }
}
