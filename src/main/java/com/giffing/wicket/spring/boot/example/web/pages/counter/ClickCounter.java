package com.giffing.wicket.spring.boot.example.web.pages.counter;

import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.AjaxLink;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.model.PropertyModel;

public class ClickCounter extends WebPage {

    private int counter;
    private final Label label;
    public  ClickCounter() {

        add(new AjaxLink<Void>("linkplus") {

            @Override
            public void onClick (AjaxRequestTarget target) {
                counter++;
                    target.add(label);
            }
        });
        add(new AjaxLink<Void>("linkmin") {

            @Override
            public void onClick (AjaxRequestTarget target) {
                counter--;
                    target.add(label);

            }

        });

        add(new AjaxLink<Void>("linkmulti") {

            @Override
            public void onClick (AjaxRequestTarget target) {
                counter =1;
                target.add(label);

            }

        });

        label = new Label("label", new PropertyModel<Integer>(this, "counter"));
        label.setOutputMarkupId(true);
        add(label);

    }

}