package io.spring.start.site.extension.kingsroad;

import io.spring.initializr.generator.project.contributor.ProjectContributor;
import org.springframework.core.Ordered;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class KingsroadContributor implements ProjectContributor {
    @Override
    public void contribute(Path projectRoot) throws IOException {
        Path configDirectory = Files.createDirectories(projectRoot.resolve("config"));
        Files.createDirectories(configDirectory.resolve("assembly"));
        Files.createDirectories(configDirectory.resolve("environments"));
    }

    @Override
    public int getOrder() {
        return Ordered.LOWEST_PRECEDENCE;
    }

}
