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
package pinorobotics.jros1tf2.tf2_msgs;

import id.jros1messages.std_msgs.HeaderMessage;
import id.jrosmessages.MessageMetadata;
import id.jrosmessages.RosInterfaceType;
import id.xfunction.XJson;
import java.util.Objects;
import pinorobotics.jros1actionlib.actionlib_msgs.Action1ResultMessage;
import pinorobotics.jros1actionlib.actionlib_msgs.GoalStatusMessage;

/** Definition for tf2_msgs/LookupTransformActionResult */
@MessageMetadata(
        name = LookupTransformActionResultMessage.NAME,
        md5sum = "ac26ce75a41384fa8bb4dc10f491ab90",
        interfaceType = RosInterfaceType.ACTION)
public class LookupTransformActionResultMessage
        implements Action1ResultMessage<LookupTransformResultMessage> {

    static final String NAME = "tf2_msgs/LookupTransformActionResult";

    public HeaderMessage header = new HeaderMessage();

    public GoalStatusMessage status = new GoalStatusMessage();

    public LookupTransformResultMessage result = new LookupTransformResultMessage();

    public LookupTransformActionResultMessage withHeader(HeaderMessage header) {
        this.header = header;
        return this;
    }

    public LookupTransformActionResultMessage withStatus(GoalStatusMessage status) {
        this.status = status;
        return this;
    }

    public LookupTransformActionResultMessage withResult(LookupTransformResultMessage result) {
        this.result = result;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(header, status, result);
    }

    @Override
    public boolean equals(Object obj) {
        var other = (LookupTransformActionResultMessage) obj;
        return Objects.equals(header, other.header)
                && Objects.equals(status, other.status)
                && Objects.equals(result, other.result);
    }

    @Override
    public String toString() {
        return XJson.asString(
                "header", header,
                "status", status,
                "result", result);
    }

    @Override
    public LookupTransformResultMessage getResult() {
        return result;
    }

    @Override
    public GoalStatusMessage getGoalStatus() {
        return status;
    }
}
