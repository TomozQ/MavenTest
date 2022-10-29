package Hello.example;
import com.opensymphony.xwork2.ActionSupport;

public class HelloStrutsAction extends ActionSupport{
  /**
   *
   */
  private static final long serialVersionUID = 1L;

  public String execute() {
      return SUCCESS;
  }
}