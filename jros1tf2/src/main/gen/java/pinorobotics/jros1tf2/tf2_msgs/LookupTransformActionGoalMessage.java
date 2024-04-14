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
import pinorobotics.jros1actionlib.actionlib_msgs.Action1GoalMessage;
import pinorobotics.jros1actionlib.actionlib_msgs.GoalIdMessage;
import pinorobotics.jrostf2.tf2_msgs.LookupTransformGoalMessage;

/**
 * Definition for tf2_msgs/LookupTransformActionGoal
 *
 * @author aeon_flux aeon_flux@eclipso.ch
 */
@MessageMetadata(
        name = LookupTransformActionGoalMessage.NAME,
        fields = {"header", "goal_id", "goal"},
        md5sum = "f2e7bcdb75c847978d0351a13e699da5",
        interfaceType = RosInterfaceType.ACTION)
public class LookupTransformActionGoalMessage
        implements Action1GoalMessage<LookupTransformGoalMessage> {

    static final String NAME = "tf2_msgs/LookupTransformActionGoal";

    public HeaderMessage header = new HeaderMessage();

    public GoalIdMessage goal_id = new GoalIdMessage();

    public LookupTransformGoalMessage goal = new LookupTransformGoalMessage();

    public LookupTransformActionGoalMessage withHeader(HeaderMessage header) {
        this.header = header;
        return this;
    }

    @Override
    public LookupTransformActionGoalMessage withGoalId(GoalIdMessage goal_id) {
        this.goal_id = goal_id;
        return this;
    }

    @Override
    public LookupTransformActionGoalMessage withGoal(LookupTransformGoalMessage goal) {
        this.goal = goal;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(header, goal_id, goal);
    }

    @Override
    public boolean equals(Object obj) {
        var other = (LookupTransformActionGoalMessage) obj;
        return Objects.equals(header, other.header)
                && Objects.equals(goal_id, other.goal_id)
                && Objects.equals(goal, other.goal);
    }

    @Override
    public String toString() {
        return XJson.asString(
                "header", header,
                "goal_id", goal_id,
                "goal", goal);
    }
}
