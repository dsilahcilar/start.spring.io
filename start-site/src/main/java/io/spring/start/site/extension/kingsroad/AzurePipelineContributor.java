package io.spring.start.site.extension.kingsroad;

import io.spring.initializr.generator.project.ProjectDescription;
import io.spring.initializr.generator.project.contributor.ProjectContributor;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;

public class AzurePipelineContributor implements ProjectContributor {
    private final AzureDocument azureDocument;

    private final ProjectDescription description;

    public AzurePipelineContributor(AzureDocument azureDocument, ProjectDescription description) {
        this.azureDocument = azureDocument;
        this.description = description;
    }

    @Override
    public void contribute(Path projectRoot) throws IOException {
        Path file = Files.createFile(projectRoot.resolve("azure-pipeline.yml"));
        try (PrintWriter writer = new PrintWriter(Files.newBufferedWriter(file))) {
            this.azureDocument.write(writer,description);
        }
    }
}
