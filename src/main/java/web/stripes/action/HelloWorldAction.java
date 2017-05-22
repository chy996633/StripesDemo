package web.stripes.action;

import net.sourceforge.stripes.action.*;


/**
 * Created by backstop-samuel on 5/17/17.
 */
public class HelloWorldAction implements ActionBean {
    private ActionBeanContext actionBeanContext;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String username;
    private String password;

    public void setContext(ActionBeanContext actionBeanContext) {
        this.actionBeanContext = actionBeanContext;
    }

    public ActionBeanContext getContext() {
        return actionBeanContext;
    }

    @DefaultHandler
    public Resolution index(){
        return new ForwardResolution("index.jsp");
    }

    public Resolution login(){
        return new ForwardResolution("index.jsp");
    }

    public Resolution register(){
        return new ForwardResolution("/WEB-INF/account/register.jsp");
    }



}
