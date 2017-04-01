package action;

import com.opensymphony.xwork2.ActionSupport;

public class IndexAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
    public String execute(){
        
        System.out.println("该方法为默认方法被struts2自动调用");
        
        return "success";
    }
}