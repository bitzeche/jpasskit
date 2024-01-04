/*
 * Copyright (C) 2024 Patrice Brend'amour <patrice@brendamour.net>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.brendamour.jpasskit.server;

import java.io.IOException;

import org.restlet.representation.Representation;
import org.restlet.resource.Delete;
import org.restlet.resource.Post;
import org.restlet.resource.ServerResource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class PKLogResource extends ServerResource {

    private static final Logger LOGGER = LoggerFactory.getLogger(PKLogResource.class);

    /*
     * POST request to webServiceURL/version/log
     */
    @Post("json")
    public final Representation postLogMessage(final Representation entity) {
        try {
            LOGGER.debug("postLogMessage: Log {}", entity.getText());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return handleLogRequest(entity);
    }

    @Delete("json")
    public final Representation deleteDeviceRegistrationRequest(final Representation entity) {
        return null;
    }

    public abstract Representation handleLogRequest(final Representation entity);
}
