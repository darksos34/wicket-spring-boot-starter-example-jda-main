package com.giffing.wicket.spring.boot.example.web.pages.home;

import com.giffing.wicket.spring.boot.example.web.pages.counter.ClickCounter;
import com.giffing.wicket.spring.boot.example.web.pages.displayecho.EchoPage;
import org.apache.wicket.authroles.authorization.strategies.role.annotations.AuthorizeInstantiation;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.wicketstuff.annotation.mount.MountPath;

import com.giffing.wicket.spring.boot.context.scan.WicketHomePage;
import com.giffing.wicket.spring.boot.example.web.pages.BasePage;
import com.giffing.wicket.spring.boot.example.web.pages.customers.CustomerListPage;
import com.giffing.wicket.spring.boot.example.web.pages.websocket.ChatPage;

@WicketHomePage
@MountPath("home")
@AuthorizeInstantiation("USER")
public class HomePage extends BasePage {

	public HomePage(){
		add(new BookmarkablePageLink<String>("customersLink", CustomerListPage.class));
		add(new BookmarkablePageLink<String>("chatLink", ChatPage.class));
		add(new BookmarkablePageLink<String>("counter", ClickCounter.class));
		add(new BookmarkablePageLink<String>("echo", EchoPage.class));
	}
}
