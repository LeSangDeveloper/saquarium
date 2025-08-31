package com.sang.saquarium.init;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.sang.saquarium.config.AppConfig;

public class SaquariumWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer  {

//    // Root Context (replaces ContextLoaderListener in web.xml)
//    @Override
//    protected Class<?>[] getRootConfigClasses() {
//        return new Class[] { AppRootConfig.class }; 
//    }
//
//    // Servlet Context (DispatcherServlet config)
//    @Override
//    protected Class<?>[] getServletConfigClasses() {
//        return new Class[] { AppConfig.class }; 
//    }
//
    // DispatcherServlet mapping -> "/"
    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }
	
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;  // no root context
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{AppConfig.class};
    }

//    @Override
//    protected String[] getServletMappings() {
//        return new String[]{"/*"}; // map DispatcherServlet to "/*"
//    }

}
