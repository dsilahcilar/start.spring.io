/*
 * Copyright 2012-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.spring.start.site.extension.kingsroad;

import io.spring.initializr.generator.io.template.MustacheTemplateRenderer;
import io.spring.initializr.generator.io.text.BulletedSection;
import io.spring.initializr.generator.io.text.MustacheSection;
import io.spring.initializr.generator.io.text.Section;
import io.spring.initializr.generator.spring.documentation.GettingStartedSection;
import io.spring.initializr.generator.spring.documentation.PreDefinedSection;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

/**
 * Project's help document intended to give additional references to the users. Contains a
 * getting started section, additional sections and a next steps section.
 *
 * @author Stephane Nicoll
 * @author Madhura Bhave
 */
public class AzureDocument {

    private final MustacheTemplateRenderer templateRenderer;

    public AzureDocument(MustacheTemplateRenderer templateRenderer) {
        this.templateRenderer = templateRenderer;
    }

    public void write(PrintWriter writer) throws IOException {
        List<Section> allSections = new ArrayList<>();
//        ParameterSection parameterSection = new ParameterSection(
//                "action",
//                "'Deploy/Delete/the app OR cleanup namespace'",
//                "string",
//                "deploy"
//        );
        Map<String, Object> model = new HashMap<>();
        model.put("kingsRoadBranch", "master");
        writer.println(templateRenderer.render("azure",model));
    }


}
