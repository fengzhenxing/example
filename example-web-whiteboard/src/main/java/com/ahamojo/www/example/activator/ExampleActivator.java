package com.ahamojo.www.example.activator;

import java.util.Dictionary;
import java.util.Hashtable;

import javax.servlet.Filter;

import org.apache.wicket.protocol.http.WicketFilter;
import org.ops4j.pax.web.extender.whiteboard.ExtenderConstants;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.framework.ServiceRegistration;

import com.ahamojo.www.example.application.ExampleApplication;
import com.ahamojo.www.example.service.ExampleService;

public class ExampleActivator implements BundleActivator{

    private ServiceRegistration<Filter> filterReg;

	public void start(BundleContext context) throws Exception {

		System.out.println("starting the activator.");
		Dictionary<String,String> props = new Hashtable<String, String>();

        WicketFilter filter = new WicketFilter(new ExampleApplication());


        props.put("filter-name", "WicketFilter");
        props.put(ExtenderConstants.PROPERTY_URL_PATTERNS, "/*");

        filterReg = context.registerService(Filter.class,filter, props);

        //====Get service reference.
        ServiceReference<ExampleService> exampleServiceReference = context.getServiceReference(ExampleService.class);
        ExampleService exampleService = context.getService(exampleServiceReference);
        exampleService.listConferences();

	}

	public void stop(BundleContext context) throws Exception {
		if (filterReg != null) {
            filterReg.unregister();
            filterReg = null;
        }
	}

}
