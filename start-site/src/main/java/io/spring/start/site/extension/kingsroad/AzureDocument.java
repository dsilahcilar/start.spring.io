package io.spring.start.site.extension.kingsroad;

import io.spring.initializr.generator.io.template.MustacheTemplateRenderer;
import io.spring.initializr.generator.project.ProjectDescription;
import java.io.PrintWriter;
import java.util.*;

public class AzureDocument {

    private final MustacheTemplateRenderer templateRenderer;

    public AzureDocument(MustacheTemplateRenderer templateRenderer) {
        this.templateRenderer = templateRenderer;
    }

    public void write(PrintWriter writer, ProjectDescription description) {
        Map<String, Object> model = new HashMap<>();
        model.put("kingsRoadBranch", "master");
        model.put("pCode",description.pCode());
        writer.println(templateRenderer.render("azure",model));
    }

}
