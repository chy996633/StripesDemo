package web.stripes.action;

import net.sourceforge.stripes.action.*;

/**
 * Created by backstop-samuel on 5/17/17.
 */
public class HelloWorldAction implements ActionBean {
    private ActionBeanContext actionBeanContext;

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


}
