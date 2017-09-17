package com.merlionlab.app.spatial.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfig;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;
import org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver;

@Configuration
public class ViewTemplateConfig {

    public FreeMarkerConfig freeMarkerConfig() {
        FreeMarkerConfig cfg = new FreeMarkerConfigurer();
        cfg.getConfiguration().setClassForTemplateLoading(this.getClass(), "/templates");
        cfg.getConfiguration().setDefaultEncoding("UTF-8");
        return cfg;
    }

    public FreeMarkerViewResolver freeMarkerSolver() {
        FreeMarkerViewResolver solver = new FreeMarkerViewResolver();
        solver.setCache(true);
        solver.setSuffix(".ftl");
        return solver;
    }
}
