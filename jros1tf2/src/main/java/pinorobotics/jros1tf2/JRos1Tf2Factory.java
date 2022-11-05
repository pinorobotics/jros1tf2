/*
 * Copyright 2022 jrostf2 project
 * 
 * Website: https://github.com/pinorobotics/jros1tf2
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package pinorobotics.jros1tf2;

import id.jros1client.JRos1Client;
import id.jrosclient.RosVersion;
import id.xfunction.Preconditions;
import pinorobotics.jros1actionlib.JRos1ActionClientFactory;
import pinorobotics.jros1tf2.tf2_msgs.LookupTransformActionDefinition;
import pinorobotics.jrostf2.impl.JRosTf2Constants;

/**
 * Factory methods for {@link JRos1Tf2}
 *
 * @author aeon_flux aeon_flux@eclipso.ch
 */
public class JRos1Tf2Factory {

    private JRos1ActionClientFactory actionClientFactory = new JRos1ActionClientFactory();

    /**
     * Creates a new instance of the client which will interact with TF2 Buffer Server
     *
     * @param client ROS1 client
     */
    public JRos1Tf2 createTf2Client(JRos1Client client) {
        Preconditions.isTrue(
                client.getSupportedRosVersion().contains(RosVersion.ROS1), "Requires ROS1 client");
        return new JRos1Tf2(
                actionClientFactory.createClient(
                        client,
                        new LookupTransformActionDefinition(),
                        JRosTf2Constants.TF2_BUFFER_SERVER_NAME));
    }
}
