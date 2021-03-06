/*-
 * #%L
 * SciJava polyglot kernel for Jupyter.
 * %%
 * Copyright (C) 2017 Hadrien Mary
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

package org.scijava.notebook.converter;

import org.scijava.Priority;
import org.scijava.convert.Converter;
import org.scijava.notebook.converter.output.PlainNotebookOutput;
import org.scijava.plugin.Plugin;

@Plugin(type = Converter.class, priority = Priority.VERY_HIGH_PRIORITY)
public class StringToPlainNotebookConverter
        extends NotebookOutputConverter<String, PlainNotebookOutput> {

    @Override
    public Class<String> getInputType() {
        return String.class;
    }

    @Override
    public Class<PlainNotebookOutput> getOutputType() {
        return PlainNotebookOutput.class;
    }

    @Override
    public PlainNotebookOutput convert(Object object) {
        return new PlainNotebookOutput((String) object);
    }

}
