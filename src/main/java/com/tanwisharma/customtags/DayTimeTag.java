package com.tanwisharma.customtags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.util.Calendar;

public class DayTimeTag extends SimpleTagSupport {
    @Override
    public void doTag() throws JspException, IOException {
        super.doTag();
        JspWriter out = getJspContext().getOut();

        Calendar c = Calendar.getInstance();
        int timeOfDay = c.get(Calendar.HOUR_OF_DAY);

        if(timeOfDay >= 0 && timeOfDay < 12){
            out.println("Good Morning from DateTime custom tag");
        }else if(timeOfDay >= 12 && timeOfDay < 16){
            out.println("Good Afternoon from DateTime custom tag");
        }else if(timeOfDay >= 16 && timeOfDay < 21){
            out.println("Good Evening from DateTime custom tag");
        }else if(timeOfDay >= 21 && timeOfDay < 24){
            out.println("Good night from DateTime custom tag");
        }

    }
}
