/*
 * Copyright 2021 jrostf2 project
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

import pinorobotics.jros1tf2.tf2_msgs.LookupTransformResultMessage;
import pinorobotics.jrosactionlib.JRosActionClient;
import pinorobotics.jrostf2.impl.AbstractJRosTf2;
import pinorobotics.jrostf2.tf2_msgs.LookupTransformGoalMessage;

/**
 * Client which allows to interact with ROS TF2 Buffer Server.
 *
 * <p>TF2 Buffer Server is part of TF2 package and can be started using:
 *
 * <pre>
 * rosrun tf2_ros buffer_server
 * </pre>
 *
 * @author aeon_flux aeon_flux@eclipso.ch
 */
public class JRos1Tf2 extends AbstractJRosTf2<LookupTransformResultMessage> {

    /**
     * Creates a new instance of the client
     *
     * @param client ROS client
     * @param actionServerName of buffer action server
     */
    JRos1Tf2(
            JRosActionClient<LookupTransformGoalMessage, LookupTransformResultMessage>
                    lookupTransformActionClient) {
        super(lookupTransformActionClient);
    }
}
