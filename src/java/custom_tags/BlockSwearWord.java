/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package custom_tags;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
 * @author Lrandom
 */
public class BlockSwearWord extends SimpleTagSupport {

    /**
     * Called by the container to invoke this tag. The implementation of this
     * method is provided by the tag library developer, and handles all tag
     * processing, body iteration, etc.
     */
    public String content;
    public String[] swearWords=new String[]{
        "fap",
        "fuck",
        "mother fuck",
        "shit"
    };
    
    public void setContent(String content){
      this.content = content;
        for (int i = 0; i < swearWords.length; i++) {
           this.content = this.content.replace(swearWords[i], "***");
        }
    }
    
    @Override
    public void doTag() throws JspException {
        JspWriter out = getJspContext().getOut();
      
        try {
             out.print(this.content);
            // TODO: insert code to write html before writing the body content.
            // e.g.:
            //
            // out.println("<strong>" + attribute_1 + "</strong>");
            // out.println("    <blockquote>");

            JspFragment f = getJspBody();
            if (f != null) {
                f.invoke(out);
            }

            // TODO: insert code to write html after writing the body content.
            // e.g.:
            //
            // out.println("    </blockquote>");
        } catch (java.io.IOException ex) {
            throw new JspException("Error in BlockSwearWord tag", ex);
        }
    }
    
}
