package com.ahamojo.www.example.application;

import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;
//import org.osgi.framework.BundleContext;
//import org.osgi.framework.ServiceReference;

//import com.ahamojo.www.example.service.ExampleService;
//import com.ahamojo.www.example.util.ExampleUtil;

//import de.agilecoders.wicket.core.Bootstrap;
//import de.agilecoders.wicket.core.settings.BootstrapSettings;
//import de.agilecoders.wicket.core.settings.IBootstrapSettings;
//import de.agilecoders.wicket.core.settings.ThemeProvider;
//import de.agilecoders.wicket.less.BootstrapLess;
//import de.agilecoders.wicket.themes.markup.html.bootswatch.BootswatchTheme;
//import de.agilecoders.wicket.themes.markup.html.bootswatch.BootswatchThemeProvider;

public class ExampleApplication extends WebApplication {

	@Override
	public Class<? extends Page> getHomePage() {
		//WebApplication application = WebApplication.get();
        //BundleContext context = (BundleContext) application.getServletContext().getAttribute("osgi-bundlecontext");
        //ServiceReference<ExampleService> reference = context.getServiceReference(ExampleService.class);
        //ExampleService service = context.getService(reference);
        //ExampleUtil.notBundle();
        //service.listConferences();
		return Home.class;
	}

	@Override
    public void init() {
        super.init();
        //configureBootstrap();
        //addResourceReplacement(JQueryResourceReference.get(),new UrlResourceReference(Url.parse("http://code.jquery.com/jquery-2.1.4.min.js")));
        getMarkupSettings().setStripWicketTags(true);
        mountPage("/index",Home.class);
        mountPage("/video",Video.class);
        mountPage("/repositories",Repositories.class);
        mountPage("/accounts",Accounts.class);
        mountPage("/create/repo",CreateRepository.class);
        mountPage("/create/account",CreateAccount.class);
    }

//    private void configureBootstrap() {
//
//        final IBootstrapSettings settings = new BootstrapSettings();
//        settings.useCdnResources(true);
//
//        final ThemeProvider themeProvider = new BootswatchThemeProvider(BootswatchTheme.Spacelab);
//        settings.setThemeProvider(themeProvider);
//
//        Bootstrap.install(this, settings);
//        BootstrapLess.install(this);
//    }




}
