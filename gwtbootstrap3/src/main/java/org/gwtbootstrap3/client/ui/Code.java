package org.gwtbootstrap3.client.ui;

/*
 * #%L
 * GwtBootstrap3
 * %%
 * Copyright (C) 2013 GwtBootstrap3
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import com.google.gwt.dom.client.Document;
import com.google.gwt.user.client.ui.HasHTML;
import org.gwtbootstrap3.client.ui.base.AbstractTextWidget;
import org.gwtbootstrap3.client.ui.base.helper.SourceCodeHelper;
import org.gwtbootstrap3.client.ui.constants.ElementTags;

/**
 * Simple {@code <code>} block for inline code emphasis.
 *
 * @author Sven Jacobs
 * @see Pre
 */
public class Code extends AbstractTextWidget implements HasHTML {

    public Code() {
        super(Document.get().createElement(ElementTags.CODE));
    }

    @Override
    public String getHTML() {
        return getElement().getInnerHTML();
    }

    /**
     * Sets HTML contents.
     * <p/>
     * If HTML contains "\n" it will be replaced by a {@code <br>} element
     * and "\s" will be replaced by a whitespace.
     *
     * @param html HTML contents
     */
    @Override
    public void setHTML(final String html) {
        getElement().setInnerHTML(SourceCodeHelper.parseCode(html).asString());
    }
}
