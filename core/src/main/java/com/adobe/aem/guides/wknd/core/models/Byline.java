package com.adobe.aem.guides.wknd.core.models;

import java.util.List;

public interface Byline {

        String getName();

        List<String> getOccupations();

        /***
         * @return a boolean if the component has enough content to display.
         */
        boolean isEmpty();
}
