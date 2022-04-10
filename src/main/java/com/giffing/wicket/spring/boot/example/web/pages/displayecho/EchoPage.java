package com.giffing.wicket.spring.boot.example.web.pages.displayecho;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.Model;

public class EchoPage  extends WebPage {

    private final Label label;
    private TextField textField;

    public EchoPage() {
        final Form form = new Form("form");
        TextField<String> field = new TextField<>("field", new Model<String>(""));
        form.add(field);
        form.add(new Button("button"));
        {
            //Missing onSubmit Function
        }
        add(form);
        add(label = new Label("message", new Model<>("")));
    }
}