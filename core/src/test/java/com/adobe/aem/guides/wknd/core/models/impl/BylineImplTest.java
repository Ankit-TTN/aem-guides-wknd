package com.adobe.aem.guides.wknd.core.models.impl;

import com.adobe.aem.guides.wknd.core.models.Byline;
import com.adobe.fd.fp.util.RepositoryUtils;
import io.wcm.testing.mock.aem.junit5.AemContext;
import io.wcm.testing.mock.aem.junit5.AemContextExtension;
import org.apache.sling.testing.mock.sling.ResourceResolverType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import javax.jcr.Session;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(AemContextExtension.class)
@ExtendWith(MockitoExtension.class)
class BylineImplTest {


    private final AemContext ctx = new AemContext();

    @BeforeEach
    void setUp() {
        ctx.addModelsForClasses(BylineImpl.class);
        ctx.load().json("/home/ankit/IdeaProjects/aem-guides-wknd/core/src/test/java/com/adobe/aem/guides/wknd/core/models/impl/BylineImplTest.json", "/content");
    }

    @Test
    public void testGetName() {
        final String expected = "Jane Doe";

        ctx.currentResource("/content/byline");
        Byline byline = ctx.request().adaptTo(Byline.class);

        String actual = byline.getName();

        assertEquals(expected, actual);
    }

    @Test
    void getOccupations() {
    }

    @Test
    void isEmpty() {
    }
}