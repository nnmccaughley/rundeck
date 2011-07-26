/*
 * Copyright 2011 DTO Solutions, Inc. (http://dtosolutions.com)
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

/*
* DirectoryFileNodesSourceFactory.java
* 
* User: Greg Schueler <a href="mailto:greg@dtosolutions.com">greg@dtosolutions.com</a>
* Created: 7/21/11 11:12 AM
* 
*/
package com.dtolabs.rundeck.core.resources.nodes;

import com.dtolabs.rundeck.core.common.Framework;
import com.dtolabs.rundeck.core.plugins.Plugin;

import java.util.Properties;

/**
 * DirectoryFileNodesSourceFactory is ...
 *
 * @author Greg Schueler <a href="mailto:greg@dtosolutions.com">greg@dtosolutions.com</a>
 */
@Plugin (name = "directory", service = "NodesSource")
public class DirectoryNodesSourceFactory implements NodesSourceFactory {
    public static final String SERVICE_PROVIDER_TYPE = "directory";
    private Framework framework;

    public DirectoryNodesSourceFactory(Framework framework) {
        this.framework = framework;
    }

    public NodesSource createNodesSource(final Properties configuration) throws ConfigurationException {

        final DirectoryNodesSource fileNodesSource = new DirectoryNodesSource(framework);
        fileNodesSource.configure(DirectoryNodesSource.Configuration.fromProperties(configuration));
        return fileNodesSource;
    }
}